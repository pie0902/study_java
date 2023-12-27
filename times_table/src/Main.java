import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Gui{
    //프레임
    JFrame frame = new JFrame("구구단");
    //제목
    JLabel titleLabel = new JLabel("구구단 계산기", SwingConstants.CENTER);
    //입력
    JTextField textField = new JTextField();
    JLabel dan = new JLabel("단");
    //버튼
    JButton cBtn = new JButton("구구단 시작");
    //결과창
    JTextArea tArea = new JTextArea();
    JLabel exit = new JLabel("* 0을 입력하고 실행을 누르시면 종료됩니다. *");
    Gui() {
        titleLabel.setBounds(0,0,400,50);
        textField.setBounds(185,60, 30,30);
        dan.setBounds(220, 60,30,30);
        cBtn.setBounds(150,100,100,30);
        tArea.setBounds(50,150, 300, 170);
        exit.setBounds(50 ,340 ,300 ,10);
        frame.add(titleLabel);
        frame.add(textField);
        frame.add(dan);
        frame.add(cBtn);
        frame.add(tArea);
        frame.add(exit);

        cBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tArea.setText("");
                try{
                    int n = Integer.parseInt(textField.getText());
                    if(n!=0 && n < 10) {
                        for (int i = 1; i < 10; i++) {
                            String result = n + " x " + i + " = " + n * i + "\n";
                            tArea.append(result);
                            textField.setText("");
                        }
                    }else if(n>9){
                        tArea.append("계산기는 구구단만 지원합니다.");
                        textField.setText("");
                    }
                    else{
                        tArea.append("구구단 계산기를 이용해주셔서 감사합니다.");
                        System.exit(0);
                    }
                }catch(NumberFormatException ex){
                    tArea.append("유효한 숫자를 입력해주세요");
                }
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 계산기 입니다.(0을 누르시면 종료됩니다.)");
//        while(true) {
//                System.out.println("몇단을 출력하시겠습니까?");
//                int n = sc.nextInt();
//                if(n!=0) {
//                    for (int i = 1; i < 10; i++) {
//                        System.out.println(n + " x " + i + " = " + n * i);
//                    }
//                }
//                else{
//                    System.out.println("구구단 계산기를 이용해주셔서 감사합니다.");
//                    break;
//                }
//        }
    }
}