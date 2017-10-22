package altTest.dynamicProgrammingTest;

import dynamicProgramming.MainAlg;
import dynamicProgramming.RodCutting;
import org.junit.Test;

/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,11:57
 */
public class RodCuttingTest {
    private  MainAlg alg = new MainAlg();

    @Test
    public void testRodCutting(){
        RodCutting rodCutting = new RodCutting();
        alg.doAlg(rodCutting);
    }
}
