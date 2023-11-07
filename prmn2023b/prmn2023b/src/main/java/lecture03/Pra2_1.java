package lecture03;

import java.util.Scanner;

public class Pra2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("name : ");
        String name = scan.next();
        System.out.print("number : ");
        int num = scan.nextInt();

        System.out.println("氏名 : " + name + ", 学籍番号 : b" + num);
    }
}
