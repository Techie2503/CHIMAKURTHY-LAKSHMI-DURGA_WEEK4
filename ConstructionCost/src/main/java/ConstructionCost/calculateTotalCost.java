package ConstructionCost;
import java.util.*;

class calculateTotalCost
{
	public static void main(String args[])
	{
		int choice,area,fullyAutomated;
		try (Scanner s = new Scanner(System.in)) {
			totalCost t = new totalCost();
			System.out.println("Enter area in square feet");
			area = s.nextInt();
			System.out.println("Enter choice of standard of material:");
			System.out.println("1.Standard");
			System.out.println("2.Above Standard");
			System.out.println("3.High Standard");
			choice = s.nextInt();
			if(choice==1)
			{
				int cost = t.calculate(1200,area);
				System.out.println("Total cost for construction is:"+Integer.toString(cost));
			}
			else if(choice==2)
			{
				int cost = t.calculate(1500,area);
				System.out.println("Total cost for construction is:"+Integer.toString(cost));
			}
			else
			{
				System.out.println("Enter 1 if you want fully automated home otherwise enter 0");
				fullyAutomated = s.nextInt();
				if(fullyAutomated==0)
				{	
					int cost = t.calculate(1800,area);
					System.out.println("Total cost for construction is:"+Integer.toString(cost));
				}
				else
				{
					int cost = t.calculate(2500,area);
					System.out.println("Total cost for construction is:"+Integer.toString(cost));
				}
			}
		}
	}
}