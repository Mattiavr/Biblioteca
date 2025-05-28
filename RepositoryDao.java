import java.util.Vector;

public class RepositoryDao implements repository
{
    Vector<Libro> libri = new Vector<>();

    @Override
    public void aggiungi(Libro libro)
    {
        libri.add(libro);
    }

    @Override
    public void rimuovi(String codice)
    {
        Libro rimuovi = null;
        for(int i = 0; i < libri.size(); i++)
        {
            if(libri.elementAt(i).getCodice().equals(codice))
            {
                rimuovi = libri.elementAt(i);
                break; // appena trovato esco
            }
        }
        if(rimuovi != null && libri.removeElement(rimuovi))
        {
            System.out.println("Libro rimosso");
        }
        else
        {
            System.out.println("Libro non presente");
        }
    }

    @Override
    public Libro TrovaLibro(String codice)
    {
        for(int i = 0; i < libri.size(); i++)
        {
            if(libri.elementAt(i).getCodice().equals(codice))
            {
                return libri.elementAt(i);
            }
        }
        return null;
    }

    @Override
    public void noleggia(String codice, String codicelibro, String data)
    {
        Libro libro = TrovaLibro(codicelibro);
        if(libro == null)
        {
            System.out.println("Libro non presente");
            return;
        }
        libro.noleggia(codice, data);
        System.out.println("Libro noleggiato con successo");
    }

    @Override
    public void ritorna(String codice)
    {
        Libro libro = TrovaLibro(codice);
        if(libro == null)
        {
            System.out.println("Libro non presente");
            return;
        }
        libro.ritorna();
        System.out.println("Libro ritornato");
    }

    @Override
    public Vector<Libro> TrovaTutti()
    {
        return libri;
    }

    @Override
	public Vector<Libro> TrovaNoleggiati()
	{
		Vector<Libro> noleggiati = new Vector<>();
		for(int i = 0; i < libri.size(); i++)
		{
			Libro libro = libri.elementAt(i);
			if(libro.getNoleggiatore() != null)
				noleggiati.add(libro);
		}
		return noleggiati;
	}
}
