package dynamicProgramming;

import java.util.Arrays;
import java.util.Random;

/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,13:26
 */
public class Tools {
    public static Random random = new Random();


    public  static int[] getPriceTable(int length){
        int[] prices = new int[length];
        for(int i=0;i<length;i++){
            prices[i] = random.nextInt(100);
        }
        Arrays.sort(prices);
        return prices;
    }
}
