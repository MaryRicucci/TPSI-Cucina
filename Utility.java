public class Utility {
    private Ingrediente [] IngredientiBolognese = new Ingrediente [11] ;
    private String [] ISB = {"Passata di pomodoro","Carne bovina","Carote","Sedano","Cipolle dorate","Sale fino","Pepe nero","Vino rosso",
    "Pancetta","Brodo vegetale","Olio extravergine di oliva"} ;
    private String [] QAB = {"300 g", "300 g","50 g","50 g","50 g","q.b.","q.b","100 g","150 g","q.b","1 cucchiaio"};
    private int [] CalTotSughi = new int [3] ;

    private int [] CIB = {54,375,300,50,50,0,68,217,992,6,899} ;
    private Ingrediente [] IngredientiSiciliana = new Ingrediente [9] ;
    private String [] ISS = {"Passata di pomodoro", "Cipolle bianche","Oli di semi di arachidi", "Melanzane","Fiordilatte",
            "Parmiggiano Reggiano","Basilico","Olio extraveergine d'oliva","Sale fino"};
    private String [] QAS = {"1 l", "150 g","q.b","500 g","250 g","70 g" , "q.b","q.b","q.b"} ;
    private int [] CIS = {14,39,899,75,115,115,39,899,0} ;
    private Ingrediente [] IngredientiAmatriciana = new Ingrediente [6] ;
    private String [] IAM = {"Pomodori pelati","Guanciale","Pecorino romano","Vino bianco","Sale fino","Peperoncino fresco"} ;
    private String [] QAM = {"400 g","150 g","75 g","50 g","50 g","q.b","1"} ;
    private int [] CAM = {84,992,289,32,0,26} ;
    private String [] NomiSughi = {"Bolognese", "Siciliana", "Amatriciana"} ;
    private Sugo [] sughi = new Sugo [3] ;
    private String [] NomiDolci = {"Mascarpone","Torta di Pinoli","Torta della nonna"};
    private Dolce [] Dolci = new Dolce [3];
    private Ingrediente [] IngMascarpone = new Ingrediente [2] ;
    private String [] IDM = {"Panna fresca liquida","Succo di limone"};
    private String [] IMQ = {"600 g", "15 g"};
    private int [] IMC = {1752,4} ;
    private Ingrediente [] IngPinoli = new Ingrediente [9] ;
    private String [] IDP = {"Burro","Farina","Fecola di patate", "Lievito","Zucchero","Sale fino", "Uova","Pinoli","Zucchero a velo"};
    private String [] IPQ = {"200 g","150 g","50 g","Mezza bustina","200 g", "1 pizzico","4","100 g","q.b"};
    private int [] IPC = {1516,515,175,0,784,0,0,567,1000};
    private Ingrediente [] IngNonna = new Ingrediente [13] ;
    private String [] IDN = {"Farina 00","Burro mobido","Zucchero a velo","Uova","Scorza al limone","Sale fino","Lievito per dolci","Latte intero","Zucchero",
    "Tuorli","Amido di mais","Amido di riso","Pinoli"}  ;
    private String [] INQ = {"500 g","250 g","150 g", "110 g","1/2","1 pizzico","4 g","500 g","100 g", "85 g","25 g", "20 g", "40 g"};
    private int [] INC = {1715,1895,588,141,69,0,2,315,392,83,83,227};
    private String[] NomiContorni = {"Verdure grigliate","Verdure impanate","Verdure fritte"};
    private Ingrediente [] IngGri = new Ingrediente [6];
    private String [] ICG = {"Zucchine","Melanzane","Peperoni","Pomodori","Sale fino","Pepe nero"};
    private int [] IGC = {45,50,187,38,0,5};
    private String [] IGQ = {"300 g", "450 g", "850 g","200 g","q.b","q.b"} ;
    private Ingrediente [] IngImp = new Ingrediente [10] ;
    private String [] ICI= {"Zucchine","Melanzane","Peperoni rossi","Olio extravergine d'oliva","Sale fino", "Pangrattato","Parmiggiano reggiano","Timo","Maggiorana",
    "Pepe nero"};
    private String [] IIQ = {"2","1","1","20 g","q.b","60 g", "60 g", "q.b","q.b","q.b"};
    private int [] IIC = {11,15,22,180,0,212,233,91,273,217};
    private Ingrediente [] IngFri = new Ingrediente [10];
    private String [] ICF = {"Carote","Zucchine","Melanzane","Peperoni","Farina 00", "Farina di riso","Acqua gassata", "Uova", "Sale fino", "Olio di semi d girasole"} ;
    private String [] IFQ = {"200 g", "200 g","200 g","200 g","100 g", "70 g","250 g","2","q.b","q.b"};
    private int [] IFC = {66,22,30,44,343,254,83,0,0,0};
    private Contorno [] Contorni = new Contorno [3] ;
    private Secondo [] Secondi = new Secondo [3] ;
    private Ingrediente [] IngFritt = new Ingrediente [6];
    private String [] NomiSecondi = {"Frittata","Caprese","Carne alla griglia"};
    private String [] ISF = {"Uova","Pecorino","Parmiggiano reggiano","sale fino","pepe nero","olio extravergine d'oliva"};
    private String [] IFRQ = {"8","50 g","50 g","q.b","q.b","2 cucchiai"};
    private int [] IFRC = {66,196,194,0,27,90};
    private Ingrediente [] IngCap = new Ingrediente [8] ;
    private String [] ISC = {"Pomodorini ciliegino","Basilico","Olio extravergine d'oliva","Sale fino","olive nere","aglio","mozzarella di bufala","Origano"};
    private String [] ICQ = {"10","8 foglie","q.b","q.b","12","1 spicchio","250 g","2 pizzichhi"};
    private int [] ICC = {17,39,899,0,235,40,720,322};
    private Ingrediente[] IngCG = new Ingrediente [10];
    private String [] ISG  = {"Costine di maiale","Salamella","maiale braciole","luganega","maiale in spiedini","olio extravergine d'oliva","sale fino","rosmarino",
    "pepe nero in grani","pepe nero"};
    private String [] ICGQ = {"800 g","300 g","500 g", "400 g", "600 g","50 g", "14 g", "q.b", "15","1 pizzico"};
    private int [] ICGC = {5288,1983,3305,2644,3966,450,0,96,217,217};
    private Primo [] Primi = new Primo [3] ;
    private String [] NomiPrimi = {"Bucatini","Maccheroni","Penne"};
    private int [] CalPrimi = {356,351,356};
    private String [] QuaPrimi = {"100 g","100 g","100 g"};
    public Utility () {
        RiempiIngSughi () ;
        CreaSughi () ;
        RiempiIngDolci();
        CreaDolci () ;
        RiempiIngContorni () ;
        CreaContorni() ;
        RiempiIngSecondi();
        CreaSecondi();
        CreaPrimi();
    }

    private void RiempiIngSughi () {
        for (int i = 0; i < IngredientiBolognese.length; i++) {
            IngredientiBolognese[i].setNome(ISB[i]);
            IngredientiBolognese[i].setCalorie(CIB[i]);
            IngredientiBolognese[i].setQuantita(QAB[i]);
        }
        for (int i = 0; i < IngredientiSiciliana.length; i++) {
            IngredientiSiciliana[i].setNome(ISS[i]);
            IngredientiSiciliana[i].setQuantita(QAS[i]);
            IngredientiSiciliana[i].setCalorie(CIS[i]);
        }
        for (int i = 0; i < IngredientiAmatriciana.length; i++) {
            IngredientiAmatriciana[i].setNome(IAM[i]);
            IngredientiAmatriciana[i].setCalorie(CAM[i]);
            IngredientiAmatriciana[i].setQuantita(QAM[i]);
        }
    }

    private void CreaSughi () {
        int length ;
        for (int i = 0 ; i<3 ; i++) {
            sughi[i].setNome(NomiSughi[i]);
            sughi[i].setCategoria("Sugo") ;
            switch (i) {
                case 0:
                    sughi[i].setIngredienti(IngredientiBolognese) ;
                    sughi[i].setTempoDiCottura(150) ;
                    length = IngredientiBolognese.length ;
                    break ;
                case 1:
                    sughi[i].setIngredienti(IngredientiSiciliana);
                    sughi[i].setTempoDiCottura(180) ;
                    length = IngredientiSiciliana.length ;
                    break ;
                default:
                    sughi[i].setIngredienti(IngredientiAmatriciana);
                    sughi[i].setTempoDiCottura(25) ;
                    length = IngredientiAmatriciana.length ;
                    break ;
            }
            sughi[i].CalcolaCalorieTotali(length);
            CalTotSughi[i]=sughi[i].CalcolaCalorieTotali(length);
            sughi[i].setPrezzo(GeneraParametri(7.00,9.50));
        }
    }
    private void RiempiIngDolci () {
        for (int i = 0; i < IngMascarpone.length; i++) {
            IngMascarpone[i].setNome(IDM[i]);
            IngMascarpone[i].setQuantita(IMQ[i]);
            IngMascarpone[i].setCalorie(IMC[i]);
        }
        for (int i = 0; i < IngPinoli.length; i++) {
            IngPinoli[i].setNome(IDP[i]);
            IngPinoli[i].setQuantita(IPQ[i]);
            IngPinoli[i].setCalorie(IPC[i]);
        }
        for (int i = 0; i<IngNonna.length; i++) {
            IngNonna[i].setNome(IDN[i]);
            IngNonna[i].setQuantita(INQ[i]);
            IngNonna[i].setCalorie(INC[i]);
        }
    }
    private void CreaDolci () {
        int length ;
        for (int i = 0 ; i<3 ; i++) {
            Dolci[i].setNome(NomiDolci[i]);
            Dolci[i].setCategoria("Dolce") ;
            switch (i) {
                case 0:
                    Dolci[i].setIngredienti(IngMascarpone) ;
                    Dolci[i].setTempoDiCottura(10) ;
                    length = IngMascarpone.length ;
                    break ;
                case 1:
                    Dolci[i].setIngredienti(IngPinoli);
                    Dolci[i].setTempoDiCottura(80) ;
                    length = IngPinoli.length ;
                    break ;
                default:
                    Dolci[i].setIngredienti(IngNonna);
                    Dolci[i].setTempoDiCottura(50) ;
                    length = IngNonna.length ;
                    break ;
            }
            Dolci[i].CalcolaCalorieTotali(length);
            Dolci[i].setPrezzo(GeneraParametri(10.50,15.70));
        }
    }
    private void RiempiIngContorni () {
        for (int i = 0; i < IngGri.length; i++) {
            IngGri[i].setNome(ICG[i]);
            IngGri[i].setQuantita(IGQ[i]);
            IngGri[i].setCalorie(IGC[i]);
        }
        for (int i = 0; i < IngImp.length; i++) {
            IngImp[i].setNome(ICI[i]);
            IngImp[i].setQuantita(IIQ[i]);
            IngImp[i].setCalorie(IIC[i]);
        }
        for (int i = 0; i<IngFri.length; i++) {
            IngFri[i].setNome(ICF[i]);
            IngFri[i].setQuantita(IFQ[i]);
            IngFri[i].setCalorie(IFC[i]);
        }
    }
    private void CreaContorni () {
        int length ;
        for (int i = 0 ; i<3 ; i++) {
            Contorni[i].setNome(NomiContorni[i]);
            Contorni[i].setCategoria("Contorno") ;
            switch (i) {
                case 0:
                    Contorni[i].setIngredienti(IngGri) ;
                    Contorni[i].setTempoDiCottura(20) ;
                    length = IngGri.length ;
                    break ;
                case 1:
                    Contorni[i].setIngredienti(IngImp);
                    Contorni[i].setTempoDiCottura(45) ;
                    length = IngImp.length ;
                    break ;
                default:
                    Contorni[i].setIngredienti(IngFri);
                    Contorni[i].setTempoDiCottura(20) ;
                    length = IngFri.length ;
                    break ;
            }
            Contorni[i].CalcolaCalorieTotali(length);
            Contorni[i].setPrezzo(GeneraParametri(7.80,9.40));
        }
    }
    private void RiempiIngSecondi () {
        for (int i = 0; i < IngFritt.length; i++) {
            IngFritt[i].setNome(ISF[i]);
            IngFritt[i].setQuantita(IFRQ[i]);
            IngFritt[i].setCalorie(IFRC[i]);
        }
        for (int i = 0; i < IngCap.length; i++) {
            IngCap[i].setNome(ISC[i]);
            IngCap[i].setQuantita(ICQ[i]);
            IngCap[i].setCalorie(ICC[i]);
        }
        for (int i = 0; i<IngCG.length; i++) {
            IngCG[i].setNome(ISG[i]);
            IngCG[i].setQuantita(ICGQ[i]);
            IngCG[i].setCalorie(ICGC[i]);
        }
    }
    private void CreaSecondi () {
        int length ;
        for (int i = 0 ; i<3 ; i++) {
            Secondi[i].setNome(NomiSecondi[i]);
            Secondi[i].setCategoria("Secondo") ;
            switch (i) {
                case 0:
                    Secondi[i].setIngredienti(IngFritt) ;
                    Secondi[i].setTempoDiCottura(20) ;
                    length = IngFritt.length ;
                    break ;
                case 1:
                    Secondi[i].setIngredienti(IngCap);
                    Secondi[i].setTempoDiCottura(5) ;
                    length = IngCap.length ;
                    break ;
                default:
                    Secondi[i].setIngredienti(IngCG);
                    Secondi[i].setTempoDiCottura(25) ;
                    length = IngCG.length ;
                    break ;
            }
            Secondi[i].CalcolaCalorieTotali(length);
            Secondi[i].setPrezzo(GeneraParametri(15.89,25.88));
        }
    }
    private void CreaPrimi () {
        int length ;
        for (int i = 0 ; i<3 ; i++) {
            Primi[i].setNome(NomiPrimi[i]);
            Primi[i].setCategoria("Primo") ;
            Primi[i].ScegliSugo(NomiSughi[i]);
            Primi[i].setCalorieTipoPasta(CalPrimi[i]);
            switch (i) {
                case 0:
                    Primi[i].setIngredienti(null) ;
                    Primi[i].setTempoDiCottura(10) ;
                    length = 0 ;
                    break ;
                case 1:
                    Primi[i].setIngredienti(null);
                    Primi[i].setTempoDiCottura(15) ;
                    Primi[i].ScegliSugo(NomiSughi[i]);
                    length = 0 ;
                    break ;
                default:
                    Primi[i].setIngredienti(null);
                    Primi[i].setTempoDiCottura(20) ;
                    Primi[i].ScegliSugo(NomiSughi[i]);
                    length = 0 ;
                    break ;
            }
            Primi[i].CalcolaCalorieTotali(length);
            Primi[i].setPrezzo(GeneraParametri(0.10,0.20));
        }
    }


    public double GeneraParametri (double min , double max) {
        double r ;
        r=(Math.random() * ((max-min)+min)) ;
        return r ;
    }
    public Sugo [] getSughi () {
        return sughi ;
    }
    public Primo [] getPrimi () {
        return Primi ;
    }
    public Secondo [] getSecondi () {
        return Secondi ;
    }
    public Contorno [] getContorni () {
        return Contorni ;
    }
    public Dolce [] getDolci () {
        return Dolci ;
    }

      }
