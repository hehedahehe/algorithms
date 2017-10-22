package altTest.dynamicProgrammingTest;

import dynamicProgramming.MainAlg;
import dynamicProgramming.RodCutting;
import org.junit.Test;

import java.util.*;

/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,11:57
 */
public class RodCuttingTest {
    private  MainAlg alg = new MainAlg();
    private Random random = new Random();

    @Test
    public void testRodCutting(){
        RodCutting rodCutting = new RodCutting();
        for(int i = 10; i< 40;i++){
            rodCutting.setRodLength(i);
            rodCutting.setPriceTable(getPriceTable(i));
            alg.doAlg(rodCutting);
        }
    }


    private int[] getPriceTable(int length){
        int[] prices = new int[length];
        for(int i=0;i<length;i++){
            prices[i] = random.nextInt(100);
        }
        Arrays.sort(prices);
        return prices;
    }
}
