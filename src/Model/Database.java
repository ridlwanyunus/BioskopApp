package Model;

import java.util.ArrayList;
import java.util.List;

import apps.Dummy;

public class Database {
	private static ArrayList<Film> films = new ArrayList<Film>();
	
	public void addFilm(Film film) {
		this.films.add(film);
		
	}
	
	public void deleteFilm(int index) {
		this.films.remove(index);
		
	}

	public ArrayList<Film> getFilms() {
		return this.films;
	}

	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}
	
}
