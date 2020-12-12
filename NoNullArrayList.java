import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int capacity){
    super(capacity);
  }

  public boolean add(T item){
    if (item == null) throw new IllegalArgumentException();
    return super.add(item);
  }

  public void add(int index, T item){
    if (item == null) throw new IllegalArgumentException();
    else super.add(index, item);
  }

  public T set(int index, T item){
    if (item == null) throw new IllegalArgumentException();
    return super.set(index, item);
  }
}
