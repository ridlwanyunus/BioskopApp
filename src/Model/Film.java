package Model;

public class Film {
	private String judul;
	private String genre;
	private String produser;
	private String penulis;
	
	public Film() {
	}
	public Film(
		 String judul,
		 String genre,
		 String produser,
		 String penulis,
		 String produksi,
		 String sinopsis,
		 int harga
	 ) {
		this.judul = judul;
		this.genre = genre;
		this.produser = produser;
		this.penulis = penulis;
		this.produksi = produksi;
		this.sinopsis = sinopsis;
		this.harga = harga;
	}
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getProduser() {
		return produser;
	}
	public void setProduser(String produser) {
		this.produser = produser;
	}
	public String getPenulis() {
		return penulis;
	}
	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}
	public String getProduksi() {
		return produksi;
	}
	public void setProduksi(String produksi) {
		this.produksi = produksi;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	private String produksi;
	private String sinopsis;
	private int harga;
	
}
