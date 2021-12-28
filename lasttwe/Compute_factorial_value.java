import java.awt.*;
import java.awt.event.*;

public class Compute_factorial_value extends java.applet.Applet implements ActionListener {
    TextField t1, t2;
    Label l1, l2, l3;
    Button b1;
    int fact = 1, n, i;
    Compute_factorial_value e;

    public void init() {
        e = this;
        t1 = new TextField(10);
        t2 = new TextField(10);
        l1 = new Label("factorial of a number");
        l2 = new Label("enter number");
        l3 = new Label("result");
        b1 = new Button("compute");
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = t1.getText();
        n = Integer.parseInt(str);
        for (i = n; i > 1; i--) {
            fact = fact * i;
        }
        String msg = "" + fact;
        t2.setText(msg);
        fact = 1;
    }
}
