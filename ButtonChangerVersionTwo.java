import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ButtonChangerVersionTwo extends JFrame implements ActionListener{    
		static String faceText;
		JButton basharat, daamin;
		JPanel pane;
		ButtonChangerVersionTwo(){
			super("Button Changer");
			setSize(300, 220);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pane=new JPanel();
			daamin=new JButton("Daamin Ashai");
			daamin.addActionListener(this); 
			daamin.setBackground(Color.BLUE);
			daamin.setOpaque(true);
			basharat=new JButton("Basharat Hamid Ashai");
			basharat.setBackground(Color.GREEN);
			basharat.setOpaque(true);
			basharat.addActionListener(this); 
			pane.add(basharat);
			pane.add(daamin);
			add (pane);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt){ 
			Object source=evt.getSource();
			if (source == daamin){
				faceText=daamin.getText();
				if (faceText.equals("Daamin Ashai")){
					daamin.setText("Dawar Ashai");
					daamin.setBackground(Color.RED);
					daamin.setOpaque(true);
				}
				else {
					daamin.setText("Daamin Ashai");
					daamin.setBackground(Color.BLUE);
					daamin.setOpaque(true);
				}
			}
			else if (source == basharat){
				faceText=basharat.getText();
				if (faceText.equals("Jozy Naqshbandi")){
					basharat.setText("Basharat Hamid Ashai");
					basharat.setBackground(Color.GREEN);
					basharat.setOpaque(true);
				}
				else {
					basharat.setText("Jozy Naqshbandi");
					basharat.setBackground(Color.PINK);
					basharat.setOpaque(true);
				}
			}
			repaint();
		}
		
		void setLookAndFeel() {
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				SwingUtilities.updateComponentTreeUI(this);
			}
			catch (Exception exc) {
				System.err.println("Couldn't use the system "+"look and feel:"+exc);
			}
		}

	public static void main(String[] args){
		ButtonChangerVersionTwo bcvt=new ButtonChangerVersionTwo();
		bcvt.setLookAndFeel();
	}
}