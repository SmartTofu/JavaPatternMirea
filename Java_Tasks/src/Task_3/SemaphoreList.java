package Task_3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphoreList<T> implements List<T> {

    // Обявления полей класса
    private final List<T> list = new ArrayList<>();
    private final Semaphore semaphore = new Semaphore(1);


    // Переопределения пяти методов списка
    @Override
    public int size() {
        try{
            semaphore.acquire();
            int size = list.size();
            semaphore.release();
            return size;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        try{
            semaphore.acquire();
            boolean isEmpty = list.isEmpty();
            semaphore.release();
            return isEmpty;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        try{
            semaphore.acquire();
            boolean container = list.contains(o);
            semaphore.release();
            return container;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    @Override
    public Iterator<T> iterator() {
        try{
            semaphore.acquire();
            Iterator<T> iter = list.iterator();
            semaphore.release();
            return iter;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        try{
            semaphore.acquire();
            Object[] arr = list.toArray();
            semaphore.release();
            return arr;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new Object[0];
        }
    }


    // Пустышки
    @Override
    public boolean add(Object o) {
        try{
            semaphore.acquire();
            list.add((T) o);
            semaphore.release();
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
