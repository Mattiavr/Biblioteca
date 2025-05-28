public class Libro implements Codice
{
    private String codice;
    private String titolo;
    private String autore;
    private String casaEd;
    private String annopub;
    private String noleggiatore;
    private String datanoleggio;

    public Libro(String titolo, String autore, String casaEd, String annopub, int cont)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.casaEd = casaEd;
        this.annopub = annopub;
        this.codice = generaCodice(cont);
        this.noleggiatore = null;
        this.datanoleggio = null;
    }

    public String getCodice()
    {
        return codice;
    }

    public String getNoleggiatore()
    {
        return noleggiatore;
    }

    public void noleggia(String noleggiatore, String datanoleggio)
    {
        this.noleggiatore = noleggiatore;
        this.datanoleggio = datanoleggio;
    }

    public void ritorna()
    {
        this.noleggiatore = null;
        this.datanoleggio = null;
    }

    public void stampa()
    {
        System.out.println("Codice libro: " + codice);
        System.out.println("Titolo libro: " + titolo);
        System.out.println("Autore libro: " + autore);
        System.out.println("Casa editrice: " + casaEd);
        System.out.println("Anno pubblicazione: " + annopub);
        if(noleggiatore != null)
        {
            System.out.println("Codice noleggiatore: " + noleggiatore);
            System.out.println("Data noleggio: " + datanoleggio);
        }
        else
        {
            System.out.println("Libro non noleggiato");
        }
    }

    @Override
    public String generaCodice(int cont)
    {
        String cod = "";
        String t = titolo.toUpperCase();
        String a = autore.toUpperCase();
        String c = casaEd.toUpperCase();

        for(int i = 0; i < 3; i++)
        {
            cod += (i < t.length() && t.charAt(i) != ' ') ? t.charAt(i) : 'X';
        }
        for(int i = 0; i < 3; i++)
        {
            cod += (i < a.length() && a.charAt(i) != ' ') ? a.charAt(i) : 'X';
        }
        for(int i = 0; i < 3; i++)
        {
            cod += (i < c.length() && c.charAt(i) != ' ') ? c.charAt(i) : 'X';
        }

        cod += annopub.replace("/", "") + cont;
        return cod;
    }
}
