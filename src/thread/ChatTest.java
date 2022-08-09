package thread;

public class ChatTest {
    public static void main(String[] args) {
        Chat chat = new Chat();
        new QuestionThread(chat);
        new AnswerThread(chat);
    }

}
