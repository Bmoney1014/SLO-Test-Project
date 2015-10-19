package SLO.controller;

import java.util.Scanner;
import SLO.output.OutputClass;

public class ControllerClass 
{
	private theirOutput userOutput;
	private Scanner userScanner;
	private userInfo OutputClass;
	
	public ControllerClass()
	{
	userScanner = new Scanner(System.in);
	userOutput = new OutputClass();
	userInfo = new ControllerClass(name, age, isInSchool);
	
	System.out.println("Type in your name");
	String userName = userScanner.next();
	}
	}
private void askQuestions()
{
System.out.println("Type in your name");
String userName = userScanner.next();

System.out.println("Type in your age");
int userAge = userScanner.nextInt();
}