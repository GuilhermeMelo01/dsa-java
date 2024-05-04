package io.github.guilhermemelo01.linkedlist.base;

public class SinglyLinkedList {

    public static void main(String[] args) {
        Node<Integer> node2 = new Node<>(19);
        Node<Integer> node1 = new Node<>(12);


        node1.setNext(node2);

        System.out.println(node1);
    }

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

}
