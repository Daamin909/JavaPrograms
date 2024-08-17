import javax.swing.*;
class Property{
	public static void main(String[] args){
		String name=System.getProperty("java.runtime.version");
		JOptionPane.showMessageDialog(null, "Java Runtime Version is"+" "+name, "Name", JOptionPane.PLAIN_MESSAGE);
	}
}