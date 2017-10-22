import dynamicProgramming.MainAlg;
import dynamicProgramming.RodCutting;
import dynamicProgramming.Tools;

import java.util.Random;

/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,13:25
 */
public class Main {

    public static void main(String[] args){
        MainAlg alg = new MainAlg();
        Random random = new Random();

        RodCutting rodCutting = new RodCutting();
        for(int i = 10; i< 40;i++){
            rodCutting.setRodLength(i);
            rodCutting.setPriceTable(Tools.getPriceTable(i));
            alg.doAlg(rodCutting);
        }
    }
}
