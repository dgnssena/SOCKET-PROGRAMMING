import java.net.*;
import java.io.*;
import java.util.*;  


public class client{
	public static void main(String[] args) throws IOException{
		Socket s =new Socket("localhost",4999);

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("hello");
		pr.flush();


		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str1= sc.nextLine();              //reads string 
       System.out.print("You have entered: "+str1);   


       Process process = Runtime.getRuntime().exec("str1",
       	    new String[]{"var2=dogan"});
       System.out.print("entered:"+process);
        
       



		






	}

}
	
