package thread;

public class AnswerThread implements Runnable{

    Chat chat;
    String[] answers = {"eleykum salam","sagol yaxsiyam,sen necesen?","ela"};

    public AnswerThread(Chat chat) {
        this.chat = chat;
        new Thread(this,"Answers").start();
    }

    @Override
    public void run() {
        for (String answer: answers) {
            chat.answer(answer);
        }

}}
