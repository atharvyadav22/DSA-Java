package Queue;

import java.util.LinkedList;
import java.util.Queue;

//Problem No-225 https://leetcode.com/problems/implement-stack-using-queues/description/?envType=problem-list-v2&envId=queue
public class StackUsingQueue {

    private Queue<Integer> q;

    LinkedList<Integer> list = new LinkedList<>();


    public StackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
