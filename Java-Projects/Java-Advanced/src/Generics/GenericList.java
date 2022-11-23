package Generics;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    private T[] items;
    private int count = 10;

    public GenericList() {
        this.items =(T[]) new Object[10];
        this.count = count;
    }

    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{ // to iterator through the T Data type
        private int index;
        private GenericList<T> list; // Using the genericList class, it's dependecy injection
        public ListIterator(GenericList<T> list){
            this.list = list;
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
