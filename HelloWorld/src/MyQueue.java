import java.util.*;
public class MyQueue {
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.pop());
		System.out.println(q);
		System.out.println(q.empty());
	}
    Stack<Integer> stack;
    Stack<Integer> helper;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack  = new Stack();
        helper = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty()) {
        	stack.push(x);
        }
        else {
        	while(!stack.isEmpty()) {
            	helper.push(stack.pop());
            }
        	stack.add(x);
        	while(!helper.isEmpty()) {
        		stack.push(helper.pop());
        	}
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
       return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}