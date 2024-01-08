package timer;
public class TimerTask implements Runnable {
    private boolean running= false;
    public void start(){
        running = true;
    }
    public void stop(){
        running = false;
    }
    @Override
    public void run(){
        while(running){
            System.out.println("타임 : " + new java.util.Date());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
