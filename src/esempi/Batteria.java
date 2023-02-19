package esempi;

public class Batteria {
	private int capacitaCarica;
	private int livCarica;
	
	//costruttore di default
	public Batteria() {
		capacitaCarica = 100;
		livCarica = 50;
	}
	
	//costruttore normale
	public Batteria(int cc) {
		capacitaCarica = cc;
		livCarica = cc/2;
	}
	
	public Batteria(Batteria b) {
		this.capacitaCarica = b.capacitaCarica;
	}
	
	public int getLivelloCarica() {
		return livCarica;
	}
	
	public int getCapacitàCarica() {
		return capacitaCarica;
	}
	
	public void consuma() {
		if(livCarica>0) {
			livCarica--;
		}else {
			System.out.println("Batteria scarica!");
		}	
	}
	
	public void ricarica() {
		if(livCarica<capacitaCarica) {
			livCarica++;
		}else {
			System.out.println("Batteria carica!");
		}
			
	}
	
	public String toString() {
		return "Capacità di carica: "+capacitaCarica+"\n"+
				"Livello carica: "+livCarica;
	}
	
	public static void main(String[] args) {
		Batteria b1 = new Batteria(15);
		System.out.println(b1);
		for(int i=0; i<10; i++) {
			b1.consuma();
		}
		System.out.println(b1);
		
		for(int i=0; i<b1.getCapacitàCarica(); i++) {
			b1.ricarica();
		}
		System.out.println(b1);
	}
}
