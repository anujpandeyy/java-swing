import javax.swing.*;
import java.awt.*;
class ScrollPaneGit{
ScrollPaneGit(){

Frame f =new Frame("Anuj");

JScrollPane s=new JScrollPane();


s.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  

f.add(s);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(null);
}
public static void main (String args[]){
new ScrollPaneGit();
}
}