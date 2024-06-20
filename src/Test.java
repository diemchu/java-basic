import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 문제 1
//        System.out.print("입력하세여: ");
//        String  inputString  = scanner.nextLine();
//        for(int  i =0 ; i < 3 ; i++){
//            System.out.println(inputString);
//        }

        //문제 2
//         int number1  , number2;
//         System.out.println("두개의 정수를 입력하세요? ");
//         number1 = scanner.nextInt();
//         number2= scanner.nextInt();
//        System.out.print(number2 +"\n"+number1);

        //문제 3
//        System.out.println("  *   * ");
//        System.out.println(" *** ***");
//        System.out.println("**********");
//        System.out.println("*********");
//        System.out.println(" *****");
//        System.out.println("   *   ");

        //문제 4
        String [] names = new String[3];
        double [] grades = new double[3];

        for (int i = 0 ; i < names.length ; i++){
            System.out.print("name = ");
            names[i] =   scanner.nextLine();
        }
        for( int i = 0 ;  i  < grades.length ;i++){
            System.out.print("grade = ");
            grades[i] = scanner.nextDouble();
        }
        for( int i = 0 ;  i  < grades.length ;i++) {
//            System.out.printf("name = %s , grade = %.1f \n",names[i],grades[i]);
            System.out.println(String.format("name = %s , grade = %.1f",names[i],grades[i]));
        }

    }
}
