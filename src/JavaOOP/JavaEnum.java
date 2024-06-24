package JavaOOP;

//Một enum là một "lớp" đặc biệt đại diện cho một nhóm
// các hằng số (các biến không thể thay đổi, như các biến cuối cùng).

enum  Level{
    LOW,
    MEDIUM,
    HIGH
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
    }
}
