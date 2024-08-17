import javax.swing.*;
class ParentsPic extends JFrame{
		JButton jozy, basharat;
		ParentsPic(){
		super("Parents Pic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		ImageIcon joozy=new ImageIcon ("jozy.jpg");
		ImageIcon bashart=new ImageIcon ("bash.jpg");
		jozy=new JButton("Jozy", joozy);
		basharat=new JButton("Basharat", bashart);
		panel.add(jozy);
		panel.add(basharat);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		ParentsPic pp=new ParentsPic();
	}
}
		