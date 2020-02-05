
package LinkedList;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> list=new DoublyLinkedList<String>();
        list.addFirst("nam");
        list.addLast("thang");
        list.addFirst("man");
        list.printAll();
        //list.removeLast();
        //list.printAll();
        list.addPos("trung", 1);
        list.printAll();
    }
}
