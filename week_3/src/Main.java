import java.util.Scanner;

import week_3.Calculator;

public class Main {
    public static void main(String[] args) {
        int value;//계산기에 넣을 값 변수
        char word;//연산자 변수
        Scanner sc = new Scanner(System.in);
        Calculator base = new Calculator();
        System.out.println("---계산기 입니다.===\n\n종료하시려면 0을 눌러주세요!");
        //첫번째로 초기화할 값 입력
        System.out.println("숫자를 입력하세요");
        value = sc.nextInt();
        sc.nextLine();
        //초기값 셋팅
        if(value == 0){
            System.exit(0);
        }
        while(true) {
            System.out.println("연산자를 입력하세요\n + - * /");
            word = sc.nextLine().charAt(0);
            base.getChar(word);
            if (word == '0') {
                break;
            }
            System.out.println("숫자를 입력하세요");
            value = sc.nextInt();
            sc.nextLine();
            if (value == 0) {
                break;
            }
            base.getNum(value);
            base.call();
        }
    }
}