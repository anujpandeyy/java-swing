import javax.swing.*;
import java.awt.*;
class ComboBoxGit{
ComboBoxGit(){

JFrame f=new JFrame("Anuj");

String country[]={"India","U.S.A","England","Newzealand"};

JComboBox c = new JComboBox(country);

f.add(c);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());

}
public static void main (String args[]){
new ComboBoxGit();
}
}