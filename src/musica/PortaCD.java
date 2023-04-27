package musica;

public class PortaCD {
    private int n;
    private CD[] scaffale;
    private int quantità = 0;
    
    public PortaCD(int nCd) {
        this.n=nCd;
        scaffale = new CD[n];
    }
    
    public CD getCD(int n) {
        if(n<0 || n>scaffale.length) {
            return null;
        }
        return scaffale[n];
    }
    
    public int setCd(CD cd, int n) {
        if(n<0 || n>scaffale.length) {
            return -1;
        }
        if(scaffale[n]!=null) {
            return -2;
        }
        scaffale[n] = cd;
        quantità ++;
        return n;
    }
    
    public int killCd(int n) {
        if(n<0 || n>scaffale.length) {
            return -1;
        }
        if(scaffale[n]==null) {
            return -2;
        }
        scaffale[n] = null;
        quantità --;
        return n;
    }
    
    public int getQuantità() {
        return quantità;
    }
    
    public int CercaCdperTitolo(String titolo) {
        for(int i=0;i<scaffale.length;i++) {
            if(scaffale[i]!=null && scaffale[i].getTitolo()==titolo) {
                return i;
            }
    }
    return -1;
    }
    
    public String toString() {
     String titoli="";
        for(int i=0; i<scaffale.length;i++) {
            if(scaffale[i]!=null) {
             titoli=titoli+scaffale[i].getTitolo()+"/n";
            }
        }
        return titoli;
    }
    
    public static void main(String[]args) {
     PortaCD p = new PortaCD(10);
     CD c = new CD("titolo1", "Pavarani", 5, 3 );
     p.setCd(c, 6);
     CD z = new CD("titolo2", "Musolino", 4, 2);
     p.setCd(z, 8);
     System.out.println(p);
    }
    

}
