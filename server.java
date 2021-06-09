import java.net.*;
import java.io.*;
import java.util.*;  

public class server{
	public static void main(String[] args) throws IOException{
		
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();

		System.out.println("client connected");

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("client:yes");
		pr.flush();

		Process process = Runtime.getRuntime().exec(
        "cmd /c echo %var1%",
        new String[]{"var1=value1"});
        
        System.out.print("result :"+process);




		




		
	}

}
	
