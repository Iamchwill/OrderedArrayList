import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int capacity){
    super(capacity);
  }

  public boolean add(T item){
    if (item == null) throw new IllegalArgumentException();
    super.add(this.orderIndex(item), item);
    return true;
  }

  public void add(int index, T item){
    if (item == null) throw new IllegalArgumentException();
    super.add(this.orderIndex(item), item);
  }

  public T set(int index, T item){
    if (item == null) throw new IllegalArgumentException();
    T removed  = super.remove(index);
    super.add(this.orderIndex(item), item);
    return removed;
  }

  private int orderIndex(T item){
    if (item == null) throw new IllegalArgumentException();
    for (int index = 0; index < this.size(); index++){
      if (this.get(index).compareTo(item) >= 0) return index;
    }
    return this.size();
  }
}
