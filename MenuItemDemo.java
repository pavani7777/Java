import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuItemDemo extends JFrame
{
	JFrame menuFrame;
	JMenu fileMenu, editMenu, exitMenu;
	JMenuItem itemNew, itemOpen, itemCopy, itemPaste, itemClose;
	JMenuBar menuBar;
public MenuItemDemo()
{
	menuBar=new JMenuBar();
	
	fileMenu=new JMenu("File");
	editMenu=new JMenu("Edit");
	exitMenu=new JMenu("Exit");
	

	itemNew=new JMenuItem("New");
	itemOpen=new JMenuItem("Open");
	itemCopy=new JMenuItem("Copy");
	itemPaste=new JMenuItem("Paste");
	itemClose=new JMenuItem("Close");
	
	fileMenu.add(itemNew);
	fileMenu.add(itemOpen);
	editMenu.add(itemCopy);
	editMenu.add(itemPaste);
	exitMenu.add(itemClose);
	
menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(exitMenu);

setJMenuBar(menuBar);
setTitle("JMenuItem Demo");
setSize(300,300);
setVisible(true);
}
public static void main(String[] args)
{
	MenuItemDemo obj=new MenuItemDemo();
}
}