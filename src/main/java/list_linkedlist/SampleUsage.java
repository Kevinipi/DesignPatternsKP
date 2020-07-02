package list_linkedlist;

import java.util.Iterator;

public class SampleUsage {

    public static void main(String[] args) {
        //Test Fonction add ArrayMaList
        ArrayMaList arrayMaList = new ArrayMaList();
        //Defined Iterator
        ArrayMaList list2 = new ArrayMaList();
        MaListIterator maListIterator = new MaListIterator(list2);

        list2.add("Test1");
        list2.add("Test2");
        list2.add("Test3");
        //Verify position and value
        arrayMaList.add(0, "Toto");
        arrayMaList.add(1, "tata");
        arrayMaList.add(2, "blabla");
        arrayMaList.add(3, "black");
        arrayMaList.add(4,"block");

        //Test insertion
        arrayMaList.add(3, "Chut");


        //Test fonction Iterator ArrayMaListe
    //    for (Iterator<MaList> IteratorArray = arrayMaList.iterator(); IteratorArray.hasNext();){
      //      MaList element = IteratorArray.next();
        //    System.out.println(element);
        //}

        //Iterate to Iterator
        for (Iterator iteratorArray = maListIterator.getIterator(); iteratorArray.hasNext();){
            String element = (String) iteratorArray.next();
            System.out.println(element);
        }

        //test fonction add linkedMaList
        LinkedMaList linkedMaList = new LinkedMaList();

        linkedMaList.add(1,"Test");
        linkedMaList.add(2,"bidule");
        linkedMaList.add("TOTO");
        System.out.println("LinkedMaList" + linkedMaList);
    }
}