public class Dolce extends Piatto {
    public Contorno (String Nome, String Categoria, Ingrediente [] Ingredienti , int TempoDiCottura, int Calorie, double Prezzo) {
        super(Nome,Categoria,Ingredienti,TempoDiCottura,Calorie,Prezzo);
    }
    @Override
    public String StampaPiatto () {
        return super.StampaPiatto() ;
    }
    public void Prepara () {
        System.out.print ("Dolce in preparazione...") ;
    }
    @Override
    public int CalcolaCalorieTotali (int length) {
        return super.CalcolaCalorieTotali(length);
    }

    @Override
    public String getCategoria() {
        return super.getCategoria();
    }

    @Override
    public void RimuoviIngrediente(String Ingrediente) {
        super.RimuoviIngrediente(Ingrediente);
    }
}

