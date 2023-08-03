

public class Main {
   class Calculator {
       public int
       сalculate(int x, int y, char expression) {
           int z = 0;
           try {
               switch (expression) {
                   case '+':
                       z = x + y;
                       break;
                   case '-':
                       z = x - y;
                       break;
                   case '*':
                       z = x * y;
                       break;
                   case '/':
                       z = x / y;
                       break;
               }
               return z;
           } catch (Exception ex) {
               return 0;
           }
       }
   }
    public void main(String[] args)
    {
        Calculator c1 = new Calculator();
        int t = c1.сalculate(5, 5, '+');
        System.out.println(t);
    }
}