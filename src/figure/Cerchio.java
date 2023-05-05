package figure;

public class Cerchio extends Figura {
	
	public Cerchio( double raggio ){
		super( raggio );
	}
	
	public Cerchio( Cerchio c ){
		super( c.getDimensione() );
	}
	
	public double getRaggio(){ return getDimensione(); }
	
	@Override
	public double perimetro(){
		return 2*Math.PI*getDimensione();
	}//perimetro
	
	@Override
	public double area(){
		double r=getDimensione();
		return r*r*Math.PI;
	}//area
	

	@Override
	public boolean equals( Object o ){
		if( !(o instanceof Cerchio) ) return false;
		if( o==this ) return true;
		Cerchio c=(Cerchio)o;
		return super.getDimensione()==c.getDimensione();
	}//equals
	
	@Override
	public String toString(){
		return "Cerchio di raggio= "+getDimensione();
	}//toString


}//Cerchio
