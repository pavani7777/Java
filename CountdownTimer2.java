import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class CountdownTimer2 implements Runnable
{
JTextField tf;
JLabel l;
JFrame fr;
public void run()
{
buildGUI();
}
void display()
{
for (int i=60;i>=0; i--)
{
try{
Thread.sleep(1000);
String s=Integer.toString(i);
tf.setText(" "+s+"second to go..");
}catch (Exception e){
System.out.println(e);
}
}
JOptionPane.showMessageDialog(fr, "timeup!!!!");
tf.setText("");
tf.setEnabled(false);
}
public void buildGUI(){
fr=new JFrame("countown timer");
JPanel p=new JPanel();
l=new JLabel("");
tf=new JTextField(15);
tf.setEnabled(false);
Font f=new Font("Verdana",0,18);
tf.setFont(f);
tf.setBackground(Color.BLACK);
p.setBackground(Color.blue);
fr.add(p);
p.add(tf);
p.add(l);
fr.setVisible(true);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setSize(300,300);
fr.setResizable(false);
display();
}
public static void main(String args[])
{
CountdownTimer2 obj=new CountdownTimer2();
Thread CountdownThread=new Thread(obj);
CountdownThread.start();
}

}
