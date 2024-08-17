import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class VowelsAndConsonantsGUI extends JFrame implements ActionListener{    
		JButton start;
		static String alp;
		static String a;
		VowelsAndConsonantsGUI(){
			super("Vowels And Consonants");
			setSize(300, 220);
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			start= new JButton("Start");
			start.addActionListener(this);
			GridLayout bord=new GridLayout();
			setLayout(bord); 
			pane.add(start);
			add (pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == start){
				alp=JOptionPane.showInputDialog(null, "Enter an alphabet", "Alphabet", JOptionPane.QUESTION_MESSAGE);
				a=alp.toUpperCase();
				if ((a.equals("A"))||(a.equals("E"))||(a.equals("I"))||(a.equals("O"))||(a.equals("U")))  
					JOptionPane.showMessageDialog(null, "The letter"+" "+alp+" "+"is a vowel", "Answer", JOptionPane.PLAIN_MESSAGE);
				else if ((a.equals("B"))||(a.equals("C"))||(a.equals("D"))||(a.equals("F"))||(a.equals("G"))||(a.equals("H"))||(a.equals("J"))||(a.equals("K"))||(a.equals("L"))||(a.equals("M"))||(a.equals("N"))||(a.equals("P"))||(a.equals("Q"))||(a.equals("R"))||(a.equals("S"))||(a.equals("T"))||(a.equals("V"))||(a.equals("W"))||(a.equals("X"))||(a.equals("Y"))||(a.equals("Z")))  
					JOptionPane.showMessageDialog(null, "The letter"+" "+alp+" "+"is a consonant", "Answer", JOptionPane.PLAIN_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null, "Invalid Input. Please enter an Alphabet.", "Error", JOptionPane.ERROR_MESSAGE);
  

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
		VowelsAndConsonantsGUI vacgui=new VowelsAndConsonantsGUI();
		vacgui.setLookAndFeel();
	}
}