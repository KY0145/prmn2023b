package lecture02;

public class Keisan {

    int getSum(int[] x){
        int sum = 0;
        for(int i=0;i<x.length;i++)
            sum += x[i];
        System.out.println("合計値：" + sum);
        return sum;
    }

    void checkSum(int sum){
        if(sum >= 100)
            System.out.println("great!!");
        else if(sum >= 50)
            System.out.println("big");
        else
            System.out.println("small");
    }

}
