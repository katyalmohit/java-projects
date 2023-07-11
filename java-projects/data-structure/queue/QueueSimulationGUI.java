import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QueueSimulationGUI extends JFrame {
    // Use a List instead of an array to store the Queue objects
    private List<Queue<Integer>> queues;

    public QueueSimulationGUI() {
        setLayout(new FlowLayout());

        // Create GUI components to prompt the user for input
        JLabel numQueuesLabel = new JLabel("Number of queues:");
        JTextField numQueuesField = new JTextField(5);
        JLabel numPersonsLabel = new JLabel("Number of persons per queue:");
        JTextField numPersonsField = new JTextField(5);
        JButton createQueuesButton = new JButton("Create queues");
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Set the font and foreground color of the labels
        Font labelFont = new Font("SansSerif", Font.BOLD, 14);
        Color labelColor = Color.BLUE;
        numQueuesLabel.setFont(labelFont);
        numQueuesLabel.setForeground(labelColor);
        numPersonsLabel.setFont(labelFont);
        numPersonsLabel.setForeground(labelColor);

        // Set the font and foreground color of the text area
        Font textAreaFont = new Font("Monospaced", Font.PLAIN, 12);
        Color textAreaColor = Color.BLACK;
        textArea.setFont(textAreaFont);
        textArea.setForeground(textAreaColor);

        // Add an action listener to the createQueuesButton
        createQueuesButton.addActionListener(event -> {
            // Read the user input from the text fields
            int numQueues = Integer.parseInt(numQueuesField.getText());
            int numPersons = Integer.parseInt(numPersonsField.getText());

            // Create a List of Queue objects
            queues = new ArrayList<>(numQueues);
            for (int i = 0; i < numQueues; i++) {
                Queue<Integer> queue = new Queue<>();
                // enqueue some number of persons into each queue
                for (int j = 0; j < numPersons; j++) {
                    queue.enqueue(j);
                }
                queues.add(queue);
            }

            // display the initial state of the queues
            textArea.append("Initial state:\n");
            for (int i = 0; i < numQueues; i++) {
                if(i==numQueues-1){
                    textArea.append("TC    "+ " : " + queues.get(i) + "\n");
                }
                else{
                    textArea.append("Queue " + i + ": " + queues.get(i) + "\n");
                }
                
            }
            textArea.append("\n");

            // Use a SwingWorker to perform the simulation in the background
            new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() {
                    // simulate the movement of people between the queues
                    while (!queues.get(numQueues - 1).isEmpty()) {
                        // process person at front of last queue
                        queues.get(numQueues - 1).dequeue();
                        // move people between queues
                        for (int i = numQueues - 2; i >= 0; i--) {
                            if (!queues.get(i).isEmpty()) {
                                int person = queues.get(i).dequeue();
                                queues.get(i + 1).enqueue(person);
                            }
                        }
                        // publish the state of the queues
                        for (int i = 0; i < numQueues; i++) {
                            if(i==numQueues-1){
                                publish("TC    "+ " : " + queues.get(i) + "\n");
                            }
                            else{
                                publish("Queue " + i + ": " + queues.get(i) + "\n");
                            }
                        }
                        publish("\n");

                        // Add a delay between each step
                        try {
                            Thread.sleep(1000); // sleep for 1000 milliseconds (1 second)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    return null;
                }

                @Override
                protected void process(List<String> chunks) {
                    // Update the text area with the published state of the queues
                    for (String chunk : chunks) {
                        textArea.append(chunk);
                    }
                }
            }.execute();
        });

        // Add the GUI components to the frame
        add(numQueuesLabel);
        add(numQueuesField);
        add(numPersonsLabel);
        add(numPersonsField);
        add(createQueuesButton);

        setTitle("Queue Simulation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new QueueSimulationGUI();
    }
}

// Generic Queue class that can work with different data types
class Queue<T> {
    private int size;
    private Node<T> head;

    public Queue() {}
    public void enqueue(T value) {
        Node<T> n, t;
        n = new Node<>();
        n.setData(value);
        t = head;
        if (t == null) {
            head = n;
        } else {
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }
    public T dequeue() {
        if (head == null) {
            System.out.println("List is already empty");
            return null;
        } else {
            T person = head.getData();
            head = head.getNext();
            size--;
            return person;
        }
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    /*public void display() {
        Node<T> t;
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            t = head;
            for (int i = 1; i <= size; i++) {
                System.out.println("" + t.getData());
                t = t.getNext();
            }
        }
    }*/
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> t = head;
        while (t != null) {
            sb.append(t.getData()).append(" ");
            t = t.getNext();
        }
        return sb.toString();
    }
}

// Generic Node class that can work with different data types
class Node<T> {
    private T data;
    private Node<T> next;

    Node() {}
    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return this.data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    public Node<T> getNext() {
        return this.next;
    }
}
