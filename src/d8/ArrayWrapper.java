package d8;

import org.jetbrains.annotations.NotNull;


//T extends Comparable<T>: Giới hạn kiểu T phải là kiểu có thể so sánh được.
// Điều này đảm bảo rằng các đối tượng T bên trong ArrayWrapper có thể so sánh với nhau.
public class ArrayWrapper<T extends Comparable<T>> {
    private  T[] array;

    public ArrayWrapper(T []array) {
        this.array = array;
    }
    public int length(){
        return  array.length;
    }

    // Find the largest value of the array
    public T getMax(){
        T max =  null;
        for(T value: array){
            if(value == null) continue;
            if(max == null || value.compareTo(max) > 0) max = value;
        }
        return  max;
    }
    // find value function
    public boolean contains(T target){
        for (T value : array){
            if(value == null) continue;
            if(value.equals(target)) return  true;
        }
        return  false;
    }

}
