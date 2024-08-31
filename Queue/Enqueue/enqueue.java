void enQueue(int element) { 
if (isFull()) { 
System.out.println("\nThe queue is full"); 
} 
else 
{ 
if (front == -1) { 
front = 0; 
} 
rear++; 
items[rear] = element; 
System.out.println("\nThe element " + element + " is inserted"); 
} 
}
