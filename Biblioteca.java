import java.util.Vector;

public class Biblioteca
{
    private RepositoryDao libri;
    private int contl;

    public Biblioteca()
    {
        libri = new RepositoryDao();
        contl = 0;
    }

    public void aggiungiLibro()
    {
		
        String titolo = Input.stringa("Inserisci il titolo del libro: ");
        String autore = Input.stringa("Inserisci l'autore del libro: ");

        // Metto la prima lettera maiuscola
        if(!autore.isEmpty()) {
            autore = autore.substring(0,1).toUpperCase() + autore.substring(1);
        }

        String casaEd = Input.stringa("Inserisci la casa editrice del libro: ");
        String annoPub = Input.data("Inserisci l'anno di pubblicazione del libro: ");

        Libro libro = new Libro(titolo, autore, casaEd, annoPub, contl++);
        libri.aggiungi(libro);
    }

    public void noleggia()
    {
        String cod = Input.stringa("Inserisci il codice del libro da noleggiare: ");
        cod = cod.toUpperCase();
        String noleggiatore = Input.stringa("Inserisci il nome del noleggiatore: ");
        noleggiatore = noleggiatore.toUpperCase();
        String data = Input.data("Inserire la data di noleggio: ");

        libri.noleggia(noleggiatore, cod, data);
    }

    public void ritorna()
    {
        String cod = Input.stringa("Inserisci il codice del libro da ritornare: ");
        cod = cod.toUpperCase();
        libri.ritorna(cod);
    }

    public void rimuoviLibro()
    {
        String cod = Input.stringa("Inserisci il codice del libro da rimuovere: ");
        cod = cod.toUpperCase();
        libri.rimuovi(cod);
    }

    public void stampaLibri()
    {
        Vector<Libro> contenitore = libri.TrovaTutti();
        String sep = "-----------------------------";
        for (int i = 0; i < contenitore.size(); i++)
        {
            System.out.println(sep);
            contenitore.elementAt(i).stampa();
            System.out.println(sep + "\n");
        }
    }
}
