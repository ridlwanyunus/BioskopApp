package Controller;

import Model.Database;
import Model.Film;
import View.Views;

public class Controller {

	
	public Controller() {
		
	}
	
	public void controllerViewInputFilm() {
		Views views = new Views();
		Film film = views.viewInputFilm();
		this.controllerViewInputFilmAdd(film);
	}
	public void controllerViewInputFilmAdd(Film film) {
		Database database = new Database();
		database.addFilm(film);
	}
	public void controllerViewInputFilmEdit() {
		Views views = new Views();
		views.viewInputFilmEdit();

	}
	public void controllerViewInputFilmDelete() {
		Views views = new Views();
		int index = views.viewInputFilmDelete();
		Database database = new Database();
		database.deleteFilm(index);
	}
}
