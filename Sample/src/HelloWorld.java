import java.text.SimpleDateFormat;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("hello world\n");
			int a=10;
			int b=10;
			System.out.print(a+b + "\n");
			
			String ss="hello worlddsadas";
			int index=ss.indexOf("lo");
			System.out.print(index+ "\n");
			Date date = new Date();
		      String strDateFormat = "HH:mm:ss a";
		      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		      System.out.println(sdf.format(date)); 
 
					
	}

}
