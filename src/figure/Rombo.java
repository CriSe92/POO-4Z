package figure;

public class Rombo extends Figura{
	private double diagonaleMaggiore;

	public Rombo( double diagonaleMinore, double diagonaleMaggiore ){
		super( diagonaleMinore );
		if( diagonaleMaggiore<=0 ) throw new IllegalArgumentException();
		this.diagonaleMaggiore=diagonaleMaggiore;
	}
	
	public Rombo( Rombo r ){
		super( r.getDimensione() );
		this.diagonaleMaggiore=r.diagonaleMaggiore;
	}
	
	public double getDiagionaleMinore(){ return getDimensione(); }
	
	public double getDiagonaleMaggiore(){ return diagonaleMaggiore; }
	
	public double getLato(){
		double diagonaleMinore=getDimensione();
		return Math.sqrt( (diagonaleMaggiore/2)*(diagonaleMaggiore/2)+
				          (diagonaleMinore/2)*(diagonaleMinore/2) );
	}//getLato
	
	@Override
	public double perimetro(){
		double lato=getLato();
		return 4*lato;
	}//perimetro
	
	@Override
	public double area(){
		double diagonaleMinore=getDimensione();
		return (diagonaleMinore*diagonaleMaggiore)/2;
	}//area
	
	@Override
	public boolean equals( Object o ){
		if( !(o instanceof Cerchio) ) return false;
		if( o==this ) return true;
		Rombo r=(Rombo)o;
		return super.getDimensione()==r.getDimensione() &&
			diagonaleMaggiore==r.diagonaleMaggiore;
	}//equals

	public String toString(){
		return "Rombo: diag minore="+super.getDimensione()+"diag maggiore="+diagonaleMaggiore;
	}//toString
}//Rombo
