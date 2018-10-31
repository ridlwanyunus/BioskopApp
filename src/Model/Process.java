package Model;

import java.util.Scanner;

import Controller.Controller;
import View.Views;

public class Process {
	public Process() {
		
	}
	
	public boolean processAdminForm(int option) {
		Views views = new Views();
		views.viewLoginForm();
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);

		boolean isCompleted = false;
		while(isCompleted == false) {
			views.viewAdmin();
			views.viewConfirmation();
			int pilihan = scanner.nextInt();
			if(pilihan == 1) {
				boolean isFinished = false;
				while(isFinished == false) {
					views.viewInputFilmOption();
					views.viewConfirmation();
					pilihan = scanner.nextInt();
					isFinished = processInputFilm(pilihan);
				}
			}else
			if(pilihan == 2) {
				
			}else
			if(pilihan == 3) {

			}else
			if(pilihan == 4) {
				isCompleted = true;
			}
		}

		return true;
		
	}
	
	public boolean processInputFilm(int option) {
		Views views = new Views();
		Controller controller = new Controller();
		String again = "y";
		Scanner scanner = new Scanner(System.in);
		if(option == 1) {
			while(again.equals("y")) {
				controller.controllerViewInputFilm();
				views.viewRepeatation();
				again = scanner.next();
			}
		}else
		if(option == 2) {
			while(again.equals("y")) {
				controller.controllerViewInputFilmEdit();
				views.viewAvailableFilm();
				views.viewRepeatation();
				again = scanner.next();
			}
		}else
		if(option == 3) {
			while(again.equals("y")) {
				controller.controllerViewInputFilmDelete();
				views.viewAvailableFilm();
				views.viewRepeatation();
				again = scanner.next();
			}
		}else
		if(option == 4) {
			while(again.equals("y")) {
				views.viewAvailableFilm();
				views.viewRepeatation();
				again = scanner.next();
			}
		}else
		if(option == 5) {
			return true;
		}
		return false;
	}
}
