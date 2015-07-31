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




    private JComponent getConfigurationPanel(){

        JPanel panel = new JPanel();

        JLabel textLabel = new JLabel("Configuration Panel");
        panel.add(textLabel, BorderLayout.CENTER);

        return panel;
    }



    private JComponent getBootstrapPanel(){

        JPanel bootstrapPanel = new JPanel();

        JLabel textLabel = new JLabel("Bootstrap Panel");
        bootstrapPanel.add(textLabel, BorderLayout.CENTER);

        return bootstrapPanel;
    }



    public static void main(String[] args) {

        logger.info("Starting the main configuration interface.");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main  = new Main();
                main.setVisible(true);
            }
        });
    }


}
