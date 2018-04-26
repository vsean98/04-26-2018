package integer;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
        System.out.println("Key in 5 different numbers");
        int [] numbe1=new int [5];
        
        System.out.println("Enter different numbers");
        
        for (int j=0; j<numbe1.length; j++)
        {
        	
        	numbe1[j] = scan.nextInt(); 
        }
        
        System.out.println("please see the numbers in the array are divisble by 2");
		
        for(int i=0; i<numbe1.length; i++) {
		if (numbe1[i] %2==0)
		{
		System.out.println(i);
	}
		else

System.out.println("no number");


	}
	}
}
	







