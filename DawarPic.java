import javax.swing.*;
class DawarPic extends JFrame{
		JButton daawar;
		DawarPic(){
		super("Dawar Pic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		ImageIcon dawar=new ImageIcon ("dawar.jpg");
		daawar=new JButton("Dawar",dawar);
		panel.add(daawar);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		DawarPic dp=new DawarPic();
	}
}
		