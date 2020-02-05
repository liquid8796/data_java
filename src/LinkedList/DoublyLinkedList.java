package LinkedList;

public class DoublyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
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
    
    public int size(){
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
    
    public void addFirst(E e){
        Node<E> tmp=new Node<>(e,null,null);
        if(isEmpty()){
            head=tmp;
            tail=head;
        }else{
            tmp.setNext(head);
            head.setPrev(tmp);
            head=tmp;
        }
        size++;
    }
    public void addLast(E e){
        Node<E> tmp=new Node<>(e,null,null);
        if(isEmpty()){
            head=tmp;
            tail=head;
        }else{
            tail.setNext(tmp);
            tmp.setPrev(tail);
            tail=tmp;
        }
        size++;
    }
    public E removeFirst(){       
        if(isEmpty()){
            return null;
        }
        E result=head.getElement();
        Node<E> tmp=head.getNext();
        tmp.setPrev(null);
        head=tmp;
        size++;
        return result;
    }
    public E removeLast(){       
        if(isEmpty()){
            return null;
        }
        E result=tail.getElement();
        Node<E> tmp=tail.getPrev();
        tmp.setNext(null);
        tail=tmp;
        size++;
        return result;
    }
    public void addPos(E e,int pos){
        if(pos<0 || pos>=size) return;
        if(pos==0) addFirst(e);
        Node<E> tmp=head;
        Node<E> newest=new Node<>(e,null,null);
        int i=1;
        while(i<pos){
            tmp=tmp.getNext();
            i++;
        }
        newest.setNext(tmp.getNext());
        newest.setPrev(tmp);
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
