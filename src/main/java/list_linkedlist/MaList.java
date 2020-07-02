package list_linkedlist;

public interface MaList extends Iterable<MaList> {
    int size();
    void add(String valeur);
    void add(int position, String valeur);
    //Defined get for iterator
    String get(int position);
}