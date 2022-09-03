package restaurant_billing_ThursdayLab;

import java.util.ArrayList;
import java.util.Scanner;

public class RMS 
{
	static ArrayList<bill> list = new ArrayList<bill>();
	
	static void order(String f_name, int amt)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(f_name+ " Enter quantity :");
		int qty = sc.nextInt();
		
		list.add(new bill(f_name, qty, qty*amt));
	}
	
	static void billing()
	{
		double total = 0.0;
		for(bill i : list)
		{
			System.out.println(i.f_name+ "  "+i.qty+"  "+i.amt);
			total+=i.amt;
		}
		System.out.println("Total:" +total);
		System.out.println("GST:" +total*0.05);
		System.out.println("------------------------------------");
		System.out.println("Net amount:" +total*1.05);
	}
}
