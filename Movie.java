
public class Movie {
	
	public String title;
	public String discription;
	public String genre;
	public int duration;
	public int rating;
	
	
	

	public Movie(String title, String discription, String genre, int duration) {
		super();
		this.title = title;
		this.discription = discription;
		this.genre = genre;
		this.duration = duration;
		this.rating = 0;
		
		
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDiscription() {
		return discription;
	}




	public void setDiscription(String discription) {
		this.discription = discription;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public int getDuration() {
		return duration;
	}




	public void setDuration(int duration) {
		this.duration = duration;
	}




	public int getRating() {
		return rating;
	}




	public void setRating(int rating) {
		this.rating = rating;
	}

	//( title,  discription,  genre,  duration, ranting) {
	
	public String toString() {
		String output = "Movie Details\n";
		output += "Title : "+this.title+"\n";
		output += "Discription : "+this.discription+"\n";
		output += "Genre : "+this.genre+"\n";
		output += "Duration in minutes : "+this.duration+"\n";
		output += "Rating : "+this.rating+"\n";
		output += "-----------------------\n";
		return output;
	}

	//test toString method
	public static void main(String[] args) {
		Movie movie = new Movie("Interstellar", "theory of relativity", "Science Fiction", 280);
		movie.setRating(5);
		System.out.println(movie);
		
	}

}
