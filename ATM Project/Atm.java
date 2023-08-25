package com.atm;
import java.util.*;
public class Atm extends Pin
{

	private static double balence=1000;
	 public static void main(String args[])
	 {
		 Pin p=new Pin();
		 p.Pin();
//		 int Pin =9552;
//		 System.out.println("Enter Your Pin");
//		 if(Pin==9552)
//		 {
//			 System.out.println("Welcome To ATM");
//		 }
//		 else
//		 {
//			 throw new PinNotCurrecteExcpetion("Place Enter Correct Pin");
//		 }
	
		 Scanner S=new Scanner(System.in);
		 
		 while(true)
		 {
//			 System.out.println("--------------------------------------");
//			 System.out.println("Enter Your Pin");
//			 System.out.println("--------------------------------------");
//			 System.out.println("Welocme To ATM");
			 System.out.println("--------------------------------------");
			 System.out.println("1 CheckBalance");
			 System.out.println("2 Deposit");
			 System.out.println("3 Withdrawal ");
			 System.out.println("4 Exit");
			 System.out.println("--------------------------------------");
			 System.out.println("Enter Your Choice");
			 System.out.println("--------------------------------------");
			 
			 int choice=S.nextInt();
			 
			 switch(choice)
			 {
			 
			 case 1:
			  System.out.println("----------------------------------------");
			  System.out.println("To chake Your Current balence");
			  System.out.println("----------------------------------------");
			  chakeBalence();
			  break;
			  
			  case 2:
			  System.out.println("-----------------------------------------");
			  System.out.println("Enter The Deposite Amount ");
			  System.out.println("-----------------------------------------");
			  double deposite=S.nextDouble();
			  Deposite(deposite);
			  break;
			  
			  case 3:
			  System.out.println("-----------------------------------------");
			  System.out.println("Enter The Withdrwal Amount ");
			  System.out.println("-----------------------------------------");
			  double withdrawal=S.nextDouble();
			  Withdrawal(withdrawal);
			  break;
			  
			  case 4:
			  System.out.println("-----------------------------------------");
		      System.out.println("Thank You For Using My ATM");
		      System.out.println("-----------------------------------------");
		      System.exit(0);
		      break;
		      
		      default:
		      System.out.println("-----------------------------------------");
		      System.out.println("Invalid Input:  Place Enter the Number");
			  System.out.println("-----------------------------------------");
			 }
				 
		 }
	 }
	public  static void chakeBalence() 
	{
		System.out.println("================================================");
		System.out.println("Your Current Balence Is :"+"   "+balence);
		System.out.println("================================================");
		
	}
	public static void Deposite(double amt)
	{
		balence=balence+amt;
		System.out.println("=============================================");
		System.out.println("Deposit successful. New balance:" +balence);
		System.out.println("=============================================");
	}
	public static void Withdrawal(double amt)
	{
		if(amt<0) {
			System.out.println("Cannot withdraw amount lower than zero");
		}
		if((amt+500)<balence)
		{ 
			
			balence=balence-amt; 
			System.out.println("==============================================");
			System.out.println(" Withdrawal Successful. New balence: "+balence);
			System.out.println("===============================================");
		}
		else
		{
			throw new BalenceinsuffientException("Palce Give Suffiente Amount");
		}
	}
	
	
}