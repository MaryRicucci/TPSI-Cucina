public class Ingrediente {
    private String Nome , Quantita ;
    private int Calorie ;

    public Ingrediente (String Nome, int Calorie, String Quantita) {
        this.Nome = Nome ;
        this.Calorie = Calorie ;
        this.Quantita = Quantita ;
    }
    public void setNome (String Nome) {
        this.Nome = Nome ;
    }
    public String getNome () {
        return Nome ;
    }
    public void setCalorie (int Calorie) {
        this.Calorie = Calorie ;
    }
    public int getCalorie () {
        return Calorie ;
    }
    public void setQuantita (String Quantita) {this.Quantita=Quantita;}
    public String getQuantita () {return Quantita;}
} 
