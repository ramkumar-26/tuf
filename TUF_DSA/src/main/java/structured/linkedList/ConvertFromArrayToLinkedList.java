package structured.linkedList;

import java.util.Iterator;

public class ConvertFromArrayToLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        LinkedList<Integer> list = new LinkedList<>();
        for (int val : arr) {
            list.add(val);
        }

//        System.out.println(list.get(1).val);
//        list.deleteAtPos(1);
//        System.out.println(list.get(1).val);
//        System.out.println(list.get(4).val);
//        list.updateIndex(10, 4);
//        System.out.println(list.get(4).val);

//        for (int val : list){
//            System.out.println(val);
//        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
