import java.util.Scanner ;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in) ;
        boolean on = true ;
        int s ;

        String Piatto , Categoria ;
        Ristorante r = new Ristorante (null,null,null) ;
        System.out.print ("Inserire il nome del ristorante: ") ;
        r.setNome (sc.next()) ;
        System.out.print ("Inserire il titolare: ") ;
        r.setTitolare(sc.next());
        System.out.print ("Inserire il numero di telefono: ") ;
        r.setNumeroTelefono(sc.next());

        System.out.print ("Scegli cosa vuoi ordinare: ") ;
        r.StampaMenu();

        do {
            System.out.print("Piatto: ");
            Piatto = sc.next () ;

            System.out.print ("Categoria: ") ;
            Categoria = sc.next () ;

            r.OrdinaPiatto(Categoria,Piatto);

            System.out.print ("Vuoi aggiungere qualcosa?\nSe sì, premi 1\nAltrimenti,2") ;
            s = sc.nextInt () ;
            switch (s) {
                case 1:
                    on = true ;
                    break ;
                default:
                    on = false ;
            }
        } while (on) ;

        System.out.print("Ecco il riepilogo del tuo ordine: ") ;
        r.StampaOrdine();
        r.PagaPasto();
        System.out.print ("Grazie dell'ordinazione!\nL'ordine è arrivato in cucina!") ;

        System.out.print ("L'ordine è pronto!") ;
        System.out.print ("Grazie di aver ordinato da"+r.getNome());
        System.out.print ("Torna a trovarci presto e prendi nota dei nostri dati: ") ;
        r.StampaRistorante();



    }
}
