package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class Node {
     int value;
     Node next;

    public Node(int value) {
        this.value = value;
        this.next =null;
    }
    public int getValue(){
        return value;
    }
}
