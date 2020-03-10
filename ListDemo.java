import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class ListDemo extends JFrame
{
	JPanel jp;
	JList list;
	DefaultListModel dlist;
	public ListDemo()
	{
		jp=new JPanel();
		list=new JList();
		list.setSelectedIndex(0);
		
		dlist=new DefaultListModel();
		dlist.addElement("california");
		dlist.addElement("Flordia");
		dlist.addElement("Montana");
		dlist.addElement("new york");
		dlist.addElement("Oklahoma");
		list.setModel(dlist);
		
		jp.add(list);
		setTitle("JList Demo");
		setVisible(true);
		setSize(300,200);
		add(jp);
}
	public static void main(String[] args)
	{
		ListDemo lobj=new ListDemo();
	}
}