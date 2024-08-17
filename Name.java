import javax.swing.*;
class Name{
	public static void main(String[] args){
		String name=System.getProperty("user.name");
		JOptionPane.showMessageDialog(null, "Hi"+" "+name, "Name", JOptionPane.PLAIN_MESSAGE);
	}
}