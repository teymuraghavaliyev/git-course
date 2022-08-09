package thread;

public class QuestionThread implements Runnable{

Chat chat;
    String[] answers = {"salam","necesen?","mende yaxsiyam"};

    public QuestionThread(Chat chat) {
        this.chat = chat;
        new Thread(this,"Questions").start();
    }

    @Override
    public void run() {
        for (String answer: answers) {
            chat.ask(answer);
        }
    }
}
