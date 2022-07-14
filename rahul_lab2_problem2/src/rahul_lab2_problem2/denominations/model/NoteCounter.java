package rahul_lab2_problem2.denominations.model;

public class NoteCounter {

	public void PrintNoteCount(int[] denomination,int amountToBePaid)
	{
		int[] countNotes = new int[denomination.length];
		try {
			for(int i=0;i<denomination.length;i++) {  // 3 0,
				
				if(amountToBePaid >= denomination[i])  // amount 100 >= 50,100
				{
					countNotes[i] = amountToBePaid / denomination[i]; // notCounter[i] = 2 //100/100 = 1
					amountToBePaid = amountToBePaid - countNotes[i]*denomination[i]; // 100 - 1* 100 = 0
				}
				
			}
			if(amountToBePaid>0) {
				
				System.out.println("Denomination value given is higher");
				
			}
			else
			{
				System.out.println("Your payment approach in order to give min no of notes will be");
			}
			
			for(int i=0;i<denomination.length;i++) {
				if(countNotes[i] !=0) {
					System.out.println(denomination[i]+ ":" + countNotes[i]);
				}
			}
		}
		catch(Exception ex) {
			System.out.println("Exception " + ex);
		}
		
	}
}
