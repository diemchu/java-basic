package JavaOOP;


//Trong Java, cũng có thể lồng các lớp (một lớp trong một lớp).
// Mục đích của các lớp lồng nhau là nhóm các lớp thuộc về nhau

class OuterClass{
    int x = 10;

  // new o day la private thi se k goi dc ben ngoai
     static  class  InnerClass{
        static int  y = 5;
    }
}
public class JavaInnerClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        System.out.println(outerClass.x + innerClass.y);

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println(outerClass.x + OuterClass.InnerClass.y);

    }
}
