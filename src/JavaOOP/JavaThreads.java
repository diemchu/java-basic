package JavaOOP;

class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread dang chay !!!!!!!!!!!!!");
    }
}

//  có thể tạo một lớp implement interface Runnable
//  và override phương thức run(), sau đó tạo một đối tượng Thread với đối tượng Runnable đó
class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread dang chay1 !!!!!!!!!!!!!");
    }


}


public class JavaThreads
{
    // Luồng trong java Là gì
    // một đơn vị thực thi đọc lập một chương trình
    // mỗi chương trình Java có ít nhất một thread  chính( main thread)

    // Muiltithreading
    // khả năng thực thi nhiều Thread cùng một lúc trong cùng một trương chìnhh
    public static void main(String[] args) {
//        new MyThread().start();
//        new MyRunnable().run();


        //Cac phương thức quan trọng trong Thread
        // start(): phương thức này sẽ goi phương thức run() của Thread
        // join(): chờ Thread hiện tại kết thúc. đảm bảo thread hiệ tại đã kết thúc để nhường thread khác
        // sleep (long millis): tạm dừng thread hiệ tại một khoảng thời giạn nhất định
        // interrupt() Gửi tín hiệu yêu cầu thread hiện tại dừng lại. Tuy nhiên, phương thức này không ngay lập tức dừng thread
        // mà chỉ gửi một yêu cầu, việc dừng lại hay không là phụ thuộc vào code thực thi của thread đó.

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 1: "+i);
                        Thread.sleep(1000); // tam dung 1s
                    }
                } catch (InterruptedException e){
                    System.out.println("Thread 1 bi ngat");

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 2: "+i);
                        Thread.sleep(1000); // tam dung 1s
                    }
                } catch (InterruptedException e){
                    System.out.println("Thread 2 bi ngat");
                }
            }
        });
        thread1.start();
        thread2.start();

        // Ngat ket noi Thread1 sau 2s
        try {
            Thread.sleep(2000);
            thread1.interrupt();
            System.out.println("da ngat ket noi Thread 1 sau 2s");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
