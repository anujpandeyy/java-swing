import java.awt.*;
class IconGit{
IconGit(){

Frame f=new Frame();

Image icon =Toolkit.getDefaultToolkit().getImage("C:\\Users\\Anuj_Laptop\\Downloads\\garou.jpg");

f.setIconImage(icon);
f.setLayout(new FlowLayout());
f.setSize(500,500);
f.setVisible(true);

}
public static void main (String args[]){
new IconGit();
}
}