package lab3.problem_3;

import java.util.Collection;
import java.util.HashSet;

public class Set<T> implements MyCollection<T> {
    private HashSet<T> set = new HashSet();


    public boolean add(T element) {
        return set.add(element);
    }


    public int size() {
        return set.size();
    }

    public boolean remove(T element) {
        return set.remove(element);

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<T> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<T> c) {
        return set.removeAll(c);
    }

    @Override
    public boolean addAll(Collection<T> c) {
        return set.addAll(c);
    }


    public String toString() {
        return set.toString();
    }
}
