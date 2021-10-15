import javax.swing.*;
import java.awt.*;
class TabbedPaneGit{
TabbedPaneGit(){

Frame f =new Frame("Anuj");

JPanel p1 =new JPanel();
JPanel p2 =new JPanel();
JPanel p3 =new JPanel();

JTabbedPane tp =new JTabbedPane();
tp.add("hello",p1);
tp.add("hi",p2);
tp.add("bye",p3);



f.add(tp);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(null);

}
public static void main (String args[]){
new TabbedPaneGit();
}
}