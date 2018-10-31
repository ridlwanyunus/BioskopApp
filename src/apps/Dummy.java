package apps;

import java.io.LineNumberInputStream;
import java.util.ArrayList;

import Model.Database;
import Model.Film;

public class Dummy {
	public void setDummyFilm() {
		Film film = new Film(
				  "judul",
				  "genre",
				  "produser",
				  "penulis",
				  "produksi",
				  "sinopsis",
				  1000
		);
		Database db = new Database();
		db.addFilm(film);
	}
	
	public Film setOneDummyFilm() {
		Film film = new Film(
				  "judul",
				  "genre",
				  "produser",
				  "penulis",
				  "produksi",
				  "sinopsis",
				  1000
		);
		return film;
	}
	
	public ArrayList<Film> setMoreDummyFilm() {
		ArrayList<Film> listFilm = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			Film film = new Film(
					  "judul"+i,
					  "genre"+i,
					  "produser"+i,
					  "penulis"+i,
					  "produksi"+i,
					  "sinopsis"+i,
					  (1000+i)
			);
			listFilm.add(film);
		}
		
		return listFilm;
	}
}
