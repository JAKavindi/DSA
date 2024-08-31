int deQueue() { 
int element; 
if (isEmpty()) { 
System.out.println("\nThe queue is empty");
return (-1); 
} 
else { 
element = items[front]; 
if (front >= rear) { 
front = -1; rear = -1; 
} 
else 
{ front++; 
} 
System.out.println("\nThe element " +element + " is deleted"); 
return (element); } }
