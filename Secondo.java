public class Secondo extends Piatto {
    public Secondo (String Nome, String Categoria, Ingrediente [] Ingredienti , int TempoDiCottura, int Calorie, double Prezzo) {
        super(Nome,Categoria,Ingredienti,TempoDiCottura,Calorie,Prezzo) ;
    }
    public void Prepara () {
        System.out.print ("Secondo in preparazione") ;
    }

    @Override
    public void RimuoviIngrediente(String Ingrediente) {
        super.RimuoviIngrediente(Ingrediente);
    }
    @Override
    public String StampaPiatto () {
        return super.StampaPiatto () ;
    }
    @Override
    public String getCategoria () {
        return super.getCategoria() ;
    }
    public int CalcolaCalorieTotali (int length) {
        return super.CalcolaCalorieTotali(length) ;
    }

}
