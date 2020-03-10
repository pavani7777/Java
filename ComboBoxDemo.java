import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class ComboBoxDemo extends JFrame
{
	JPanel jp;
	JComboBox city;

	public ComboBoxDemo()
	{
		jp=new JPanel();
		
		
		city=new JComboBox();
		city.addItem("california");
		city.addItem("Flordia");
		city.addItem("Montana");
		city.addItem("new york");
		city.addItem("Oklahoma");
	
		
		jp.add(city);
		setTitle("JList Demo");
		setVisible(true);
		setSize(300,200);
		add(jp);
}
	public static void main(String[] args)
	{
		ComboBoxDemo cobj=new ComboBoxDemo();
	}
}