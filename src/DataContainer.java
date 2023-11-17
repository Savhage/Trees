public class DataContainer {
    DataContainer left,right;
    int value;
    public DataContainer(int n){
        value=n;
        left=null;
        right=null;
    }
    public int getValue(){
        return value;
    }
}
