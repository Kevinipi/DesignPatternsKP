package list_linkedlist;

import java.util.Iterator;

public class SampleUsage {

    public static void main(String[] args) {
        //Test Fonction add ArrayMaList
        ArrayMaList arrayMaList = new ArrayMaList();
        //Verify position and value
        arrayMaList.add(0, "Toto");
        arrayMaList.add(1, "tata");
        arrayMaList.add(2, "blabla");
        arrayMaList.add(3, "black");
        arrayMaList.add(4,"block");

        //Decalage tableau
        arrayMaList.add(1,"fouineur");

        //Implement ArrayMaListIterator
        ArrayMaList list2 = new ArrayMaList();
        MaListIterator maListIterator = new MaListIterator(list2);
        list2.add("Test1");
        list2.add("Test2");
        list2.add("Test3");


        //Test fonction ArrayMaList
        for (Iterator<String> IteratorArray = arrayMaList.iterator(); IteratorArray.hasNext();){
            String element = IteratorArray.next();
            System.out.println("ArrayMaList sans Patterns :" +element);
        }

        //Iterate to ArrayMaList with Patterns Iterator
        for (Iterator iteratorArray = maListIterator.getIterator(); iteratorArray.hasNext();){
            String element = (String) iteratorArray.next();
            System.out.println("ArrayMaList avec Patterns :" + element);
        }

        //test fonction add linkedMaList
        LinkedMaList linkedMaList = new LinkedMaList();

        //test fonction add linkedMalist avec patterns
        MaListIterator maListIterator2 = new MaListIterator(linkedMaList);

        //Liste d'éléments LinkedMaList
        linkedMaList.add("TOTO");
        linkedMaList.add("TITI");
        linkedMaList.add("TACTAC");

        //Test Iterator to LinkedList
        for (Iterator<String> IteratorArray = linkedMaList.iterator(); IteratorArray.hasNext();) {
            String element = IteratorArray.next();
            System.out.println("Linkedlist sansPatterns : " + element);
        }

        for (Iterator iteratorArray = maListIterator2.getIterator(); iteratorArray.hasNext();){
            String element = (String) iteratorArray.next();
            System.out.println("LinkedMaList avec Patterns :" + element);
        }
    }
}