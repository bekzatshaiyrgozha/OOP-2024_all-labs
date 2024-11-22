package lab3.problem_3;

import java.util.Collection;

public interface MyCollection<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();

    public boolean containsAll(Collection<T> c);
    public boolean removeAll(Collection<T> c);
    public boolean addAll(Collection<T> c);
    public boolean retainAll(Collection<T> c);




}
