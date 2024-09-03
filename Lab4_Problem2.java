import java.util.*; 
public class Lab4_Problem2
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    double dScore;   
    
    // Instantiations (Scanner, DecimalFormat, etc.):
    Scanner cin = new Scanner (System.in);    
    
    // INPUT (prompt and store values for input-capture variables from the user)
    System.out.print("Enter your score: ");
    dScore = cin.nextDouble();
    
    // Input 
    while (dScore <= 0)
    {
      System.out.println("Invalid Score");
      System.out.println("Enter your score between 0-100: ");
      try
      {
        dScore = cin.nextDouble();
        if (dScore <=0)
        {
         System.out.println("Invalid Score");
         System.out.println("Enter your score between 0-100: ");
        }
      }
      catch (Exception e)
      {
        System.out.println("invalid input, please enter a valid integer.");
        cin.next();
      }
    }
    // Processing and Calculations
    if (dScore < 0 || dScore > 100)
    {
      System.out.println("Error: Enter a valid score.");
    }
    else
    {
      if (dScore >= 90)
      {
        System.out.println("Letter grade: A");
      }
      else if (dScore >= 87)
      {
        System.out.println("Letter grade: A-");
      }
      else if (dScore >= 83) 
      {
        System.out.println("Letter grade: B+");
      } 
      else if (dScore >= 80) 
      {
        System.out.println("Letter grade: B");
      }
      else if (dScore >= 77) 
      {
        System.out.println("Letter grade: B-");
      } 
      else if (dScore >= 73) 
      {
        System.out.println("Letter grade: C+");
      } 
      else if (dScore >= 70) 
      {
        System.out.println("Letter grade: C");
      } 
      else if (dScore >= 67) 
      {
        System.out.println("Letter grade: C-");
      } 
      else if (dScore >= 63) 
      {
        System.out.println("Letter grade: D+");
      } 
      else if (dScore >= 60) 
      {
        System.out.println("Letter grade: D");
      } 
      else
      {
        System.out.println("Letter grade: F");
      }
   }
 }
}

