import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class NumberReversalGUI extends JFrame implements ActionListener{    
		JButton ok;
		JLabel noLabel;
		JTextField noField, checkField;
		int a, b, d, length, ans, c;
		String no, e;
		ArrayList<String>reverNum=new ArrayList<String>();
		NumberReversalGUI(){
			super("Number Reversal");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			noField= new JTextField(10);
			checkField= new JTextField(10);
			noLabel= new JLabel("Enter a Number");
			ok= new JButton("OK");
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
				no=noField.getText();
				checkField.setText("0");
				c=Integer.parseInt(checkField.getText());
				length=no.length();
				d=length;
				d--;
				for (a=1; a<=length; a++){
					e=String.valueOf(no.charAt(d));
					reverNum.add(e);
					d--;
				}
				length=reverNum.size();
				d=length;
				for (a=1; a<=d; a++){
					if (c==0){
						checkField.setText(String.valueOf(reverNum.get(length-1)));
						c=Integer.parseInt(checkField.getText());
					}
					else{
						checkField.setText(String.valueOf(reverNum.get(length-1)+c));
						c=Integer.parseInt(checkField.getText());
					}	
					length--;
				}
			}
			ans=Integer.parseInt(checkField.getText());	
			JOptionPane.showMessageDialog(null, "The reversed number is"+" "+ans, "Answer", JOptionPane.PLAIN_MESSAGE);
			a=0;
			noField.setText("");
			checkField.setText("");
			reverNum.clear();
			b=0;
			c=0;
			d=0;
			length=0;
			e="0";
			no="0";
			ans=0;
			repaint();				
		}
	public static void main(String[] args){
		NumberReversalGUI nrgui=new NumberReversalGUI();
	}
}