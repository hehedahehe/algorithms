package tree;

import java.util.Stack;

/*
 * @desc
 * @author lirb
 * @datetime 2017/12/30,17:01
 */
public class BinaryTreeMain {
    private  static BinaryTreeNode head;

    static {
        initTree();
    }

    /**
     *            1
     *        /      \
     *       2        3
     *    /    \     /
     *   4     5    6
     *  /
     * 0
     * @return
     */
    private static  void initTree(){
        BinaryTreeNode node0 = new BinaryTreeNode("0");
        BinaryTreeNode node4 = new BinaryTreeNode("4");
        node4.setLeftNode(node0);

        BinaryTreeNode node5 = new BinaryTreeNode("5");

        BinaryTreeNode node2 = new BinaryTreeNode(node4,node5,"2");

        BinaryTreeNode node6 = new BinaryTreeNode("6");
        BinaryTreeNode node3 = new BinaryTreeNode("3");
        node3.setLeftNode(node6);

        head = new BinaryTreeNode(node2,node3,"1");
    }


    private static void printPreOrderRecur(BinaryTreeNode node){
        if(node!=null){
            System.out.println(node.getValue());
            printPreOrderRecur(node.getLeftNode());
            printPreOrderRecur(node.getRightNode());
        }
    }

    private static void printMidOrderRecur(BinaryTreeNode node){
        if(node==null){
            return;
        }
        printMidOrderRecur(node.getLeftNode());
        System.out.println(node.getValue());
        printMidOrderRecur(node.getRightNode());
    }

    private  static void printPostOrderRecur(BinaryTreeNode node){
        if(node!=null){
            printPostOrderRecur(node.getLeftNode());
            printPostOrderRecur(node.getRightNode());
            System.out.println(node.getValue());
        }
    }

    public static void printPreOrderW(BinaryTreeNode node){
        Stack<BinaryTreeNode> nodes = new Stack<>();
        nodes.push(node);
        BinaryTreeNode currNode = null;
        while(!nodes.isEmpty()){
            currNode = nodes.pop();
            System.out.println(currNode.getValue());
            if(currNode.getRightNode()!=null){
                nodes.push(currNode.getRightNode());
            }
            if(currNode.getLeftNode()!=null){
                nodes.push(currNode.getLeftNode());
            }
        }
    }


    public static void printMidOrderW(BinaryTreeNode node){
        Stack<BinaryTreeNode> nodes = new Stack<>();
        BinaryTreeNode currNode = node;
        nodes.push(currNode);
        while(currNode.getLeftNode()!=null){
            currNode = currNode.getLeftNode();
            nodes.push(currNode);
        }
        while(!nodes.isEmpty()){
            currNode = nodes.pop();
            System.out.println(currNode.getValue());
            BinaryTreeNode _currNode = currNode.getRightNode();
            if(_currNode!=null){
                nodes.push(_currNode);
                while(_currNode.getLeftNode()!=null){
                    _currNode = _currNode.getLeftNode();
                    nodes.push(_currNode);
                }
            }
        }
    }

    /**
     * 使用循环的方式后序打印
     * @param node
     */
    public static void printPostOrderW(BinaryTreeNode node){
        Stack<BinaryTreeNode> tempStack = new Stack<>();
        Stack<BinaryTreeNode> nodes = new Stack<>();
        tempStack.push(node);
        while (!tempStack.isEmpty()) {
            BinaryTreeNode currNode = tempStack.pop();
            nodes.push(currNode);
            if(currNode.getLeftNode()!=null) tempStack.push(currNode.getLeftNode());
            if(currNode.getRightNode()!=null)tempStack.push(currNode.getRightNode());
        }
        while (!nodes.isEmpty()){
            System.out.println(nodes.pop().getValue());
        }
    }

    /**
     * 给定一棵二叉树的头节点head，按照如下两种标准分别实现二叉树边界节点的逆时针打印
     */
    public void printBinaryTreeEdge(){

    }

    public static void main(String[] args){
//        System.out.println("先序：");
//        BinaryTreeMain.printPreOrderRecur(head);
//        System.out.println("中序：");
//        BinaryTreeMain.printMidOrderRecur(head);
        System.out.println("后续：");
        BinaryTreeMain.printPostOrderRecur(head);
//        System.out.println("先序非递归；");
//        BinaryTreeMain.printPreOrderW(head);
//        System.out.println("中序非递归：");
//        BinaryTreeMain.printMidOrderW(head);
        System.out.println("后序非递归");
        BinaryTreeMain.printPostOrderW(head);
    }


}
