import java.io. *;
// Java program to implement
// a Singly Linked List
public class LinkedList {
Node head; // head of list
// Linked list Node.
// This inner class is made static
// so that main() can access it
static class Node {
int data;
Node next;
// Constructor
Node(int d)
{
data = d;
next = null;
}
}
