import javax.swing.*;
class OS{
	public static void main(String[] args){
		String name=System.getProperty("os.name");
		JOptionPane.showMessageDialog(null, "You're OS Version and name is"+" "+name, "Name", JOptionPane.PLAIN_MESSAGE);
	}
}