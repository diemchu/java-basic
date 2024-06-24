package JavaOOP;

//Một enum là một "lớp" đặc biệt đại diện cho một nhóm
// các hằng số (các biến không thể thay đổi, như các biến cuối cùng).

enum  Level{
    LOW,
    MEDIUM,
    HIGH
}

// tạo một người dùng mới
class User{
    Level level;
    int coin = 0;
    private  String name;
    private int age;
    User(String name,int age){
        this.name = name;
        this.age = age;
        // khi khởi tạo người dùng thì coin = 0  và level mặc định là Low
        this.coin = 0;
        level = Level.LOW;
    }
    public void showInfo(){
        System.out.println(String.format("name = %s , age = %d , Level  = %s, coin = %d",name,age,level,coin));
    }
}

public class JavaEnum {

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        switch (myVar){
            case LOW :
                System.out.println("Low Level");break;
            case MEDIUM:
                System.out.println("Medium Level");break;
            case HIGH:
                System.out.println("High Level");break;
        }

        User user = new User("Diem",19);
        user.showInfo();

        // khi số coin lớn hơn 100 thì sẽ được thăng cấp
        user.coin += 1000;
        if(user.coin > 100) user.level = Level.MEDIUM;
        user.showInfo();

    }
}
