
import java.util.Scanner;

class StackLL{
	 Node first;
	 Node top=null;
	 Node temp;
	 class Node{
		int value;
		Node link;

		Node(int n){
			value=n;
			link=null;
		}
	}

	public void push(int n){
			top = insert(n);
	}
	public int pop(){
		if(top==null){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			temp=top;
			top = delete(top.value);
			return temp.value;
		}		
	}
	 Node insert(int m){
		Node mNode = new Node(m);
		if(first==null){
			first=mNode;
			return first;
		}
		else{
			Node last = first;
			while(last.link!=null){
				last=last.link;
			}
			last.link=mNode;
			return mNode;
		}
	}

	 Node delete(int n){
		Node last = first;
		Node prev=null;
		if(last.value==n){
			
				first=last.link;
				return first;
		}
		else{
			while(last.link!=null){
			 if(last.value==n){
				prev.link=last.link;
				System.out.println("matched");
				
				} 	
				prev=last;
				last=last.link;		
			}
			if(last.value==n){
				prev.link=null;
				
			}
			return prev;
		}
		
}

	 void display(){
		StackLL last2=new StackLL();
		if(first==null){
			System.out.println("Empty");
		}
		else{
			System.out.print("\nLinked List :");
			Node last = first;
			while(last.link!=null){
				System.out.print(last.value+",");
				last=last.link;
			}
			System.out.print(last.value);
			
		}
	}
}

class Stack_Using_LL{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackLL obj = new StackLL();
		System.out.print("Enter the size of stack : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element in stack : ");	
			obj.push(sc.nextInt());
		}

		System.out.println("Popped Element : "+obj.pop());

		obj.display();
		
		
	}
}
