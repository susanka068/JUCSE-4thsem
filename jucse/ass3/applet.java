import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class applet implements ItemListener
{
    private Checkbox cbJava ; 
    private Checkbox cbPython ;
    private Label messageLabel ;
    private String text = "" ;
    public applet() 
    {
        Frame frame = new Frame("blah blah");
        Font font = new Font("SansSeriff",Font.BOLD,12);
        cbJava = new Checkbox("Java");
        cbPython = new Checkbox("Python");
        messageLabel = new Label();
        cbJava.setBounds(10,40,160,30);
        cbPython.setBounds(10,80,160,30);
        cbJava.setFont(font);
        cbPython.setFont(font);
        frame.add(cbJava);
        frame.add(cbPython);
        cbJava.addItemListener((java.awt.event.ItemListener) this);
        cbPython.addItemListener((java.awt.event.ItemListener) this);
        frame.setSize(400,350);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new applet();

    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        text = "";
        text+="Languages";
        text += "Java :" + cbJava.getState();
        text += "Python" + cbPython.getState();
        messageLabel.setText(text);

    }
}