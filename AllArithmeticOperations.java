package JavaOperators;


import java.util.Scanner;

public class AllArithmeticOperations
{

    public static void main(String[] args)
     {
         float num1;
         float num2;
         String operation;

         Scanner input = new Scanner((System.in));

         System.out.println("please enter the first number");
         num1 = input.nextInt();


         Scanner op = new Scanner((System.in));

         System.out.println("please enter the operation");
         operation = op.next();

         System.out.println("please enter the second number");
         num2 = input.nextInt();

         {
             if (operation == "+");
         {
             System.out.println("your answer is" + (num1 + num2));
         }
         if (operation == "-");
         {
             System.out.println("your answer is" + (num1 - num2));
         }

         if (operation == "/");
         {
             System.out.println("your answer is" + (num1 / num2));
         }
         if (operation == "*")
         {
             System.out.println("your answer is" + (num1 * num2));
         }


     }

}


}
