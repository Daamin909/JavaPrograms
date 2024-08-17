import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AddSubMulDivGUIVersionTwo extends JFrame implements ActionListener{    
		JButton add;
		JButton sub;
		JButton mul;
		JButton div;
		JTextField num1;
		JTextField num2;
		JLabel fn;
		JLabel sn;
		static int a, b, c;
		static float d, e, f;
		AddSubMulDivGUIVersionTwo(){
			super("Playing with numbers again");
			setSize(300, 220);
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			add= new JButton("Add");
			add.addActionListener(this); 
			sub=new JButton("Subtract");
			sub.addActionListener(this); 
			mul=new JButton("Multiply");
			mul.addActionListener(this); 
			div= new JButton("Divide");
			div.addActionListener(this);
			num1=new JTextField(5);
			num2=new JTextField(5);
			fn=new JLabel("First Number");
			sn=new JLabel("Second Number");
			BorderLayout bord=new BorderLayout();
			setLayout(bord); 
			pane.add(fn);
			pane.add(num1);
			pane.add(sn);
			pane.add(num2);
			pane.add(add);
			pane.add(sub);
			pane.add(mul);
			pane.add(div);
			add (pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == add){
				int a=Integer.parseInt(num1.getText());
				int b=Integer.parseInt(num2.getText());
				c=a+b;
				JOptionPane.showMessageDialog(null, "The sum of two given numbers is"+" "+c, "Answer", JOptionPane.PLAIN_MESSAGE);
				num1.setText("");
				num2.setText("");
			}
			else if (source == sub){
				int a=Integer.parseInt(num1.getText());
				int b=Integer.parseInt(num2.getText());
				c=a-b;
				JOptionPane.showMessageDialog(null, "The difference of two given numbers is"+" "+c, "Answer", JOptionPane.PLAIN_MESSAGE);
				num1.setText("");
				num2.setText("");
			}
			else if (source == mul){
				int a=Integer.parseInt(num1.getText());
				int b=Integer.parseInt(num2.getText());
				c=a*b;
				JOptionPane.showMessageDialog(null, "The product of two given numbers is"+" "+c, "Answer", JOptionPane.PLAIN_MESSAGE);
				num1.setText("");
				num2.setText("");
			}
			else if (source == div){
				float e=Float.parseFloat(num1.getText());
				float f=Float.parseFloat(num2.getText());
				d=e/f;
				JOptionPane.showMessageDialog(null, "The quotient of two given numbers is"+" "+d,"Answer", JOptionPane.PLAIN_MESSAGE);
				num1.setText("");
				num2.setText("");
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
		AddSubMulDivGUIVersionTwo asmdguivt=new AddSubMulDivGUIVersionTwo();
		asmdguivt.setLookAndFeel();
	}
}