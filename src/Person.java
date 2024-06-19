public class Person
{
    String name;
    int age;
    String contact;



    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contac) {
        this.contact = contac;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contac='" + contact + '\'' +
                '}';
    }
}
