package ss10_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyList<>();
        arrayList.addLast(7);
        arrayList.addFirst(5);
        arrayList.addFirst(6);
        arrayList.addFirst(8);
        arrayList.addFirst(9);
        arrayList.add(3,10);
        arrayList.add(4,12);
        arrayList.remove(4);
        arrayList.remove(3);
        arrayList.printList();
        System.out.println("index = "+arrayList.indexOf(6));
        arrayList.clear();
        System.out.println("Mang sau khi clear:");
        arrayList.printList();
    }
}
