package ClientPackage;

import java.net.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Client {
	public static void main(String[] args) {
		try {
		 String operation;
		 Scanner scanner= new Scanner(System.in);
		 
		 Socket socket=new Socket("localhost",12345);
		 System.out.println("je suis connecte");
		 System.out.println("send operation like : 34 * 55");
		 operation=scanner.nextLine();
		 scanner.close();
		 OutputStream ostream = socket.getOutputStream(); 
	     PrintWriter pwrite = new PrintWriter(ostream, true);
	     pwrite.println(operation);
		 socket.close();
		 
		

		 
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
