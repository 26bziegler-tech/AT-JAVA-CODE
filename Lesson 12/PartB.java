public class PartB {
   public static void main(String[] args)
   {
      double result = smallest(3.5, 2, 1.25);
      System.out.println("The smallest number is " + result);
   }

   public static double smallest(double x, double y, double z)
   {
      double min = x;

      if (y < min)
         min = y;

      if (z < min)
         min = z;

      return min;
   }
}
