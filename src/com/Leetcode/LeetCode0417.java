package com.Leetcode;

import java.util.*;

public class LeetCode0417 {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

class Solution041701 {
    public int[] reversePrint(ListNode head) {
        List<Integer> original = new ArrayList<>();
        while (head != null){
            original.add(head.val);
            head = head.next;
        }
        Collections.reverse(original);
        return original.stream().mapToInt(Integer::intValue).toArray();
    }
}


class CQueue {
    private LinkedList<Integer> input;
    private LinkedList<Integer> output;

    public CQueue() {
        input = new LinkedList<Integer>();
        output = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        input.addLast(value);
    }
    /************关键步骤************/
    public int deleteHead() {
        if (!output.isEmpty()) return output.removeLast();    // 之前没有pop完的继续pop
        if (input.isEmpty()) return -1;
        while(!input.isEmpty())
            output.addLast(input.removeLast());
        return output.removeLast();
    }
}

/**
 * 复习重点
 * 思路：
 * 首先创建状态转移图，图中应该包含：
 * 1. 初始状态：
 * 2. 合法的结束状态
 * 3. 状态之间的合法转化
 *
 * 遍历整个字符串，不断变化当前状态，如果当前状态的下一个状态不在转化图中（非法输入），就直接return false
 * 遍历完成后，检测结束状态是否合法，合法return true，否则return false
 */
class Solution041703 {
    public boolean isNumber(String s) {
        Map[] states = {
                new HashMap<>() {{ put(' ', 0); put('s', 1); put('d', 2); put('.', 4); }}, // 0.
                new HashMap<>() {{ put('d', 2); put('.', 4); }},                           // 1.
                new HashMap<>() {{ put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }}, // 2.
                new HashMap<>() {{ put('d', 3); put('e', 5); put(' ', 8); }},              // 3.
                new HashMap<>() {{ put('d', 3); }},                                        // 4.
                new HashMap<>() {{ put('s', 6); put('d', 7); }},                           // 5.
                new HashMap<>() {{ put('d', 7); }},                                        // 6.
                new HashMap<>() {{ put('d', 7); put(' ', 8); }},                           // 7.
                new HashMap<>() {{ put(' ', 8); }}                                         // 8.
        };
        int p = 0;
        char t;
        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') t = 'd';
            else if(c == '+' || c == '-') t = 's';
            else if(c == 'e' || c == 'E') t = 'e';
            else if(c == '.' || c == ' ') t = c;
            else t = '?';
            if(!states[p].containsKey(t)) return false;
            p = (int)states[p].get(t);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
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
class Solution041704 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode cur,tem,nex;

        /************关键步骤************/
        cur = head;
        tem = head.next;
        cur.next = null;
        while (tem != null){
            nex = tem.next;
            tem.next = cur;
            cur = tem;
            tem = nex;
        }
        return cur;
    }
}
