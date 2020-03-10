import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelDemo extends JFrame

{
	JPanel jPanel;
	JLabel firstName, lastName;
	
	public LabelDemo()
	{
		jPanel=new JPanel(); 
		firstName=new JLabel("First Name");
		lastName=new JLabel("Last Name");
		jPanel.add(firstName);
	    jPanel.add(lastName);
	    
	    setTitle("JLabel Demo");
	    setVisible(true);
	    setSize(300,300);
	    add(jPanel);
}
	public static void main(String[] args)
	{
		LabelDemo pd=new LabelDemo();
	}
	}