package Q_01;

public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(this.top==null){
            this.top=newNode;
        }else {
            newNode.setNext(this.top);
            this.top=newNode;
        }

    }
    public void pop(){
        if(this.top==null){
            System.out.println("Empty stack");
        }else{
            Node NextNode=this.top.getNext();
            this.top.setNext(null);
            this.top=NextNode;
        }
    }
    public void display(){
        Node current=this.top;
        while(!(current==null)){
            System.out.print(" "+current.getData());
            current=current.getNext();
        }
        System.out.println();
    }
}
