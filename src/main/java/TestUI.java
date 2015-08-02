import javax.swing.*;
import java.awt.*;

/**
 * Test the basic swign functionality.
 *
 * Created by babbar on 2015-07-31.
 */
public class TestUI extends JFrame {

    public TestUI() {
        init();
    }


    private void init() {

        setTitle("Test Interface");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {

                TestUI ui = new TestUI();
                ui.setVisible(true);
            }
        });
    }

}