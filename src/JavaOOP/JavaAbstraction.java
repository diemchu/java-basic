package JavaOOP;


//Trừu tượng hóa dữ liệu là quá trình ẩn một số chi tiết nhất
// định và chỉ hiển thị thông tin cần thiết cho người dùng.
//Lớp trừu tượng: là lớp bị hạn chế, không thể sử dụng để tạo đối tượng (để truy cập nó phải được kế thừa từ lớp khác).
// Phương thức trừu tượng: chỉ có thể được sử dụng trong một lớp trừu tượng và nó không có phần thân. Phần thân được cung cấp bởi lớp con (được kế thừa từ).


abstract class Bike{
    // ham truu tuong
    protected  abstract void bikeSound();
    public void  wheelNumber(){
        System.out.println(String.format("wheel number  = %d",2));
    }
}

class Bicycle extends  Bike{
    @Override
    protected void bikeSound() {
        System.out.println("ecccccccccccc!");
    }
}

class  MotoBike  extends   Bike{
    @Override
    protected void bikeSound() {
        System.out.println("bachhh bachhhh");
    }
}

public class JavaAbstraction
{

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.bikeSound();
        bicycle.wheelNumber();
        new MotoBike().wheelNumber();
    }
}
