import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class FactorsGUI extends JFrame implements ActionListener{    
		JButton ok;
		JLabel noLabel;
		JTextField noField, factorField;
		long no, a, temp;
		String ans, c;
		int b;
		ArrayList<Long> factor=new ArrayList<Long>();
		FactorsGUI(){
			super("Factors");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			noField= new JTextField(10);
			factorField= new JTextField(10);
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
				c=factorField.getText();
				for (a=1; a<=no; a++){
					if ((no==0)||(no==1))
						JOptionPane.showMessageDialog(null, "Please enter a number higher than 1", "Error", JOptionPane.ERROR_MESSAGE);
					else if (no%a==0)
						factor.add(a);
				}
				for (b=0; b<=factor.size()-1; b++){
					if (c.equals("0")){
						temp=factor.get(b);
						factorField.setText(String.valueOf(temp));
						c=factorField.getText();	
					}
					else{
						temp=factor.get(b);
						factorField.setText(c+","+" "+temp);
						c=factorField.getText();
					}
				}
				ans=factorField.getText();
				JOptionPane.showMessageDialog(null, "The factors of the number"+" "+no+" "+"are as follows"+" "+ans, "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			repaint();	
			no=0;
			a=0;
			temp=0;
			ans="0";
			c="0";
			b=0;	
			factorField.setText("");
			factor.clear();
			noField.setText("");		
		}
	public static void main(String[] args){
		FactorsGUI fgui=new FactorsGUI();
	}
}