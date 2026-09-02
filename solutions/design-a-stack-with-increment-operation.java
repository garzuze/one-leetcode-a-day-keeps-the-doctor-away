class CustomStack {
   private int[] stack;
   private int cursor = 0;

   public CustomStack(int maxSize) {
       this.stack = new int[maxSize];
   }
  
   public void push(int x) {
       if (cursor >= stack.length) {
           return;
       }
       stack[cursor] = x;
       cursor++;
   }
  
   public int pop() {
       if (stack.length == 0 || cursor == 0) {
           return -1;
       }
       int val = stack[cursor - 1];
       cursor--;
       return val;
   }
  
   public void increment(int k, int val) {
       for (int i = 0; i < k && i < stack.length; i++) {
           stack[i] += val;
       }

       return;
   }
}

/**
* Your CustomStack object will be instantiated and called as such:
* CustomStack obj = new CustomStack(maxSize);
* obj.push(x);
* int param_2 = obj.pop();
* obj.increment(k,val);
*/
