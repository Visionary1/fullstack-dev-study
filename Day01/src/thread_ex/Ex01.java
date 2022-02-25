package thread_ex;

public class Ex01 {
    public static void main(String[] args) throws InterruptedException {
        // create thread (1) : inherit thread class

        // ThreadExtends te1 = new ThreadExtends("ㅇ");
        // ThreadExtends te2 = new ThreadExtends("ㅅ");

        // single thread : run in order
        // te1.run();
        // te2.run();

        // multi - thread : run simutaneously
        // te1.start();
        // te2.start();

        /*
        // create thread (2) : Runnable interface implment
        ThreadImplements ti1 = new ThreadImplements("A");
        ThreadImplements ti2 = new ThreadImplements("B");

        // single thread , run is always single thread
        // ti1.run();
        // ti2.run();

        Thread t1 = new Thread(ti1);
        Thread t2 = new Thread(ti2);

        t1.start();
        t1.join(); // (main thread) wait for t1 thread to die

        t2.start();
        t2.join(); // (main thread) wait for t2 thread to die 

        System.out.println("done"); // 이게 먼저 나옴!, 멀티 쓰레드로 다 같이 실행되어서
        */

        ThreadImplements ti1 = new ThreadImplements("어흥");
        ThreadImplements ti2 = new ThreadImplements("음메~");
        ThreadImplements ti3 = new ThreadImplements("히잉");

        Thread lion = new Thread(ti1);
        Thread cow = new Thread(ti2);
        Thread cat = new Thread(ti3);
        
        lion.start();
        cow.start();

        lion.join();
        cow.join();
        
        cat.start();
        
    }
}
