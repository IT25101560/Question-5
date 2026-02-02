class Calculator {
    public int add(int a, int b) { return a + b; }
    public int multiply(int a, int b) { return a * b; }
    public int square(int n) { return n * n; }
}

public class ExpressionTwo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(4, 7);           
        int sum2 = calc.add(8, 3);           
        
        int sq1 = calc.square(sum1);         
        int sq2 = calc.square(sum2);         
        
        int finalResult = calc.add(sq1, sq2); 

        System.out.println("The result of (4 + 7)^2 + (8 + 3)^2 is: " + finalResult);
    }
}
