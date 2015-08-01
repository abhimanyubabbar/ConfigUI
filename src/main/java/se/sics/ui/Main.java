package se.sics.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Main class representing the UI for setting
 * the configuration for the application.
 *
 * Created by babbar on 2015-07-31.
 */
public class Main extends JFrame {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public Main() {

        logger.info("Main component booted up.");
        init();
    }

    private void init(){


        Container contentPane = getContentPane();
        contentPane.add(getTabbedPane(), BorderLayout.CENTER);

//      MAIN SCREEN CONFIGURATION.
        setTitle("DY Configuration.");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    /**
     * Construct a tabbed pane containing information
     * about various other panes.
     *
     * @return tabbed-pane.
     */
    private JComponent getTabbedPane() {

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Configuration", getConfigurationPanel());
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        tabbedPane.addTab("Bootstrap", getBootstrapPanel());
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        return tabbedPane;
    }


    /**
     * Construct panel for setting the configuration for the
     * main application.
     *
     * @return
     */
    private JComponent getConfigurationPanel(){

        JPanel panel = new JPanel();
        JLabel textLabel = new JLabel("Configuration Panel");

        panel.setLayout(new BorderLayout());
        panel.add(textLabel, BorderLayout.NORTH);

        return panel;
    }



    private JComponent getBootstrapPanel(){

        JPanel bootstrapPanel = new JPanel();

//      BOOTSTRAP COMPONENTS.

        JLabel bootstrapIpLabel = new JLabel("IP");
        JTextField bootstrapIpField = new JTextField(15);

        JLabel bootstrapPortLabel = new JLabel("PORT");
        JTextField bootstrapPortField = new JTextField(5);

        JLabel bootstrapIdLabel = new JLabel("IDENTIFIER");
        JTextField bootstrapIdField = new JTextField(20);

        GroupLayout gpLayout = new GroupLayout(bootstrapPanel);
        bootstrapPanel.setLayout(gpLayout);

        gpLayout.setAutoCreateGaps(true);
        gpLayout.setAutoCreateContainerGaps(true);


        gpLayout.setHorizontalGroup(
                gpLayout.createSequentialGroup()
                        .addGroup(gpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bootstrapIpLabel)
                                        .addComponent(bootstrapPortLabel)
                                        .addComponent(bootstrapIdLabel)
                        )
                        .addGroup(gpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bootstrapIpField)
                                        .addComponent(bootstrapPortField)
                                        .addComponent(bootstrapIdField)
                        ));


        gpLayout.setVerticalGroup(
                gpLayout.createSequentialGroup()
                .addGroup(gpLayout.createParallelGroup()
                        .addComponent(bootstrapIpLabel)
                        .addComponent(bootstrapIpField)
                )
                .addGroup(gpLayout.createParallelGroup()
                        .addComponent(bootstrapPortLabel)
                        .addComponent(bootstrapPortField)
                )
                .addGroup(gpLayout.createParallelGroup()
                        .addComponent(bootstrapIdLabel)
                        .addComponent(bootstrapIdField)
                )
        );

        return bootstrapPanel;
    }



    public static void main(String[] args) {

        logger.info("Starting the main configuration interface.");
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                Main main  = new Main();
                main.setVisible(true);
            }
        });
    }


}
