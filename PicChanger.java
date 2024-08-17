import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PicChanger extends JFrame implements ActionListener{
		JButton dawar, daamin;
		ImageIcon dam, daw;
		PicChanger(){
			super("Pic Changer");
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel=new JPanel();
			daw=new ImageIcon("dawar.jpg");
			dam=new ImageIcon("daamin.jpg");
			daamin=new JButton(dam);
			daamin.addActionListener(this);
			dawar=new JButton(daw);			
			dawar.addActionListener(this);			
			BorderLayout bord=new BorderLayout();
			setLayout(bord); 
			panel.add(daamin);
			panel.add(dawar);
			dawar.setVisible(false);
			add(panel);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == daamin){
				daamin.setVisible(false);
				dawar.setVisible(true);
			}
			if (source == dawar){
				dawar.setVisible(false);
				daamin.setVisible(true);
			}			
			repaint();				
		}
	public static void main(String[] args){
		PicChanger pc=new PicChanger();
	}
}
	


