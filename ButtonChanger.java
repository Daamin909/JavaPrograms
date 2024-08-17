import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonChanger extends JFrame implements ActionListener{    
		JButton basharat, daamin, dawar, jozy;
		JPanel pane;
		ButtonChanger(){
			super("Button Changer");
			setSize(300, 220);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pane=new JPanel();
			daamin=new JButton("Daamin Ashai");
			daamin.setBackground(Color.BLUE);
			daamin.setOpaque(true);
			daamin.addActionListener(this); 
			basharat=new JButton("Basharat Hamid Ashai");
			basharat.setBackground(Color.GREEN);
			basharat.setOpaque(true);
			basharat.addActionListener(this); 
			jozy=new JButton("Jozy Naqshbandi");
			jozy.setBackground(Color.PINK);
			jozy.setOpaque(true);
			jozy.addActionListener(this); 
			dawar=new JButton("Dawar Ashai");
			dawar.setBackground(Color.RED);
			dawar.setOpaque(true);
			dawar.addActionListener(this); 
			pane.add(basharat);
			pane.add(jozy);
			pane.add(daamin);
			pane.add(dawar);
			dawar.setVisible(false);
			jozy.setVisible(false);
			add (pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == daamin){
				daamin.setVisible(false);
				dawar.setVisible(true);
			}
			else if (source == basharat){
				basharat.setVisible(false);
				jozy.setVisible(true);
			}
			else if (source == jozy){
				jozy.setVisible(false);
				basharat.setVisible(true);
			}
			else if (source == dawar){
				dawar.setVisible(false);
				daamin.setVisible(true);
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
		ButtonChanger bc=new ButtonChanger();
		bc.setLookAndFeel();
	}
}