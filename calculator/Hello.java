import java.util.Scanner;

class Calculator{
    public static int add(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
}
public class Hello {
    public static void main(String[] args){
        System.out.println("연산자를 입력하세요 (+, -, *, /): ");
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        System.out.println("숫자 두개를 입력하세요");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();
        switch(c){
            case "+":
                System.out.println(calculator.add(a,b));
                break;
            case "-":
                System.out.println(calculator.minus(a,b));
                break;
            case "*":
                System.out.println(calculator.multiply(a,b));
                break;
            case "/":
                System.out.println(calculator.divide(a,b));
                break;
            default:
                System.out.println("유효하지않은 값을 입력했습니다.");
                break;
        }

    }
}