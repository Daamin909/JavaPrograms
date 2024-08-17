import javax.swing.*;
class BasharatPic extends JFrame{
		JButton basharat;
		BasharatPic(){
		super("Basharat Pic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		ImageIcon bashart=new ImageIcon ("bash.jpg");
		basharat=new JButton("Basharat",bashart);
		panel.add(basharat);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		BasharatPic bp=new BasharatPic();
	}
}
		


