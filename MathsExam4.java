import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MathsExam4 extends JFrame implements ActionListener{    
		JButton result, next;
		JRadioButton[] ans=new JRadioButton[4];
		ButtonGroup bg=new ButtonGroup();
		JLabel question;
		int checker1;
		String q;
		MathsExam4(){
			super("Exam");
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			question=new JLabel("2 x 3 = ?");
			ans[0]=new JRadioButton("8");
			ans[1]=new JRadioButton("10");
			ans[2]=new JRadioButton("6");
			ans[3]=new JRadioButton("14");
			bg.add(ans[0]);
			bg.add(ans[1]);
			bg.add(ans[2]);
			bg.add(ans[3]);
			result=new JButton("Result");
			result.addActionListener(this);
			next=new JButton("Next");
			next.addActionListener(this);
			pane.add(question);
			pane.add(ans[0]);
			pane.add(ans[1]);
			pane.add(ans[2]);
			pane.add(ans[3]);
			pane.add(result);
			pane.add(next);
			add(pane);
			result.setEnabled(false);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == next){
				q=question.getText();
				if (ans[0].isSelected()){
					q=question.getText();
					if (q.equals("232 - 67 = ?")){
						checker1++;
					}
					else if (q.equals("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?")){
						checker1++;
		  			}
					else if (q.equals("2 x 10 = ?")){
						checker1++;
					}
					else if (q.equals("457653 is a odd number or an even number")){
						checker1++;
					}		
				}
				else if (ans[1].isSelected()){
					q=question.getText();
					 if (q.equals("210 _ 1092")){
						checker1++;
					}
					else if (q.equals("908724 is a odd number or an even number")){
						checker1++;
					}
					else if (q.equals("102 + 22 = ?")){
						checker1++;
					}
					else if (q.equals("2431 + 0 = 24310")){
						checker1++;
					}
				}
				else if (ans[2].isSelected()){
					q=question.getText();
					if (q.equals("2 x 3 = ?")){
						checker1++;
					}	
				}
				else if (ans[3].isSelected()){
					q=question.getText();
					if (q.equals("125 ___ 127")){
						checker1++;
					}
				}
				if (q.equals("2 x 3 = ?")){
					bg.clearSelection();
					question.setText("210 _ 1092");
					ans[0].setText("=");
					ans[1].setText("<");
					ans[2].setText(">");
					ans[3].setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("210 _ 1092")){
					bg.clearSelection();
					question.setText("908724 is a odd number or an even number");
					ans[0].setText("odd");
					ans[1].setText("even");
					ans[2].setText("I don't know");
					ans[3].setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("908724 is a odd number or an even number")){
					bg.clearSelection();
					question.setText("102 + 22 = ?");
					ans[0].setText("123");
					ans[1].setText("124");
					ans[2].setText("122");
					ans[3].setText("80");
					q=question.getText();
				}
				else if (q.equals("102 + 22 = ?")){
					bg.clearSelection();
					question.setText("125 ___ 127");
					ans[0].setText("123");
					ans[1].setText("120");
					ans[2].setText("122");
					ans[3].setText("126");
					q=question.getText();
				}
				else if (q.equals("125 ___ 127")){
					bg.clearSelection();
					question.setText("232 - 67 = ?");
					ans[0].setText("165");
					ans[1].setText("167");
					ans[2].setText("301");
					ans[3].setText("202");
					q=question.getText();
				}
				else if (q.equals("232 - 67 = ?")){
					bg.clearSelection();
					question.setText("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?");
					ans[0].setText("5");
					ans[1].setText("6");
					ans[2].setText("4");
					ans[3].setText("25");
					q=question.getText();
				}
				else if (q.equals("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?")){
					bg.clearSelection();
					question.setText("2431 + 0 = 24310");
					ans[0].setText("True");
					ans[1].setText("False");
					ans[2].setText("I don't know");
					ans[3].setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2431 + 0 = 24310")){
					bg.clearSelection();
					question.setText("2 x 10 = ?");
					ans[0].setText("20");
					ans[1].setText("18");
					ans[2].setText("16");
					ans[3].setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 10 = ?")){
					bg.clearSelection();
					question.setText("457653 is a odd number or an even number");
					ans[0].setText("odd");
					ans[1].setText("even");
					ans[2].setText("I don't know");
					ans[3].setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("457653 is a odd number or an even number")){
					bg.clearSelection();
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}
			else if (source == result){
				question.setText("2 x 3 = ?");
				result.setEnabled(false);
				q="0";
				bg.clearSelection();
				ans[0].setText("8");
				ans[1].setText("10");
				ans[2].setText("6");
				ans[3].setText("14");
				JOptionPane.showMessageDialog(null, checker1+" "+"out of 10", "Result", JOptionPane.PLAIN_MESSAGE);
				checker1=0;
			}	
			repaint();		
		}
	public static void main(String[] args){
		MathsExam4 me4=new MathsExam4();
	}
}