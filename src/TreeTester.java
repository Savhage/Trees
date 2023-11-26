public class TreeTester {
    public static void main(String[] args){
        AlexisTree tree=new AlexisTree();
        tree.addValue(5);
        tree.addValue(2);
        tree.addValue(25);
        tree.addValue(65);
        tree.addValue(19);
        tree.addValue(24);
        tree.addValue(23);
        tree.printTree();
        tree.remove(25);
        tree.printTree();
    }
}
