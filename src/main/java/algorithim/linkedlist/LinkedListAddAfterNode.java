package algorithim.linkedlist;

public class LinkedListAddAfterNode {

    LinkedList head, tail;

    public void addAfterNode(LinkedList node, int i) {
	LinkedList newNode = new LinkedList(i);
	LinkedList temp = node.next;
	node.next = newNode;
	newNode.next = temp;
    }

}
