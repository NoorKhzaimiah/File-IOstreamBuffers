package streams;
import java.io.*;
public class str2 {
	
	 public static void main(String[] args) throws Exception{
	       
	     InputStream  r = new FileInputStream("e:\\data.txt");
	     FileOutputStream fout = new      FileOutputStream("e:\\out.txt");
	     BufferedOutputStream bo = new BufferedOutputStream(fout);
	     BufferedInputStream bin = new BufferedInputStream(r);
	     
	     // read chars
	     BufferedReader buf = new BufferedReader(new FileReader("e:\\data.txt"));
	        System.out.println("line 1: "+ buf.readLine());
	        System.out.println("line 2: "+ buf.readLine());
	     
	     //byte dd[]=new byte[1000];
	    // bin.read(dd);
	    // String str = new String(dd);
	     //   System.out.println(str);
	     
//	     for (int i=50;i<150;i++)
	  //   bo.write(i);
	  
	  /*
	  bo.write("Networks Programming\r\n".getBytes());
	  bo.write("5th year level\n".getBytes());
	  
	  
	     bo.flush();
	    */    
	    }
	    

}
