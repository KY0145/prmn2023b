package lecture02;

public class Security {
    String[][] accounts = {
            {"b2221250", "pass"},
            {"b2221320", "word"},
            {"b2221440", "JapAnESe"},
            {"b2221510", "riCeBAlL"},
            {"b2221600", "j4Wer3Hr2Nbe45xS"}
    };

    int find(String user){
        for(int i=0;i<accounts.length;i++){
            if(accounts[i][0].equals(user)) return i;
        }
        return -1;
    }

    void checkAccount(int idx, String pass){
        if(!accounts[idx][1].equals(pass)){
            System.out.println("不正なアクセス");
            System.exit(0);
        }
        System.out.println("ログイン完了");
    }

}
