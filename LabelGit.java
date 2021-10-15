import javax.swing.*;
import java.awt.*;
class LabelGit{
LabelGit(){

JFrame f =new JFrame("Anuj");


JLabel j1=new JLabel("Anuj");
JLabel j2=new JLabel("Pandey");

f.add(j1);
f.add(j2);

f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());

}
public static void main (String args[]){
new LabelGit();
}
}