class Queue{
    int front=-1,rear=-1;
    int Q [] = new int[10];

    public void enqueue(int n){
        if(rear>=9){
            System.out.println("Queue is overflow");
        }
        else{
            if(rear==-1){
                front=0;     
            }
            rear++;
            Q[rear]=n;
        }
    }
    public int dequeue(){
        if(rear==-1){
            System.out.println("Queue is underflow");
            return 0;
        }
        else{
            front++;
            return Q[front];
        }
}
    public void displayQueue(){
        for(int i=front;i<=rear;i++){
            System.out.println(Q[i]);
        }
    }
}
public class QueueDemo {
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.displayQueue();

        obj.dequeue();
        obj.displayQueue();
    }
}
