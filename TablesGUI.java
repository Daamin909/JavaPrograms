import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TablesGUI extends JFrame implements ActionListener{    
		JButton one;
		JButton two;
		JButton three;
		JButton four;
		JButton five;
		JButton six;
		JButton seven;
		JButton eight;
		JButton nine;
		JButton ten;
		static int a, b, c, d;
		TablesGUI(){
			super("Tables");
			setSize(300, 220);
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			one= new JButton("1");
			one.addActionListener(this); 
			two=new JButton("2");
			two.addActionListener(this); 
			three=new JButton("3");
			three.addActionListener(this); 
			four= new JButton("4");
			four.addActionListener(this);
			five= new JButton("5");
			five.addActionListener(this); 
			six= new JButton("6");
			six.addActionListener(this); 
			seven= new JButton("7");
			seven.addActionListener(this); 
			eight= new JButton("8");
			eight.addActionListener(this); 
			nine= new JButton("9");
			nine.addActionListener(this); 
			ten= new JButton("10");
			ten.addActionListener(this); 
			BorderLayout bord=new BorderLayout();
			setLayout(bord); 
			pane.add(one);
			pane.add(two);
			pane.add(three);
			pane.add(four);
			pane.add(five);
			pane.add(six);
			pane.add(seven);
			pane.add(eight);
			pane.add(nine);
			pane.add(ten);
			add (pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == one){
				JOptionPane.showMessageDialog(null, "1x1=1\n1x2=2\n1x3=3\n1x4=4\n1x5=5\n1x6=6\n1x7=7\n1x8=8\n1x9=9\n1x10=10", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == two){
				JOptionPane.showMessageDialog(null, "2x1=2\n2x2=4\n2x3=6\n2x4=8\n2x5=10\n2x6=12\n2x7=14\n2x8=16\n2x9=18\n2x10=20", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == three){
				JOptionPane.showMessageDialog(null, "3x1=3\n3x2=6\n3x3=9\n3x4=12\n3x5=15\n3x6=18\n3x7=21\n3x8=24\n3x9=27\n3x10=30", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == four){
				JOptionPane.showMessageDialog(null, "4x1=4\n4x2=8\n4x3=12\n4x4=16\n4x5=20\n4x6=24\n4x7=28\n4x8=32\n4x9=36\n4x10=40", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == five){
				JOptionPane.showMessageDialog(null, "5x1=5\n5x2=10\n5x3=15\n5x4=20\n5x5=25\n5x6=30\n5x7=35\n5x8=40\n5x9=45\n5x10=50", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == six){
				JOptionPane.showMessageDialog(null, "6x1=6\n6x2=12\n6x3=18\n6x4=24\n6x5=30\n6x6=36\n6x7=42\n6x8=45\n6x9=54\n6x10=60", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == seven){
				JOptionPane.showMessageDialog(null, "7x1=7\n7x2=14\n7x3=21\n7x4=28\n7x5=35\n7x6=42\n7x7=49\n7x8=56\n7x9=63\n7x10=70", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == eight){
				JOptionPane.showMessageDialog(null, "8x1=8\n8x2=16\n8x3=24\n8x4=32\n8x5=40\n8x6=48\n8x7=56\n8x8=63\n8x9=72\n8x10=80", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == nine){
				JOptionPane.showMessageDialog(null, "9x1=9\n9x2=18\n9x3=27\n9x4=36\n9x5=45\n9x6=54\n9x7=63\n9x8=72\n9x9=81\n9x10=90", "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (source == ten){
				JOptionPane.showMessageDialog(null, "10x1=10\n10x2=20\n10x3=30\n10x4=40\n10x5=50\n10x6=60\n10x7=70\n10x8=80\n10x9=90\n10x10=100", "Answer", JOptionPane.PLAIN_MESSAGE);
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
		TablesGUI tgui=new TablesGUI();
		tgui.setLookAndFeel();
	}
}