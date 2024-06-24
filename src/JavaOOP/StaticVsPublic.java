package JavaOOP;

public class StaticVsPublic {
    // static vs public ds
    //  static co the truy cap ma k can khoi tao doi tuong
    // con public thi khoi tao doi tuong moi co the goi ham dc


    // static method
    static  void staticMethod(){
        System.out.println("static methods can be called without creating objects");
    }
    // public method
    public   void publicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        staticMethod();
        new StaticVsPublic().publicMethod();
    }
}
