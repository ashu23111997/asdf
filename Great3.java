import java.util.Scanner;

class Great3{

	public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			int[] a = new int[3];
			for(int i = 0;i<3;i++)
			{
				a[i] = s.nextInt();		
			}
			
			int x = a[0]>=a[1]?(a[0]>=a[2]?a[0]:a[2]):(a[1]>=a[2]?a[1]:a[2]);
			System.out.println(x);
		}
}
