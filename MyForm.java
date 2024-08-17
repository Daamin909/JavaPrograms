import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyForm extends JFrame implements ActionListener{    
		JButton ok;
		JTextField name;
		JTextField age;
		JTextField mobno;
		JTextArea schoff;
		JTextArea con;
		JTextArea email;
		JTextArea fn;
		JTextArea mn;
		JLabel nameLabel;
		JLabel ageLabel;
		JLabel mobnoLabel;
		JLabel schoffLabel; 	
		JLabel conLabel;
		JLabel emailLabel;
		JLabel fnLabel;
		JLabel mnLabel;
		MyForm(){
			super("Form");
			setSize(300, 220);
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			nameLabel=new JLabel("Name: ");
			ageLabel=new JLabel("Age: ");
			mobnoLabel=new JLabel("Mobile No: ");
			schoffLabel = new JLabel("Name of school or office:");
			conLabel = new JLabel("Country:");
			emailLabel = new JLabel("Email id:");
			fnLabel = new JLabel("Fathers name:");
			mnLabel = new JLabel("Mothers name:");
			name=new JTextField(20);
			age=new JTextField(5);
			mobno=new JTextField(10);
			schoff=new JTextArea(20, 20);
			con=new JTextArea(20, 20);
			email=new JTextArea(20, 20);
			fn=new JTextArea(20, 20);
			mn=new JTextArea(20, 20);
			ok = new JButton("Submit");
			ok.addActionListener(this); 
			pane.add("North West", nameLabel);
			pane.add("North West", name);
			pane.add("North", ageLabel);
			pane.add("North", age);
			pane.add("North East", mobnoLabel);
			pane.add("North East", mobno);
			pane.add("Center West", schoffLabel);
			pane.add("Center West", schoff);
			pane.add("Center", conLabel);
			pane.add("Center", con);
			pane.add("Center East", emailLabel);
			pane.add("Center East", email);
			pane.add("South West", mnLabel);
			pane.add("South West", mn);
			pane.add("South East", fnLabel);
			pane.add("South East", fn);
			pane.add("South", ok);
			add (pane);
			pack();
			name.getText();
			age.getText();
			mobno.getText();
			schoff.getText();
			email.getText();
			con.getText();
			mn.getText();
			fn.getText();

			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == ok){
				JOptionPane.showMessageDialog(null, "Thank You", "Message", JOptionPane.PLAIN_MESSAGE);
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
		MyForm mf=new MyForm();
		mf.setLookAndFeel();
	}
}