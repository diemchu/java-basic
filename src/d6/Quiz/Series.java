package d6.Quiz;

public class Series extends Book{
    private String  author;
    private  String subtitle;
    private int siri;

    @Override
    public void printInfo() {
        System.out.println(String.format("Series(%s ,%d ,%s ,%s)"
                ,getTitle(),getPages(),this.author,this.subtitle));
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getSiri() {
        return siri;
    }

    public void setSiri(int siri) {
        this.siri = siri;
    }
}
