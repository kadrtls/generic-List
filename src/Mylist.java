public class Mylist<T> {
    int count=0;
    private int capacity=10;
      private T[] array= (T[]) new Integer[20];
      int eklenenE=0;


    public Mylist(){
        this.capacity=10;
    }
    public Mylist(int capacity) {
        this.capacity = capacity;
    }

    public int size(){
        for (int i=0;i<array.length;i++){
            if (array[i]!=null){
                //count++;
            }
        }
        return count;
    }
    public void add(T data){
        if(count<capacity){
            array[count]= data;
            count++;
        }else {
            setCapacity(capacity*2);
            array[count]= (T) data;
            count++;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
