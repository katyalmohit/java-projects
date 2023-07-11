import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.security.SecureRandom;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.util.Scanner;

public class project{
    //private static final Map<String, String> userCredentials = null;
   
    public static void secondwin(){
        JFrame frame = new JFrame("MAIN WINDOW");
        frame.setSize(450, 800);
        frame.getContentPane().setBackground(new Color(0, 128, 128));

        JButton button2 = new JButton(" GENERATE PASSWORD ");
        button2.setBounds(40, 30, 350, 40);
        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("MV Boli", Font.BOLD, 22));
        button2.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button2.setFocusPainted(false);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Passgen();
            }
        });
        frame.getContentPane().add(button2);

        JButton button3 = new JButton(" ENCRYPT TEXT ");
        button3.setBounds(40, 90, 350, 40);
        button3.setBackground(Color.GREEN);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("MV Boli", Font.BOLD, 22));
        button3.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button3.setFocusPainted(false);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Doencrypt();
            }
        });
        frame.getContentPane().add(button3);

        JButton button4 = new JButton(" DECRYPT TEXT ");
        button4.setBounds(40, 150, 350, 40);
        button4.setBackground(Color.GREEN);
        button4.setForeground(Color.BLACK);
        button4.setFont(new Font("MV Boli", Font.BOLD, 22));
        button4.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button4.setFocusPainted(false);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dodecrypt();
            }
        });
        frame.getContentPane().add(button4);

        JButton button5 = new JButton(" STORE PASSWORD ");
        button5.setBounds(40, 210, 350, 40);
        button5.setBackground(Color.GREEN);
        button5.setForeground(Color.BLACK);
        button5.setFont(new Font("MV Boli", Font.BOLD, 22));
        button5.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button5.setFocusPainted(false);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                store();
            }
        });
        frame.getContentPane().add(button5);

        JButton searchButton = new JButton("SEARCH CREDENTIALS");
        searchButton.setBounds(40, 270, 350, 40);
        searchButton.setBackground(Color.GREEN);
        searchButton.setForeground(Color.BLACK);
        searchButton.setFont(new Font("MV Boli", Font.BOLD, 22));
        searchButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        searchButton.setFocusPainted(false);
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search();
            }
        });
        frame.getContentPane().add(searchButton);


        JButton button7 = new JButton(" DELETE CREDENTIALS ");
        button7.setBounds(40, 330, 350, 40);
        button7.setBackground(Color.GREEN);
        button7.setForeground(Color.BLACK);
        button7.setFont(new Font("MV Boli", Font.BOLD, 22));
        button7.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button7.setFocusPainted(false);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletewindow();
            }});
        frame.getContentPane().add(button7);

        JButton button8 = new JButton(" ADD NOTE ");
        button8.setBounds(40, 390, 350, 40);
        button8.setBackground(Color.GREEN);
        button8.setForeground(Color.BLACK);
        button8.setFont(new Font("MV Boli", Font.BOLD, 22));
        button8.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button8.setFocusPainted(false);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addnote();
            }});
        frame.getContentPane().add(button8);

        JButton button9 = new JButton(" GET A NOTE");
        button9.setBounds(40, 450, 350, 40);
        button9.setBackground(Color.GREEN);
        button9.setForeground(Color.BLACK);
        button9.setFont(new Font("MV Boli", Font.BOLD, 22));
        button9.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button9.setFocusPainted(false);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayNotes();
            }
        });
        frame.getContentPane().add(button9);

        JButton button10 = new JButton(" EXIT ");
        button10.setBounds(40, 510, 350, 40);
        button10.setBackground(Color.GREEN);
        button10.setForeground(Color.BLACK);
        button10.setFont(new Font("MV Boli", Font.BOLD, 22));
        button10.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button10.setFocusPainted(false);
        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(button10);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void deletewindow(){
            JFrame frame = new JFrame("DISPLAY DETAILS");
            frame.getContentPane().setBackground(Color.GREEN);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(300, 300);

            JLabel titleLabel = new JLabel("Enter your Account Name ");
            titleLabel.setFont(new Font("MV Boli", Font.BOLD, 16));
            titleLabel.setBounds(17, 20, 250, 40);
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel.setForeground(Color.WHITE); // Set text color
            titleLabel.setBackground(Color.BLUE); // Set background color
            titleLabel.setOpaque(true); // Make the label opaque
            titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

            JTextArea accountTextField = new JTextArea();
            accountTextField.setFont(new Font("MV Boli", Font.BOLD, 20));
            accountTextField.setBounds(30, 85, 230, 70);
            accountTextField.setLineWrap(true); // Enable line wrapping
            accountTextField.setWrapStyleWord(true); // Wrap at word boundaries
            accountTextField.setCaretPosition(0);

            JButton generateButton = new JButton(" P R O C E E D ");
            generateButton.setFont(new Font("MV Boli", Font.BOLD, 14)); // Set font style
            generateButton.setBackground(new Color(0, 150, 136)); // Set background color
            generateButton.setForeground(Color.WHITE); // Set text color
            generateButton.setFocusPainted(false); // Remove focus border
            generateButton.setBounds(44,175, 200, 40 );
            
            generateButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try{
                    String account = accountTextField.getText().toLowerCase();
                    if(account.isEmpty()){
                        throw new IllegalArgumentException("Field cannot be empty");
                    }
                    String filePath = "account_details.txt";

                    File inputFile = new File(filePath);
                    File tempFile = new File("temp.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                        String currentLine;
                        boolean found = false;

                        // Read the file line by line and copy to the temporary file, excluding the account details for the specified account
                        while ((currentLine = reader.readLine()) != null) {
                            if (currentLine.startsWith("Account: ") && currentLine.substring(9).trim().toLowerCase().equals(account.toLowerCase())) {
                                // Skip the account name, username, and password lines
                                reader.readLine(); // Skip username line
                                reader.readLine(); // Skip password line
                                found =true;
                                continue;
                            }

                            writer.write(currentLine + System.lineSeparator());
                        }

                        writer.close();
                        reader.close();

                        // Replace the original file with the temporary file
                        if (inputFile.delete()) {
                            if (tempFile.renameTo(inputFile)) {
                                // Show a confirmation message if the account was found
                                if (found) {
                                    JOptionPane.showMessageDialog(frame, "Account details deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Account not found!", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else {
                                // Show an error message if renaming the temporary file fails
                                JOptionPane.showMessageDialog(frame, "Error deleting account details!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            // Show an error message if deleting the original file fails
                            JOptionPane.showMessageDialog(frame, "Error deleting account details!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        // Clear the text fields
                        accountTextField.setText("");
                        accountTextField.setText("");
                        accountTextField.setText("");

                    } catch (IOException ex) {
                        ex.printStackTrace();
                        // Show an error message if there's an issue reading or writing the files
                        JOptionPane.showMessageDialog(frame, "Error deleting account details!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(IllegalArgumentException ex){
                        JOptionPane.showMessageDialog(frame,ex.getMessage());
                    }
                }
            });


                  
            frame.getContentPane().setLayout(null);
            frame.getContentPane().add(titleLabel);
            frame.getContentPane().add(accountTextField);
            frame.getContentPane().add(generateButton);
            frame.setVisible(true);
        }
           
    public static void addnote() {
        final JTextArea noteTextArea;
        JFrame noteFrame = new JFrame("Add Note");
        noteFrame.setSize(425, 400);
        noteFrame.getContentPane().setBackground(new Color(255, 215, 0));
        noteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel textLabel = new JLabel(" Add Something !!! ");
        textLabel.setBounds(12, 20, 800, 40);
        textLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        textLabel.setForeground(Color.BLACK);
        noteFrame.getContentPane().add(textLabel);

        noteTextArea = new JTextArea();
        noteTextArea.setFont(new Font("MV Boli", Font.PLAIN, 15));
        noteTextArea.setLineWrap(true);
        noteTextArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(noteTextArea);
        scrollPane.setBounds(40, 70, 320, 180);
        noteFrame.getContentPane().add(scrollPane);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(40, 275, 320, 40);
        saveButton.setBackground(Color.GREEN);
        saveButton.setForeground(Color.BLACK);
        saveButton.setFont(new Font("MV Boli", Font.BOLD, 22));
        saveButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new ActionListener() 
            {
            public void actionPerformed(ActionEvent e) {
                String noteText = noteTextArea.getText();
                if (!noteText.isEmpty()) {
                    saveNoteToFile(noteText);
                    JOptionPane.showMessageDialog(null, "Note saved successfully!");
                    noteTextArea.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a note before saving.");
                }
            }
        });
        noteFrame.getContentPane().add(saveButton);

        noteFrame.setLayout(null);
        noteFrame.setVisible(true);
    }
    
    public static void saveNoteToFile(String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true))) {
            writer.write(note);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void displayNotes() {
    JFrame displayFrame = new JFrame("Display Notes");
    displayFrame.setSize(425, 400);
    displayFrame.getContentPane().setBackground(new Color(255, 215, 0));
    displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JLabel textLabel = new JLabel(" Your Notes !!! ");
    textLabel.setBounds(12, 20, 800, 40);
    textLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
    textLabel.setForeground(Color.BLACK);
    displayFrame.getContentPane().add(textLabel);

    JTextArea displayTextArea = new JTextArea();
    displayTextArea.setFont(new Font("MV Boli", Font.PLAIN, 13));
    displayTextArea.setLineWrap(true);
    displayTextArea.setWrapStyleWord(true);
    displayTextArea.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(displayTextArea);
    scrollPane.setBounds(40, 70, 320, 280);
    displayFrame.getContentPane().add(scrollPane);

    try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            displayTextArea.append(line);
            displayTextArea.append("\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    displayFrame.setLayout(null);
    displayFrame.setVisible(true);
    }

    
    public static void Passgen(){
        JFrame mainFrame;
        mainFrame = new JFrame("Password Generator");
        mainFrame.setSize(400, 230);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.getContentPane().setBackground(new Color(255, 192, 203)); // Set background color
        mainFrame.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Add padding

        JLabel sizeLabel = new JLabel("  Enter the size of the password :  ");
        sizeLabel.setFont(new Font("MV Boli", Font.BOLD, 18)); // Set font style
        sizeLabel.setForeground(new Color(50, 50, 50)); // Set text color
        constraints.gridx = 1; // Set column index
        constraints.gridy = 0; // Set row index
        mainFrame.add(sizeLabel, constraints);

        JTextField sizeTextField = new JTextField(10);
        sizeTextField.setFont(new Font("Arial", Font.BOLD, 25)); // Set font style
        sizeTextField.setBackground(new Color(255, 165, 0)); // Set background color
        constraints.gridx = 1;
        constraints.gridy = 2;
        mainFrame.add(sizeTextField, constraints);

        JButton generateButton = new JButton("Generate Password");
        generateButton.setFont(new Font("MV Boli", Font.BOLD, 18)); // Set font style
        generateButton.setBackground(new Color(0, 150, 136)); // Set background color
        generateButton.setForeground(Color.WHITE); // Set text color
        generateButton.setFocusPainted(false); // Remove focus border
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2; // Span across two columns
        mainFrame.add(generateButton, constraints);
      

        generateButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                String sizeInput = sizeTextField.getText();
                int size = Integer.parseInt(sizeInput);

                if (size <= 0) {
                    throw new IllegalArgumentException("Password size must be a positive number");
                }

                String password = generatePassword(size);
                displayPassword(password);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(mainFrame, "Invalid input! Please enter a valid positive number.");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(mainFrame, ex.getMessage());
            }
        }
    });

        mainFrame.setVisible(true);
    }
    public static String generatePassword(int size) {
        String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*(){}[],.<>?/+-*.";
        String alphanumeric = upperLetter + lowerLetter + numbers + specialChars;

        SecureRandom r = new SecureRandom();
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            int index = r.nextInt(alphanumeric.length());
            arr[i] = alphanumeric.charAt(index);
        }
        return new String(arr);
    }

    public static void displayPassword(String password) {
        JFrame passwordFrame = new JFrame("Generated Password");
        passwordFrame.setSize(320, 150);
        passwordFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        passwordFrame.setLayout(new FlowLayout());

        // Create a panel with a border
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(280, 80));
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        // Set layout for the panel
        panel.setLayout(new BorderLayout());

        JLabel passwordLabel = new JLabel("Generated Password: ");
        JTextField passwordTextField = new JTextField(password, 20);
        passwordTextField.setEditable(false);

        // Set font and style for the labels and text field
        Font labelFont = new Font("Arial", Font.BOLD, 16);
        Font textFieldFont = new Font("Arial", Font.BOLD, 16);
        passwordLabel.setFont(labelFont);
        passwordTextField.setFont(textFieldFont);

        // Set colors for the labels and text field
        passwordLabel.setForeground(Color.BLUE);
        passwordTextField.setForeground(Color.BLACK);
        passwordTextField.setBackground(Color.YELLOW);

        // Add padding around the components
        passwordLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        passwordTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Add the label and text field to the panel
        panel.add(passwordLabel, BorderLayout.NORTH);
        panel.add(passwordTextField, BorderLayout.CENTER);

        // Create a small sized copy button
        JButton copyButton = new JButton("Copy");
        copyButton.setPreferredSize(new Dimension(70, 30));
        copyButton.setToolTipText("Copy Password");
        // Set font and style for the copy button
        Font buttonFont = new Font("Arial", Font.BOLD, 12);
        copyButton.setFont(buttonFont);

        // Attach ActionListener to the copy button
        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringSelection selection = new StringSelection(passwordTextField.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, null);
            }
        });

        // Add the copy button to the panel
        panel.add(copyButton, BorderLayout.EAST);
        passwordFrame.add(panel);
        passwordFrame.setVisible(true);
    }

    public static void store(){
        String SecurityKey="123456789";
        JFrame frame = new JFrame("STORE DETAILS");
        frame.getContentPane().setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(520, 520);

        JLabel titleLabel = new JLabel("Enter the Account");
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel.setBounds(10, 20, 480, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBackground(Color.BLUE); // Set background color
        titleLabel.setOpaque(true); // Make the label opaque
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


        JTextField accountTextField = new JTextField();
        accountTextField.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField.setBounds(75, 80, 350, 40);


        JLabel titleLabel1 = new JLabel("Enter the Username");
        titleLabel1.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel1.setBounds(10, 150, 480, 40);
        titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel1.setForeground(Color.WHITE); // Set text color
        titleLabel1.setBackground(Color.BLUE); // Set background color
        titleLabel1.setOpaque(true); // Make the label opaque
        titleLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


        JTextField accountTextField1 = new JTextField();
        accountTextField1.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField1.setBounds(75, 210, 350, 40);


        JLabel titleLabel2 = new JLabel("Enter the Password");
        titleLabel2.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel2.setBounds(10, 290, 480, 40);
        titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel2.setForeground(Color.WHITE); // Set text color
        titleLabel2.setBackground(Color.BLUE); // Set background color
        titleLabel2.setOpaque(true); // Make the label opaque
        titleLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


        JTextField accountTextField2 = new JTextField();
        accountTextField2.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField2.setBounds(75, 350, 350, 40);

        JButton generateButton = new JButton("S T O R E");
        generateButton.setFont(new Font("MV Boli", Font.BOLD, 18)); // Set font style
        generateButton.setBackground(new Color(0, 150, 136)); // Set background color
        generateButton.setForeground(Color.WHITE); // Set text color
        generateButton.setFocusPainted(false); // Remove focus border
        generateButton.setBounds(190,420, 150, 40 );

        generateButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
            String account = accountTextField.getText();
            String username = accountTextField1.getText();
            String password = accountTextField2.getText();
            String encryptedpass =aes_encryption.encrypt(password, SecurityKey);
            if(account.isEmpty() || username.isEmpty() || password.isEmpty()){
                throw new IllegalArgumentException("Field cannot be empty");
            }
            // Create a string with the account details
            String accountDetails = "Account: " + account + "\n"
                                    + "Username: " + username + "\n"
                                    + "Password: " +  encryptedpass + "\n";
            
            // Save the account details to a file
            FileWriter writer = new FileWriter("account_details.txt", true); // Append to the file
            writer.write(accountDetails);
            writer.write("\n"); // Add a new line after each account
            writer.close();
            
            // Show a confirmation message
            JOptionPane.showMessageDialog(frame, "Account details stored successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            // Clear the text fields
            accountTextField.setText("");
            accountTextField1.setText("");
            accountTextField2.setText("");}
         catch (IOException ex) {
            ex.printStackTrace();
            // Show an error message if there was an issue saving the account details
            JOptionPane.showMessageDialog(frame, "Error storing account details!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(frame,ex.getMessage());
            }}
        });

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(titleLabel);
        frame.getContentPane().add(accountTextField);
        frame.getContentPane().add(titleLabel1);
        frame.getContentPane().add(accountTextField1);
        frame.getContentPane().add(titleLabel2);
        frame.getContentPane().add(accountTextField2);
        frame.getContentPane().add(generateButton);
        frame.setVisible(true);    
    }


    public static void search(){
        String SecurityKey="123456789";
        JFrame frame = new JFrame("DISPLAY DETAILS");
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);

        JLabel titleLabel = new JLabel("Enter your Account Name ");
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 16));
        titleLabel.setBounds(17, 20, 250, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBackground(Color.BLUE); // Set background color
        titleLabel.setOpaque(true); // Make the label opaque
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

        JTextArea accountTextField = new JTextArea();
        accountTextField.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField.setBounds(30, 85, 230, 70);
        accountTextField.setLineWrap(true); // Enable line wrapping
        accountTextField.setWrapStyleWord(true); // Wrap at word boundaries
        accountTextField.setCaretPosition(0);

        JButton generateButton = new JButton(" P R O C E E D ");
        generateButton.setFont(new Font("MV Boli", Font.BOLD, 14)); // Set font style
        generateButton.setBackground(new Color(0, 150, 136)); // Set background color
        generateButton.setForeground(Color.WHITE); // Set text color
        generateButton.setFocusPainted(false); // Remove focus border
        generateButton.setBounds(44,175, 200, 40 );
        generateButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String account = accountTextField.getText();
            displayAccountDetails(account);
        }
        });
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(titleLabel);
        frame.getContentPane().add(accountTextField);
        frame.getContentPane().add(generateButton);
        frame.setVisible(true);
    }
    
    public static void displayAccountDetails(String selectedAccount) {
        String SecurityKey="123456789";
        try {
            File file = new File("account_details.txt");
            Scanner scanner = new Scanner(file);
            boolean found = false;
            String username = "";
            String password_new = "";
            String password="";

            // Search for the selected account name in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Account: ") && line.substring(9).trim().toLowerCase().equals(selectedAccount.toLowerCase())) {
                    // Account name found, retrieve the corresponding username and password
                    found = true;
                    if (scanner.hasNextLine()) {
                        username = scanner.nextLine().substring(10);
                }
                if (scanner.hasNextLine()) {
                    password_new = scanner.nextLine().substring(10);
                    password=aes_encryption.decrypt(password_new,SecurityKey);

                }
                break;
            }
        }  
        scanner.close();
        if (found) {
            JFrame frame = new JFrame("STORED DETAILS");
            frame.getContentPane().setBackground(Color.PINK);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(520, 520);
            frame.setLayout(null);

            JLabel titleLabel = new JLabel("ACCOUNT NAME");
            titleLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
            titleLabel.setBounds(10, 20, 480, 40);
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel.setForeground(Color.WHITE); // Set text color
            titleLabel.setBackground(Color.BLUE); // Set background color
            titleLabel.setOpaque(true); // Make the label opaque
            titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


            JTextField accountTextField = new JTextField();
            accountTextField.setFont(new Font("MV Boli", Font.BOLD, 20));
            accountTextField.setBounds(75, 80, 350, 40);
            accountTextField.setText(selectedAccount);


            JLabel titleLabel1 = new JLabel("ACCOUNT USERNAME");
            titleLabel1.setFont(new Font("MV Boli", Font.BOLD, 25));
            titleLabel1.setBounds(10, 150, 480, 40);
            titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel1.setForeground(Color.WHITE); // Set text color
            titleLabel1.setBackground(Color.BLUE); // Set background color
            titleLabel1.setOpaque(true); // Make the label opaque
            titleLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


            JTextField accountTextField1 = new JTextField();
            accountTextField1.setFont(new Font("MV Boli", Font.BOLD, 20));
            accountTextField1.setBounds(75, 210, 350, 40);
            accountTextField1.setText(username);



            JLabel titleLabel2 = new JLabel("ACCOUNT PASSWORD");
            titleLabel2.setFont(new Font("MV Boli", Font.BOLD, 25));
            titleLabel2.setBounds(10, 280, 480, 40);
            titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel2.setForeground(Color.WHITE); // Set text color
            titleLabel2.setBackground(Color.BLUE); // Set background color
            titleLabel2.setOpaque(true); // Make the label opaque
            titleLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

            JTextField accountTextField2 = new JTextField();
            accountTextField2.setFont(new Font("MV Boli", Font.BOLD, 20));
            accountTextField2.setBounds(75, 340, 350, 40);
            accountTextField2.setText(password);

            frame.add(titleLabel);
            frame.add(titleLabel1);
            frame.add(titleLabel2);
            frame.add(accountTextField);
            frame.add(accountTextField1);
            frame.add(accountTextField2);
            frame.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Account not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving account details!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
}

    public static void Doencrypt(){
        JFrame frame = new JFrame("ENCRYPTION");
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(520, 510);

        JLabel titleLabel = new JLabel("Enter the text ");
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel.setBounds(10, 20, 480, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBackground(Color.BLUE); // Set background color
        titleLabel.setOpaque(true); // Make the label opaque
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

        JTextArea accountTextField = new JTextArea();
        accountTextField.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField.setBounds(75, 80, 350, 140);
        accountTextField.setLineWrap(true); // Enable line wrapping
        accountTextField.setWrapStyleWord(true); // Wrap at word boundaries
        accountTextField.setCaretPosition(0);
        //accountTextField.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel titleLabel1 = new JLabel("Enter the secret key");
        titleLabel1.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel1.setBounds(10, 250, 480, 40);
        titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel1.setForeground(Color.WHITE); // Set text color
        titleLabel1.setBackground(Color.BLUE); // Set background color
        titleLabel1.setOpaque(true); // Make the label opaque
        titleLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

        JTextField accountTextField1 = new JTextField();
        accountTextField1.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField1.setBounds(75, 320, 350, 40);

        JButton generateButton = new JButton(" E N C R Y P T");
        generateButton.setFont(new Font("MV Boli", Font.BOLD, 18)); // Set font style
        generateButton.setBackground(new Color(0, 150, 136)); // Set background color
        generateButton.setForeground(Color.WHITE); // Set text color
        generateButton.setFocusPainted(false); // Remove focus border
        generateButton.setBounds(150,378, 190, 40 );

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                String text = accountTextField.getText();
                String key=accountTextField1.getText();
                if (text.isEmpty()) {
                throw new IllegalArgumentException("Please enter the text to encrypt.");
            }
                String encSite=aes_encryption.encrypt(text, key);
                displayEncryption(encSite);
            }
                catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage());
        }
            }
        });

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(titleLabel);
        frame.getContentPane().add(accountTextField);
        frame.getContentPane().add(titleLabel1);
        frame.getContentPane().add(accountTextField1);
        frame.getContentPane().add(generateButton);
        frame.setVisible(true);    
    }


    public static void displayEncryption(String encryptedText) {
        JFrame encryptFrame = new JFrame("Encrypted Text");
        encryptFrame.setSize(450, 320);
        encryptFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        encryptFrame.setLayout(null);
        encryptFrame.getContentPane().setBackground(Color.ORANGE); // Set background color

        JLabel headingLabel = new JLabel("Encrypted Text");
        headingLabel.setBounds(15,20, 400, 35);
        headingLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headingLabel.setForeground(Color.WHITE); // Set text color
        headingLabel.setBackground(Color.RED); // Set background color
        headingLabel.setOpaque(true);
        headingLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        encryptFrame.getContentPane().add(headingLabel);

        JTextArea encryptedTextArea = new JTextArea();
        encryptedTextArea.setFont(new Font("MV Boli", Font.PLAIN, 16));
        encryptedTextArea.setText(encryptedText);
        encryptedTextArea.setEditable(false);
        encryptedTextArea.setLineWrap(true); // Enable line wrap
        encryptedTextArea.setWrapStyleWord(true); // Wrap at word boundaries
        encryptedTextArea.setBounds(30, 80, 350, 120);

        JScrollPane scrollPane = new JScrollPane(encryptedTextArea);
        scrollPane.setBounds(30, 80, 350, 120);

        JButton copyButton = new JButton("Copy");
        copyButton.setBounds(160, 220, 70, 30);
        copyButton.setFont(new Font("Arial", Font.BOLD, 12));
        copyButton.setToolTipText("Copy Password");

        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringSelection selection = new StringSelection(encryptedTextArea.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, null);
            }
        });

        encryptFrame.getContentPane().add(copyButton);
        encryptFrame.getContentPane().add(scrollPane);
        encryptFrame.setVisible(true);
    }

    public static void Dodecrypt(){
        JFrame frame = new JFrame("DECRYPTION");
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(520, 510);

        JLabel titleLabel = new JLabel("Enter the text ");
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel.setBounds(10, 20, 480, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBackground(Color.BLUE); // Set background color
        titleLabel.setOpaque(true); // Make the label opaque
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

        JTextArea accountTextField = new JTextArea();
        accountTextField.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField.setBounds(75, 80, 350, 140);
        accountTextField.setLineWrap(true); // Enable line wrapping
        accountTextField.setWrapStyleWord(true); // Wrap at word boundaries
        accountTextField.setCaretPosition(0);
        //accountTextField.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel titleLabel1 = new JLabel("Enter the secret key");
        titleLabel1.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel1.setBounds(10, 250, 480, 40);
        titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel1.setForeground(Color.WHITE); // Set text color
        titleLabel1.setBackground(Color.BLUE); // Set background color
        titleLabel1.setOpaque(true); // Make the label opaque
        titleLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border

        JTextField accountTextField1 = new JTextField();
        accountTextField1.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField1.setBounds(75, 320, 350, 40);

        JButton generateButton = new JButton(" D E C R Y P T");
        generateButton.setFont(new Font("MV Boli", Font.BOLD, 18)); // Set font style
        generateButton.setBackground(new Color(0, 150, 136)); // Set background color
        generateButton.setForeground(Color.WHITE); // Set text color
        generateButton.setFocusPainted(false); // Remove focus border
        generateButton.setBounds(150,378, 190, 40 );

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                String text = accountTextField.getText();
                String key=accountTextField1.getText();
                if(text.isEmpty()){
                    throw new IllegalArgumentException("Please enter the text to decrypt");
               }
                String encSite=aes_encryption.decrypt(text, key);
                displayDecryption(encSite);
            }catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        }
        });

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(titleLabel);
        frame.getContentPane().add(accountTextField);
        frame.getContentPane().add(titleLabel1);
        frame.getContentPane().add(accountTextField1);
        frame.getContentPane().add(generateButton);
        frame.setVisible(true);    
    }

    public static void displayDecryption(String decryptedText) {
        JFrame encryptFrame = new JFrame("Decrypted Text");
        encryptFrame.setSize(450, 320);
        encryptFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        encryptFrame.setLayout(null);
        encryptFrame.getContentPane().setBackground(Color.ORANGE); // Set background color

        JLabel headingLabel = new JLabel("Decrypted Text");
        headingLabel.setBounds(15,20, 400, 35);
        headingLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headingLabel.setForeground(Color.WHITE); // Set text color
        headingLabel.setBackground(Color.RED); // Set background color
        headingLabel.setOpaque(true);
        headingLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        encryptFrame.getContentPane().add(headingLabel);

        JTextArea encryptedTextArea = new JTextArea();
        encryptedTextArea.setFont(new Font("MV Boli", Font.PLAIN, 16));
        encryptedTextArea.setText(decryptedText);
        encryptedTextArea.setEditable(false);
        encryptedTextArea.setLineWrap(true); // Enable line wrap
        encryptedTextArea.setWrapStyleWord(true); // Wrap at word boundaries
        encryptedTextArea.setBounds(30, 80, 350, 120);

        encryptFrame.getContentPane().add(encryptedTextArea);
        encryptFrame.setVisible(true);
    }

}
