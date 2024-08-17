import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Exam extends JFrame implements ActionListener{    
		JButton test1, test2, test3, test4;
		Exam(){
			super(" Start the Exam");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			test1=new JButton("Maths 1");
			test1.addActionListener(this);
			test1.setBackground(Color.BLUE);
			test2=new JButton("Maths 2");
			test2.addActionListener(this);
			test2.setBackground(Color.RED);
			test3=new JButton("Maths 3");
			test3.addActionListener(this);
			test3.setBackground(Color.GREEN);
			test4=new JButton("Maths 4");
			test4.addActionListener(this);
			test4.setBackground(Color.YELLOW);
			pane.add(test1);
			pane.add(test2);
			pane.add(test3);
			pane.add(test4);
			add(pane);
			pack();
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == test1){
				MathsExam1 mee1=new MathsExam1();
			}
			else if (source == test2){
				MathsExam2 mee2=new MathsExam2();
			}
			else if (source == test3){
				MathsExam3 mee3=new MathsExam3();
			}
			else if (source == test4){
				MathsExam4 mee4=new MathsExam4();
			}
			repaint();				
		}
	public static void main(String[] args){
		Exam e=new Exam();
	}
}