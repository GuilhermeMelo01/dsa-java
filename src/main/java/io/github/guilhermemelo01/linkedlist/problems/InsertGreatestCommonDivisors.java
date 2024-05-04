package io.github.guilhermemelo01.linkedlist.problems;

import io.github.guilhermemelo01.linkedlist.problems.listnode.ListNode;

public class InsertGreatestCommonDivisors {

    public static void main(String[] args) {
        ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3, null))));
        ListNode listNode = insertGreatestCommonDivisors(head);
        System.out.println(listNode);
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode node = head;
        while (node.next != null) {
            int nodeValue = node.val;
            int nextNodeValue = node.next.val;
            int minimunValueBetween = nodeValue < nextNodeValue ? nodeValue : nextNodeValue;

            for (int i = minimunValueBetween; i > 0; i--) {
                if (nodeValue % i == 0 && nextNodeValue % i == 0) {
                    ListNode newNode = new ListNode(i, node.next);
                    node.next = newNode;
                    node = newNode.next;
                    break;
                }
            }
        }
        return head;
    }
}
