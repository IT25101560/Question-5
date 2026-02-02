class Calculator {
    public int add(int a, int b) { return a + b; }
    public int multiply(int a, int b) { return a * b; }
    public int square(int n) { return n * n; }
}

public class ExpressionOne {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int m1 = calc.multiply(3, 4);  
        int m2 = calc.multiply(5, 7);  
        int sum = calc.add(m1, m2);    
        int result = calc.square(sum); 

        System.out.println("The result of (3 * 4 + 5 * 7)^2 is: " + result);
    }
}
