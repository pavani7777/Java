import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame
{
	JPanel jp;
	JTextArea about, exp;
	public TextAreaDemo()
	{
		jp=new JPanel();
		about=new JTextArea(10,20);
	    jp.add(about);
	
		
		setTitle("JTextArea Demo");
		setVisible(true);
		setSize(500,200);
		add(jp);
		
	}
	public static void main(String[] args)
	{
		TextAreaDemo tobj=new TextAreaDemo();
	}
}
