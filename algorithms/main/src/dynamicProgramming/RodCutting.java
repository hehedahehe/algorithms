package dynamicProgramming;


/*
 * @desc 钢条切割问题
 * @author lirb
 * @datetime 2017/10/22,11:36
 */
public class RodCutting {

    private  int[] priceTable = new int[]{1,5,8,9,10,17,20,24,30};
    private   int rodLength = 10;
    private AlgType algType = AlgType.SIMPLE_RECURIVE;

    public RodCutting(){}
    public RodCutting(int rodLength, int[] priceTable){
        this.rodLength = rodLength;
        this.priceTable = priceTable;
    }

    public RodCutting(AlgType algType){
        this.algType = algType;
    }

    public int[] getPriceTable() {
        return priceTable;
    }

    public void setPriceTable(int[] priceTable) {
        this.priceTable = priceTable;
    }

    public int getRodLength() {
        return rodLength;
    }

    public void setRodLength(int rodLength) {
        this.rodLength = rodLength;
    }

    public AlgType getAlgType() {
        return algType;
    }

    public void setAlgType(AlgType algType) {
        this.algType = algType;
    }

    /**
     * 根据钢条长度和价格表，获取最优的价格
     * @return
     */
    public int getOptimalPrice(){
        int optimalPrice = 0;
        switch(this.algType){
            case SIMPLE_RECURIVE:
                optimalPrice = simpleRecursiveAlg(rodLength);
        }
        return optimalPrice;
    }

    /**
     * 简单的递归方法
     * @return
     */
    private int simpleRecursiveAlg(int length){
        if(length==0){
            return 0;
        }else{
            int q = -1;
            for(int i = 1;i<=length;i++){
                int p = simpleRecursiveAlg(length-i)+priceTable[i-1];
                q = p>q?p:q;
            }
            return q;
        }
    }


}
