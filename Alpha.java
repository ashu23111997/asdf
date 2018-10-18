import java.util.Scanner;

class Alpha{

	public static void main(String[] args)
		{
			String x = (new Scanner(System.in)).nextLine();
			char a = x.charAt(0);
			if(x.length()>1)
				System.out.println("No");
			else
			{
				if(((int)a>=65 && (int)a<=90) || ((int)a>=97 && (int)a<=122))
					System.out.println("Alphabet");
				else
					System.out.println("No");
			}
		}
}
