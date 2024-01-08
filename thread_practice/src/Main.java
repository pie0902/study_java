import java.util.Scanner;
import timer.TimerTask;

public class Main {
    public static void main(String[] args) {
        //TimerTask class 인스턴스 생성
        TimerTask timerTask = new TimerTask();
        //TimerTask 인스턴스를 사용하여 새로운 스레드 생성
        Thread thread = new Thread(timerTask);
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        while (true) {
            //입력받기
            System.out.print("입력: ");
            String input = sc.nextLine();
            //start를 입력했을때
            if ("start".equalsIgnoreCase(input)){
                //만약 스레드가 실행중이아니면 새로운 스레드 생성&시작
                if (!thread.isAlive()) {
                    thread = new Thread(timerTask);
                    thread.start();
                }
                // timerTask 메소드의 running을 true로 만들어 타이머 활성화
                timerTask.start();
            } else if ("stop".equalsIgnoreCase(input)) {
                // 타이머 정지
                timerTask.stop();
                // 루프 탈출
                break;
            } else  {
                System.out.println("잘못된 입력입니다.");
            }
        }
        sc.close();
        try{
            //타이머스레드가 끝나기전까지  메인 스레드 대기
            thread.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
