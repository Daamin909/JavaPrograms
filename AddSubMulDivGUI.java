import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AddSubMulDivGUI extends JFrame implements ActionListener{    
		JButton add;
		JButton sub;
		JButton mul;
		JButton div;
		static int a, b, c;
		static float d, e, f;
		AddSubMulDivGUI(){
			super("Playing With Numbers");
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
			BorderLayout bord=new BorderLayout();
			setLayout(bord); 
			pane.add("Center East", add);
			pane.add("Center", sub);
			pane.add("Center West", mul);
			pane.add("South", div);
			add (pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == add){
				int a=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the First Number", "First Number", JOptionPane.QUESTION_MESSAGE));
				int b=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Second Number", "Second Number", JOptionPane.QUESTION_MESSAGE));
				c=a+b;
				JOptionPane.showMessageDialog(null, a+"+"+b+"="+c, "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == sub){
				int a=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the First Number", "First Number", JOptionPane.QUESTION_MESSAGE));
				int b=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Second Number", "Second Number", JOptionPane.QUESTION_MESSAGE));
				c=a-b;
				JOptionPane.showMessageDialog(null, a+"-"+b+"="+c, "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == mul){
				int a=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the First Number", "First Number", JOptionPane.QUESTION_MESSAGE));
				int b=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Second Number", "Second Number", JOptionPane.QUESTION_MESSAGE));
				c=a*b;
				JOptionPane.showMessageDialog(null, a+"x"+b+"="+c, "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == div){
				float e=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the First Number", "First Number", JOptionPane.QUESTION_MESSAGE));
				float f=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the Second Number", "Second Number", JOptionPane.QUESTION_MESSAGE));
				d=e/f;
				JOptionPane.showMessageDialog(null, e+"/"+f+"="+d, "Answer", JOptionPane.PLAIN_MESSAGE);
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
		AddSubMulDivGUI asmdgui=new AddSubMulDivGUI();
		asmdgui.setLookAndFeel();
	}
}