import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MathsExam3 extends JFrame implements ActionListener{    
		JButton result, next;
		JRadioButton[] ans=new JRadioButton[4];
		ButtonGroup bg=new ButtonGroup();
		JLabel question;
		int checker1;
		String q;
		MathsExam3(){
			super("Exam");
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			question=new JLabel("2 x 7 = ?");
			ans[0]=new JRadioButton("16");
			ans[1]=new JRadioButton("10");
			ans[2]=new JRadioButton("14");
			ans[3]=new JRadioButton("12");
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
					if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
						checker1++;
					}
					else if (q.equals("22_22")){
						checker1++;
					}
					else if (q.equals("2 x 9 = ?")){
						checker1++;
					}
					else if (q.equals("4576576434567890654323 is a odd number or an even number")){
						checker1++;
					}		
				}
				else if (ans[1].isSelected()){
					q=question.getText();
					 if (q.equals("2101 _ 10920")){
						checker1++;
					}
					else if (q.equals("2343568 is a odd number or an even number")){
						checker1++;
					}
					else if (q.equals("109 + 37 = ?")){
						checker1++;
					}
					else if (q.equals("24319 + 0 = 243190")){
						checker1++;
					}
				}
				else if (ans[2].isSelected()){
					q=question.getText();
					if (q.equals("2 x 7 = ?")){
						checker1++;
					}	
				}
				else if (ans[3].isSelected()){
					q=question.getText();
					if (q.equals("1025 ___ 1027")){
						checker1++;
					}
				}
				if (q.equals("2 x 7 = ?")){
					bg.clearSelection();
					question.setText("2101 _ 10920");
					ans[0].setText("=");
					ans[1].setText("<");
					ans[2].setText(">");
					ans[3].setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("2101 _ 10920")){
					bg.clearSelection();
					question.setText("2343568 is a odd number or an even number");
					ans[0].setText("odd");
					ans[1].setText("even");
					ans[2].setText("I don't know");
					ans[3].setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2343568 is a odd number or an even number")){
					bg.clearSelection();
					question.setText("109 + 37 = ?");
					ans[0].setText("144");
					ans[1].setText("146");
					ans[2].setText("145");
					ans[3].setText("54");
					q=question.getText();
				}
				else if (q.equals("109 + 37 = ?")){
					bg.clearSelection();
					question.setText("1025 ___ 1027");
					ans[0].setText("1023");
					ans[1].setText("1020");
					ans[2].setText("1022");
					ans[3].setText("1026");
					q=question.getText();
				}
				else if (q.equals("1025 ___ 1027")){
					bg.clearSelection();
					question.setText("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?");
					ans[0].setText("39");
					ans[1].setText("40");
					ans[2].setText("38");
					ans[3].setText("41");
					q=question.getText();
				}
				else if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
					bg.clearSelection();
					question.setText("22_22");
					ans[0].setText("=");
					ans[1].setText("<");
					ans[2].setText(">");
					ans[3].setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("22_22")){
					bg.clearSelection();
					question.setText("24319 + 0 = 243190");
					ans[0].setText("True");
					ans[1].setText("False");
					ans[2].setText("I don't know");
					ans[3].setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("24319 + 0 = 243190")){
					bg.clearSelection();
					question.setText("2 x 9 = ?");
					ans[0].setText("18");
					ans[1].setText("20");
					ans[2].setText("16");
					ans[3].setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 9 = ?")){
					bg.clearSelection();
					question.setText("4576576434567890654323 is a odd number or an even number");
					ans[0].setText("odd");
					ans[1].setText("even");
					ans[2].setText("I don't know");
					ans[3].setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("4576576434567890654323 is a odd number or an even number")){
					bg.clearSelection();
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}
			else if (source == result){
				question.setText("2 x 7 = ?");
				result.setEnabled(false);
				q="0";
				ans[0].setText("6");
				ans[1].setText("10");
				ans[2].setText("14");
				ans[3].setText("12");
				bg.clearSelection();
				JOptionPane.showMessageDialog(null, checker1+" "+"out of 10", "Result", JOptionPane.PLAIN_MESSAGE);
				checker1=0;
			}	
			repaint();		
		}
	public static void main(String[] args){
		MathsExam3 me3=new MathsExam3();
	}
}