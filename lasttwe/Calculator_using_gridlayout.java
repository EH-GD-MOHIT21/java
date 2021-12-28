import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Calculator_using_gridlayout extends Frame implements ActionListener {
    int i = 0, temp = 0;
    char a;
    float stk[];
    int top;
    TextField t;
    Button dot, mod, b, one, two, three, four, five, six, seven, eight, nine,
            zero, add, sub, mul, div, eq, sine, sqrt, cbrt;
    GridBagConstraints gc;

    Calculator_using_gridlayout() {
        super("My Calculator");
        stk = new float[20];
        top = -1;
        gc = new GridBagConstraints(); // creating gridlayout
        // creating textfield and button on simple calculator
        t = new TextField("");
        b = new Button("Reset");
        one = new Button(" 1 ");
        two = new Button(" 2 ");
        three = new Button(" 3 ");
        four = new Button(" 4 ");
        five = new Button(" 5 ");
        six = new Button(" 6 ");
        seven = new Button(" 7 ");
        eight = new Button(" 8 ");
        nine = new Button(" 9 ");
        zero = new Button(" 0 ");
        add = new Button(" + ");
        sub = new Button(" - ");
        mul = new Button(" * ");
        div = new Button(" / ");
        eq = new Button(" = ");
        dot = new Button("...");
        mod = new Button(" % ");
        sine = new Button(" sin ");
        sqrt = new Button(" sqrt ");
        cbrt = new Button(" cbrt ");
        setSize(250, 250);
        setLocation(500, 200);
        setLayout(new GridBagLayout());
        addcomp(one, 1, 1, 1, 1);
        addcomp(two, 1, 2, 1, 1);
        addcomp(three, 1, 3, 1, 1);
        addcomp(four, 1, 4, 1, 1);
        addcomp(five, 2, 1, 1, 1);
        addcomp(six, 2, 2, 1, 1);
        addcomp(seven, 2, 3, 1, 1);
        addcomp(eight, 2, 4, 1, 1);
        addcomp(nine, 3, 1, 1, 1);
        addcomp(zero, 3, 2, 1, 1);
        addcomp(mul, 3, 3, 1, 1);
        addcomp(div, 3, 4, 1, 1);
        addcomp(add, 4, 1, 1, 1);
        addcomp(sub, 4, 2, 1, 1);
        addcomp(eq, 4, 3, 1, 1);
        addcomp(mod, 4, 4, 1, 1);
        addcomp(dot, 5, 1, 1, 1);
        addcomp(sine, 5, 2, 1, 1);
        addcomp(sqrt, 5, 3, 1, 1);
        addcomp(cbrt, 5, 4, 1, 1);
        addcomp(new Label(""), 7, 1, 4, 1);
        addcomp(t, 8, 1, 4, 1);
        addcomp(new Label(""), 9, 1, 4, 1);
        addcomp(b, 10, 2, 2, 1);
        setVisible(true);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        eq.addActionListener(this);
        mod.addActionListener(this);
        dot.addActionListener(this);
        sine.addActionListener(this);
        sqrt.addActionListener(this);
        cbrt.addActionListener(this);
        b.addActionListener(this);
    }

    public void addcomp(Component cc, int r, int c, int w, int h) {
        gc.gridx = c;
        gc.gridy = r;
        gc.gridwidth = w;
        gc.gridheight = h;
        gc.fill = gc.BOTH;
        add(cc, gc);
    }

    // performing action on simple calculator
    public void actionPerformed(ActionEvent ae) { // comparing input value in simple calculator
        if (ae.getSource() == b) {
            t.setText("");
        }
        if (ae.getSource() == one) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "1");
        }
        if (ae.getSource() == two) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "2");
        }
        if (ae.getSource() == three) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "3");
        }
        if (ae.getSource() == four) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "4");
        }
        if (ae.getSource() == five) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "5");
        }
        if (ae.getSource() == six) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "6");
        }
        if (ae.getSource() == seven) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "7");
        }
        if (ae.getSource() == eight) {
            if (temp == 1)
                func();
            t.setText(t.getText() + "8");
        }
        if (ae.getSource() == nine) {
            t.setText(t.getText() + "9");
            if (temp == 1)
                func();
        }
        if (ae.getSource() == zero) {
            t.setText(t.getText() + "0");
            if (temp == 1)
                func();
        }
        if (ae.getSource() == add || ae.getSource() == sub || ae.getSource() == mul ||
                ae.getSource() == div || ae.getSource() == mod || ae.getSource() == sqrt ||
                ae.getSource() == cbrt || ae.getSource() == sine) {
            String s;
            s = t.getText();
            float num1 = 0, num2 = 0, num3 = 0;
            float n = Float.parseFloat(s);
            push(n);
            if (ae.getSource() == add)
                a = '+';
            if (ae.getSource() == sub)
                a = '-';
            if (ae.getSource() == mul)
                a = '*';
            if (ae.getSource() == div)
                a = '/';
            if (ae.getSource() == mod)
                a = '%';
            t.setText("");
            if (ae.getSource() == sqrt) {
                double num = pop();
                t.setText(Double.toString(Math.sqrt(num)));
            }
            if (ae.getSource() == cbrt) {
                double num = pop();
                t.setText(Double.toString(Math.cbrt(num)));
            }
            if (ae.getSource() == sine) {
                double num = pop();
                t.setText(Double.toString(Math.sin(num)));
            }
        }
        if (ae.getSource() == eq) {
            float num1 = 0, num2 = 0, num3 = 0, temp1;
            String s = t.getText();
            float n = Float.parseFloat(s);
            push(n);
            num1 = pop();
            num2 = pop();
            switch (a) {
                // perform arithmetic operation
                case '+':
                    num3 = num1 + num2;
                    push(num3);
                    break;
                case '-':
                    num3 = num2 - num1;
                    push(num3);
                    break;
                case '*':
                    num3 = num1 * num2;
                    push(num3);
                    break;
                case '/':
                    num3 = num2 / num1;
                    push(num3);
                    break;
                case '%':
                    num3 = num2 % num1;
                    push(num3);
                    break;
            }
            if (i == 1) {
                t.setText(Float.toString(num3));
                i = 0;
            } else
                t.setText(Integer.toString((int) num3));
            temp = 1;
        }
        if (ae.getSource() == dot) {
            i = 1;
            t.setText(t.getText() + ".");
        }
    }

    public void push(float a) {
        top++;
        stk[top] = a;
    }

    public float pop() {
        float num = stk[top];
        top--;
        return (num);
    }

    public void func() {
        t.setText("");
        temp = 0;
    }

    public static void main(String rr[]) throws Exception {
        new Calculator_using_gridlayout();
    }
}
