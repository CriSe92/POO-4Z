package figure;

public class Cilindro extends Cerchio implements FiguraSolida {
	
	private double altezza;
	
	public Cilindro(double h, double raggio) {
		super(raggio);
		if (h<=0) throw new IllegalArgumentException();
		this.altezza=h;
	}//Costruttore 1
	
	public Cilindro(Cilindro c) {
		super(c.getRaggio() );
		if( altezza<=0 ) throw new IllegalArgumentException();
		this.altezza=c.altezza;
	}//Costruttore di copia
	
	public double getAltezza() {return altezza;}
	
	public double perimetro() {throw new UnsupportedOperationException();}
	
	public double area() {return areaLaterale()+areaDiBase();}
	
	public double areaDiBase() {
		return Math.PI*super.getRaggio()*super.getRaggio();
	}//areaDiBase
	
	public double areaLaterale() {
		return 2*Math.PI*super.getRaggio()*altezza;
	}//getAltezza
	
	public double volume() {
		return Math.PI*altezza*getRaggio()*getRaggio();
	}//volume
	
	public String toString() {
		return "Cilindo avente per base un "+super.toString()+" e altezza %1.2f"+altezza;
	}//toString
	
	public boolean equals(Object o){
		if( !(o instanceof Cilindro) ) return false;
		if( o==this ) return true;
		Cilindro c=(Cilindro)o;
		return super.equals(c) && this.altezza == c.altezza;
	}//equals

//main di prova
	public static void main(String[] args) {
		Cilindro c1= new Cilindro(15,3);
		System.out.printf("Area totale di "+c1+": %1.2f%n",c1.area());
	}
}

