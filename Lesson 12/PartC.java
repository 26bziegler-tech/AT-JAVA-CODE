public class PartC {
   public static void main(String[] args)
   {
      String text = "Hello World";
      int count = countVowels(text);
      System.out.println("Number of vowels: " + count);
   }

   public static int countVowels(String phrase)
   {
      int count = 0;

      for (int i = 0; i < phrase.length(); i++)
      {
         if (isVowel(phrase.charAt(i)))
            count++;
      }

      return count;
   }

   public static boolean isVowel(char c)
   {
      c = Character.toLowerCase(c);
      return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
   }
}

