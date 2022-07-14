package rahul_lab2.paymoney.model;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int array_size = sc.nextInt();
		int[] transactionArray = new int[array_size];
		System.out.println("Enter the values of the array");
		for(int i = 0; i< array_size; i ++)
		{
			transactionArray[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets to be achived");
		int targets = sc.nextInt();
		while(targets != 0)
		{
			System.out.println("Enter the target value");
			long target = sc.nextLong();
			boolean bTargetAchieved  = false;
			long sum = 0; 
			for(int i = 0; i<array_size && !bTargetAchieved;i++)
			{
				sum += transactionArray[i];
				if(sum>=target)
				{
					bTargetAchieved = true;
					System.out.println("Target achieved after "+(i+1)+" transactions");
					break;
				}
				
			}
			if(!bTargetAchieved)
			{
				System.out.println("Target cannont be achieved");	
			}
			targets--;
			
		}
		
	}

}
