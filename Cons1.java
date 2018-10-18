import java.util.Scanner;

class Cons1{

	public static void main(String[] args)
		{
			String x = (new Scanner(System.in)).nextLine();
			char a = x.charAt(0);
			if(x.length()>1)
				System.out.println("invalid");
			else
			{
				if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
				{
					System.out.println("Vowel");
				}
				else if(((int)a>=65 && (int)a<=90) || ((int)a>=97 && (int)a<=122))
					System.out.println("Consonant");
				else
					System.out.println("invalid");
			}
		}
}
