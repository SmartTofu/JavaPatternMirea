package Task_3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSet<T> implements Set<T> {

    // Поле - несинхронизированный хэш-сет
    private final Set<T> set = new HashSet<>();


    // Переопределения пяти методов сета
    @Override
    synchronized public int size() { return set.size(); }

    @Override
    synchronized public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) { return set.contains(o); }

    @Override
    synchronized public Iterator iterator() {
        return set.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return set.toArray();
    }



    // Пустышки
    @Override
    synchronized public boolean add(Object o) {
        return set.add((T) o);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return false;
    }

    @Override
    synchronized public boolean addAll(Collection c) {
        return false;
    }

    @Override
    synchronized public void clear() {

    }

    @Override
    synchronized public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    synchronized public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    synchronized public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    synchronized public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
