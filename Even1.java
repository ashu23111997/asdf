import java.util.*;
class Even1{
  public static void main(String[] args)
  {
    int num = (new Scanner(System.in)).nextInt();
    if(num<0)
      System.out.println("invalid");
    else if(num%2==0)
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
}
