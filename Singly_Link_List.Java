
public class linkedlist
{
	private Node head;
	private boolean isempty;
	private int size; 
	
	Node n1 = new Node();	
	public linkedlist(){
		isempty = true;
		size=0;
	}
	public Node gethead(){
		return head;
		
	}
	public void insert(Node p ,int value1){
		if(p==head && p==null){
			head=new Node();
			head.value=value1;
			size++;
		}
	
		else{
		
			if(p.next==null){
				p.next = new Node();
				p.next.value = value1;
				size++;
			}
			else{
				insert(p.next,value1);
			}
		}
	}
	
	public int getsize(){
		return size;
	}
	
	int s = getsize();
	
	public void print()
	{
		print(head);
	}
	
	private void print(Node current){
		if(current==null){
			return;
		}
		else{
			System.out.println(current.value);
			print(current.next);
		}
	}
	
	public int search(int value){
		//gethead();
		search(head,value);
		return value;
	}
	
	private int element_index = -1; // for storing index of the element
	private void search(Node current, int value){
		element_index++;
		if(current==null){
			System.out.ptintln("List is empty");
			return;
		}
		else{
			if(current.value==value){
				System.out.println(value+" found");
				System.out.println("\n"+ "Element is at index : " + element_index+"th");
			}
			else{
				search(current.next,value);
			}
		}
	}
	
	
	public void delete(int value){
		if(head==null){
			return;
		}
		else{
			if(head.value==value){
				Node temp;
				temp=head;
				head = temp.next;
				temp.next=null;
				size--;
				return;
			}
		}
		delete(head,value);
	}
	private void delete(Node current, int value){
		if(current==null){
			return;
		}
		else{
			if(current.next.value==value){
				Node temp;		
				temp=current.next;
				
				current.next = current.next.next;
				temp.next=null;
				size--;
				return;
			}
			delete(current.next,value);
		}
	}
}
