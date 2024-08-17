import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MathsExam2 extends JFrame implements ActionListener{    
		JButton ans1, ans2, ans3, ans4, result, skip;
		JLabel question;
		int checker1;
		String q;
		MathsExam2(){
			super("Exam");
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			question=new JLabel("2 x 7 = ?");
			ans1=new JButton("16");
			ans1.addActionListener(this);
			ans2=new JButton("10");
			ans2.addActionListener(this);
			ans3=new JButton("14");
			ans3.addActionListener(this);
			ans4=new JButton("12");
			ans4.addActionListener(this);
			skip=new JButton("Skip");
			skip.addActionListener(this);
			result=new JButton("Result");
			result.addActionListener(this);
			pane.add(question);
			pane.add(ans1);
			pane.add(ans2);
			pane.add(ans3);
			pane.add(ans4);
			pane.add(skip);
			pane.add(result);
			add(pane);
			result.setEnabled(false);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == ans1){
				q=question.getText();
				if (q.equals("2 x 7 = ?")){
					question.setText("2101 _ 10920");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("2101 _ 10920")){
					question.setText("2343568 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2343568 is a odd number or an even number")){
					question.setText("109 + 37 = ?");
					ans1.setText("144");
					ans2.setText("146");
					ans3.setText("145");
					ans4.setText("54");
					q=question.getText();
				}
				else if (q.equals("109 + 37 = ?")){
					question.setText("1025 ___ 1027");
					ans1.setText("1023");
					ans2.setText("1020");
					ans3.setText("1022");
					ans4.setText("1026");
					q=question.getText();
				}
				else if (q.equals("1025 ___ 1027")){
					question.setText("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?");
					ans1.setText("39");
					ans2.setText("40");
					ans3.setText("38");
					ans4.setText("41");
					q=question.getText();
				}
				else if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
					checker1++;
					question.setText("22_22");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("22_22")){
					checker1++;
					question.setText("24319 + 0 = 243190");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("24319 + 0 = 243190")){
					question.setText("2 x 9 = ?");
					ans1.setText("18");
					ans2.setText("20");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 9 = ?")){
					checker1++;
					question.setText("4576576434567890654323 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("4576576434567890654323 is a odd number or an even number")){
					checker1++;
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}		
			}
			else if (source == ans2){
				q=question.getText();
				if (q.equals("2 x 7 = ?")){
					question.setText("2101 _ 10920");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("2101 _ 10920")){
					checker1++;
					question.setText("2343568 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2343568 is a odd number or an even number")){
					checker1++;
					question.setText("109 + 37 = ?");
					ans1.setText("144");
					ans2.setText("146");
					ans3.setText("145");
					ans4.setText("54");
					q=question.getText();
				}
				else if (q.equals("109 + 37 = ?")){
					checker1++;
					question.setText("1025 ___ 1027");
					ans1.setText("1023");
					ans2.setText("1020");
					ans3.setText("1022");
					ans4.setText("1026");
					q=question.getText();
				}
				else if (q.equals("1025 ___ 1027")){
					question.setText("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?");
					ans1.setText("39");
					ans2.setText("40");
					ans3.setText("38");
					ans4.setText("41");
					q=question.getText();
				}
				else if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
					question.setText("22_22");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("22_22")){
					question.setText("24319 + 0 = 243190");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("24319 + 0 = 243190")){
					checker1++;
					question.setText("2 x 9 = ?");
					ans1.setText("18");
					ans2.setText("20");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 9 = ?")){
					question.setText("4576576434567890654323 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("4576576434567890654323 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}
			else if (source == ans3){
				q=question.getText();
				if (q.equals("2 x 7 = ?")){
					question.setText("2101 _ 10920");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("2101 _ 10920")){
					checker1++;
					question.setText("2343568 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2343568 is a odd number or an even number")){
					question.setText("109 + 37 = ?");
					ans1.setText("144");
					ans2.setText("146");
					ans3.setText("145");
					ans4.setText("54");
					q=question.getText();
				}
				else if (q.equals("109 + 37 = ?")){
					question.setText("1025 ___ 1027");
					ans1.setText("1023");
					ans2.setText("1020");
					ans3.setText("1022");
					ans4.setText("1026");
					q=question.getText();
				}
				else if (q.equals("1025 ___ 1027")){
					question.setText("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?");
					ans1.setText("39");
					ans2.setText("40");
					ans3.setText("38");
					ans4.setText("41");
					q=question.getText();
				}
				else if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
					question.setText("22_22");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("22_22")){
					question.setText("24319 + 0 = 243190");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("24319 + 0 = 243190")){
					question.setText("2 x 9 = ?");
					ans1.setText("18");
					ans2.setText("20");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 9 = ?")){
					question.setText("4576576434567890654323 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("4576576434567890654323 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}
			else if (source == ans4){
				q=question.getText();
				if (q.equals("2 x 7 = ?")){
					question.setText("2101 _ 10920");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("2101 _ 10920")){
					question.setText("2343568 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2343568 is a odd number or an even number")){
					question.setText("109 + 37 = ?");
					ans1.setText("144");
					ans2.setText("146");
					ans3.setText("145");
					ans4.setText("54");
					q=question.getText();
				}
				else if (q.equals("109 + 37 = ?")){
					question.setText("1025 ___ 1027");
					ans1.setText("1023");
					ans2.setText("1020");
					ans3.setText("1022");
					ans4.setText("1026");
					q=question.getText();
				}
				else if (q.equals("1025 ___ 1027")){
					checker1++;
					question.setText("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?");
					ans1.setText("39");
					ans2.setText("40");
					ans3.setText("38");
					ans4.setText("41");
					q=question.getText();
				}
				else if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
					question.setText("22_22");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("22_22")){
					question.setText("24319 + 0 = 243190");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("24319 + 0 = 243190")){
					question.setText("2 x 9 = ?");
					ans1.setText("18");
					ans2.setText("20");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 9 = ?")){
					question.setText("4576576434567890654323 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("4576576434567890654323 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}
			else if (source == result){
				question.setText("2 x 7 = ?");
				result.setEnabled(false);
				q="0";
				ans1.setText("8");
				ans2.setText("10");
				ans3.setText("14");
				ans4.setText("6");
				JOptionPane.showMessageDialog(null, checker1+" "+"out of 10", "Result", JOptionPane.PLAIN_MESSAGE);
				checker1=0;
			}
			else if (source == skip){
				q=question.getText();
				if (q.equals("2 x 7 = ?")){
					question.setText("2101 _ 10920");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("2101 _ 10920")){
					question.setText("2343568 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2343568 is a odd number or an even number")){
					question.setText("109 + 37 = ?");
					ans1.setText("144");
					ans2.setText("146");
					ans3.setText("145");
					ans4.setText("54");
					q=question.getText();
				}
				else if (q.equals("109 + 37 = ?")){
					question.setText("1025 ___ 1027");
					ans1.setText("1023");
					ans2.setText("1020");
					ans3.setText("1022");
					ans4.setText("1026");
					q=question.getText();
				}
				else if (q.equals("1025 ___ 1027")){
					question.setText("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?");
					ans1.setText("39");
					ans2.setText("40");
					ans3.setText("38");
					ans4.setText("41");
					q=question.getText();
				}
				else if (q.equals("Daamin is 19 years old. Dawar is 20 years elder than Daamin. How old is Dawar?")){
					question.setText("22_22");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("22_22")){
					question.setText("24319 + 0 = 243190");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("24319 + 0 = 243190")){
					question.setText("2 x 9 = ?");
					ans1.setText("18");
					ans2.setText("20");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 9 = ?")){
					question.setText("4576576434567890654323 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("4576576434567890654323 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}	
			}
			repaint();		
		}
	public static void main(String[] args){
		MathsExam2 me2=new MathsExam2();
	}
}