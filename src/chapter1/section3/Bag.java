package chapter1.section3;

import java.util.Iterator;

/**
 * Created by rene on 06/08/17.
 */
public class Bag<Item> implements Iterable<Item> {

    private class Node {
        Item item;
        Node next;
    }

    private Node first;

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            //Not used in Bag
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}