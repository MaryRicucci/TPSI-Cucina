public class Ristorante {
    private String Nome, NumeroTelefono , Titolare ;
    private Menu menu ;
    private Ordine ordine;
    public Ristorante (String Nome, String NumeroTelefono, String Titolare) {
        this.Nome = Nome ;
        this.NumeroTelefono = NumeroTelefono ;
        this.Titolare = Titolare ;
        menu = new Menu () ;
        ordine = new Ordine () ;
    }

    public void StampaMenu () {
       menu.StampaMenu();
    }
    public void AggiungiPiattoMenu (String Categoria, Piatto piatto) {
        switch (Categoria) {
            case "Primo" :
                menu.AggiungiPrimo((Primo) piatto);
                break ;

            case "Secondo":
                menu.AggiungiSecondo((Secondo) piatto);
                break ;
            case "Contorno":
                menu.AggiungiContorno((Contorno)piatto);
                break ;
            case "Dolce":
                menu.AggiungiDolce((Dolce)piatto);
                break ;
            default:
                menu.AggiungiSugo ((Sugo) piatto) ;
                break ;
        }
    }
    public void setNome (String Nome) {
        this.Nome = Nome;
    }
    public void setNumeroTelefono (String Numero) {
        NumeroTelefono = Numero ;
    }
    public void setTitolare (String tit) {
        Titolare = tit ;
    }

    public  void OrdinaPiatto (String Categoria, String Piatto) {
        int r ;
        double Costo ;
        r=menu.ControllaPiatto(Categoria,Piatto) ;
        if (r!=-1) {
            Costo = menu.getCosto (r,Categoria) ;
            ordine.AggiungiPiatto(Nome,Costo);
            System.out.print ("Piatto ordinato!") ;
        }
    }
    public void StampaOrdine () {
        ordine.RiepilogoOrdine();
    }
    public String PagaPasto () {
        ordine.RiepilogoOrdine();
        return ordine.PagaPasto();
    }
    public String StampaRistorante () {
        return "Nome: "+Nome+"\nTitolare: "+Titolare+"\nNumero di telefono: "+NumeroTelefono+"\nMenù: "+menu ;
    }
    public String getNome () {return Nome;}
}
