import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TitleChanger extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;

    public TitleChanger() {
        super("Title Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setLookAndFeel();
        b1 = new JButton("Daamin");
        b2 = new JButton("Dawar");
        b1.addActionListener(this);
        b2.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == b1) {
            setTitle("Daamin");
        } else if (source == b2) {
            setTitle("Dawar");
        }
        repaint();
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + exc);
        }
    }

    public static void main(String[] arguments) {
        TitleChanger frame = new TitleChanger();
    }
}