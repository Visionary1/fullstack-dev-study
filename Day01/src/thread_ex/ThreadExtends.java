package thread_ex;

public class ThreadExtends extends Thread {
    private String resource;
    
    public ThreadExtends(String resource) {
        this.resource = resource;
    }
    
    @Override
    public void run() {
        // 여기서 구현되는 내용이 쓰레드에서 수행되는 내용
        // resource 10번 출력
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.resource);
        }
    }
}
