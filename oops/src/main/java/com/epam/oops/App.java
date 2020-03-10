package com.epam.oops;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App extends Gift
{
    public static void main( String[] args )
    {
    	TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no of chocolates:");
    	int no_choc=sc.nextInt();
    	for(int i=0;i<no_choc;i++){
    		System.out.println("Enter chocolate type 0/1:");
    		int chocType=sc.nextInt();
    		System.out.println("Enter weight of the chocolate:");
    		int chocWeight=sc.nextInt();
    		System.out.println("Enter price of chocolate:");
    		int chocPrice=sc.nextInt();
    		String candyName=null;
    		if(chocType==1){
    			System.out.println("Enter name of the candy:");
    			candyName=sc.next();
    			tm.put(chocWeight, candyName);
    			wgt.add(chocWeight);
    		}
    	}
    	Sweets s1=new Sweets(50,80);
    	Sweets s2=new Sweets(20,60);
    	Sweets s3=new Sweets(40,50);
    	Sweets s4=new Sweets(30,40);
    	Gift g=new Gift();
    	System.out.println("TotalWeight="+g.getWeight());
    	System.out.println("Sorting Chocolates based on weight:");
    	Chocolates c=new Chocolates();
    	c.sortChocolates(tm);
    	System.out.println("Enter lower limit and upper limit:");
    	int l1=sc.nextInt();
    	int l2=sc.nextInt();
    	c.getChoclatesInRange(l1,l2,tm);
    }
}
