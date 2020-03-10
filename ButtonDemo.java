import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonDemo extends JFrame
{
	JPanel jp;
	JButton submit,cancel;
	 public ButtonDemo()
	 {
		 jp=new JPanel();
		 submit=new JButton("Submit");
		 cancel=new JButton("Cancel");
		 jp.add(submit);
		 jp.add(cancel);
		 setTitle("JButton Demo");
		 setVisible(true);
		 setSize(300,200);
		 add(jp);
	 }
	 public static void main(String[] args)
	 {
		 ButtonDemo bobj=new ButtonDemo();
	 }
}