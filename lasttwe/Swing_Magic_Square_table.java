import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Swing_Magic_Square_table extends Frame implements WindowListener {
    
    TextField t;
    Button b;
    TextArea ta;

    Swing_Magic_Square_table(String s){
        super(s);
        t = new TextField();
        setLayout(new FlowLayout());
        setSize(500, 500);
        b = new Button("Eval");
        b.addActionListener(new ActionListener() {    
            public void actionPerformed (ActionEvent e) {  
                    int value = Integer.parseInt(t.getText());

                    ta.setText(generateSquare(value));    
                }    
            });  
        ta = new TextArea();
        t.setBounds(0, 0, 500, 50);
        ta.setBounds(0, 120, 500, 50);
        b.setBounds(0, 180, 500, 50);
        add(t);
        add(b);
        add(ta);
    }

    

    public void windowOpened(WindowEvent e){};

    public void windowClosing(WindowEvent e){
        System.exit(0);
    };

    public void windowClosed(WindowEvent e){};

    public void windowIconified(WindowEvent e){};

    public void windowDeiconified(WindowEvent e){};
   
    public void windowActivated(WindowEvent e){};

    public void windowDeactivated(WindowEvent e){};

    static String generateSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) 
            {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;
                if (i < 0)
                    i = n - 1;
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                magicSquare[i][j] = num++;
            j++;
            i--;
        }

        String s = "";

        System.out.println("The Magic Square for " + n
                + ":");
        System.out.println("Sum of each row or column "
                + n * (n * n + 1) / 2 + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++){
                s = s.concat(String.valueOf(magicSquare[i][j]));
            }
            s = s.concat("\n");
        }
        
        return s;
    }

    // driver program
    public static void main(String[] args) {
        // Works only when n is odd
        // generateSquare(n);
        Swing_Magic_Square_table m = new Swing_Magic_Square_table("magic square");
        m.show();
    }
}