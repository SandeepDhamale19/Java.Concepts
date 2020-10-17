package com.javaconcepts.polymorphism;

/**
 * Polymorphism:
 * 
 * It is an OOP (Object Oriented Programming) concept which allows actions to
 * act differently based on the actual objects that the action is being
 * performed on.
 * 
 * @author Sumon Dey
 *
 */
public class MoviePlayer_MainProgram {

	public static void main(String[] args) {

		for (int movieCounter = 1; movieCounter <= 5; movieCounter++) {
			Movie myMoviePlayer = randomMoviePlaylist();
			System.out.println("Movie #" + movieCounter + ". " + myMoviePlayer.getMovieName() + ", with the plot: "
					+ myMoviePlayer.moviePlot());
		}
	}

	private static Movie randomMoviePlaylist() {
		int randomMovie = (int) (Math.random() * 3) + 1;
		switch (randomMovie) {
		case 1:
			return new IronMan();
		case 2:
			return new Avengers();
		case 3:
			return new CityLights();
		}
		return null;
	}

}
