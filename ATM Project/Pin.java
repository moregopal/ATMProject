package com.atm;

import java.util.Scanner;

public class Pin 
{
	
		public static void Pin()
		  {
			  int Pin;
			  Scanner s=new Scanner(System.in);
			  System.out.println("Enter Your Pin");
			  Pin=s.nextInt();
			  
			  if(Pin==9552)
			  {
				  System.out.println("--------------------------------------");
				  System.out.println("Welocme To ATM");
				  System.out.println("--------------------------------------");
			  }
			  else
			  {
						 throw new PinNotCurrecteExcpetion("Place Enter Currect Pin");
			  }

			  
		  }
//		public static void main(String[] args) 
//		{
//			Pin p=new Pin();
//			p.Pin();
//		}
	 }

 

