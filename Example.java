class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}	
}
class Queue{
	Node front;
	public void enQueue(int data){
		Node node=new Node(data);
		if(front==null){
			front=node;
		}else{
			Node temp=front;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void deQueue(){
		if(front!=null){
			front=front.next;
		}
	}
	public void printQueue(){
		Node temp=front;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println("\b\b]");		
	}
}
class Example{
	public static void main(String args[]){
		Queue q1=new Queue();
		q1.enQueue(100);
		q1.enQueue(200);
		q1.enQueue(300);
		q1.enQueue(400);
		q1.printQueue();
		q1.deQueue();
		q1.printQueue();
	}
}
