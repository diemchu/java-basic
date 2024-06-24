package JavaOOP;

//Generics trong Java là một tính năng cho phép bạn tạo ra các lớp
// phương thức và interfaces có thể hoạt động với nhiều loại dữ liệu khác nhau mà không cần phải viết lại mã.
// Nó cho phép bạn chỉ định kiểu dữ liệu (type) cụ thể mà các đối tượng sẽ xử lý khi bạn khởi tạo chúng
//===============================================================================================================================
//Box để lưu trữ một đối tượng của bất kỳ loại nào
//T là tham số kiểu (type parameter) của lớp Box. Tham số này có thể là bất kỳ kiểu dữ liệu nào (primitive type hoặc object type).
//item là biến để lưu trữ đối tượng của kiểu T

class Box<T>{
    private  T item;
    public void setItem(T item){
        this.item = item;
    }



    public T getItem(){
        return  item;
    }
    public void showItem(){
        System.out.println(item);
    }
}
public class JavaGenerics
{
    // Generrics method
    // co the truyen bat cu 1 array voi bat cu datatype nao
    public  static  <T> void printArray(T[] array){
        for (T element: array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // co the su dung lop box de luu tru bat ki mot loai du lieu nao
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Java");
        stringBox.showItem();

        // tao mot box de luu chu thong tin 1 user
        User user = new User("박지훈",20);
        user.coin = 1000;
        Box<User> userBox = new Box<>();
        userBox.setItem(user);
        userBox.showItem();


        //=====================================================================================
        // tao một mảng
        String[] strings = {"diem","name","linh"};
        printArray(strings);
        Double [] doubles = {1.2,23.2,22.1};
        printArray(doubles);

        User[] users= {new User("diem",29),new User("Nam",29)};
        printArray(users);



    }

}
