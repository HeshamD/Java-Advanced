package Collections2;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    private T[] items = (T[]) new Object[10];
    private int count = 0;

    public void add(T data){
        items[count] = data;
        count++;
    }
    public T get(int index){
        return items[count];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{
        private int index;
        private GenericList<T> list;

        public ListIterator(GenericList<T> list){
            this.list=list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
