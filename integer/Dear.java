package integer;

import java.util.Scanner;

public class Dear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Key in 8 different numbers");
        for (int i=1; i<9; i++)
        {
            int num=scan.nextInt();
            sum=sum+num;    
        }
        System.out.println("Average: "+sum/8);
    }




	}


