package JavaOOP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExp
{
    // Biểu thức chính quy là một chuỗi các ký tự tạo thành mẫu tìm kiếm
    // khi bạn tìm kiếm dữ liệu trong văn bản, bạn có thể sử dụng mẫu
    // tìm kiếm này để mô tả những gì bạn đang tìm kiếm.
    // Biểu thức chính quy có thể là một ký tự đơn hoặc một mẫu phức tạp hơn.

//    Pattern Class - Xác định một mẫu (được sử dụng trong tìm kiếm)
//    Matcher Class -Dùng để tìm kiếm mẫu
//    PatternSyntaxException Class - Cho biết lỗi cú pháp trong mẫu biểu thức chính quy


    public static void main(String[] args) {
        // Tao mot mau de tim kiem
        // o vi du ben duoi cum tu java se duoc tim kiem trong mot cau
        // option: Pattern.CASE_INSENSITIVE : tim kiem  khong phan biet chu hoa chu thuong

        Pattern pattern  = Pattern.compile("chuducdiem1@gmail.com",Pattern.CASE_INSENSITIVE);
        // tim kiem voi noi dung
        //Phương thức matcher() được sử dụng để tìm kiếm mẫu trong chuỗi.
        // Nó trả về một đối tượng Matcher chứa thông tin về tìm kiếm đã được thực hiện.
        Matcher matcher = pattern.matcher("chuducdiem1@gmail.com is my email!!!!!!!");
        //Phương thức find() trả về true nếu tìm thấy mẫu trong chuỗi và trả về false nếu không tìm thấy mẫu đó.
        boolean matchFound = matcher.find();
        if(matchFound)  System.out.println("Match Found");
        else System.out.println("Math not found");


        //  Regular Expression Patterns
        // [abc] : tim mot ki tu tuy chon trong dau ngoac <chi can co 1 ki tu haop le tra ve true>
//        [^abc] Tìm một ký tự KHÔNG nằm trong dấu ngoặc <>
        // [0 9 ]Find one character from the range 0 to 9
        Pattern pattern1 = Pattern.compile("n*}",Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher("chuducdiem from viet nnnam6");
        System.out.println(matcher1.find());
    }
}
