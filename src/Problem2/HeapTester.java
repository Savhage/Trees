package Problem2;

public class HeapTester {
    public static void main(String[] args){
        MinHeap min=new MinHeap();
        MaxHeap max=new MaxHeap(25);
        System.out.println(max.peak());
        max.add(14);
        System.out.println(max.peak());
        max.add(27);
        System.out.println(max.peak());
    }
}
