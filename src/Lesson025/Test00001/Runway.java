package Lesson025.Test00001;

//3.1 В классе Runway:
//        - создать приватную переменную типа Thread
//        - для переменной создать геттер и сеттер

public class Runway {

    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
