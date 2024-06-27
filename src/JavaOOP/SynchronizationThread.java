package JavaOOP;


class Counter {
    private  int count = 0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationThread
{
//    Khi làm việc với threads, việc đồng bộ hóa (synchronization) rất quan trọng để tránh
//    các vấn đề liên quan đến truy cập đồng thời vào tài nguyên chia sẻ.
//Synchronized Method: Chỉ một thread có thể truy cập phương thức này tại một thời điểm.
//Synchronized Block: Chỉ một thread có thể thực thi khối mã này tại một thời điểm dựa trên khóa của đối tượng được chỉ định.
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                    System.out.println("thread 1 : "+counter.getCount());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0 ; i < 1000; i++){
                    counter.increment();
                    System.out.println("thread 2 : "+counter.getCount());
                }
            }
        });
        thread1.start();
        thread2.start();
//        thread1.join();
//        thread2.join();

        System.out.println("Final count: "+counter.getCount());
    }
}
