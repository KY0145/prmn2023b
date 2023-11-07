package lecture02;

import java.util.Scanner;

public class PracII {
    public static void main(String[] args){

        int[] num = new int[5];

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("数字" + i + "つ目");
            num[i] = scan.nextInt();
        }

        Keisan calc = new Keisan();

        int x = calc.getSum(num);
        calc.checkSum(x);

    }
}
