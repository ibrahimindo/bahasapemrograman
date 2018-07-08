public class looping1{
	
	public static void main (String[] args)
	{
		int loopmaksimal = 5;
		int i = 1, j;
		boolean undo = false;
		while(i > 0) {
			j = 1;
			while(j <= i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println("");
			if (undo) {
				i--;
			}else{
				i++;
			}
 
			if (i == loopmaksimal) {
				undo = true;
			}
 
		}
	}
}
