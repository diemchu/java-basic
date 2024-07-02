package d6.Quiz;

import java.time.LocalDate;

public class Magazine extends  Book{
    private LocalDate time;
    private String topic;

    @Override
    public void printInfo() {
        System.out.println(String.format("Magazine(%s ,%d ,%s ,%s)"
                ,getTitle(),getPages(),this.time,this.topic));
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
