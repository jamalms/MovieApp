
public class MovieApp {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Interstellar", "theory of relativity", "Science Fiction", 280);
		Movie movie2 = new Movie("6 Underground", "excited", "Crime", 220);
		Movie movie3 = new Movie("Shooter", "good", "Action", 230);
		Movie movie4 = new Movie("Red Notice", "excited", "Drama", 290);
		Movie movie5 = new Movie("Fatherhood", "funny", "Commedy", 230);
		Movie movie6 = new Movie("Interstellar", "theory of relativity", "Science Fiction", 280);
		
		
		MovieList myList = new MovieList();
		myList.add(movie1);
		myList.add(movie2);
		myList.add(movie3);
		myList.add(movie4);
		myList.add(movie5);
		myList.add(movie6);
		
		movie1.setRating(5);
		movie2.setRating(4);
		movie3.setRating(3);
		movie4.setRating(5);
		movie5.setRating(3);
		movie6.setRating(3);
		
		myList.remove(5);
	//myList.remove("movie1");
		System.out.println(myList);
		System.out.println("The average stars of the movies is: " + myList.get_avg());
		
		System.out.println("The number of films in the list is: " +myList.size());

	}

}
