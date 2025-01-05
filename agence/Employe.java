import java.util.Arrays;
import java.util.Scanner;

public class Employe extends Client 
{
    private String function ;

    public Employe(){
        super() ;
        this.function="not assined yet";

    }
    public Employe(String nom  , String prenom ,String ville , String function )
    {
      super(nom ,prenom ,ville) ;
      this.function=function ;

  

    }
public Client rechercheMembre(int codeClient, Client[] tb){
  for (Client client : tb) if ( client==null)continue;
    else  if   (client.getCode()==codeClient) return client;
     return null;
  
    

}
public void consulterClient(int codeClient ,Client[] tbClients)
{
  Client c=rechercheMembre(codeClient, tbClients);
  String label="--------------:inspected client Code "+
     c.getCode()+":----------------";
  c.menu(label);

}

public void supprimerMembre(int clientCode ,Client[] tbClients,String memberType){
    
  for (int i = 0; i < tbClients.length; i++) if (tbClients[i]==null)continue;
  else  if (tbClients[i].getCode()==clientCode) {

System.out.println("--member "+memberType +": "+tbClients[i].getCode()+
              " has been deleted succesfully");
       tbClients[i]=null;}  
  
  

    
} 
// pour les prametre de cleint  , on les demende dans  la methode ces desus  :

public Client[] ajouterMembre(Client []tabClients,String memberType)
 
   {
    
    Scanner sc =new Scanner(System.in);
    Client c  =new Client() ;

 
     System.out.print("enter the name of the "+memberType);
     System.out.print(":");
     c.setPrenom(sc.next());
     System.out.print("enter the last name of the "+memberType);
     System.out.print(":");
     c.setNom(sc.next());
     System.out.print("enter the city  of the "+memberType);
     System.out.print(":");
     c.setVille(sc.next());
     Client newtb[]=new Client[tabClients.length+1];
     for (int i = 0; i < tabClients.length; i++) newtb[i]=tabClients[i];
     newtb[tabClients.length]=c;
     System.out.println("member "+memberType+" :"+c.getCode()+"has been added succesfully");


    return newtb;
    
}
   public  void  ajouterCompte(Client client)
       
        {
           

          }
public Compte[] supprimerCompte(Compte c ,int numeroCompteSupprimer){
             
           return new Compte[2];


          }
        @Override
        public String toString() {
            return "Employe [nom=" + super.getNom() + ", prenom=" +super.getPrenom()  + 
            ", ville=" + getVille()+ ", code=" + super.getCode() + ", compte="
                + Arrays.toString(super.getComptes())  + "function = "+ this.function+"]" ;
        }

  public void menuEmploye()
  {
    //a inserer ...
    int k=1;
        
    while (k!=0) {


      System.out.println("--------------:Employer Code "+this.getCode()+":----------------");
      System.out.println("--options ");
      System.out.println("1)add-client ");
      System.out.println("2)remove-client ");
      System.out.println("3)inspect-client ");
      System.out.println("4)add-acount");
      System.out.println("5)remove-acount");





    }


    
  }

 


    
}
