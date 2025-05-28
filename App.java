public class App
{
    public static void main(String[] args)
    {
        Biblioteca bib = new Biblioteca();
        boolean uscita = true;
        while(uscita)
        {   
            int scelta = Menu.scegli();
            switch(scelta)
            {
                case 0:
                    uscita= false;
                    break; 
                case 1:
                    bib.aggiungiLibro();
                    break;          
                case 2:
                    bib.rimuoviLibro();
                    break;            
                case 3:
                    bib.noleggia();
                    break;
                case 4:
                    bib.ritorna();
                    break;
                case 5:
                    bib.stampaLibri();
                    break;
            }
            if(uscita)
            {
                uscita=Input.bool("Vuoi fare qualcos'altro(1=si,0=no)?");
            }
            try
            {
                Thread.sleep(500);
                System.out.print("\033c");
            }
            catch(InterruptedException e){}
        }
    }  

}  
