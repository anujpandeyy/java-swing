import javax.swing.*;
import java.awt.*;
class RadioButtonGit{
RadioButtonGit(){

Frame f =new Frame("Anuj");

JRadioButton b1=new JRadioButton("code");

JRadioButton b2=new JRadioButton("sleep");

f.add(b1);
f.add(b2);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());

}
public static void main (String args[]){
new RadioButtonGit();
}
}