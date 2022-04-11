package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

      //assignment: = (This is not equal!!!! We just assign a data)
      int number = 100;

        System.out.println("number = " + number); // 100

        number = 200;// after this line number=200

        System.out.println("number = " + number); // 200

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word); // Compiler reads the last assigned value!!!

        word = "Cydeo";

        System.out.println("word = " + word);

        word = "Java Programming";

      System.out.println("word = " + word);

      System.out.println("___________________________");

      // Addition Assignment:

      int x = 100;

      System.out.println("x = " + x);

      System.out.println(x+200); //300

      x += 200; //x = x+200;

      System.out.println("x = " + x);

      String str = "Wooden";

      str +=" Spoon";

      System.out.println("str = " + str);

      double num1 = 2.5;

      System.out.println("num1 = " + num1); // 2.5

      num1 += 5.5;

      System.out.println("num1 = " + num1); //8.0

      double availableBalance =1000.50;
      //deposit 300$
      availableBalance += 300;

      System.out.println("availableBalance = " + availableBalance);

      System.out.println("_____________________________________________");

      //withdrawing 500$

      availableBalance -= 500; //1300.5-500=800.5

      System.out.println("availableBalance = " + availableBalance);

      //withdrawing 200$, then depositing 400$

      availableBalance -= 200; //availableBalance = 600.5
      availableBalance +=400; //availableBalance = 1000.5

      System.out.println("__________________________________________");

      double salary = 50000.50;

      System.out.println("salary = " + salary);

      salary *= 2; //salary = salary * 2

      System.out.println("salary = " + salary);

      double doge = 0.00000001;

      doge *=1000000;

      System.out.println("doge = " + doge);

      System.out.println("________________________________________");

      double num2 = 25000;

      // num2 = num2/2;

      num2 /=2;

      System.out.println("num2 = " + num2);

      System.out.println("____________________________________________");

      double num3 = 100;

      // %=

      num3 %= 3;

      System.out.println("num3 = " + num3);

      System.out.println("____________________________________");


      int amount =127; //cents

      int quarters = amount / 25;
      int cents = amount % 25;

      System.out.println("quarters = " + quarters);
      System.out.println("cents = " + cents);


      System.out.println("_________________________________");

      int cents2 = 127;
      cents2 %= 25;

      System.out.println("cents2 = " + cents2);

      System.out.println("________________________________________");

      int y = 300;
      y %= 16;

      System.out.println("y = " + y);

      System.out.println("-----------------------------------");

      int balance = 3500;

      //insurance fee: $153

      balance %= 153;

      System.out.println("balance = " + balance);








    }
}
