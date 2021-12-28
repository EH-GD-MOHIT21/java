import java.io.*;

import java.net.*;

class Server

{

    public static void main(String args[])

    {

        try

        {

            ServerSocket ss = new ServerSocket(1064);

            System.out.println("Waiting for Client Request");

            Socket s = ss.accept();

            BufferedReader br;

            PrintStream ps;

            String str;

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            str = br.readLine();

            System.out.println("Received radius");

            double r = Double.parseDouble(str);

            double area = 3.14 * r * r;

            ps = new PrintStream(s.getOutputStream());

            ps.println(String.valueOf(area));

            br.close();

            ps.close();

            s.close();

            ss.close();

        }

        catch (Exception e)

        {

            System.out.println(e);

        }

    }

}

// Client Program

// import java.io.*;

// import java.net.*;

// class simple_client_server_application

// {

// public static void main(String args[]) throws IOException

// {

// Socket s = new Socket(InetAddress.getLocalHost(), 1064);

// BufferedReader br;

// PrintStream ps;

// String str;

// System.out.println("Enter Radius :");

// br = new BufferedReader(new InputStreamReader(System.in));

// ps = new PrintStream(s.getOutputStream());

// ps.println(br.readLine());

// br = new BufferedReader(new InputStreamReader(s.getInputStream()));

// str = br.readLine();

// System.out.println("Area of the circle is : " + str);

// br.close();

// ps.close();

// }

// }
