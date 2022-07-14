package rahul_lab2_problem2.denominations.main;

import java.util.Scanner;

import rahul_lab2_problem2.denominations.model.NoteCounter;
import rahul_lab2_problem2.denominations.model.mergeSorter;

public class DenominationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int denomination_size = sc.nextInt();
		int[] denominationArray = new int[denomination_size];
		System.out.println("Enter the currency denominations value");
		for(int i = 0; i< denomination_size; i ++)
		{
			denominationArray[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amountToPay = sc.nextInt();
		
		mergeSorter sorter = new mergeSorter();
		sorter.sort(denominationArray,0,denominationArray.length-1);
		NoteCounter nc = new NoteCounter();
		nc.PrintNoteCount(denominationArray, amountToPay);
		
	}

}
