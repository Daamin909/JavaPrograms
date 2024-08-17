import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
class Calculator extends JFrame implements ActionListener{    
		ArrayList<Long> numbers = new ArrayList<Long>();
		ArrayList<Double> numbersDiv = new ArrayList<Double>();
		JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply, divide, clear, equals;
		JTextField numTextField;
		static long temp, checker, ans, length;
		static double tempDiv, ansDiv;
		static int a, b=0, c=1, ans2;
		static String text="0";
		Calculator(){
			super("Calculator");
			setSize(230, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			JPanel pane=new JPanel();
			Image icon = Toolkit.getDefaultToolkit().getImage("icon.jpg");  
			setIconImage(icon);
			one= new JButton("1");
			one.addActionListener(this);
			two= new JButton("2");
			two.addActionListener(this);
			three= new JButton("3");
			three.addActionListener(this);
			four= new JButton("4");
			four.addActionListener(this);
			five= new JButton("5");
			five.addActionListener(this);
			six= new JButton("6");
			six.addActionListener(this);
			seven= new JButton("7");
			seven.addActionListener(this);
			eight= new JButton("8");
			eight.addActionListener(this);
			nine= new JButton("9");
			nine.addActionListener(this);
			zero= new JButton("0");
			zero.addActionListener(this);
			plus= new JButton("+");
			plus.addActionListener(this);
			minus= new JButton("-");
			minus.addActionListener(this);
			multiply= new JButton("*");
			multiply.addActionListener(this);
			divide= new JButton("/");
			divide.addActionListener(this);
			equals= new JButton("=");
			equals.addActionListener(this);
			clear=new JButton("CE");
			clear.addActionListener(this);
			numTextField=new JTextField(18);
			numTextField.setText("0");
			numTextField.setEditable(false);
			Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
 			numTextField.setBorder(border);
			pane.add(numTextField);
			pane.add(one);
			pane.add(two);
			pane.add(three);
			pane.add(plus);
			pane.add(four);
			pane.add(five);
			pane.add(six);
			pane.add(minus);
			pane.add(seven);
			pane.add(eight);
			pane.add(nine);
			pane.add(multiply);
			pane.add(zero);
			pane.add(clear);
			pane.add(equals);
			pane.add(divide);
			add(pane);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			text=numTextField.getText();
			if (source == one){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("1");
				else
					numTextField.setText(text+"1");
					text=numTextField.getText();
			}
			if (source == two){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("2");
				else{
					numTextField.setText(text+"2");
					text=numTextField.getText();
				}
			}
			if (source == three){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("3");
				else{
					numTextField.setText(text+"3");
					text=numTextField.getText();
				}
			}
			if (source == four){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("4");
				else{
					numTextField.setText(text+"4");
					text=numTextField.getText();
				}
			}
			if (source == five){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("5");
				else{
					numTextField.setText(text+"5");
					text=numTextField.getText();
				}
			}
			if (source == six){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("6");
				else{
					numTextField.setText(text+"6");
					text=numTextField.getText();
				}
			}
			if (source == seven){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("7");
				else{
					numTextField.setText(text+"7");
					text=numTextField.getText();
				}
			}
			if (source == eight){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("8");
				else{
					numTextField.setText(text+"8");
					text=numTextField.getText();
				}
			}
			if (source == nine){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("9");
				else{
					numTextField.setText(text+"9");
					text=numTextField.getText();
				}
			}
			if (source == zero){
				text=numTextField.getText();
				if (text.equals("0"))
					numTextField.setText("0");
				else{
					numTextField.setText(text+"0");
					text=numTextField.getText();
				}
			}
			if (source == plus){
				checker=10;
				temp=Long.parseLong(numTextField.getText());
				numbers.add(temp);
				numTextField.setText("");
			}
			if (source == minus){
				checker=20;
				temp=Long.parseLong(numTextField.getText());
				numbers.add(temp);
				numTextField.setText("");
			}
			if (source == multiply){
				checker=30;
				temp=Long.parseLong(numTextField.getText());
				numbers.add(temp);
				numTextField.setText("");
			}
			if (source == divide){
				checker=40;
				tempDiv=Double.parseDouble(numTextField.getText());
				numbersDiv.add(tempDiv);
				numTextField.setText("");
			}
			if (source == equals){
				tempDiv=Double.parseDouble(numTextField.getText());
				numbersDiv.add(tempDiv);
				temp=Long.parseLong(numTextField.getText());
				numbers.add(temp);
				if (checker==10){
					b=0;
					c=1;
					length=numbers.size();
					if (length%2==0){
						for (a=1; a<=length/2; a++){
							if (ans==0){
								ans=numbers.get(b)+numbers.get(c);
								b=b+2;	
								c=c+2;	
							}
							else if(ans!=0){
								temp=ans;
								ans=temp+numbers.get(b)+numbers.get(c);
								b=b+2;	
								c=c+2;
							}
						}
					}
					else if(length%2!=0){
						for (a=1; a<=length; a++){
							if (ans==0){
								ans=ans+numbers.get(b);
								b++;		
							}
							else if(ans!=0){
								temp=ans;
								ans=temp+numbers.get(b);
								b++;	
							}
						}
					}
					numTextField.setText(String.valueOf(ans));
					numbers.clear();
					numbersDiv.clear();
					temp=0;
					checker=0;		
					ans=0;
					length=0;
					a=1;
					b=0;
					c=1;
					ansDiv=0;
					tempDiv=0;
					text="0";
					System.out.flush();
				}
				else if (checker==20){
					b=0;
					c=1;
					length=numbers.size();
					if (length%2==0){
						for (a=1; a<=length/2; a++){
							if (ans==0){
								ans=numbers.get(b)-numbers.get(c);
								b=b+2;	
								c=c+2;	
							}
							else if(ans!=0){
								temp=ans;
								ans=temp-numbers.get(b)-numbers.get(c);
								b=b+2;	
								c=c+2;
							}
						}
					}
					else if(length%2!=0){
						for (a=1; a<=length; a++){
							if (ans==0){
								ans=numbers.get(b)-ans;
								b++;		
							}
							else if(ans!=0){
								temp=ans;
								ans=temp-numbers.get(b);
								b++;	
							}
						}
					}
					numTextField.setText(String.valueOf(ans));
					numbers.clear();
					numbersDiv.clear();
					temp=0;
					checker=0;		
					ans=0;
					length=0;
					a=1;
					b=0;
					c=1;
					ansDiv=0;
					tempDiv=0;
					text="0";
					System.out.flush();
				}
				else if (checker==30){
					b=0;
					c=1;
					length=numbers.size();
					if (length%2==0){
						for (a=1; a<=length/2; a++){
							if (ans==0){
								ans=numbers.get(b)*numbers.get(c);
								b=b+2;	
								c=c+2;	
							}
							else if(ans!=0){
								temp=ans;
								ans=temp*numbers.get(b)*numbers.get(c);
								b=b+2;	
								c=c+2;
							}
						}
					}
					else if(length%2!=0){
						for (a=1; a<=length; a++){
							if (ans==0){
								ans=numbers.get(b);
								b++;		
							}
							else if(ans!=0){
								temp=ans;
								ans=temp*numbers.get(b);
								b++;	
							}
						}
					}
					numTextField.setText(String.valueOf(ans));
					numbers.clear();
					numbersDiv.clear();
					temp=0;
					checker=0;		
					ans=0;
					length=0;
					a=1;
					b=0;
					c=1;
					ansDiv=0;
					tempDiv=0;
					text="0";
					System.out.flush();
				}
				else if (checker==40){
					b=0;
					c=1;
					length=numbersDiv.size();
					if (length%2==0){
						for (a=1; a<=length/2; a++){
							if (ansDiv==0){
								ansDiv=numbersDiv.get(b)/numbersDiv.get(c);
								b=b+2;	
								c=c+2;	
							}
							else if(ansDiv!=0){
								tempDiv=ansDiv;
								ansDiv=tempDiv+numbersDiv.get(b)/numbersDiv.get(c);
								b=b+2;	
								c=c+2;
							}
						}
					}
					else if(length%2!=0){
						for (a=1; a<=length; a++){
							if (ansDiv==0){
								ansDiv=numbersDiv.get(b);
								b++;		
							}
							else if(ansDiv!=0){
								tempDiv=ansDiv;
								ansDiv=tempDiv/numbersDiv.get(b);
								b++;	
							}
						}
					}	
					numTextField.setText(String.valueOf(ansDiv));
					numbers.clear();
					numbersDiv.clear();
					temp=0;
					checker=0;		
					ans=0;
					length=0;
					a=1;
					b=0;
					c=1;
					ansDiv=0;
					tempDiv=0;
					text="0";
					System.out.flush();
				}
			}
			if (source == clear){
				numbers.clear();
				numbersDiv.clear();
				temp=0;
				checker=0;		
				ans=0;
				length=0;
				a=1;
				b=0;
				c=1;
				ansDiv=0;
				tempDiv=0;
				text="0";
				System.out.flush();
				numTextField.setText("0");
			}
			repaint();				
		}	
	public static void main(String[] args) throws NumberFormatException{
		new Calculator();	
	}
}