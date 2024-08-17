import javax.swing.*;
class JozyPic extends JFrame{
		JButton jozy;
		JozyPic(){
		super("Jozy Pic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		ImageIcon joozy=new ImageIcon ("jozy.jpg");
		jozy=new JButton("Jozy", joozy);
		panel.add(jozy);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		JozyPic jp=new JozyPic();
	}
}
		


