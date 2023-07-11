import java.awt.*;
import javax.swing.*;
public class gui{
    public static void main(String[] args){
        JFrame frame = new JFrame ("Test Frame");
        frame.setSize (new Dimension(300,200));
        frame.setLocation(100,100);
        Container contentPane = frame.getContentPane();
        JLabel label = new JLabel("HERE IS A LABEL");
        contentPane.add(label,BorderLayout.NORTH);
        JButton button = new JButton("BUTTON");
        contentPane.add(button,BorderLayout.SOUTH);
        //contentPane.setBackground(Color.red);
        frame.setVisible(true);
    }
}