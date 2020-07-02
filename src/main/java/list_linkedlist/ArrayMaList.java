package list_linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayMaList implements MaList {

    private String[] array = new String[10];
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (this.size >= this.array.length) {
            String[] newArray = new String[this.size * 2];

            // copier array dans newArray
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            // on référence le nouveau tableau
            this.array = newArray;
        }
        this.array[size] = valeur;
        this.size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
        if(position <= this.array.length) {
            if (this.size >= this.array.length) {
                String[] newArray = new String[this.size * 2];
                // découper le tableau
                for (int i = 0; i < position; i++) {
                    newArray[i] = array[i];
                }
                newArray[position] = valeur;

                for (int i = 0; position + 1 < this.array.length; i++) {
                    newArray[i] = array[i];
                }
                // on référence le nouveau tableau
                this.array = newArray;
            } else {
                // découper le tableau
                for (int i = 0; i < position; i++) {
                    this.array[i] = array[i];
                }

                //this.array[position+1] = this.array[position];
                this.array[position] = valeur;

                for (int i = position + 2; i < this.array.length; i++) {
                    this.array[i] = array[i];
                }
            }
            this.size++;
        }
    }

    @Override
    public String get(int position) {
        return this.array[position];
    }

    @Override
    public Iterator<MaList> iterator() {
        // TODO
        List<String> listElement = Arrays.asList(this.array);
        // Boucle for
        Iterator element = listElement.iterator();

        return element;
    }
}
