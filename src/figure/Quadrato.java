package figure;


public class Quadrato extends Figura {
	public Quadrato( double lato ){
		super(lato);
	}

	public double getLato(){
		return super.getDimensione(); 
	}
	
	public double perimetro(){ return super.getDimensione()*4; }
	
	public double area(){
		double l=super.getDimensione();
		return l*l;
	}//area
	
	public String toString(){
		return "Quadrato di lato="+super.getDimensione();
	}//toString
	
	public boolean equals( Object o ){
		if( !(o instanceof Quadrato) ) return false;
		if( o==this ) return true;
		Quadrato q=(Quadrato)o;
		return super.getDimensione()==q.getDimensione();
	}//equals

}//Quadrato
