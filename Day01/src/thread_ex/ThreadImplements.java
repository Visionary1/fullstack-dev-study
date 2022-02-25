package thread_ex;

public class ThreadImplements implements Runnable {

    private String resource;

    public ThreadImplements(String resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        // 여기서 구현되는 내용이 쓰레드에서 수행되는 내용
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.resource);
        }
        
    }
    
}
