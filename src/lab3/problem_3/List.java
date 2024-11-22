package lab3.problem_3;

import java.util.ArrayList;
import java.util.Collection;

public class List<T> implements  MyCollection<T>{
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(T element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean add(T element) {
        return list.add(element);
    }

    @Override
    public boolean remove(T element) {
        return list.remove(element);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean removeAll(Collection<T> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean addAll(Collection<T> c) {
        return list.addAll(c);
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<T> c) {
        return list.retainAll(c);
    }

    public String toString(){
        return list.toString();

    }
}
