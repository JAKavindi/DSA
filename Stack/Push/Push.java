// push elements to the top of stack 
public void push(int x) { 
if (isFull()) { 
System.out.println("Stack OverFlow"); 
// terminates the program 
System.exit(1);
// insert element on top of stack 
System.out.println("Inserting " + x); arr[++top] = x; 
}
