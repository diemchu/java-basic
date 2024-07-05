package d8;

public class D81IntArrayWrapper {
    private int [] intArray;

    public D81IntArrayWrapper(int[] intArray) {
        this.intArray = intArray;
    }
    public  int length(){
        return  intArray.length;
    }
    // 최대값 반환하는 메서드
    public int getMax(){
        int max = intArray[0];
        for(int value: intArray){
            max =Math.max(max,value);
        }
        return  max;
    }



}
