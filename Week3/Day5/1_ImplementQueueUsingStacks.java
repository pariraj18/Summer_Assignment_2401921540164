class MyQueue {
    Stack<Integer>mainS;
    Stack<Integer>helperS;

    public MyQueue() {
        mainS=new Stack<>();
        helperS=new Stack<>();
        
    }
    
    public void push(int x) {
        while(!mainS.isEmpty()){
            helperS.push(mainS.pop());
        }
        mainS.push(x);
        while(!helperS.isEmpty()){
            mainS.push(helperS.pop());
        }
        
    }
    
    public int pop() {
        return mainS.pop();
        
    }
    
    public int peek() {
        return mainS.peek();
        
    }
    
    public boolean empty() {
        return mainS.isEmpty();
        
    }
}

