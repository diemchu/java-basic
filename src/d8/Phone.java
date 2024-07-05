package d8;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Phone implements Comparable<Phone>
{


    private  String name;
    private  int price;
    Phone(String name , int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(@NotNull Phone o) {
        if( this.price == o.price ) return  0;
        else if(this.price < o.price) return  1;
        else return  -1;
    }

    @Override
    public String toString() {
        return String.format(String.format("Phone[%s, %d]",this.name,this.price));
    }
}
