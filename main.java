package double_linklist;

/***
 * 
 * @author Purvesh
 * implementation of GENERIC Doubly linkedList 
 * @param <T>
 */

public class main {

	public static void main(String[] args) {
		
		 int value = 1;
		 String a = "Hello"; //just hardcoded value to be inserted into LinkedList
		 String b = "world"; //just hardcoded value to be inserted into LinkedList
		
		 doubly_linklist<String> d = new doubly_linklist<>();
		//d.gethead();
		
		for(int i=0;i<20;i++){
			d.insert(d.gethead(),a);
			value++;
		}
		
		System.out.println("Size is"+d.getsize());
		d.delete(a);
		System.out.println("size after delete"+d.getsize());
		d.print();
	}
}

/*
Following methods are available with LinkedList
		-> gethead() : will return head of List
			d.gethead();
		-> print() : will print whole linkdedlist
			d.print();
		-> insert(head of list, value to be inserted) : for inserting element into list
			d.insert(d.gethead(),"Hello");
		-> delete() : delete element from list
			d.delete("value of element to be deleted");
		-> print() : print whole LinkedList
			d.print();
*/
