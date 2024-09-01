import java.util.Scanner;
class Link{
	static Node head;
	static Node rear=null,front=null,temp;
	static class Node{
		int value;
		Node next;
		Node(int n){
			value=n;
			next=null;
		}
	}

	public static void enque(int n){
			if(rear==null){
				front= insert(n);
				rear = front;
			}
			else{
				rear = insert(n);
			}		
	}
	public static int deque(){
		if(front==null){
			System.out.println("Queue Underflow");
			return 0;
		}
		else{
			temp = front;
			front = delete(front.value);
			return (temp.value);
		}
	}
	static Node insert(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			return head;
		}
		else{
			Node lastNode = head;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=mNode;
			return mNode;
		}
	}
	// static void deleteAtlast(){
	// 	if(head==null){

	// 	}
	// 	else{
	// 		Node lastNode=head;
	// 		while(lastNode.next.next!=null){
	// 			lastNode=lastNode.next;
	// 		}
	// 		lastNode.next=null;
	// 	}
	// }

	static Node delete(int n){
		Node lastNode = head;
		Node prev=null;
		if(lastNode.value==n){
				head=lastNode.next;
				return head;
		}
		else{
			while(lastNode.next!=null){
			 if(lastNode.value==n){
				prev.next=lastNode.next;
				System.out.println("matched");
				return prev;
			} 	
			prev=lastNode;
			lastNode=lastNode.next;	
			}
			if(lastNode.value==n){
				prev.next=null;
			}
		}
		return prev;	
}

	static void display(){
		Link lastNode2=new Link();
		if(head==null){
			// System.out.println("Empty");
		}
		else{
			System.out.print("\nLinked List :");
			Node lastNode = head;
			while(lastNode.next!=null){
				System.out.print(lastNode.value+" => ");
				lastNode=lastNode.next;
			}
			System.out.print(lastNode.value);
			
		}
	}
}

class QueueByLL{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Link obj = new Link();
		System.out.print("Enter no. of Queue element : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element of Queue : ");	
			obj.enque(sc.nextInt());
		}

		System.out.println("Deque element : "+obj.deque());
		System.out.println("Deque element : "+obj.deque());
		System.out.println("Deque element : "+obj.deque());
		
		obj.display();
	}
}