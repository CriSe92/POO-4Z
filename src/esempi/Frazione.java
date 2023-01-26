package esempi;

public class Frazione {
   
   private int numeratore;
   private int denominatore;
   
  public Frazione(){
      this.numeratore = 0;
      this.denominatore = 1;
   }
   
   public Frazione(int num, int den){
      if(den==0){
        System.err.println("Denominatore non valido!");
        System.exit(-1);
      }
      this.numeratore = num;
      this.denominatore = den;
   }
   
   public int getNumeratore(){
     return numeratore;
   }
   
   public int getDenominatore(){
     return denominatore;
   }
   
   public void setNumeratore(int num){
     this.numeratore = num;
   }
   
   public void setDenomionatore(int den){
      if(den==0){
        System.err.println("Denominatore non valido!");
        System.exit(-1);
      }
     this.denominatore = den;
   }
   
   public Frazione reciproca(){
     return new Frazione(this.denominatore,this.numeratore);
   }
   
   public Frazione opposta(){
     return new Frazione(-1*this.numeratore,this.denominatore);
   }
   
   public Frazione somma(Frazione f){
     int m = mcm(this.denominatore,f.denominatore);
     int nuovo_num = this.numeratore*m/this.denominatore + f.numeratore*m/f.denominatore;
     return new Frazione(nuovo_num,m);
   }
   
   public Frazione sottrai(Frazione f){
      return this.somma(f.opposta());
   }
   
   public Frazione moltiplica(Frazione f){
     return new Frazione(this.numeratore*f.numeratore,this.denominatore*f.denominatore);
   }
   
   public Frazione dividi(Frazione f){
     return new Frazione(this.numeratore*f.denominatore,this.denominatore*f.numeratore);
   }
   
   public Frazione semplifica(){
     int m = MCD(this.numeratore, this.denominatore);
     return new Frazione(this.numeratore/m,this.denominatore/m);
   }
   
   private int MCD(int a, int b){
     if(a%b==0){
       return b;
     }else{
       return MCD(b,a%b);
     }
   }
   
   /*
    * private int MCD_iterativo(int a, int b) {
		if(a<b) {
			int t = a;
			a = b;
			b = t;
		}
	    int r;
	    while(b != 0){
	         r = a % b;
	         a = b; 
	         b = r;
	    }
	    return a; 
	}
    * */
   
	private int mcm(int a, int b) {
		return (a*b)/MCD(a,b);
	}
   
   public String toString(){
     return this.numeratore+"/"+this.denominatore;
   }
   
   public static void main(String[] args){
     Frazione f1 = new Frazione(5,3);
     System.out.println(f1);
     Frazione f2 = f1.reciproca();
     System.out.println(f2.toString());
   }
   
}
