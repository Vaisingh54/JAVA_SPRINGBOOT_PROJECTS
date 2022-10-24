package Interface;

import java.awt.event.ActionListener;

public class DeskTop implements Pendrive{

 @Override
public void read() {
System.out.println("Desktop reads");
}

 @Override
public void write() {
System.out.println("Desktop writes");
}

 @Override
public void scan() {
System.out.println("Desktop scan");
}

 @Override
public void format() {
System.out.println("Desktop format");
}

}
