import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Prank extends JFrame implements ActionListener{    
		JButton ok;
		JLabel prankLabel;
		JTextField prankField;
		String[] options= { "Accepted", "Declined" };
		String name;
		int response;
		Prank(){
			super("Challenge");
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			prankField= new JTextField(18);
			prankLabel= new JLabel("Try to enter you're name");
			int response=JOptionPane.showOptionDialog(null, "Challenge: Type you're name in the Text Box", "Challenge", 0,  JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (response==1)
				System.exit(0);
			ok=new JButton("Give Up");
			ok.addActionListener(this);
			prankField.addActionListener(this);
			pane.add(prankLabel);
			pane.add(prankField);
			pane.add(ok);
			add(pane);
			pack();
			prankField.setEditable(false);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){
			JOptionPane.showMessageDialog(null, "HAHAHAHAHAHA you lose", "You Lose", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	public static void main(String[] args){
		Prank p=new Prank();
	}
}