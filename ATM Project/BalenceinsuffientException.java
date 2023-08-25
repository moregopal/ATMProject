package com.atm;

public class BalenceinsuffientException extends RuntimeException
{
public BalenceinsuffientException(String msg) 
{
 super(msg);	
}
}
 class PinNotCurrecteExcpetion extends RuntimeException
{
	 public PinNotCurrecteExcpetion(String msg) 
	 {
		super(msg);
	 }
}