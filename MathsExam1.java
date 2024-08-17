import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.net.*;

class MathsExam1 extends JFrame implements ActionListener{    
		JButton ans1, ans2, ans3, ans4, result, skip;
		JLabel question;
		int checker1;
		String q;
		MathsExam1(){
			super("Exam");
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pane=new JPanel();
			question=new JLabel("2 x 3 = ?");
			ans1=new JButton("8");
			ans1.addActionListener(this);
			ans2=new JButton("10");
			ans2.addActionListener(this);
			ans3=new JButton("6");
			ans3.addActionListener(this);
			ans4=new JButton("14");
			ans4.addActionListener(this);
			result=new JButton("Result");
			result.addActionListener(this);
			skip=new JButton("Skip");
			skip.addActionListener(this);
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
				if (q.equals("2 x 3 = ?")){
					question.setText("210 _ 1092");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("210 _ 1092")){
					question.setText("908724 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("908724 is a odd number or an even number")){
					question.setText("102 + 22 = ?");
					ans1.setText("123");
					ans2.setText("124");
					ans3.setText("122");
					ans4.setText("80");
					q=question.getText();
				}
				else if (q.equals("102 + 22 = ?")){
					question.setText("125 ___ 127");
					ans1.setText("123");
					ans2.setText("120");
					ans3.setText("122");
					ans4.setText("126");
					q=question.getText();
				}
				else if (q.equals("125 ___ 127")){
					question.setText("232 - 67 = ?");
					ans1.setText("165");
					ans2.setText("167");
					ans3.setText("301");
					ans4.setText("202");
					q=question.getText();
				}
				else if (q.equals("232 - 67 = ?")){
					checker1++;
					question.setText("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?");
					ans1.setText("5");
					ans2.setText("6");
					ans3.setText("4");
					ans4.setText("25");
					q=question.getText();
				}
				else if (q.equals("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?")){
					checker1++;
					question.setText("2431 + 0 = 24310");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2431 + 0 = 24310")){
					question.setText("2 x 10 = ?");
					ans1.setText("20");
					ans2.setText("18");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 10 = ?")){
					checker1++;
					question.setText("457653 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("457653 is a odd number or an even number")){
					checker1++;
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}		
			}
			else if (source == ans2){
				q=question.getText();
				if (q.equals("2 x 3 = ?")){
					question.setText("210 _ 1092");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("210 _ 1092")){
					checker1++;
					question.setText("908724 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("908724 is a odd number or an even number")){
					checker1++;
					question.setText("102 + 22 = ?");
					ans1.setText("123");
					ans2.setText("124");
					ans3.setText("122");
					ans4.setText("80");
					q=question.getText();
				}
				else if (q.equals("102 + 22 = ?")){
					checker1++;
					question.setText("125 ___ 127");
					ans1.setText("123");
					ans2.setText("120");
					ans3.setText("122");
					ans4.setText("126");
					q=question.getText();
				}
				else if (q.equals("125 ___ 127")){
					question.setText("232 - 67 = ?");
					ans1.setText("165");
					ans2.setText("167");
					ans3.setText("301");
					ans4.setText("202");
					q=question.getText();
				}
				else if (q.equals("232 - 67 = ?")){
					question.setText("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?");
					ans1.setText("5");
					ans2.setText("6");
					ans3.setText("4");
					ans4.setText("25");
					q=question.getText();
				}
				else if (q.equals("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?")){
					question.setText("2431 + 0 = 24310");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2431 + 0 = 24310")){
					checker1++;
					question.setText("2 x 10 = ?");
					ans1.setText("20");
					ans2.setText("18");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 10 = ?")){
					question.setText("457653 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("457653 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}		
			}
			else if (source == ans3){
				q=question.getText();
				if (q.equals("2 x 3 = ?")){
					checker1++;
					question.setText("210 _ 1092");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("210 _ 1092")){
					question.setText("908724 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("908724 is a odd number or an even number")){
					question.setText("102 + 22 = ?");
					ans1.setText("123");
					ans2.setText("124");
					ans3.setText("122");
					ans4.setText("80");
					q=question.getText();
				}
				else if (q.equals("102 + 22 = ?")){
					question.setText("125 ___ 127");
					ans1.setText("123");
					ans2.setText("120");
					ans3.setText("122");
					ans4.setText("126");
					q=question.getText();
				}
				else if (q.equals("125 ___ 127")){
					question.setText("232 - 67 = ?");
					ans1.setText("165");
					ans2.setText("167");
					ans3.setText("301");
					ans4.setText("202");
					q=question.getText();
				}
				else if (q.equals("232 - 67 = ?")){
					question.setText("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?");
					ans1.setText("5");
					ans2.setText("6");
					ans3.setText("4");
					ans4.setText("25");
					q=question.getText();
				}
				else if (q.equals("Sam is 15 years old. Sam is ten years elder than Kelly. How old is Kelly?")){
					question.setText("2431 + 0 = 24310");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2431 + 0 = 24310")){
					question.setText("2 x 10 = ?");
					ans1.setText("20");
					ans2.setText("18");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 10 = ?")){
					question.setText("457653 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("457653 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}		
			}
			else if (source == ans4){
				q=question.getText();
				if (q.equals("2 x 3 = ?")){
					question.setText("210 _ 1092");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("210 _ 1092")){
					question.setText("908724 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("908724 is a odd number or an even number")){
					question.setText("102 + 22 = ?");
					ans1.setText("123");
					ans2.setText("124");
					ans3.setText("122");
					ans4.setText("80");
					q=question.getText();
				}
				else if (q.equals("102 + 22 = ?")){
					question.setText("125 ___ 127");
					ans1.setText("123");
					ans2.setText("120");
					ans3.setText("122");
					ans4.setText("126");
					q=question.getText();
				}
				else if (q.equals("125 ___ 127")){
					checker1++;
					question.setText("232 - 67 = ?");
					ans1.setText("165");
					ans2.setText("167");
					ans3.setText("301");
					ans4.setText("202");
					q=question.getText();
				}
				else if (q.equals("232 - 67 = ?")){
					question.setText("Sam is 15 years old. Sam is ten years older than Kelly. How old is Kelly?");
					ans1.setText("5");
					ans2.setText("6");
					ans3.setText("4");
					ans4.setText("25");
					q=question.getText();
				}
				else if (q.equals("Sam is 15 years old. Sam is ten years older than Kelly. How old is Kelly?")){
					question.setText("2431 + 0 = 24310");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2431 + 0 = 24310")){
					question.setText("2 x 10 = ?");
					ans1.setText("20");
					ans2.setText("18");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 10 = ?")){
					question.setText("457653 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("457653 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}
			else if (source == result){
				JOptionPane.showMessageDialog(null, checker1+" "+"out of 10", "Result", JOptionPane.PLAIN_MESSAGE);
				question.setText("2 x 3 = ?");
				result.setEnabled(false);
				checker1=0;
				q="0";
				ans1.setText("8");
				ans2.setText("10");
				ans3.setText("6");
				ans4.setText("14");
			}
			else if (source == skip){
				q=question.getText();
				if (q.equals("2 x 3 = ?")){
					question.setText("210 _ 1092");
					ans1.setText("=");
					ans2.setText("<");
					ans3.setText(">");
					ans4.setText("I don't know");
					q=question.getText();
				}
				else if (q.equals("210 _ 1092")){
					question.setText("908724 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("908724 is a odd number or an even number")){
					question.setText("102 + 22 = ?");
					ans1.setText("123");
					ans2.setText("124");
					ans3.setText("122");
					ans4.setText("80");
					q=question.getText();
				}
				else if (q.equals("102 + 22 = ?")){
					question.setText("125 ___ 127");
					ans1.setText("123");
					ans2.setText("120");
					ans3.setText("122");
					ans4.setText("126");
					q=question.getText();
				}
				else if (q.equals("125 ___ 127")){
					question.setText("232 - 67 = ?");
					ans1.setText("165");
					ans2.setText("167");
					ans3.setText("301");
					ans4.setText("202");
					q=question.getText();
				}
				else if (q.equals("232 - 67 = ?")){
					question.setText("Sam is 15 years old. Sam is ten years older than Kelly. How old is Kelly?");
					ans1.setText("5");
					ans2.setText("6");
					ans3.setText("4");
					ans4.setText("25");
					q=question.getText();
				}
				else if (q.equals("Sam is 15 years old. Sam is ten years older than Kelly. How old is Kelly?")){
					question.setText("2431 + 0 = 24310");
					ans1.setText("True");
					ans2.setText("False");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("2431 + 0 = 24310")){
					question.setText("2 x 10 = ?");
					ans1.setText("20");
					ans2.setText("18");
					ans3.setText("16");
					ans4.setText("14");
					q=question.getText();
				}
				else if (q.equals("2 x 10 = ?")){
					question.setText("457653 is a odd number or an even number");
					ans1.setText("odd");
					ans2.setText("even");
					ans3.setText("I don't know");
					ans4.setText("None of the above");
					q=question.getText();
				}
				else if (q.equals("457653 is a odd number or an even number")){
					JOptionPane.showMessageDialog(null, "Please click on the result button to know you're result", "Information", JOptionPane.PLAIN_MESSAGE);
					result.setEnabled(true);
				}
			}			
			repaint();				
		}
	public static void main(String[] args){
		MathsExam1 me1=new MathsExam1();
	}
}