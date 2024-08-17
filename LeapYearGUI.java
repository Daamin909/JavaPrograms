import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LeapYearGUI extends JFrame implements ActionListener{    
		JButton ok;
		JLabel yearLabel;
		JTextField yearField;
		static int year;
		static boolean notInt;
		LeapYearGUI(){
			super("Find the leap year");
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			yearField= new JTextField(4);
			yearLabel= new JLabel("Enter a year");
			ok= new JButton("OK");
			ok.setBackground(Color.BLUE);
			ok.addActionListener(this);
			pane.add(yearLabel);
			pane.add(yearField);
			pane.add(ok);
			add(pane);
			pack();
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == ok){
				String input;
				input=yearField.getText();
				checkNumber(input);
				if ((notInt==false)&&(year==0)){
					JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
					yearField.setText("");
					notInt=false;
					year=0;
				}	
				else if ((year>0)&&(year%4==0))
				{
					JOptionPane.showMessageDialog(null, "Year"+" "+year+" "+"is a leap year", "Answer", JOptionPane.PLAIN_MESSAGE);
					yearField.setText("");
					notInt=false;
					year=0;
				}
				else if((year>0)&&(year%4!=0))
				{
					JOptionPane.showMessageDialog(null, "Year"+" "+year+" "+"is a not leap year", "Answer", JOptionPane.PLAIN_MESSAGE);
					yearField.setText("");
					notInt=false;
					year=0;
				}
			}
			repaint();				
		}
		void checkNumber(String x){
			try{
				year=Integer.parseInt(x);	
			}
			catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
				yearField.setText("");
				notInt=true;
				year=0;
			}
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
		LeapYearGUI lygui=new LeapYearGUI();
		lygui.setLookAndFeel();
	}
}