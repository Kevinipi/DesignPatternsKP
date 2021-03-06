package list_linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedMaList implements MaList {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (first == null) {
            first = new Node();
            first.setValeur(valeur);
            last = first;
        } else {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            last.setNext(newLast);

            this.last = newLast;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void add(int position, String valeur) {
        // TODO
        if (first != null) {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            int i =0;
            Node nodeActual = first;
            while(nodeActual.getNext() != null) {
                if(i == position) {
                    nodeActual.setValeur(valeur);

                }

                nodeActual = nodeActual.getNext();
            }

            this.last = nodeActual;
        }
    }

    @Override
    public String get(int position) {
        // TODO
        return null;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private Node followingNode = first;

            @Override
            public boolean hasNext() {
                return followingNode != null;
            }

            @Override
            public String next() {
                if (followingNode == null) {
                    throw new NoSuchElementException();
                }
                String toReturn = followingNode.getValeur();
                followingNode = followingNode.getNext();
                return toReturn;
            }
        };
    }

}
