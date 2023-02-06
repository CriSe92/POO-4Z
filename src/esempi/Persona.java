package esempi;

public class Persona {
    private String nome;
    private int eta;
    private String sesso;
    private String professione;
    
    public Persona(String nome, int eta, String sesso, String professione){
        this.nome=nome;
        this.eta=eta;
        this.sesso=sesso;
        this.professione=professione;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessione() {
        return professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    
    public String chiSei(){
        return "Sono una persona di nome: "+nome+", sesso:"+sesso+", età: "+eta+", professione: "+professione;
    }
    
    public static void main(String[] args){
        Persona p=new Persona("Rossi Mario",30,"Maschile","Impiegato");
        System.out.println(p.chiSei());
    }
}