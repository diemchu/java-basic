package d4;

import java.util.Scanner;

//Note 클래스를 만들어보자.
//Note는 제목과 페이지를 각각 문자열과 문자열 배열로 가지고 있다.
//Note의 생성자는 제목과 페이지 수를 인자로 받는다.
//페이지의 길이는 전달받은 페이지 수와 동일하다.
//Note는 글을 작성할 수 있는 write 메서드와 글을 읽을 수 있는 read 메서드를 가지고 있다.
//write 메서드는 작성할 쪽과 작성할 내용을 인자로 받는다. 이때 본래 적혀있던 내용이 있다면 지워진다.
//read 메서드는 읽을 쪽을 인자로 받는다. 작성된 내용을 반환한다. (작성된 내용이 없다면 null이 반환될 것이다.)
//총 몇쪽이 작성되었는지를 반환하는 메서드를 가지고 있다.
//작성된 모든 내용을 페이지 순서대로 출력하는 메서드를 가지고 있다. 작성되지 않은 페이지는 출력하지 않는다.
public class Note {
    private  final  String  title;
    private String[] pages;

    Note(String title, int pages) {
        this.title = title;
        this.pages = new String[pages];
    }

    // 글  읽 수 있는 read 메서드
    public String read(int page) {
        if (pages[page] == null) return null;
        else return pages[page];
    }

    // 글 작성할 수 있는 write 메서드
    public void write(int page, String content) {
        pages[page] = content;
    }

    // 총 명몇쪽 작성했는지 반환 하는 함수
    public  int wrotePages(){
        int count = 0;
        for (String s : pages){
            if(s != null) count++;
        }
        return  count;
    }
    // 작성된 모든 내용을 페이지 순서대로 출력하는 메서드
    public  void printAllPages(){
        for(int i = 0 ; i<pages.length ;i++){
            if(pages[i] == null) continue;
            System.out.println(String.format("page<%d> : %s",i,pages[i]));
        }
    }
    // 작성한 page 수정 함수
    public boolean modifyingPage(int page, String newContent){
        if(pages[page]  == null) return  false;
        pages[page] = newContent;
        return  true;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Note note = new Note("myNotes",100);
        int page;
        String content;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("작성할 페이지  ? :");
            page= s.nextInt();
            if(page < 0) break;
            s.nextLine();
            System.out.print("작성할 내용 > ");
            content = s.nextLine();
            note.write(page,content);
            note.printAllPages();
            System.out.println("=========================");

        }
        System.out.println(note.modifyingPage(1,"Hello Diem"));
        note.printAllPages();
        System.out.printf("총 %d page 작성했습니다!!",note.wrotePages());
    }

}
