### Procedura di Sviluppo: Progetto Java – Gestione di una Biblioteca

#### Introduzioni teoriche

**DAO (Data Access Object):**  
Un pattern che separa la logica di accesso ai dati dalla logica applicativa. I DAO gestiscono le operazioni CRUD su file o database.

**Repository:**  
Un livello astratto che centralizza l’accesso ai dati, usando i DAO sottostanti.

**Interface (Interfaccia):**  
Una collezione di metodi astratti che una classe può implementare.

**Abstract Class (Classe Astratta):**  
Una classe che può contenere sia metodi astratti (senza implementazione) che metodi concreti.
Non può essere istanziata direttamente e viene usata per fornire una base comune ad altre classi.

---

#### Procedura dello sviluppo
0. **Implementazione classi menu e input:**
   - Utilizzate per gli input e la creazione del menu.
   
1. **Progettare le classi principali:**
   - `Libro`: contiene le proprietà di un libro.
   - `Biblioteca`: gestisce la collezione di libri.

2. **Definire una `interface` `Repository<T>`:**
   - Contiene i metodi fondamentali: `aggiungi`, `rimuovi`, `noleggia`, `ritorna` e i vector.

3. **Creare un `RepositoryDao`:**
   - Una classe che centralizza l'accesso ai DAO

4. **Creare una `abstract class`:**
   - Es. `Codice` come classe astratta di `Libro`.

5. **Sviluppo App:**
   - Classe `App` per il main contente il menu con le scelte.

6. **Testare le funzionalità:**
   - Verificare che tutte le operazioni sui libri funzionino correttamente.

