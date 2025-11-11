package Collections;
    import java.util.LinkedList;
    //Efficient Insertion and Deletion & Allow Duplicated & No Thread Safe
    //Adding elements at Beginning and Middle is faster compared to Array List
  

    public class LinkedListExample {
    	
    	  public void linkedlistforloop() {
    		  
    		  LinkedList<Integer> linkedlist = new LinkedList<Integer>();
    		  linkedlist.add(21);
    		  linkedlist.add(11);
    		  linkedlist.add(12);
    		  linkedlist.add(13);
    		  linkedlist.add(14);
    		  linkedlist.add(15);
    		  linkedlist.add(15);
    		  
    		  for(int i=0;i<linkedlist.size();i++) {
    			  System.out.println("Display the List of Integers:"+linkedlist.get(i));
    		  }
    	    	
    	    }
    	  
    	  public void foreachloopiteration() {
    		  LinkedList<String> linkedlist = new LinkedList<String>();
    		  linkedlist.add("A");
    		  linkedlist.add("B");
    		  linkedlist.add("G");
    		  linkedlist.add("T");
    		  linkedlist.add("Z");
    		  
    		  for(String str:linkedlist) {
    			  System.out.println(str);
    		  }
    		  
    	  }
        public static void main(String[] args) {
        	
        	LinkedListExample obj = new LinkedListExample();
        	//obj.linkedlistforloop();
        	obj.foreachloopiteration();
        	
            LinkedList<String> names = new LinkedList<>();
            names.add("Alice");
            names.add("Bob");
            names.addFirst("Charlie"); // Adds to the beginning
            names.addLast("David"); // Adds to the end

            System.out.println("Linked List: " + names); // Output: [Charlie, Alice, Bob, David]

            names.removeFirst(); // Removes Charlie
            System.out.println("After removing first: " + names); // Output: [Alice, Bob, David]
            
            names.removeLast();
            System.out.println("After Removing Last:"+names);
            
            names.addFirst("Ashok");
            System.out.println("After adding First:"+names);
            
            names.addLast("Kumar");;
            System.out.println("After adding last:"+names);
            
            names.getFirst();
            System.out.println("Get first Name:"+names.getFirst());
            
            names.getLast();
            System.out.println("Get Last Name:"+names.getLast());
            
            names.removeFirstOccurrence("Bob");
            System.out.println("Get the Names:"+names);
            
            //names.pollFirst();
            //System.out.println(names);
            
            //names.pollLast();
            //System.out.println(names);
            
            //names.remove();
            //System.out.println(names);
        }
    }