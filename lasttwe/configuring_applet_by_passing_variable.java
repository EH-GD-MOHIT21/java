import java.applet.*;
import java.awt.Graphics;
/* <applet code="AppletParamDemo.class" width=300 height=100>
<param name=place value="Gulbarga"> <param name=college value="Govt Polytechnic">
</applet> */
public class configuring_applet_by_passing_variable extends Applet
{
String p,c;
public void init()
{
p=getParameter("place");
c=getParameter("college");
}
public void paint(Graphics g)
{
g.drawString(c,80,20);
g.drawString(p,100,40);
}
