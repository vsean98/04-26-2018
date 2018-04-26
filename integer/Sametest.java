package integer;
import java.util.Scanner;
public class Sametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Same candidate1 =new Same(12,23.4, 20);
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        System.out.println("New application for insurance");
        System.out.println("How old are you? ");
        int age=scan.nextInt();
        System.out.println("How much do you weigh?");
        double weight=scan.nextDouble();
        System.out.println("What is your yearly income?");
        double income=scan.nextDouble();
        if (age<18)
        {
            System.out.println("You will be added to the minor category");
        }
        else if((age>=18)&&(age<38)&&(weight<200))
        {
            System.out.println("You will be added to the healthy category");
        }
        else if ((age>=38)&&(age<58)&&(income>50000))
        {
            System.out.println("You will be added to the Low risk category");
        }
        else if (age>58)
        {
            System.out.println("You will be added to the High risk category");
        }
        else
        {
            System.out.println("Error");
        }
        System.out.println("Are you starting a new application? Press any key to start new Quote. if not key in 1 to Quit.");
        int answer=scan.nextInt();
        if(answer==1)
        {
            break;
        }
        
        
        }
    }


	
		
		
	}


