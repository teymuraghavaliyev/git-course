package thread;

public class Chat {
    boolean flag = false;
    public synchronized void ask(String message){
        if(flag){
            try {
                wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(message);
        flag = true;
        notify();
    }

    public synchronized void answer(String message){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(message);
        flag = false;
        notify();
    }
}
