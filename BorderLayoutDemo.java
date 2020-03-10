import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame
{
	JButton reset, add, update, delete;
	public BorderLayoutDemo()
	{
		reset=new JButton("Reset");
		add=new JButton("add");
		update=new JButton("Update");
		delete=new JButton("Delete");
		
		setVisible(true);
		setSize(400,300);
		setTitle("Borderlayout Demo");
		setLayout(new BorderLayout());
		add(reset, BorderLayout.EAST);
		add(add, BorderLayout.WEST);
		add(update, BorderLayout.NORTH);
		add(delete, BorderLayout.SOUTH);
	}
	public static void main(String[] args)
	{
		BorderLayoutDemo bobj=new BorderLayoutDemo();
	}
}