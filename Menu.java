public class Menu {
    private Primo [] PrimiPiatti = new Primo [10];
    private Secondo [] SecondiPiatti = new Secondo [10] ;
    private Contorno [] Contorni = new Contorno [10] ;
    private Dolce [] Dolci = new Dolce [10] ;
    private Sugo [] Sughi = new Sugo [10] ;
    private Utility u = new Utility ();
    public Menu () {
       CreaMenu () ;
    }

    private void CreaMenu () {
        for (int i = 0; i<3; i++) {
            PrimiPiatti= u.getPrimi();
            SecondiPiatti= u.getSecondi() ;
            Contorni = u.getContorni () ;
            Dolci = u.getDolci() ;
            Sughi = u.getSughi () ;
        }
    }
    public void StampaMenu () {
        System.out.print(PrimiPiatti+"\n"+SecondiPiatti+"\n"+Contorni+"\n"+Dolci) ;
    }
    public void AggiungiPrimo (Primo primo) {
        int l=-1 ;
        for (int i = 0 ; i<PrimiPiatti.length; i++) {
            if (PrimiPiatti[i].equals(null)){
                l=i ;
            }
        }
        if (l>-1){ PrimiPiatti[l]= primo ; }
    }
    public void AggiungiSecondo (Secondo secondo) {
        int l=-1 ;
        for (int i = 0 ; i< SecondiPiatti.length; i++) {
            if (SecondiPiatti[i].equals(null)){
                l=i ;
            }
        }
        if (l>-1){ SecondiPiatti[l]= secondo ; }
    }
    public void AggiungiContorno (Contorno contorno) {
        int l=-1 ;
        for (int i = 0 ; i<Contorni.length; i++) {
            if (Contorni[i].equals(null)){
                l=i ;
            }
        }
        if (l>-1){ Contorni[l]= contorno ; }
    }
    public void AggiungiDolce (Dolce dolce) {
        int l=-1 ;
        for (int i = 0 ; i<Dolci.length; i++) {
            if (Dolci[i].equals(null)){
                l=i ;
            }
        }
        if (l>-1){ Dolci[l]= dolce ; }
    }
    public void AggiungiSugo (Sugo sugo) {
        int l=-1 ;
        for (int i = 0 ; i<Sughi.length; i++) {
            if (Sughi[i].equals(null)){
                l=i ;
            }
        }
        if (l>-1){ Sughi[l]= sugo ; }
    }
    public int ControllaPiatto (String Categoria, String Piatto) {
        int p = -1 ;
       switch (Categoria) {
           case "Primo":
               for (int i = 0; i < PrimiPiatti.length; i++) {
                   if (Piatto.equals(PrimiPiatti[i].getNome())) {
                       p = i;
                   }
               }
               break;
           case "Secondo":
               for (int i = 0; i < SecondiPiatti.length; i++) {
                   if (Piatto.equals(SecondiPiatti[i].getNome())) {
                       p = i;
                   }
               }
               break;
           case "Contorno":
               for (int i = 0; i < Contorni.length; i++) {
                   if (Piatto.equals(Contorni[i].getNome())) {
                       p = i;
                   }
               }
               break;
           default:
               for (int i = 0; i < Dolci.length; i++) {
                   if (Piatto.equals(Dolci[i].getNome())) {
                       p = i;
                   }
               }
               break;
       }
       return p ;
    }
    public double getCosto (int r,String Categoria) {
        double c ;
        switch (Categoria) {
            case "Primo":
                c=PrimiPiatti[r].getPrezzo () ;
                break ;
            case "Secondo":
                c=SecondiPiatti[r].getPrezzo();
                break ;
            case "Contorno":
                c=Contorni[r].getPrezzo() ;
                break ;
            default:
                c=Dolci[r].getPrezzo() ;
                break;
        }
        return c ;
    }
}
