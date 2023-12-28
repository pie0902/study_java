

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
    class Human{
            private String team;
            private  String name;
            private String type;

            Human(String name,String type) {
                this.team = "sparta";
                this.name = name;
                this.type = type;
            }

            void ask(String q) {
                System.out.println(name + " = " + q);
            }

            public String getTeam(){
                return team;
            }
            public String getName(){
                return name;
            }
            public String getType(){
                return type;
            }
            public void setType(String type){
                this.name = type;
            }
            public void setName(String name){
                this.name = type;
            }
        }
        class Tutor extends Human{
            Tutor(String name, String type) {
                super(name, type);
            }

            void answer(String answer){
                System.out.println(getName() + "튜터님 : " + answer);
            }
        }



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose;
        List<String>askList = new ArrayList<>();
        Collections.addAll(askList,"오버라이딩","오버로딩");
        Human yun = new Human("윤종일", "학생");
        Tutor kim = new Tutor("김창용", "튜터");
        Tutor heo = new Tutor("허지희", "튜터");
        System.out.println("team : " + yun.getTeam() + "\nname : " + yun.getName() + "\ntype : " + yun.getType());
        System.out.println("team : " + kim.getTeam() + "\nname : " + kim.getName() + "\ntype : " + kim.getType());
        System.out.println("team : " + heo.getTeam() + "\nname : " + heo.getName() + "\ntype : " + heo.getType() + "\n");
        yun.ask("질문이 있어요!");
        kim.answer("무엇이 궁금하신가요?");
        int i = 1;
        for(String ask:askList){
            System.out.println(i + " . " + ask);
            i++;
        }
        System.out.println("[해당하는 숫자를 입력해주세요]");
        choose =  sc.nextLine();
        if(choose.equals("1")){
            heo.answer("오버라이딩은 상위 클래스의 메소드를 하위 클래스가 재정의 하는거에요!");
        }
        else if(choose.equals("2")) {
            kim.answer("오버로딩은 동일한 이름을 가진 메서드가 매개변수의 타입이나 개수가 다른경우\n여러 번 정의되는 것을 말해요!");
        }
        else {
            System.out.println("이상한 번호를 누르셨습니다.");
        }
        System.out.println("종료");
    }
}