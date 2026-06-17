class MinStack {
    Stack<Integer>allData=new Stack<>(),minData=new Stack<>();
    
    public void push(int val) {
        allData.push(val);
        if(minData.isEmpty()|| val<=minData.peek()){
            minData.push(val);
        }
        
    }
    
    public void pop() {
            if(allData.peek().equals(minData.peek())){
                minData.pop();
            }
            allData.pop();
        }
    public int top() {
        if(allData.isEmpty()){
            return -1;
        }
        else{
        return    allData.peek();
        }
        
    }
    
    public int getMin() {
        if(minData.isEmpty()){
            return -1;}
            else{
                return minData.peek();
            }
        }
        
    }


