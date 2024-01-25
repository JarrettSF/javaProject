package gui;
import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JFrame window;

    //main window frame
    public MainWindow(){

    window = new JFrame();
    window.setTitle("Hello World");
    window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    window.setSize(800,500);
    window.setLocationRelativeTo(null);

        /* main panel */
    JPanel panel = new JPanel();

        JTextField text = new JTextField("Username");
        text.setPreferredSize(new Dimension(100,50));
        panel.add(text);

        JTextField text1 = new JTextField("Password");
        text1.setPreferredSize(new Dimension(100,50));
        panel.add(text1);

        JButton button = new JButton("Submit");
       // button.setLocation(null);
        panel.add(button);



        window.add(panel);

    }




    public void show(){

            window.setVisible(true);

    }

}
