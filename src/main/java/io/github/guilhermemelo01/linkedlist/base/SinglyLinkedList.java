package io.github.guilhermemelo01.linkedlist.base;

public class SinglyLinkedList {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(10);
        Node<Integer> first = new Node<>(8);
        Node<Integer> second = new Node<>(1);
        Node<Integer> third = new Node<>(11);
        head.setNext(first);
        first.setNext(second);
        second.setNext(third);

        printValuesNode(head);

//        Integer lengthNode = findLengthNode(head);
//        System.out.println("Length: "+ lengthNode);

        System.out.println("----INSERT FIRST POSITION----");
        head = insertNewNodeAtFirstPosition(new Node<>(243), head);
        printValuesNode(head);

        System.out.println("----INSERT LAST POSITION----");
        head = insertNewNodeAtLastPosition(new Node<>(111), head);
        printValuesNode(head);

        System.out.println("----INSERT IN GIVEN POSITION----");
        head = insertNewNodeInGivePosition(new Node<>(439), head, 3);
        printValuesNode(head);
    }

    public static Node<Integer> insertNewNodeInGivePosition(Node<Integer> newNode, Node<Integer> head, int position){

        if(position == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }
        else{
            Node<Integer> previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }

            Node<Integer> current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }

        return head;
    }
    public static Node<Integer> insertNewNodeAtLastPosition(Node<Integer> newNode, Node<Integer> currentHead){
        if (currentHead.data == null){
            currentHead = newNode;
            return currentHead;
        }

        Node<Integer> currentNode = currentHead;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return currentHead;
    }

    public static Node<Integer> insertNewNodeAtFirstPosition(Node<Integer> newNode, Node<Integer> currentHead){
        newNode.setNext(currentHead);
        currentHead = newNode;
        return currentHead;
    }

    public static Integer findLengthNode(Node<Integer> head){
        Node<Integer> current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void printValuesNode(Node<Integer> head){
        Node<Integer> current = head;
        while (current != null){
            System.out.print(current.getData() + " --> ");
            current = current.next;
        }
        System.out.println("null");
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

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "data=" + data +
//                    ", next=" + next +
//                    '}';
//        }
    }

}
