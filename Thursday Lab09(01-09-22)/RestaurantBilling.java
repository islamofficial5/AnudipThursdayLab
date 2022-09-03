package restaurant_billing_ThursdayLab;

import java.util.Scanner;

public class RestaurantBilling
{
	public static void main(String[] args)
	{
		String ch;
		int id;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========Menu===========");
		System.out.println("1.Briyani Combo     Rs.199");
		System.out.println("2.Chinese Combo     Rs.299");
		System.out.println("3.Bada Platter      Rs.199");
		System.out.println("4.Dhosa Platter     Rs.399");
		do
		{
			System.out.println("------------------------------");
			System.out.println("Enter food id:");
			id = sc.nextInt();
			switch(id)
			{
			case 1:
				RMS.order("Briyani Combo", 199);
				break;
			case 2:
				RMS.order("Chinese Combo", 299);
				break;
			case 3:
				RMS.order("Bada Platter", 199);
				break;
			case 4:
				RMS.order("Dhosa Platter", 399);
				break;
			default:
				System.out.println("wrong input");
			}
			System.out.println("Continue billing press y/n");
			ch = sc.next();
			System.out.println("ch:" +ch);
		}
		while(ch.equalsIgnoreCase("y"));
		{
			RMS.billing();
		}
		System.out.println("------------------------------------");
		System.out.println("-----**Thank you visit again**------");
	}
}
