package com.practice.leetcode.linkedlist;

public class ReverseLinkedList2 {

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Если список пуст или разворот не требуется (левая граница равна правой)
        if (head == null || left == right) {
            return head;
        }

        // 1. Создаем фиктивный узел, который указывает на голову списка.
        // Это нужно, чтобы удобно обрабатывать случай, когда left = 1.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 2. Находим узел 'pre', который стоит ПЕРЕД позицией left.
        // Изначально pre = dummy. Нам нужно сделать (left - 1) шагов.
        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 3. 'curr' — это первый узел, который нужно развернуть (позиция left).
        ListNode curr = pre.next;

        // 4. Выполняем разворот участка от left до right.
        // Нам нужно сделать (right - left) перестановок.
        for (int i = 0; i < right - left; i++) {
            // Узел, который мы будем перемещать в начало участка
            ListNode nextNode = curr.next;

            // Шаг 1: Убираем nextNode из текущего места
            // curr теперь указывает на узел после nextNode
            curr.next = nextNode.next;

            // Шаг 2: Вставляем nextNode сразу после pre
            // nextNode указывает на то, на что раньше указывал pre.next
            nextNode.next = pre.next;

            // pre теперь указывает на nextNode
            pre.next = nextNode;
        }

        // 5. Возвращаем новый головной узел (следующий за dummy)
        return dummy.next;
    }
}
