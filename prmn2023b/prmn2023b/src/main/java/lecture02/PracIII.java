package lecture02;

import java.util.Scanner;

public class PracIII {
    public static void main(String[] args){
        Security sc = new Security();
        Scanner input = new Scanner(System.in);

        System.out.print("username : ");
        String user = input.next();

        int idx = sc.find(user);
        if(idx == -1){
            System.out.println("error!!");
            System.exit(0);
        }

        System.out.print("password : ");
        String pass = input.next();

        sc.checkAccount(idx, pass);
        System.out.println("～ログイン以降の処理～");
    }
}
