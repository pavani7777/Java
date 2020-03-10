import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame
{
	JButton add, update, delete;
	public FlowLayoutDemo()
	{
		add=new JButton("Add");
		update=new JButton("Update");
		delete=new JButton("Delete");
		
		setVisible(true);
		setSize(300,300);
		setTitle("FlowLayoutDemo");
		
		setLayout(new FlowLayout());
		add(add);
		add(update);
		add(delete);
	}
	public static void main(String[] args)
	{
		FlowLayoutDemo obj=new FlowLayoutDemo();
	}
}