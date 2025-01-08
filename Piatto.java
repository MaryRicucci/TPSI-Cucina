public abstract class Piatto {
    private String Nome, Categoria;
    private Ingrediente[] Ingredienti;
    private int TempoDiCottura, Calorie;
    private double Prezzo;

    public Piatto(String Nome, String Categoria, Ingrediente [] Ingredienti , int TempoDiCottura, int Calorie, double Prezzo) {
     this.Nome = Nome ;
     this.Categoria = Categoria ;
     this.TempoDiCottura = TempoDiCottura ;
     this.Calorie = Calorie ;
     this.Prezzo = Prezzo ;
     for (int i = 0 ; i<Ingredienti.length ; i++) {
         this.Ingredienti[i]= Ingredienti[i] ;
     }
    }

    public String StampaPiatto() {
        return "Nome del piatto_ " + Nome + "\nCategoria: " + Categoria + "\nPrezzo: " + Prezzo + "\nIngredienti: " + Ingredienti + "\nCalorie: " + Calorie + "\nTempo di cottura: " + TempoDiCottura;
    }

    public abstract void Prepara();

    public int CalcolaCalorieTotali(int length) {
        for (int i = 0; i < length; i++) {
            Calorie = Calorie + (Ingredienti[i].getCalorie()) ;
        }
        return Calorie;
    }

    public void RimuoviIngrediente(String Ingrediente) {
        for (int i = 0; i < Ingredienti.length; i++) {
            if (Ingredienti[i].getNome().equals(Ingrediente)) {
                Ingredienti[i].setNome(null) ;
            }
        }

    }
    public String getCategoria () {
        return Categoria ;
    }
    public String getNome () {return Nome;}
    public void setNome (String Nome) {
        this.Nome = Nome ;
    }
    public void setCategoria (String categoria) {
        Categoria = categoria ;
    }
    public void setIngredienti (Ingrediente [] ingredienti) {
        this.Ingredienti = ingredienti ;
    }
    public void setTempoDiCottura (int Tcottura) {
        TempoDiCottura = Tcottura ;
    }
    public void setPrezzo (double p) {
        Prezzo = p ;
    }
    public double getPrezzo () {return Prezzo;}

}
