public class Class {
    public static void main(String[] args) {
        Tread thread0 = new Tread();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        Thread[] threads = {thread0, thread1, thread2, thread3};
        thread0.start();
    }
}
