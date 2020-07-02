package list_linkedlist;

import java.util.Iterator;

public class MaListIterator implements Iterator<String> {

    private MaList maList;

    private int size = 0;

    public MaListIterator(MaList maList) {
        this.maList = maList;
    }

    //Function for return iterator
    public Iterator getIterator() {
        return new MaListIterator(maList);
    }
    @Override
    public boolean hasNext() {
        return size < this.maList.size();
    }

    @Override
    public String next() {
        if(this.hasNext()){
            return maList.get(size++);
        }
        return null;
    }

    @Override
    public void remove() {

    }
}
