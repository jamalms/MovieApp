
public class MovieList {
	
	//Reference to first and last Nodes
	private Node first;
	private Node last;
	
	// check the linkedList Size
	public int size() {
		int size = 0;
		Node current = first;
		while(current != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	// get_average – this method should return the average star rating of all movies stored
	//within the LinkedList
	
	public double get_avg() {
		int avg_satrs = 0;
		int counter = 0;
		Node current = first;
		while(current != null) {
			if(current.movie.rating != 0) {
				avg_satrs+= current.movie.rating;
				counter++;
			}
			current = current.next;
		}
		avg_satrs = avg_satrs / counter;
		return avg_satrs;
	}
	
	//isEmpty – this method should check if the linkedlist is empty and return a boolean
	public boolean isEmpty() {
		return first == null;
	}
	
	//add - this method should allow the addition of a new Node into the linkedlist at the
	//end of the current list 
	public void add(Movie elem) {
		if(isEmpty()) {
			Node insertion = new Node(elem);
			first = insertion;
			last = first;
		}else {
			last.next = new Node(elem);
			last = last.next;
		}
	}
	
	// remove - this method removes the first occurrence of the target Node. The target is
	//defined by Movie Title. You should take into account when no movie title is found
	public void remove(int index){
		  if(index < 0 || index >=size()){
		    throw new IndexOutOfBoundsException();
		  }
		  if(index == 0){
		    first = first.next;
		    if(first == null){
		      last = null;
		    }
		  }else{
		    Node pred = first;
		    for(int k =1;k <=index-1;k++){
		      pred = pred.next;
		    }
		    pred.next = pred.next.next;
		    if(pred.next == null){
		      last = pred;
		    }
		  }
		}

	public void remove(String target) {
		Node current = first;
		int index = 0;
		while(current !=null && !current.movie.title.equals(target)) {
			current = current.next;
			index++;
		}
		if(current != null && current.movie.title.equals(target)) {
			remove(index);
			
		}
		//return; 
	}
	

	
	
	
	
	public String toString() {
		
		String display = "Movies\n";
		display += "------------------------\n";
		Node current = first;
		while(current != null) {
			display += current.toString()+"\n";
			current = current.next;
		}
		display += "------------------------\n";
		return display;
	}
}
