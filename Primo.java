public class Primo extends Piatto {
    private Sugo sugo ;
   private String TipoDiPasta ;
   private int CalorieTipoPasta ;
    public Primo (String Nome, String Categoria, Ingrediente [] Ingredienti , int TempoDiCottura, int Calorie, double Prezzo,Sugo sugo) {
        super(Nome,Categoria,Ingredienti,TempoDiCottura,Calorie,Prezzo) ;
        this.sugo = sugo ;
    }
    public void ScegliSugo (String Sugo) {

    }
    public void ScegliTipoDiPasta (String TipoPasta) {
        TipoDiPasta = TipoPasta ;
    }
    @Override
    public String getCategoria () {
        return super.getCategoria() ;
    }
    @Override
    public String StampaPiatto () {
        return super.StampaPiatto()+"\nTipo di pasta: "+TipoDiPasta+" calorie della pasta: "+CalorieTipoPasta ;
    }


    public void Prepara () {
        System.out.print ("Il piatto è in preparazione") ;
    }
    @Override
    public int CalcolaCalorieTotali (int length) {
        return super.CalcolaCalorieTotali(length)+CalorieTipoPasta;
    }
    public void setCalorieTipoPasta (int Cal) {
        CalorieTipoPasta = Cal ;
    }

    @Override
    public void RimuoviIngrediente(String Ingrediente) {
        super.RimuoviIngrediente(Ingrediente);
    }

}
