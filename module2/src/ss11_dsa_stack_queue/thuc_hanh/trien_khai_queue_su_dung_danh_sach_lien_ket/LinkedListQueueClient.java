package ss11_dsa_stack_queue.thuc_hanh.trien_khai_queue_su_dung_danh_sach_lien_ket;

public class LinkedListQueueClient {
  public static void main(String[] args) {
    MyLinnkedListQueue queue = new MyLinnkedListQueue();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    System.out.println("Dequeued item is " + queue.dequeue().key);
  }
}