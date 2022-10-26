
public class Node {
Movie movie;
Node next;

public Node(Movie movie, Node next) {
	this.movie = movie;
	this.next = next;
}
 public Node(Movie movie) {
	 this.movie = movie;
 }

 public String toString() {
	 return movie.toString();
 }


}
