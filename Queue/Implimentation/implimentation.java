class Queue { 
private static int front, rear, capacity; 
private static int queue[]; 
Queue(int size) { 
front = rear = -1; 
capacity = size; 
queue = new int[capacity]; 
} 

