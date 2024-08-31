//pop elements from top of stack 
public int pop() { 
// if stack is empty 
// no element to pop 
if (isEmpty()) { 
System.out.println("STACK EMPTY"); 
// terminates the program 
System.exit(1); } 
// pop element from top of stack 
return arr[top--];
} 
