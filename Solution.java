import java.util.*;
class Solution{
  public static void main(String[] args)
  {
    int num = (new Scanner(System.in)).nextInt();
    if(num>0)
      System.out.println("Positive");
    else if(num<0)
      System.out.println("Negative");
    else
      System.out.println("Zero");
  }
}
