package Problem2;

public class HeapTester {
    public static void main(String[] args){
        MinHeap min=new MinHeap(25);
        MaxHeap max=new MaxHeap(25);
        min.add(55);
        max.add(55);
        max.add(65);
        min.add(65);
        min.add(2);
        max.add(2);
        min.add(17);
        max.add(17);
        max.print();
        System.out.println();
        min.print();
    }
}
