import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Segungo valor"));
		
		double z = x/y;
		JOptionPane.showMessageDialog(null, "O resultado é: "+z);
		
	}
}
