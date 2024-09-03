import java.util.*;
public class Lab6_Problem1
{
  public static void main(String[] args)
  {
   int iNum;
   
   Scanner cin = new Scanner (System.in);
   do
   {   
   System.out.print("Enter a value between 1 and 50");
   while (!cin.hasNextInt())
   {
     System.out.println("Not a valid number");
     System.out.println("Only integers between 1 and 100: ");
     cin.next();
   }
   iNum = cin.nextInt();
   }
   while (iNum <1 || iNum >100);
   {
   fvDrawTriangle(iNum);
   }
  }
   
  
  public static void fvDrawTriangle(int iPiMax)
  {  
    // DECLARATIONS
    int iRows;
    int iColumns;
    
    // PROCESSING AND CALCULATIONS
    for (iRows = iPiMax; iRows >= 1; iRows--)
    {
      for(iColumns = 1; iColumns <= iRows; iColumns++)
      {
        System.out.print("/");
      }
      System.out.println();
    }
    
  }

}
