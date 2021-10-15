import javax.swing.*;
import java.awt.*;
class ButtonGit{
ButtonGit(){

Frame f=new Frame("Anuj");

JButton b1 =new JButton("click");
JButton b2 =new JButton("here");

f.add(b1);
f.add(b2);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());
}
public static void main (String args[]){
new ButtonGit();
}
}