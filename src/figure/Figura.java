package figure;

public abstract class Figura {
	private double dimensione;
	
	public Figura( double dimensione ){
		if( dimensione<=0 ) throw new IllegalArgumentException();
		this.dimensione=dimensione;
	}
	
	public void setDimensione(double dim){this.dimensione=dim;}
	
	public double getDimensione(){ return dimensione; }

	public abstract double perimetro();
	
	public abstract double area();

}//Figura
