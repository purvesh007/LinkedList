public class main {

	public static void main(String[] args) {
		
		int value = 2; // just hardcode value to be inserted in LinkedList, can be change to user input mode
		
		linkedlist l = new linkedlist();
		
		for(int i=0;i<5;i++){
			l.insert(l.gethead(), value);
			value++;
		}
		System.out.println("size "+ l.getsize());
		
		/*
		Following methods are available with LinkedList
		-> print() : will print whole linkdedlist
			l.print();
		-> search() : search an element in list,return boolean output (Element found or not), also return index of the element if found!
			l.search("value to be search");
		-> delete() : delete element from list
			l.delete("value of element to be deleted");
		-> print() : print whole LinkedList
			l.print();
		*/
	}
}
