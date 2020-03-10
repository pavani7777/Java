package game;

import java.util.Random;
import java.util.Scanner;

public class Hangman
{
	public void showMenu() throws Exception
	{
		int option=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("---------Menu---------");
		System.out.println("1.play");
		System.out.println("2.Instruction");
		System.out.println("3.Exit");
		System.out.println("\nChoose the option");
		try
		{
		option=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please provide a valid numerical input");
			showMenu();
		}
		switch(option)
		{
		case 1:playGame();
		break;
		case 2:instructGame();
		break;
		case 3:exitGame();
		break;
		default:
			try
			{
				throw new Exception();
			}
			catch(Exception e)
			{
			showMenu();
		
			}
		}
	}


	
	
		
	
private void exitGame() {
		// TODO Auto-generated method stub
	System.out.println("playGame method is invoked");
	System.exit(0);
	}





private void instructGame() {
		// TODO Auto-generated method stub
	
	}
private void playGame() throws Exception 
{
	String word[]= {"japan", "qutar", "syria", "mongolia", "bahrain", "india"};
	int len,i,count=0,rnd,flag=0;
	String choice, temp;
    Random rd=new Random();
    Scanner input=new Scanner(System.in);
    rnd=rd.nextInt(6);
    len=word[rnd].length();
    char[] newString=new char[len];
    StringBuffer wrgString=new StringBuffer();
    for(int j=0;j<len;j++)
    {
    	System.out.print("_ ");
    }
    System.out.println();
    do
    {
    	flag=0;
    	System.out.println("\nEnter your guess:");
    	try
    	{
    	String ch=input.nextLine().toLowerCase();
    	if(ch.length()!=1)
    	{
    		throw new Exception();
    	}
    	count++;
    	for(i=0;i<len;i++)
    	{
    		if(word[rnd].charAt(i)==ch.charAt(0))
    		{
    			newString[i]=word[rnd].charAt(i);
    			flag=1;
    		}
    	
    	}
    	if(flag==0)
    	{
    		flag=1;
    		wrgString.append(ch+",");
    		System.out.println("\nMisses:"+wrgString);
    	}
    	System.out.println(newString);
    	temp=new String(newString);
    	if(word[rnd].equals(temp))
    	{
    		System.out.println("---------- Congrats :) you won ----------");
    		System.out.println("Do you wnat to play again? (Y/N)");
    		choice=input.nextLine();
    		if(choice.equalsIgnoreCase("Y"))
    		{
    			playGame();
    		}
    		else
    		{
    			showMenu();
    		}
    	}
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }while(flag!=0);
}

public static void main(String[] args) throws Exception
{
	Hangman hd=new Hangman();
	hd.showMenu();
}
}