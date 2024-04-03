import java.util.Scanner;

public class Extract_no {
	static int extractMaximum(String str) 
	{ 
		int num = 0, res = 0; 
	
		for (int i = 0; i<str.length(); i++) 
		{	
			if (Character.isDigit(str.charAt(i))) 
				num = num * 10 + (str.charAt(i)-'0'); 
	
			else
			{ 
				res = Math.max(res, num); 
	
				num = 0; 
			} 
		} 
	
		return Math.max(res, num); 
	} 
	
	public static void main(String[] args) 
	{ 
        Scanner j =new Scanner(System.in);
		String str = j.nextLine(); 
		System.out.println(extractMaximum(str)); 
	}	 
} 




