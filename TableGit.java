import javax.swing.*;
class TableGit{
TableGit(){

JFrame f=new JFrame ("Anuj");

String data [][]={{"555","Anuj","5555"}};

String column []={"ID","NAME","SALARY"};

JTable j=new JTable(data,column);


JScrollPane s=new JScrollPane(j);

f.add(s);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(null);
}
public static void main (String args[]){
new TableGit();
}
}