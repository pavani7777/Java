import java.util.Locale;
import java.util.ResourceBundle;
public class TestLocale{
	public static void main(String[] args) {
	Locale l1=new Locale("de","DE");
	ResourceBundle rb1=ResourceBundle.getBundle("MessageBundle",l1);
	System.out.println(rb1.getString("Message"));
	Locale l2=new Locale("zn","ZN");
	ResourceBundle rb2=ResourceBundle.getBundle("MessageBundle",l2);
	System.out.println(rb2.getString("Message"));
	}
	
}