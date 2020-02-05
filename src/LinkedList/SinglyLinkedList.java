
package LinkedList;

public class SinglyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }       
    }
    
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;
    //access method
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }   
    public E getFirst(){
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E getLast(){
        if(isEmpty()) return null;
        return tail.getElement();
    }
    //update method
    public void addFirst(E e){
        head=new Node<>(e,head);
        if(isEmpty()){
            tail=head;
        }
        size++;
    }
    public void addLast(E e){
        Node<E> newest=new Node<>(e,null);
        if(isEmpty()){
            head=newest;
            tail=head;
        }else{
            tail.setNext(newest);
            tail=tail.getNext();
        }
        size++;
    }
    public E removeFirst(){
        if(isEmpty()) return null;
        E result=head.getElement();
        head=head.getNext();
        size--;
        if(size==0) tail=null;
        return result;
    }
    public void addPos(E e,int pos){
        if(pos<0 || pos>=size) return;
        if(pos==0) addFirst(e);
        Node<E> tmp=head;
        Node<E> newest=new Node<>(e,null);
        int i=1;
        while(i<pos){
            tmp=tmp.getNext();
            i++;
        }
        newest.setNext(tmp.getNext());
        tmp.setNext(newest);
        size++;
    }
    public void printAll(){
        Node<E> tmp=head;
        System.out.print("[");
        while(tmp!=null){
            System.out.print(tmp.getElement()+" ");
            tmp=tmp.getNext();
        }
        System.out.println("\b]");
    }
}
