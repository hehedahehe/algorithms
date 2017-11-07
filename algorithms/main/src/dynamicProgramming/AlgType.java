package dynamicProgramming;/*
 * @desc
 * @author lirb
 * @datetime 2017/10/22,11:53
 */

public enum AlgType {
    SIMPLE_RECURIVE(1),
    RECURIVE_WITH_MEM(2);

    private int type;
    AlgType(int type){
        this.type = type;
    }
}
