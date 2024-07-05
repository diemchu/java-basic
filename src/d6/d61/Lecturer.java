package d6.d61;



public class Lecturer  extends  CollegeMember{
    private int papers;
    public int getPapers() {
        return papers;
    }
    public void setPapers(int papers) {
        this.papers = papers;
    }
    public void printInfo(){
        System.out.println(String.format("Lecturer -> %s, %d ,%s ,%d", getName(),getAge() ,getMajor(),this.papers));
    }
}
