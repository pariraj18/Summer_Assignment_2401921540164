class Solution {
    public String reverseWords(String s) {
        char[]ch=s.toCharArray();
        int start=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '|| i==ch.length-1){
            int end=(i==ch.length-1 && ch[i]!=' ')?i+1:i;
            while(start<end){
                char temp=ch[start];
                ch[start]=ch[end-1];
                ch[end-1]=temp;
                start++;
                end--;
            }

           start=i+1;
        }
        }
        return new String(ch);
    }
}
