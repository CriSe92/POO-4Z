package musica;

public class CD {
	private String titolo, autore; 
	private int numeroBrani,durata;
	
	public CD(String titolo, String autore, int numoeroBrani, int durata) {
		this.titolo = titolo;
		this.autore = autore;
		this.numeroBrani = numoeroBrani;
		this.durata = durata;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getNumeroBrani() {
		return numeroBrani;
	}

	public void setNumeroBrani(int numeroBrani) {
		this.numeroBrani = numeroBrani;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String toString() {
		return "Titolo: "+this.titolo+"\n"+
		"Autore: "+this.autore+"\n"+
		"Numero brani: "+this.numeroBrani+"\n"+
		"Durata: "+this.durata;
	}
	
	public static void main(String[] args) {
		CD c1 = new CD("MioTitolo1","Cristina Serrao",10,120);
		CD c2 = new CD("MioTitolo2","Mario Rossi",15,150);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.getTitolo());
		c1.setTitolo("NuovoTitolo1");
		System.out.println("Questo è il CD dopo l'aggiornamento");
		System.out.println(c1);
	}
}
