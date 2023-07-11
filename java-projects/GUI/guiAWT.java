import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class guiAWT extends Frame{
    guiAWT(){
        Label l1;
        setTitle("This is an example of a simple GUI");
        Frame f = new Frame();
        
        Button b = new Button("Click me");

        b.setBounds(80, 100, 80, 30);
        add(b);
        f.setSize(300,300);
        l1 = new Label("This is label!");
        l1.setBounds(80,100,80,30);
        f.add(l1);
        

        f.setLayout(null);

        f.setVisible(true);
        
        
    }
    public static void main(String[] args){
        guiAWT t = new guiAWT();
    }

}
