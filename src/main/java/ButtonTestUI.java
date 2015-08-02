import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Test User Interface for the buttons in
 * the system.
 *
 * Created by babbar on 2015-07-31.
 */
public class ButtonTestUI extends JFrame{


    public ButtonTestUI(){

        init();

    }


    private void init(){

        JButton button = new JButton("Quit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Button Test");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createLayout(button);
    }

    private void createLayout(JComponent... arg){

        Container contentPane = getContentPane();
        GroupLayout gl = new GroupLayout(contentPane);
        contentPane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));


    }


    public static void main(String[] args) {

        System.out.println("Starting with the main test user interface.");


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ButtonTestUI ui = new ButtonTestUI();
                ui.setVisible(true);
            }
        });
    }



}
