import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class OddEvenGUI extends JFrame implements ActionListener{    
		JButton ok;
		JLabel noLabel;
		JTextField noField;
		static long no, checker;
		OddEvenGUI(){
			super("Odd or Even");
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			noField= new JTextField(10);
			noLabel= new JLabel("Enter a Number");
			ok=new JButton("OK");
			ok.setBackground(Color.RED);
			ok.addActionListener(this);
			pane.add(noLabel);
			pane.add(noField);
			pane.add(ok);
			add(pane);
			pack();
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == ok){     
				no=Long.parseLong(noField.getText());
				noField.setText("");	
				checker=no%2;
				if (checker==0)		
					JOptionPane.showMessageDialog(null, "The number"+" "+no+" "+"is an even number", "Answer", JOptionPane.PLAIN_MESSAGE);		
				else if (checker!=0)
					JOptionPane.showMessageDialog(null, "The number"+" "+no+" "+"is an odd number", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			repaint();				
		}
	public static void main(String[] args) throws NumberFormatException{
		OddEvenGUI oegui=new OddEvenGUI();
	}
}