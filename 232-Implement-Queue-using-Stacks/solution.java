class MyQueue {
    // Push element x to the back of queue.
    public Stack<Integer> s1 =new Stack<>();
    public Stack<Integer> s2 =new Stack<>();
    public void push(int x) {
        if(s1.isEmpty()){
            front =x;
        }
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
            s2.push(s1.pop());
        }}
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        if(!s2.isEmpty()){
           return s2.peek();
            }return front;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}