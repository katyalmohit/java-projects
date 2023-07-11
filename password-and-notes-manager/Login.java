import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
 import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Login{
    //private static final Map<String, String> userCredentials = null;
    public static void main(String[] args) {
        JFrame frame = new JFrame(" PASSWORD AND NOTES MANAGER");
        frame.setSize(830, 630);
        frame.getContentPane().setBackground(new Color(0, 128, 128));
        
		 
		ImageIcon originalIcon = new ImageIcon("encryption.jpg");
        Image originalImage = originalIcon.getImage();
        
        //Resize the image to fit the frame
        Image resizedImage = originalImage.getScaledInstance(730,560, Image.SCALE_SMOOTH);
        
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel background = new JLabel(resizedIcon); 
        background.setBounds(40, 125,730,560);
        frame.getContentPane().add(background);
		
        
        

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(0, 20, 820, 10);
        separator.setForeground(Color.YELLOW);
        separator.setBorder(new LineBorder(Color.YELLOW, 20));
        frame.getContentPane().add(separator);

        JLabel textLabel = new JLabel("                      Welcome  to  the  Password  and  Notes  Manager  !        ");

        textLabel.setBounds(10, 40, 800, 40);
        textLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        textLabel.setForeground(new Color(255, 255, 0));
        frame.getContentPane().add(textLabel);
        JSeparator separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setBounds(0, 80, 820, 10);
        separator2.setForeground(Color.YELLOW);
        separator2.setBorder(new LineBorder(Color.YELLOW, 20));
        frame.getContentPane().add(separator2);
		JButton button9 = new JButton(" L O G I N");
        button9.setBounds(450, 180, 280, 40);
        button9.setBackground(Color.GREEN);
        button9.setForeground(Color.BLACK);
        button9.setFont(new Font("MV Boli", Font.BOLD, 22));
        button9.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button9.setFocusPainted(false);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        background.add(button9);
		

        


        /*
        JButton button1 = new JButton(" P R O C E E D ");
        button1.setBounds(30, 570, 350, 40);
        button1.setBackground(Color.GREEN);
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("MV Boli", Font.BOLD, 22));
        button1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button1.setFocusPainted(false);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Processbar();
            }
        });
        */

        JButton button2 = new JButton(" E X I T ");
        button2.setBounds(450, 250, 280, 40);
        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("MV Boli", Font.BOLD, 22));
        button2.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button2.setFocusPainted(false);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        background.add(button2);
        frame.setLayout(null);
        frame.setVisible(true);

    }

        public static void Processbar() {

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(15, 50, 400, 50);
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.RED);

        JFrame progressFrame = new JFrame("Processing");
        progressFrame.setSize(450, 220);
        progressFrame.getContentPane().setBackground(Color.CYAN);
        progressFrame.setLayout(null);
        progressFrame.add(progressBar);
        progressFrame.setVisible(true);

        JButton proceedButton = new JButton("Proceed");
        proceedButton.setFont(new Font("MV Boli", Font.BOLD, 18));
        proceedButton.setBackground(Color.white);
        proceedButton.setForeground(Color.BLACK);
        proceedButton.setBounds(150, 120, 150, 30);
        proceedButton.setEnabled(false);
        progressFrame.add(proceedButton);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    final int progress = i;

                    // Update the progress bar on the Event Dispatch Thread (EDT)
                    progressBar.setValue(progress);

                    // Simulate processing delay
                    try {
                        TimeUnit.MILLISECONDS.sleep(10); // Adjust the delay as needed
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                proceedButton.setEnabled(true);

                // Close the progress frame
                progressFrame.dispose();
                project.secondwin();
            }
        });

        thread.start(); // Start the processing thread

		
	}
    
	public static void login(){
        String SecurityKey="123456789";
        JFrame frame = new JFrame("LOGIN");
        frame.getContentPane().setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(520, 430);

        JLabel textLabel = new JLabel(" Login to your Account !!! ");
        textLabel.setBounds(90, 20, 800, 40);
        textLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        textLabel.setForeground(Color.BLACK);
        frame.getContentPane().add(textLabel);


        JLabel titleLabel1 = new JLabel("USERNAME");
        titleLabel1.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel1.setBounds(10, 80, 480, 40);
        titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel1.setForeground(Color.WHITE); // Set text color
        titleLabel1.setBackground(Color.BLUE); // Set background color
        titleLabel1.setOpaque(true); // Make the label opaque
        titleLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


        JTextField accountTextField1 = new JTextField();
        accountTextField1.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField1.setBounds(75, 140, 350, 40);


        JLabel titleLabel2 = new JLabel("PASSWORD");
        titleLabel2.setFont(new Font("MV Boli", Font.BOLD, 25));
        titleLabel2.setBounds(10, 210, 480, 40);
        titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel2.setForeground(Color.WHITE); // Set text color
        titleLabel2.setBackground(Color.BLUE); // Set background color
        titleLabel2.setOpaque(true); // Make the label opaque
        titleLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border


        JTextField accountTextField2 = new JTextField();
        accountTextField2.setFont(new Font("MV Boli", Font.BOLD, 20));
        accountTextField2.setBounds(75, 270, 350, 40);

        JButton generateButton = new JButton("L O G I N");
        generateButton.setFont(new Font("MV Boli", Font.BOLD, 18)); // Set font style
        generateButton.setBackground(new Color(0, 150, 136)); // Set background color
        generateButton.setForeground(Color.WHITE); // Set text color
        generateButton.setFocusPainted(false); // Remove focus border
        generateButton.setBounds(175,330, 150, 40 );

        generateButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String username = accountTextField1.getText();
            String password = accountTextField2.getText();
            match(username, password);
            }
            
        });

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(titleLabel1);
        frame.getContentPane().add(accountTextField1);
        frame.getContentPane().add(titleLabel2);
        frame.getContentPane().add(accountTextField2);
        frame.getContentPane().add(generateButton);
        frame.setVisible(true);    
    }

    public static void match(String username, String password) {
        String SecurityKey = "123456789";
        try {
            File file = new File("login.txt");
            Scanner scanner = new Scanner(file);
            boolean found = false;

            // Search for the selected account name in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Username: ")) {
                    String storedUsername = line.substring(10).trim().toLowerCase();
                    if (storedUsername.equals(username.toLowerCase())) {
                        if (scanner.hasNextLine()) {
                            line = scanner.nextLine();
                            if (line.startsWith("Password: ")) {
                                String storedPassword = line.substring(10).trim();
                                String decryptedPassword = aes_encryption.decrypt(storedPassword, SecurityKey);
                                if (decryptedPassword.equals(password)) {
                                    found = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            scanner.close();

            if (found) {
                Processbar();
            } else {
                JOptionPane.showMessageDialog(null, "Account not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving account details!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}