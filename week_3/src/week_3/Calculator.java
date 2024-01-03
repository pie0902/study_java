package week_3;

public class Calculator extends AbstractOperation {
    char word;
    int startValue;
    int num;
    AddOperation addOperation;
    SubstractOperation subOperation;
    MultiplyOperation multiplyOperation;
    DivideOperation divideOperation;
    public Calculator() {
        addOperation = new AddOperation();
        subOperation = new SubstractOperation();
        multiplyOperation = new MultiplyOperation();
        divideOperation = new DivideOperation();
    }

    public void getStartValue(int startValue) {
        this.startValue = startValue;
    }

    public void getNum(int num){
        this.num = num;
    }

    public void getChar(char word){
        this.word = word;
    }

    @Override
    public void call(){
        switch (word) {
            case '+':
                startValue = addOperation.add(startValue,num);
                break;
            case '-':
                startValue = subOperation.substract(startValue,num);
                break;
            case '*':
                startValue = multiplyOperation.mulitply(startValue,num);
                break;
            case '/':
                startValue = divideOperation.divide(startValue,num);
                break;
            default:
                System.out.println("없는 연산자 입니다.");
                break;
        }
    }
}
