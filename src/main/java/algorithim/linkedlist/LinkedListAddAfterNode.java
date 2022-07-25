package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListAddAfterNode {

    LinkedList.Node head, tail;

    public void addAfterNode(Node node, int i) {
	Node newNode = new LinkedList.Node(i);
	Node temp = node.next;
	node.next = newNode;
	newNode.next = temp;
    }

}
