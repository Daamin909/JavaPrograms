import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Authenticator extends JFrame implements ActionListener{
		JTextField username=new JTextField(15);
		JPasswordField password=new JPasswordField(15);
		JTextArea comments =new JTextArea(10, 10);
		int response;
		String[] options= { "Accepted", "Declined" };
		JButton ok;
		Authenticator(){
			super("Information");
			setSize(300, 220);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			JSlider ad = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
			ad.setMajorTickSpacing(10);
			ad.setMinorTickSpacing(1);
			ad.setPaintTicks(true);
			ad.setPaintLabels(true);
			JPanel pane=new JPanel();
			response=JOptionPane.showOptionDialog(null, "Challenge: Type you're name in the Text Box", "Challenge", 0,  JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			System.out.println(response);
			JLabel usernameLabel=new JLabel("Username: ");
			JLabel passwordLabel=new JLabel("Password: ");
			JLabel commentsLabel=new JLabel("Comments: ");
			ImageIcon loadIcon = new ImageIcon("load.gif");
			ImageIcon saveIcon = new ImageIcon("save.gif");
			ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
			ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
			JScrollPane jsp=new JScrollPane(comments);
			JToolBar bar = new JToolBar();
			JButton load = new JButton("Load", loadIcon);
			JButton save = new JButton("Save", saveIcon);
			JButton subscribe = new JButton("Subscribe", subscribeIcon);
			JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
			ok=new JButton("OK");
			ok.addActionListener(this);
			comments.setLineWrap(true);
			comments.setWrapStyleWord(true);
			password.setEchoChar('?');
			add("North", bar);
			bar.add(load);
			bar.add(save);
			bar.add(subscribe);
			bar.add(unsubscribe);
    			JTextArea edit = new JTextArea(8, 40);
     			JScrollPane scroll = new JScrollPane(edit);
   			BorderLayout bord = new BorderLayout();
        			setLayout(bord);
			pane.add("North West", usernameLabel);
			pane.add("North West", username);
			pane.add("North", passwordLabel);
			pane.add("North", password);
			pane.add("North East", commentsLabel);
			pane.add(comments);
			pane.add("South", ok);
			add("Center", jsp);
			add("West", ad);
			add (pane);
			pack();
			setVisible(true);
			
		}
		public void actionPerformed(ActionEvent evt){ 
				JOptionPane.showMessageDialog(null, "Thank You", "Message", JOptionPane.PLAIN_MESSAGE);
		}
		static void setLookAndFeel(){
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			}
			catch (Exception exc){
				System.err.println(exc.getMessage());
			}
		}
	public static void main(String[] args){
		Authenticator.setLookAndFeel();
		Authenticator a=new Authenticator();
	}
}