public class TreeTester {
    public static void main(String[] args){
        AlexisTree tree=new AlexisTree();
        tree.addValue(5);
        tree.addValue(2);
        tree.addValue(25);
        tree.addValue(65);
        System.out.println(tree.findValue(5));
    }
}