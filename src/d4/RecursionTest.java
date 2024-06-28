package d4;



public class RecursionTest {

    public  static  int factorial(int n ){
        if(n < 1 ) return 1 ;
        else {
            System.out.println(n);
            return  n  * factorial(n-1);
        }
    }

    public  static  int fibo (int n){
        if(n==0 ) return  0;
        if(n<3) return  1;
        else{
            System.out.println(n);
            return  fibo(n-1) + fibo(n-2);
        }
    }

    public static int sumOfDigits(int n){
        if(n == 0) return  0;
        return  n % 10 + sumOfDigits(n/10);
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        System.out.println(str);
        // khi de quy xong thi toan tu moi duoc tinh theo thu tu
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // tinh luy thua bang de quy
    public static  int pow(int x  , int n){
        if(n == 0 ) return  1;
        return  x * pow(x,n -1);
    }
    // dem phan tu trong mot mang
    public  static  int counterElements(int[] arr ,  int index) {
        if(index == arr.length ) return  0;
        else return  1 + counterElements(arr , index + 1);
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(fibo(5));
//        System.out.println(sumOfDigits(1234));
//        System.out.println(reverseString("hello"));
//        System.out.println(pow(2,4));

        int arr[] =  {1,2,4,5,5};
        System.out.println(counterElements(arr,0));


    }

}
