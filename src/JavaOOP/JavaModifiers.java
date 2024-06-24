package JavaOOP;


// Abstract
abstract  class Main{
    public  String fname = "Chu";
    public  int age = 24;
    public  abstract  void study(); // abstract method
}

// subclass (lop  ke thua main)
class  Student extends Main{
    public  int graduationYear = 2018;
    @Override
    public void study() {
        System.out.println("Studying all day along");
    }
}

public class JavaModifiers
{
    // doi voi class
    // public : the class accessible by any other class
    // default:  lop nay chi co the truy cap  boi cac lop trong cung 1 goi

    // doi voi constructoers, attributes,methods
     // public: co the truy cap bang moi class
    // private: chi co the truy cap trong cung 1 lop
    // default: Mã chỉ có thể truy cập được trong cùng một gói
    // protected: Mã có thể truy cập được trong cùng một gói và các lớp con.

    // non-access modifiers
    // final : lop nay khong the ke thua boi cac lop khac
    // abstract: Lớp này không thể được sử dụng để tạo các đối tượng (Để truy cập một lớp trừu tượng, nó phải được kế thừa từ một lớp khác

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name = " + student.fname);
        System.out.println("Age = " + student.age);
        System.out.println("Graduation Year:  = " + student.graduationYear);
        student.study();
    }
}


