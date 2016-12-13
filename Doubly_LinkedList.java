package double_linklist;

public class Doubly_LinkedList<T> {
	
	private Doubly_Node<T> head;
	private boolean isempty;
	private int size;
	
	Doubly_Node<T> n = new Doubly_Node<T>();
	
	public Doubly_LinkedList(){
		isempty=true;
		size=0;
	}
	
	public Doubly_Node<T> gethead(){
		return head;	
	}
	
	public int getsize(){
		return size;
	}
	
	public void insert(Doubly_Node<T> p, T value){
		if(p==head&& p==null){
			head = new Doubly_Node<T>();
			head.value=value;
			size++;
		}
		else{
			if(p.next==null){
				p.next = new Doubly_Node<T>();
				p.next.value = value;
				p.next.previous = p;
				size++;
			}
			else{
				insert(p.next,value);
			}
		}
	}
	
	public void delete(T value){
		if(head ==null){
			return;
		}
		else{
			if(head.value == value){
				Doubly_Node<T> temp;
				temp = head;
				head = temp.next;
				temp.previous=null;
				temp.next=null;
				
				size--;
			}
		}
		delete(head,value);
	}
	
	private void delete(Doubly_Node<T> current, T value){
		if(current == null){
			return;
		}
		else{
			if(current.next.value == value && current.next.next!=null){
				Doubly_Node<T> temp;
				temp=current.next;
				temp.previous=null;
				current.next=current.next.next;
				temp.next=null;
				current.next.previous=current;
				size--;
				return;
			}
			else if(current.next.value == value && current.next.next==null){
				current.next.previous=null;
				current.next=null;
				
			}
			delete(current.next,value);
		}
	}
	
	public void print(){
		print(head);
	}
	
	private void print(Doubly_Node<T> current) {
		if(current==null){
			return;
		}
		else{
			System.out.println(current.value);
			print(current.next);
		}
		
		
	}
	

}
