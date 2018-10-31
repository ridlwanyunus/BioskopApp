package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Database;
import Model.Film;
import Model.Validation;
import apps.Dummy;

public class Views {
	
	public void viewLogin() {
		System.out.println("APLIKASI BIOSKOP");
		System.out.println("Silahkan login ke dalam aplikasi");
		System.out.println("1. Login sebagai admin");
		System.out.println("2. Login sebagai customer");
		System.out.println("3. Exit");
	}
	
	public void viewLoginForm() {
		Validation validation = new Validation();
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		System.out.println("Login Form");
		System.out.print("Username : ");
		username = scanner.next();
		System.out.print("Password : ");
		password = scanner.next();
		boolean flag = validation.isAdmin(username, password);
	}
	
	public Film viewInputFilm() {
		Film film = new Film();
		Scanner scanner = new Scanner(System.in);
		String strInput;
		int intInput;
		System.out.println("MENU ADMIN INPUT FILM ");
		System.out.print("Judul : ");
		strInput = scanner.nextLine();
		film.setJudul(strInput);
		System.out.print("Genre : ");
		strInput = scanner.nextLine();
		film.setGenre(strInput);
		System.out.print("Sinopsi : ");
		strInput = scanner.nextLine();
		film.setSinopsis(strInput);
		System.out.print("Penulis : ");
		strInput = scanner.nextLine();
		film.setPenulis(strInput);
		System.out.print("Produksi : ");
		strInput = scanner.nextLine();
		film.setProduksi(strInput);
		System.out.print("Produser : ");
		strInput = scanner.nextLine();
		film.setProduser(strInput);
		System.out.print("Harga : ");
		intInput = scanner.nextInt();
		film.setHarga(intInput);
		return film;
	}
	
	public void viewConfirmation() {
		System.out.print("Masukkan pilihan menu diatas : ");
	}
	
	public void viewRepeatation() {
		System.out.print("Ingin transaksi lagi ? [y/n] : ");
	}
	
	public void viewAdmin() {
		System.out.println("MENU ADMIN");
		System.out.println("Silahkan pilih menu dibawah ini");
		System.out.println("1. Input Film");
		System.out.println("2. Input Bioskop");
		System.out.println("3. Input Jadwal");
		System.out.println("4. Exit");
	}
	
	public void viewInputFilmOption() {
		System.out.println("MENU INPUT FILM");
		System.out.println("Silahkan pilih menu dibawah ini");
		System.out.println("1. Input Film");
		System.out.println("2. Edit Film");
		System.out.println("3. Delete Film");
		System.out.println("4. Lihat Film");
		System.out.println("5. Exit");
	}
	
	public void viewInputFilmEdit() {
		Scanner scanner = new Scanner(System.in);
		Database database = new Database();
		this.viewAvailableFilm();
		System.out.print("Masukkan index film yang akan diedit : ");
		int index = scanner.nextInt();
		Film film = database.getFilms().get(index);
		System.out.println("Pilih attribut yang akan di edit ");
		System.out.println("1. Judul Film");
		System.out.println("2. Penulis Film");
		System.out.println("3. Genre Film");
		System.out.println("4. Produksi Film");
		System.out.println("5. Produser Film");
		System.out.println("6. Sinopsis Film");
		System.out.println("7. Harga Film");
		System.out.print("Pilihan : ");
		int pilihan = scanner.nextInt();
		String strInput;
		int intInput;
		switch(pilihan) {
			case 1:
				System.out.println("Judul film lama : "+database.getFilms().get(index).getJudul());
				System.out.print("Judul film baru : ");
				strInput = scanner.nextLine();
				strInput = scanner.nextLine();
				database.getFilms().get(index).setJudul(strInput);
				break;
			case 2:
				System.out.println("Penulis film lama : "+database.getFilms().get(index).getPenulis());
				System.out.print("Penulis film baru : ");
				strInput = scanner.nextLine();
				strInput = scanner.nextLine();
				database.getFilms().get(index).setPenulis(strInput);
				break;
			case 3:
				System.out.println("Genre film lama : "+database.getFilms().get(index).getGenre());
				System.out.print("Genre film baru : ");
				strInput = scanner.nextLine();
				strInput = scanner.nextLine();
				database.getFilms().get(index).setGenre(strInput);
				break;
			case 4:
				System.out.println("Produksi film lama : "+database.getFilms().get(index).getProduksi());
				System.out.print("Produksi film baru : ");
				strInput = scanner.nextLine();
				strInput = scanner.nextLine();
				database.getFilms().get(index).setProduksi(strInput);
				break;
			case 5:
				System.out.println("Produser film lama : "+database.getFilms().get(index).getProduser());
				System.out.print("Produser film baru : ");
				strInput = scanner.nextLine();
				strInput = scanner.nextLine();
				database.getFilms().get(index).setProduser(strInput);
				break;
			case 6:
				System.out.println("Sinopsis film lama : "+database.getFilms().get(index).getSinopsis());
				System.out.print("Sinopsis film baru : ");
				strInput = scanner.nextLine();
				strInput = scanner.nextLine();
				database.getFilms().get(index).setSinopsis(strInput);
				break;
			case 7:
				System.out.println("Harga film lama : "+database.getFilms().get(index).getHarga());
				System.out.print("Harga film baru : ");
				intInput = scanner.nextInt();
				database.getFilms().get(index).setHarga(intInput);
				break;
		}
	}
	
	public int viewInputFilmDelete() {
		Scanner scanner = new Scanner(System.in);
		this.viewAvailableFilm();
		System.out.print("Masukkan index film yang akan dihapus : ");
		int index = scanner.nextInt();
		return index;
	}
	
	public void viewSelectedFilm(ArrayList<Film> films) {
		
		for(Film film : films) {
			System.out.println(""
					+film.getJudul()+" | "
					+film.getPenulis()+" | "
					+film.getGenre()+" | "
					+film.getProduksi()+" | "
					+film.getProduser()+" | "
					+film.getSinopsis()+" | "
					+film.getHarga()+" | ");
		}
	}
	
	public void viewAvailableFilm() {
		Database database = new Database();
		ArrayList<Film> films = database.getFilms();
		int id = 0;
		System.out.println(""
				+"ID"+" | "
				+"Judul	"+" | "
				+"Penulis "+" | "
				+"Genre	"+" | "
				+"Produksi "+" | "
				+"Produser "+" | "
				+"Sinopsis "+" | "
				+"Harga "+" | ");
		
		for(Film film : films) {
			System.out.println(""
					+id+" | "
					+film.getJudul()+" | "
					+film.getPenulis()+" | "
					+film.getGenre()+" | "
					+film.getProduksi()+" | "
					+film.getProduser()+" | "
					+film.getSinopsis()+" | "
					+film.getHarga()+" | ");
			id++;
		}
	}
	
	public void viewFinished() {
		System.out.println("Shutdown bioskop application.");
	}
	
	public void checkerPlus() {
		Database database = new Database();
		Dummy dummy = new Dummy();
		for(Film film : dummy.setMoreDummyFilm()) {
			database.addFilm(film);
		}
		
	}
	
	public void checkerMinus() {
		Database database = new Database();
		for(int i=3; i<=5; i++) {
			database.deleteFilm(i);
		}
		
	}
}
