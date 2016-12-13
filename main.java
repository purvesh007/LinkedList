package double_linklist;

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
