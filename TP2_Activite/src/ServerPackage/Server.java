package ServerPackage;
import java.io.BufferedReader;
import java.net.SocketException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
 
public class Server {
	public static void main(String[] args)
	{
		String operation;
		int resultat;
		String[] ParOpartion;
		try {
		
		try {	
			
			ServerSocket ss=new ServerSocket(12345);	
			System.out.println("je suis un serveur en attente");
			Socket s=ss.accept();
			System.out.println("l'operation ? :");
			InputStream is = s.getInputStream();
            InputStreamReader isr= new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            operation= br.readLine();
            System.out.println("le operation est : "+operation);
			ParOpartion=operation.split(" ");
            switch(ParOpartion[1]) {
            case "*":
            	System.out.println("l'operation est le multiplucation *");
            	resultat=Integer.parseInt(ParOpartion[0])*Integer.parseInt(ParOpartion[2]);
            	System.out.println("resultat = "+resultat);
            	break; 
            case "+":
                System.out.println("l'operation est l'addition +");
                resultat=Integer.parseInt(ParOpartion[0])+Integer.parseInt(ParOpartion[2]);
                System.out.println("resultat = "+resultat);
                break;
            case "-":
            	System.out.println("l'operation est le diffèrence -");
            	resultat=Integer.parseInt(ParOpartion[0])-Integer.parseInt(ParOpartion[2]);
            	System.out.println("resultat = "+resultat);
            	break;
            case "/":
            	System.out.println("l'operation est le division / ");
            	resultat=Integer.parseInt(ParOpartion[0])/Integer.parseInt(ParOpartion[2]);
            	System.out.println("resultat = "+resultat);
            	break;
                
            default:
                System.out.println("tapez correcte operation SVP !");
                resultat=-1;
            	
            	
               
            }
			s.close();
		}
			catch(IOException e){
			e.printStackTrace();	
				
			}

	
	}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
}
	
}