package d8;

import java.util.Arrays;

public class D81Generics
{
    public static void main(String[] args) {
        //Generic – 일반적인이라는 뜻
        // Generic 안쓰면
        int [] nums = {1,23,4,5,100};
        D81IntArrayWrapper intArrayWrapper = new D81IntArrayWrapper(nums);
        System.out.println("nums len = " + intArrayWrapper.length());
        System.out.println("nums max = "+intArrayWrapper.getMax());

        // Generic 쓰면
        Double [ ] doubles = {1.2,5.4,5.6,9.4};
        ArrayWrapper<Double> arrayWrapper = new ArrayWrapper<>(doubles);
        System.out.println(arrayWrapper.length());
        System.out.println(arrayWrapper.getMax());
        System.out.println(arrayWrapper.contains(5.6));
    }
}
