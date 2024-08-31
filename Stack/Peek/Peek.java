// return the from top element without deletion 
public int pop() { 
// if stack is empty 
// no element to peek 
if (isEmpty()) { 
System.out.println("STACK EMPTY"); 
// terminates the program 
System.exit(1); } 
// peek element from top of stack 
return arr[top];
} 
