import javax.swing.*;
class ChildrenPic extends JFrame{
		JButton dawar, daamin;
		ChildrenPic(){
		super("Children Pic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		ImageIcon daawar=new ImageIcon ("dawar.jpg");
		ImageIcon damin=new ImageIcon ("daamin.jpg");
		daamin=new JButton("Daamin",damin);
		dawar=new JButton("Dawar",daawar);
		panel.add(daamin);
		panel.add(dawar);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		ChildrenPic cp=new ChildrenPic();
	}
}
		