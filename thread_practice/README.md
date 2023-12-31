# Timer
------------------------------------
#### 🟢 간단 설명

안녕하세요. Thread를 학습하면서 간단하게 콘솔창에 시간을 출력하는 프로그램을 제작해봤습니다.


*****************************
#### 🟢 진행 기간
##### 2024.01.08

****************************

#### 🟢 진행 과정
##### 1. TimerTask 클래스를 정의하고 Runnable 인터페이스를 구현
##### 2. run() 메소드를 오버라이드해서 timer 기능 구현
##### 3. main 클래스에서 입출력을 받아서 TimerTask에 선언된 boolean형 변수 running()의 상태를 조작
##### 4. TimeTask 클래스의 인스턴스를 Thread 클래스의 생성자에 전달하고 start/stop 메소드를 호출하여 스레드를 시작


****************************
#### 🟢 어려웠던 문제와 해결책
##### 1.InterruptedException의 개념에 대한 어려움
* 고민: Interrupt의 개념이 어려웠습니다. 왜 join을 사용하는지에 대해 의문이 생겼습니다.  
* 해결: 예외 처리를 하는 방법과 왜 join을 사용해서 예외 처리를 해야 하는지 관련 자료를 찾아보면서 숙지했습니다.
###### 밑에 코드로 예외처리를 하는 이유
1. TimeTask를 전달받은 thread가 timer기능을 수행하고 종료될 때까지 메인 스레드를 대기상태로 유지합니다.
2. 이렇게 하지 않으면 timer의 기능을 다 수행하기 전에 종료가 되거나 다른 문제들이 생길 우려가 있습니다.
```
    try{  
        //타이머스레드가 끝나기전까지  메인 스레드 대기  
        thread.join();  
    }  
    catch(InterruptedException e){  
        e.printStackTrace();  
    }
```


***************************
#### ✏️ 느낀점
>Thread를 처음 접하고 직접 코드를 작성하면서 정말 낮설다고 느껴졌습니다. 
>일단 TimerTask 인스턴스를 전달받아 생성한 스레드를 제어하기 위해서 거쳐야할 과정이 많다고 생각이 들었고 스레드를 생성하고 그냥 사용하는것이 아니라 예외처리도 해야하고 어떻게 제어할것인지를 잘 설계하고 작성해야 한다는걸 느꼈습니다.

