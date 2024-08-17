import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColourChanger extends JFrame implements ActionListener{    
		JButton daamin, red, blue, green, yellow;
		ColourChanger(){
			super("Colour Changer");
			setSize(300, 220);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			daamin=new JButton("Daamin Ashai");
			daamin.addActionListener(this);
			red=new JButton("Red");
			red.setBackground(Color.RED);
			red.setOpaque(true);
			red.addActionListener(this);
			blue=new JButton("Blue");
			blue.setBackground(Color.BLUE);
			blue.setOpaque(true);
			blue.addActionListener(this);
			green=new JButton("Green");
			green.setBackground(Color.GREEN);
			green.setOpaque(true);
			green.addActionListener(this);
			yellow=new JButton("Yellow");
			yellow.setBackground(Color.YELLOW);
			yellow.setOpaque(true);
			yellow.addActionListener(this);
			pane.add(daamin);
			pane.add(red);
			pane.add(blue);
			pane.add(green);
			pane.add(yellow);
			add(pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == daamin){
				JOptionPane.showMessageDialog(null, "Please press another button", "Error", JOptionPane.ERROR_MESSAGE);	
			}
			else if (source == red){
			daamin.setBackground(Color.RED);
			daamin.setOpaque(true);
			}
			else if (source == blue){
			daamin.setBackground(Color.BLUE);
			daamin.setOpaque(true);
			}
			else if (source == green){
			daamin.setBackground(Color.GREEN);
			daamin.setOpaque(true);
			}
			else if (source == yellow){
			daamin.setBackground(Color.YELLOW);
			daamin.setOpaque(true);
			}
			repaint();
		}
		
		void setLookAndFeel() {
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				SwingUtilities.updateComponentTreeUI(this);
			}
			catch (Exception exc) {
				System.err.println("Couldn't use the system "+"look and feel:"+exc);
			}
		}

	public static void main(String[] args){
		ColourChanger cc=new ColourChanger();
		cc.setLookAndFeel();
	}
}