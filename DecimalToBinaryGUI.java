import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DecimalToBinaryGUI extends JFrame implements ActionListener{    
		JButton ok, clear;
		JTextField field;
		JTextArea inputField;
		JLabel l1, l2;
		static long decimal, c, a, b;
		static String result=" ";
		DecimalToBinaryGUI(){
			super("Decimal To Binary Converter");
			setSize(701, 100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			ok= new JButton("Calculate");
			ok.addActionListener(this);
			clear= new JButton("Clear");
			clear.addActionListener(this);
			inputField= new JTextArea(2, 15);
			field= new JTextField(15);
			l1= new JLabel("Decimal:");
			l2= new JLabel("Binary:");
			ok.setBackground(Color.GREEN);
			clear.setBackground(Color.YELLOW);
			inputField.setEditable(false);
			pane.add(l1);
			pane.add(field);
			pane.add(l2);				
			pane.add(inputField);
			pane.add(ok);
			pane.add(clear);
			add (pane);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source==ok){
				calculator();
			}
			else if (source==clear){
				clear();
				inputField.setText("");
			}													
			repaint();
		}
		
		void calculator() {
			try{
				decimal=Long.parseLong(field.getText());
			}
			catch(NullPointerException|NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Invalid Input, Please try again", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			if (decimal==1){
				inputField.setText("1");
			}
			else if(decimal==0){
				inputField.setText("0");
			}

			for(a=0; a<=2147483647; a++){

				if((decimal!=0)&&(decimal!=1)){
					c=decimal%2;
					decimal=decimal/2;
					result= result.concat(Long.toString(c));

				}
				else if(decimal==1){
					decimal=0;
					result= result.concat("1");
				}
				else if(decimal<=0){
					StringBuilder ans = new StringBuilder();
					ans.append(result);
					ans.reverse();
					result=ans.toString();
					inputField.setText(result);
					clear();
					a=2147483647;
				}		
			}

		}
	
	void clear(){
		
		field.setText("");
		decimal=0;
		c=0;
		a=0; 
		b=0;
		result=" ";
		System.out.flush();
	}
	public static void main(String[] args){
		DecimalToBinaryGUI dtbgui=new DecimalToBinaryGUI();
	}
}