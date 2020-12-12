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
    else super.add(item);
    return true;
  }

  public void add(int index, T item){
    if (item == null) throw new IllegalArgumentException();
    else super.add(index, item);
  }
}
