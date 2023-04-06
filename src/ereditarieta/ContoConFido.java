package ereditarieta;

public class ContoConFido extends ContoBancario {
    private double scoperto=0;
    private double fido=1000;
    
    public ContoConFido(String numero) {
      super(numero);
      //fido = 1000;
    }
    
    public ContoConFido(String numero, double saldo) {
      super(numero,saldo);
    }
    
    public ContoConFido(String numero, double saldo, double fido) {
      super(numero,saldo);
      this.fido = fido;
    }
    
    public double getFido(){
      return fido;
    }
    
    public double getScoperto(){
      return scoperto;
    }
    
    @Override
    public String toString(){
      return super.toString()+" Fido: "+fido+" Scoperto: "+scoperto;
    }
    
    public void deposita(double quanto){}
    
    public boolean preleva(double quanto){
        if(quanto<=getSaldo()){
          super.preleva(quanto);
          return true;
        }
        if(quanto<=getSaldo()+fido-scoperto){
          double residuo = quanto - getSaldo();
          super.preleva(getSaldo());
          scoperto = scoperto + residuo;
          return true;
        }
        return false;
    }
}