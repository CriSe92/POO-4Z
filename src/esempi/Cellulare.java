package esempi;

public class Cellulare {

	private int numSms;
	private int secChiamata;
	private Batteria b;
	
	public Cellulare() {
		numSms = 0;
		secChiamata = 0;
		b = new Batteria();
	}
	
	public Cellulare(int capacitaBatteria) {
		numSms = 0;
		secChiamata = 0;
		b = new Batteria(capacitaBatteria);
	}
	
	public Cellulare(int ns, int sc, Batteria b) {
		numSms = ns;
		secChiamata = sc;
		this.b = new Batteria(b);
	}
	
	public int getLivelloCarica() {
		return b.getLivelloCarica();
	}
	
	public int getNumSms() {
		return  numSms;
	}
	
	public int getNumChiamate() {
		return secChiamata;
	}
	
	public boolean sms() {
		if(b.getLivelloCarica()>0) {
			numSms++;
			b.consuma();
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Cellulare c = new Cellulare(10);
		//Mando 10 sms
		boolean okSms;
		for(int i=0; i<10; i++) {
			okSms = c.sms();
			if(okSms) {
				System.out.println("Sms inviato correttamente!");
			}else {
				System.out.println("Sms non inviato!");
			}
		}
	}
}
