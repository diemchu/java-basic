package d6;

public class Student extends CollegeMember
{
    private double  grades;

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void printInfo(){
        System.out.println(String.format("Student -> %s ,%s ,%.2f", getName() ,getMajor(),this.grades));
    }


}
