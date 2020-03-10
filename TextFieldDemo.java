import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame
{
	JPanel jp;
	JTextField firstname,lastname;
	public TextFieldDemo()
	{
		jp=new JPanel();
		firstname=new JTextField();
		firstname.setText("peter");
		
		lastname=new JTextField();
		lastname.setText("Jones");
		
		jp.add(firstname);
		jp.add(lastname);
		
		setTitle("JTextField Demo");
		setVisible(true);
		setSize(300,200);
		add(jp);
		
	}
	public static void main(String[] args)
	{
		TextFieldDemo tobj=new TextFieldDemo();
	}
}
