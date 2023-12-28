
        class Human{
            String team = "sparta";
            String name;
            String type;
            Human(String name,String type)  {
                this.team = team;
                this.name = name;
                this.type = type;
            }
        }

public class Main {
    public static void main(String[] args) {
        Human yun = new Human("윤종일","학생");
        Human kim = new Human("김창용","튜터");
        Human heo = new Human("허지희","튜터");
        System.out.println("team : "+ yun.team + "\nname : " +yun.name + "\ntype : " + yun.type +"\n");

        System.out.println("team : "+ kim.team + "\nname : " +kim.name + "\ntype : " + kim.type +"\n");

        System.out.println("team : "+ heo.team + "\nname : " +heo.name + "\ntype : " + heo.type +"\n");

    }
}