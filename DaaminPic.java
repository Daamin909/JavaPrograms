import javax.swing.*;
class DaaminPic extends JFrame{
		JButton daamin;
		DaaminPic(){
		super("Daamin Pic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		ImageIcon damin=new ImageIcon ("daamin.jpg");
		daamin=new JButton("Daamin",damin);
		panel.add(daamin);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		DaaminPic dp=new DaaminPic();
	}
}
		