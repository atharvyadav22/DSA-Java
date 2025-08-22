package Stack;

import java.util.Stack;

//Problem No-232 https://leetcode.com/problems/implement-queue-using-stacks/description/?envType=problem-list-v2&envId=queue
public class QueueUsingStack {
        Stack<Integer> s1, s2;

        public QueueUsingStack() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            peek();
            return s2.pop();
        }

        public int peek() {

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();

        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }

}
