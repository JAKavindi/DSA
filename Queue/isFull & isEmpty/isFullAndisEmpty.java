boolean isFull() {
if (front == 0 && rear == SIZE - 1) { 
return true;
} 
return false; 
} 
boolean isEmpty() { 
if (front == -1) 
return true; 
else 
return false;
}
