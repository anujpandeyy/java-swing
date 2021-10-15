import javax.swing.*;
import java.awt.*;
class TextFieldGit{
TextFieldGit(){

JFrame f=new JFrame("Anuj");

JTextField t1=new JTextField("hello");

JTextField t2=new JTextField("world");

f.add(t1);
f.add(t2);

f.setVisible(true);
f.setSize(500,500);
f.setLayout(new FlowLayout());

}
public static void main (String args[]){
new TextFieldGit();
}
}