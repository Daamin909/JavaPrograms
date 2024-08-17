import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FamilyPic extends JFrame implements ActionListener{
		JButton dawar, daamin, jozy, basharat, photo, clear, da, dajr, jn, ba;
		JPanel panel;
		ImageIcon photos, damin, daawar, bashart, joozy;
		static int w, x, y, z;
		FamilyPic(){
			super("Family Pic");
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel=new JPanel();
			photos=new ImageIcon("information.jpg");
			damin=new ImageIcon("daamin.jpg");
			daawar=new ImageIcon("dawar.jpg");
			joozy=new ImageIcon("jozy.jpg");
			bashart=new ImageIcon("bash.jpg");
			photo=new JButton(photos);
			da=new JButton(damin);
			dajr=new JButton(daawar);
			jn=new JButton(joozy);
			ba=new JButton(bashart);
			basharat=new JButton("Basharat");
			basharat.setBackground(Color.GREEN);
			basharat.addActionListener(this);
			daamin=new JButton("Daamin");
			daamin.setBackground(Color.BLUE);
			daamin.addActionListener(this);
			dawar=new JButton("Dawar");			
			dawar.setBackground(Color.RED);
			dawar.addActionListener(this);			
			jozy=new JButton("Jozy");
			jozy.setBackground(Color.PINK);
			jozy.addActionListener(this);
			clear=new JButton("Clear");
			clear.addActionListener(this);
			BorderLayout bord=new BorderLayout();
			setLayout(bord); 
			panel.add(ba);
			panel.add(jn);
			panel.add(dajr);
			panel.add(da);
			panel.add(photo);
			panel.add(daamin);
			panel.add(dawar);
			panel.add(jozy);
			panel.add(basharat);
			panel.add(clear);
			da.setVisible(false);
			dajr.setVisible(false);
			jn.setVisible(false);
			ba.setVisible(false);
			add(panel);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == daamin){
			da.setVisible(true);
			photo.setVisible(false);
			dajr.setVisible(false);
			jn.setVisible(false);
			ba.setVisible(false);
			}
			if (source == basharat){
			da.setVisible(false);
			photo.setVisible(false);
			dajr.setVisible(false);
			jn.setVisible(false);
			ba.setVisible(true);
			}			
			if (source == dawar){
			da.setVisible(false);
			photo.setVisible(false);
			dajr.setVisible(true);
			jn.setVisible(false);
			ba.setVisible(false);
			}			
			if (source == clear){
			da.setVisible(false);
			photo.setVisible(true);
			dajr.setVisible(false);
			jn.setVisible(false);
			ba.setVisible(false);	
			}			
			if (source == jozy){
			da.setVisible(false);
			photo.setVisible(false);
			dajr.setVisible(false);
			jn.setVisible(true);
			ba.setVisible(false);
			}	
			repaint();				
		}
	public static void main(String[] args){
		FamilyPic fp=new FamilyPic();
	}
}
	


