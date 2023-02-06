package esempi;

public class Lampadina {
	
	private boolean stato;
	private boolean sonoRotta;
	private int numMaxClick;
	private int numClickEffettuati;
	
	public Lampadina(int numMaxClick) {
		this.numMaxClick = numMaxClick;
		this.sonoRotta = false;
		this.numClickEffettuati = 0;
		this.stato = false; //spenta
	}
	
	public boolean click() {
		this.numClickEffettuati++;
		if(this.stato){//accesa
			this.stato = false; //spegni lampadina
		}else {
			this.stato = true; //accendi lampadina
		}
		
		if(this.numClickEffettuati == this.numMaxClick) {
			this.sonoRotta = true;
		}
		return this.stato;
	}
	
	public boolean sonoRotto() {
		return this.sonoRotta;
	}
	
	public String toString() {
		if(this.sonoRotta) {
			return "Sono rotta";
		}else {
			if(this.stato) {
				return "Sono accesa";
			}else{
				return "Sono spenta";
			}
		}
	}
	
	public static void main(String[] args) {
		Lampadina l = new Lampadina(10);
		while(!l.sonoRotto()) {
			l.click();
			System.out.println(l);
		}
	}

}
	
