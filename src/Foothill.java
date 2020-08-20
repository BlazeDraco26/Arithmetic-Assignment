
public class Foothill
{
   public static void main(String[] args)
   {
      int myId;
      int numLet;
      
      myId = 20441267;
      numLet = 6;
      
      System.out.println("My first name is Jordan");
      System.out.println("My Foothill ID is 20441267");
      System.out.println("The number of characters in my first name is 6");
      System.out.println("Expression 1:" + myId % 15);
      System.out.println("Expression 2:" + (myId + 4) % 11);
      System.out.println("Expression 3:" + (myId / (numLet + 500.)));
      System.out.println("Expression 4:" + (1 + 2 + 3 + 4 + 5 + numLet));
      System.out.println("Expression 5:" + 
         15000./((80. + (myId - 123456))/((numLet + 20) * (numLet + 20))));
   }
}

/* --------------------------- run ----------------------------

My first name is Jordan
My Foothill ID is 20441267
The number of characters in my first name is 6
Expression 1:2
Expression 2:4
Expression 3:40397.760869565216
Expression 4:21
Expression 5:0.4990675459377157

------------------------------------------------------------- */
