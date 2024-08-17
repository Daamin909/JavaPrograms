import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ActionListenerExample extends JFrame implements ActionListener{  
		JTextField tf;
		JButton b;
		ActionListenerExample(){
			super("Action Listener");
			JPanel pane=new JPanel();  
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  			tf=new JTextField(20);  
  			b=new JButton("Click Here");  
  			b.addActionListener(this);
			pane.add(b);
			pane.add(tf);
			add(pane);
			pack();
			setVisible(true);
		}
		public void actionPerformed(ActionEvent evt){  
			Object source=evt.getSource();
			if (source==b){
				tf.setText("My name is Daamin.");  
			}
		}
	public static void main(String[] args) {  
		ActionListenerExample ale=new ActionListenerExample();
	}
}