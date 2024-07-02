package d6.Quiz;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
        Book book = new Magazine();
        book.setTitle("벡엔드 개발자");
        book.setPages(100);

        if(book instanceof  Magazine magazine){
            magazine.setTime(LocalDate.of(2024,4,20));
            magazine.setTopic("자바 자바");
            magazine.printInfo();
        }


        Book b1 = new Series();
        b1.setTitle("JavaScript, Html, Css");
        b1.setPages(50);
        if(b1 instanceof Series){
            ((Series)b1).setAuthor("쭈즉지앰");
            ((Series)b1).setSubtitle("베트남");
            b1.printInfo();
        }
    }
}
