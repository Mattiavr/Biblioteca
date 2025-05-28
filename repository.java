import java.util.Vector;

public interface repository
{
    void aggiungi(Libro libro);
    void rimuovi(String codice);
    void noleggia(String codice, String codicelibro, String data);
    void ritorna(String codice);
    Libro TrovaLibro(String codice);
    Vector<Libro> TrovaTutti();
    Vector<Libro> TrovaNoleggiati();
}
