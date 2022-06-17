package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class Solution {
  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enQueue(14);
    queue.enQueue(22);
    queue.enQueue(43);
    queue.displayQueue();
    queue.deQueue();
    queue.displayQueue();
    queue.deQueue();
    queue.displayQueue();
  }
}
