import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bunch extends JFrame{

	public Bunch() {
		super("Bunch");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane=new JPanel();
		GridLayout family=new GridLayout(3, 3, 10, 10);
		pane.setLayout(family);
		JButton mom=new JButton("Jozy Naqshbandi");
		JButton dad=new JButton("Basharat Hamid Ashai");
		JButton marcia=new JButton("Daamin Ashai");
		JButton carol=new JButton("Dawar Ashai");
		JButton greg=new JButton("Abeer Naqshbandi");
		JButton jan=new JButton("Zaroon Naqshbandi");
		JButton alice=new JButton("Dawood Farooqi");
		JButton peter=new JButton("Tahoor Farooqi");
		JButton cindy=new JButton("Essa Reshi");
		JButton mike=new JButton("Midaah Reshi");
		JButton bobby=new JButton("Shaayan Tramboo");
		JButton my=new JButton("Ryan Tramboo");
		pane.add(mom);
		pane.add(dad);
		pane.add(marcia);
		pane.add(carol);
		pane.add(greg);
		pane.add(jan);
		pane.add(alice);
		pane.add(peter);
		pane.add(cindy);
		pane.add(mike);
		pane.add(bobby);
		pane.add(my);
		add(pane);
		setVisible(true);
	}
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		SwingUtilities.updateComponentTreeUI(this);
	}catch (Exception exc){
		System.err.println("Couldn't use the system"+"look and feel:"+exc);
		}
	}
	public static void main(String[] args){
		Bunch frame=new Bunch();
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	
	