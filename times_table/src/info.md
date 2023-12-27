<details><summary>코드보기</summary>
```
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
    }
}
```
</details>

## 구구단
Java 강의를 시청하며 단순히 코드를 따라 치는 것이 아닌,실전 같은 환경에서 빠르게 학습하는 것을 목표로 삼았습니다. 
마침 for문을 공부하고 있어서, 구구단 프로그램을 간단하게 만들어 보기로 했습니다. 
단순히 출력하는 것만으로는 언제나 무언가 부족함을 느꼈기에, 기본적인 공부를 하면서도 눈에 띄는 결과물을 남기고자 했습니다.
그래서 반복문과 Java의 기본 라이브러리 중 하나인 Swing을 사용하여 구구단 프로그램을 구현해 보았습니다.

### 기본 Gui
![스크린샷 2023-12-27 오후 4 17 14](https://github.com/pie0902/study_java/assets/47919911/a32177d4-6469-40fa-9c34-87cb0f07609c)
![스크린샷 2023-12-27 오후 4 17 28](https://github.com/pie0902/study_java/assets/47919911/1cae5640-7254-4d19-9db5-0a2f0027d1ae)
![스크린샷 2023-12-27 오후 4 17 38](https://github.com/pie0902/study_java/assets/47919911/836b415a-9bf4-415b-add1-e74a13a4c08c)

### 기능 설명
  1. 텍스트 입력란에 숫자를 입력하고 "구구단 시작" 버튼을 클릭하면 입력한 숫자에 1~9 를 곱한 결과가 출력되는 단순한 구구단 계산기 입니다.
  2. 마우스로 직접 클릭해서 종료를 할수있지만 숫자 0을 입력해도 종료를 할수있는 기능을 개발했습니다.
  3. 9를 초과하는 숫자를 넣으면 안내가 나오는 기능을 개발했습니다.
  4. Java의 Swing 라이브러리를 사용해서 구현했습니다.
  5. 반복문과 조건문을 사용했습니다.

### 느낀점

* 구구단 시작 버튼에 이벤트를 주려고 구글링하면서 addActionListener 방법에 대해서 찾아보게 됐습니다.
  코드를 입력하니 @override가 자동완성이 됐고 override에 대해서 찾아보면서 override의 개념을 조금은 알게 됐습니다.
* Java의 Swing 라이브러리가 익숙하지 않아서 디자인도 코드도 아주 어설프지만 매우 재미있게 코딩했습니다.
* 그냥 강의만 듣는 것이 아닌 실제 예제를 직접 코딩해보는 것에 대한 습관을 만들어야겠다는 생각이 들었습니다.
