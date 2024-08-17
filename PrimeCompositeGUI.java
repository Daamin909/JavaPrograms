import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class PrimeCompositeGUI extends JFrame implements ActionListener{    
		JButton ok;
		JLabel noLabel;
		JTextField noField;
		static long no;
		static int a, b, c;
		PrimeCompositeGUI(){
			super("Prime or Composite");
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
				for (b=2; b<=no/2; b++){
					if (no%b==0)
						c++;
				}
				if (c<=1)	
					JOptionPane.showMessageDialog(null, "The number"+" "+no+" "+"is a prime number", "Answer", JOptionPane.PLAIN_MESSAGE);		
				else if(c>1)
					JOptionPane.showMessageDialog(null, "The number"+" "+no+" "+"is a composite number", "Answer", JOptionPane.PLAIN_MESSAGE);
				c=0;
			}
			repaint();				
		}
	public static void main(String[] args) throws NumberFormatException{
		PrimeCompositeGUI pcgui=new PrimeCompositeGUI();
	}
}