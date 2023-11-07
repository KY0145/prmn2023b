package lecture02;

public class Gakuseki {
    String number;
    void check(String gakuseki){
        if(number.equals(gakuseki))
            System.out.println("complete!");
        else
            System.out.println("error!!");
    }

}
