package d6.d65;

public class Student  extends Person{
    private  String major;


    @Override
    public String toString() {
        return String.format("Student [%s , %s]",super.toString(),this.major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
