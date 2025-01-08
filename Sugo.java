public class Sugo extends Piatto {
    public Sugo(String Nome,String Categoria, Ingrediente [] Ingredienti , int TempoDiCottura, int Calorie, double Prezzo) {
        super(Nome,Categoria,Ingredienti,TempoDiCottura,Calorie,Prezzo) ;
    }

    @Override
    public String getCategoria() {
        return super.getCategoria() ;
}
    @Override
    public int CalcolaCalorieTotali (int length) {
        return super.CalcolaCalorieTotali(length);
    }
    @Override
    public void RimuoviIngrediente (String Ingrediente) {
        super.RimuoviIngrediente(Ingrediente);
    }
    public void Prepara () {
        System.out.print ("Sugo in preparazione...") ;
    }
    @Override
    public String StampaPiatto () {
        return super.StampaPiatto() ;
    }
}
