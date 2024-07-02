package d6.Quiz;

//
//책을 나타내는 추상 클래스 Book을 만들고,
//월간지 클래스 Magazine
//시리즈 클래스 Series
//교과서 클래스 TextBook
//을 각각 Book을 상속받아 만들어보자.
//=================================================================
//Book 클래스는 제목, 페이지 수에 대한 정보를 가지고 있다.
//Magazine 클래스는 몇년몇월 호인지, 주제가 무엇인지에 대한 정보를 가지고 있다.
//Series 클래스는 작가, 부제, 시리즈의 몇번째 권인지에 대한 정보를 가지고 있다.
//TextBook 클래스는 과목, 학년에 대한 정보를 가지고 있다.
//Book 클래스는 책에 대한 정보를 정리해서 보여주는 목적의 printInfo() 추상 메서드를 가지고 있다.
//각 하위 클래스의 printInfo() 메서드는 Book의 정보와 자신이 가진 정보를 별도로 보여준다.

abstract  class  Book{
    private String title ;
    private  int pages;

     public  abstract void printInfo();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}


