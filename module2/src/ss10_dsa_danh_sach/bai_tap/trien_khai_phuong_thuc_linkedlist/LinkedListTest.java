package ss10_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(6);
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addLast(8);
        System.out.println("---------");
        linkedList.printList();
        System.out.println("---------");
        linkedList.remove(3);
        linkedList.printList();

    }
}
