import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int capacity){
    super(capacity);
  }

  public boolean add(T item){
    super.add(this.orderIndex(item), item);
    return true;
  }

  public void add(int index, T item){
    super.add(this.orderIndex(item), item);
  }

  private int orderIndex(T item){
    if (item == null) throw new IllegalArgumentException();
    for (int index = 0; index < this.size(); index++){
      if (this.get(index).compareTo(item) >= 0) return index;
    }
    return this.size();
  }
}
