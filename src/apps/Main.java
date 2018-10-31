package apps;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Database;
import Model.Film;
import Model.Process;
import View.Views;

public class Main {
	public static void main(String[] args) {
		Database db = new Database();
		Dummy dummy = new Dummy();
		Views views = new Views();
		Process process = new Process();
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		boolean isFirstLayerFinished = false;
		while(isFirstLayerFinished == false) {
			views.viewLogin();
			views.viewConfirmation();
			option = scanner.nextInt();
			if(option == 1) {
				process.processAdminForm(option);
			}else
			if(option == 2) {
				isFirstLayerFinished = false;
			}else
			if(option == 3) {
				
				isFirstLayerFinished = true;
			}
			
		}
		views.viewFinished();
	}
	
}
