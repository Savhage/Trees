import java.util.Arrays;

public class Set {
    String[] data;
    int size;
    int capacity=10;
    public Set(){

        data=new String[capacity];
        size=0;
    }
    public Set(String[] array){
        data=new String[capacity];
        for(int i=0;i<array.length-1;i++){
            add(array[i]);
            }
    }
    public void add(String input){
        checkCapacity();
        boolean check=true;
        for(int i=0;i<size;i++){
            if(input.equalsIgnoreCase(data[i])){
                check=false;
            }
        }
        if(check){
            data[size]=input;
            size++;
        }

    }
    public void union(Set input){
        boolean check=true;
        for(int i=0;i<input.getSize();i++){
            for(int j=0;j<size;i++){
                if(input.getSet()[i].equalsIgnoreCase(data[j])){
                    check=false;
                }
            }
            if(check){
                add(input.getSet()[i]);
            }
            check=true;
        }
    }
    public Set intersect(Set input){
        Set temp=new Set();
        boolean check=false;
        for(int i=0;i<input.getSize();i++){
            for(int j=0;j<size;i++){
                if(input.getSet()[i].equalsIgnoreCase(data[j])){
                    check=true;
                }
            }
            if(check){
                temp.add(input.getSet()[i]);
            }
            check=false;
        }
        return temp;
    }
    //Our set is the scope and the input is what is being complimented
    public Set compliment(Set input){
        Set temp=new Set();
        boolean check=true;
        for(int i=0;i<size;i++){
            for(int j=0;j<input.getSize();i++){
                if(data[i].equalsIgnoreCase(input.getSet()[j])){
                    check=false;
                }
            }
            if(check){
                temp.add(data[i]);
            }
            check=true;
        }
        return temp;
    }
    public void remove(String input){
        int j=0;
        Set temp=new Set();
        for(int i=0;i<size;i++){
            if(data[i].equalsIgnoreCase(input)){
                j++;
                size--;
            }
            temp.add(data[j]);
        }
        data=temp.getSet();
    }
    public void clear(){
        String[] temp=new String[capacity];
        data=temp;
    }
    public int getSize(){
        return size;
    }
    public String[] getSet(){
        return data;
    }
    private void checkCapacity(){
        while(size>=capacity){
            capacity*=2;
        }
        data= Arrays.copyOf(data,capacity);
    }
}
