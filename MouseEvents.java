import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code = "MouseEvents.class" width=500 height=500>
 * </applet>
 */
public class MouseEvents extends Applet implements MouseListener {
    String msg = "";

    public void init(){
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        msg = "MOUSE CLICKED";
        showStatus("mouse clicked");
        repaint();
    }

    public void mousePressed(MouseEvent me)
    {
        msg = "MOUSE PRESSED";
        showStatus("mouse pressed");
        repaint();
    }

    public void mouseReleased(MouseEvent me)
    {
        msg = "MOUSE RELEASED";
        showStatus("mouse released");
        repaint();
    }

    public void mouseentered(MouseEvent me)
    {
        msg = "MOUSE ENTERED";
        showStatus("mouse entered");
        repaint();
    }

    public void mouseExited(MouseEvent me)
    {
        msg = "MOUSE EXITED";
        showStatus("mouse exited");
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,20,20);
    }

}
