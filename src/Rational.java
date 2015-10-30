
public class Rational
{
	
	//Class Attributes
	   private int firstNum;
	   private int firstDen;
	   private int reducedNum;
	   private int reducedDen;
	   private int gcf;
	   
   
	  //Method used to display data 
	  public void displayData()
   {
	  System.out.println();
      System.out.println(getOriginal() + " equals " + getDecimal());
      System.out.println();
      System.out.println("and reduces to " + getReduced());
      System.out.println();
   }
   
   //Constructor
   public Rational(int n, int d){
	   firstNum = n;
	   firstDen = d;
   }
   
   //Returns numerator
   private int getNum(){
	   return firstNum;
   }
   
   //Returns denominator
   private int getDen()
   {
	   return firstDen;
   }
   
   //Converts numerator and denominator to double and divides them
   private double getDecimal()
   {
	   return (double)getNum() / (double)getDen();
	   
   }
   
   
   //Gets Original String Representation of fraction
   private String getOriginal(){
	   return String.valueOf(firstNum) + "/" + String.valueOf(firstDen);
   }
   
   //First finds the gcf and then reduces num and den by gcf
   private String getReduced(){
	   getGCF(firstNum,firstDen);
	   reducedNum = firstNum / gcf;
	   reducedDen = firstDen / gcf;
	   	   
	   return String.valueOf(reducedNum) + "/" + String.valueOf(reducedDen);
   }

   
   //Method to find gcf
  private void getGCF(int n1,int n2)
   {
      int rem = 0;
      do
      {
         rem = n1 % n2;
         if (rem == 0)
            gcf = n2;
         else
         {
            n1 = n2;
            n2 = rem;
        }
      }
      while (rem != 0);
   }
}