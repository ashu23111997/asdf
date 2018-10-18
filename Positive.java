import java.util.Scanner;
import static java.lang.System.out;
class A{

public static void main(String[] args)
{
  int a = (new Scanner(System.in)).nextInt();
  if(a>0)
    out.println("Positive");
  else if(a<0)
    out.println("Negative");
  else
    out.println("Zero");
}
}
