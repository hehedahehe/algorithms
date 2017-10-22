package dynamicProgramming;

/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,12:04
 */
public class MainAlg {

    private RodCutting rodCutting;


    public void doAlg(RodCutting rodCutting){
        this.rodCutting = rodCutting;
        long startTime = System.currentTimeMillis()/1000;
        int optimalPrice = rodCutting.getOptimalPrice();
        long endTime = System.currentTimeMillis()/1000;
    }
}
