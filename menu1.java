import java.awt.*;
import java.awt.event.*;
public class menu1 extends Frame
{
MenuBar mb;
Menu m1,m2;
MenuItem i1,i2,i3,i4,i5,i6,i7,i8;
menu1()
{
setSize(500,500);
show();
mb=new MenuBar();
setMenuBar(mb);
m1=new Menu("File");
m2=new Menu("Edit");
mb.add(m1);
mb.add(m2);
i1=new MenuItem("New");
i2=new MenuItem("New Window");
i3=new MenuItem("Save");
i4=new MenuItem("Save As");
i5=new MenuItem("Copy");
i6=new MenuItem("Cut");
i7=new MenuItem("Past");
i8=new MenuItem("Undo");
m1.add(i1);m1.add(i2);m1.add(i3);m1.add(i4);m2.add(i5);m2.add(i6);m2.add(i7);m2.add(i8);
}
public static void main(String args[])
{
new menu1();
}
}