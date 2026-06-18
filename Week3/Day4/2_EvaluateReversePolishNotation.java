class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>vs=new Stack<>();
    for(String  ch :tokens){
        if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/")){
            int v2=vs.pop();
            int v1=vs.pop();
    
         if(ch.equals("+")){
            vs.push(v1+v2);
        }
        else if(ch.equals("-")){
            vs.push(v1-v2);
        }
        else if(ch.equals("*")){
            vs.push(v1*v2);
        }
        else{
            vs.push((int) v1/v2);
        }
    }
    else{
        vs.push(Integer.valueOf(ch));
    }
}
return vs.pop();
}
}
