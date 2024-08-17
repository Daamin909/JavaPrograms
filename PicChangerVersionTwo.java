import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PicChangerVersionTwo extends JFrame implements ActionListener{
		JButton dawar, daamin, jozy, basharat;
		ImageIcon dam, daw, joz, bas;
		PicChangerVersionTwo(){
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
			joz=new ImageIcon("jozy.jpg");
			bas=new ImageIcon("bash.jpg");
			jozy=new JButton(joz);
			jozy.addActionListener(this);
			basharat=new JButton(bas);			
			basharat.addActionListener(this);			
			BorderLayout bord=new BorderLayout();
			setLayout(bord); 
			panel.add(daamin);
			panel.add(dawar);
			panel.add(jozy);
			panel.add(basharat);
			dawar.setVisible(false);
			jozy.setVisible(false);
			basharat.setVisible(false);
			add(panel);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == daamin){
				daamin.setVisible(false);
				dawar.setVisible(true);
				jozy.setVisible(false);
				basharat.setVisible(false);
			}
			if (source == dawar){
				dawar.setVisible(false);
				daamin.setVisible(false);
				jozy.setVisible(true);
				basharat.setVisible(false);
			}
			if (source == jozy){
				daamin.setVisible(false);
				dawar.setVisible(false);
				jozy.setVisible(false);
				basharat.setVisible(true);
			}
			if (source == basharat){
				daamin.setVisible(true);
				dawar.setVisible(false);
				jozy.setVisible(false);
				basharat.setVisible(false);
			}			
			repaint();				
		}
	public static void main(String[] args){
		PicChangerVersionTwo pcvt=new PicChangerVersionTwo();
	}
}
	


