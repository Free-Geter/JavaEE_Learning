package com.Leetcode;

import com.Lesson.lesson1.array.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeetCode0421 {
}


class Solution0421 {
    public static String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c :
                s.toCharArray()) {
            if (c == ' ')
                stringBuilder.append("%20");
            else
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution042101 {
    private static Stack<Integer> stack = new Stack<>();
    public static int[] reversePrint(ListNode head) {
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode p1,p2,p3;
        p1 = new ListNode(1);
        p2 = new ListNode(2);
        p3 = new ListNode(3);
        p1.next = p2;
        p2.next = p3;
        int [] s = reversePrint(p1);
        System.out.println(Arrays.toString(s));
    }
}

class CQueue01 {
    private Stack<Integer> input;
    private Stack<Integer> output;
    public CQueue01() {
        input= new Stack<>();
        output = new Stack<>();
    }

    public void appendTail(int value) {
        input.push(value);
    }

    public int deleteHead() {
        if (output.isEmpty())
        {
            if (input.isEmpty())
                return -1;
            else
                while (!input.isEmpty()){
                    output.push(input.pop());
                }
        }
        return output.pop();
    }

    public static void main(String[] args) {
        CQueue01 queue01 = new CQueue01();
        System.out.println(queue01.deleteHead());
//        queue01.appendTail(1);
//        queue01.appendTail(2);
//        queue01.appendTail(3);
//        System.out.println(queue01.deleteHead());
//        queue01.appendTail(100);
//        System.out.println(queue01.deleteHead());
//        System.out.println(queue01.deleteHead());
//        System.out.println(queue01.deleteHead());
    }
}

// Definition for a Node.
class Node {
    int val;
    Node next, random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

/**
 * 复习重点，空间复杂度相较于传统方法更小，但是时间复杂度更高
 * 典型的空间换时间
 */
class Solution042104 {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node cur = head;
        // 1. 复制各节点，并构建拼接链表
        while(cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }
        // 2. 构建各新节点的 random 指向
        cur = head;
        while(cur != null) {
            if(cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        // 3. 拆分两链表
        cur = head.next;
        Node pre = head, res = head.next;
        while(cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null; // 单独处理原链表尾节点
        return res;      // 返回新链表头节点
    }
}
