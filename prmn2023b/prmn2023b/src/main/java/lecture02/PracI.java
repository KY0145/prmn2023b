package lecture02;

import java.util.Scanner;

public class PracI {
    public static void main(String[] args){

        Gakuseki g = new Gakuseki();
        g.number = "B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。：");
        String gakuseki = scan.next();

        g.check(gakuseki);
    }
}
