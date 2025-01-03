import java.util.Arrays;
import java.util.Scanner;

public class Employe extends Client 
{
    private String function ;

    public Employe(){
        super() ;

    }
    public Employe(String nom  , String prenom ,String ville ,String function )
    { 
      super(nom ,prenom ,ville) ;
      this.function=function ;

  

    }

public void consulterClient(int num ,Client[] tbClients)
{

}
public Client[] supprimerClient(int num ,Client[] tbClients){
    Client[] tbClient  = new Client[tbClients.length-1];

    return tbClient ;
} 
// pour les prametre de cleint  , on les demende dans  la methode ces desus  :
public Client ajouterClient( )
 
   {
    Scanner sc =new Scanner(System.in)  ;

 
     System.out.print("donner le nom de client ");
     String nom = sc.next() ;
     System.out.print("") ;

    Client c  =new Client() ;
    return c ;
    
}
         public  void  ajouterCompte(Client client)
       
        {
           

          }
          public Compte[] supprimerCompte(Compte c ,int numeroCompteSupprimer){
             
           return new Compte[2];


          }
        @Override
        public String toString() {
            return "Employe [nom=" + super.getNom() + ", prenom=" +super.getPrenom()  + ", ville=" + getVille()+ ", code=" + super.getCode() + ", compte="
                + Arrays.toString(super.getCompte())  + "function = "+ this.function+"]" ;
        }

  public void menuEmploye()
  {
    //a inserer ...


    
  }

 


    
}
