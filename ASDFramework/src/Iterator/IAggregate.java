package ASDFramework.src.Iterator;

public interface IAggregate<T> {
    public void add(T obj);
    public void remove(T obj);
    public IIterator<T> iterator();
}
