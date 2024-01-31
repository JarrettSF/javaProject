package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.DefaultCaret;


public class MainWindow {

// creates frame for new window called in button 1
    public static void createFrame()
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                JTextArea textArea = new JTextArea(15, 50);
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);
                textArea.setFont(Font.getFont(Font.SANS_SERIF));
                JScrollPane scroller = new JScrollPane(textArea);
                scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JTextField input = new JTextField(20);
                JButton button = new JButton("Enter");
                DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                panel.add(scroller);
                inputpanel.add(input);
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.pack();
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
                input.requestFocus();
            }
        });
    }

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

//button1 calls new window
                JButton button1 = new JButton("Next");
                panel.add(button1);
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        createFrame();
                    }
                });

        window.add(panel);

    }




    public void show(){

            window.setVisible(true);

    }

}
