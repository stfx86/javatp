import java.util.Arrays;
import java.util.Scanner;

public class Employe extends Client 
{
    private String function ;
    

    public String getFunction() {
      return function;
    }
    public void setFunction(String function) {
      this.function = function;
    }
    public Employe(){
        super() ;
        this.function="not assined yet";

    }
    public Employe(String nom  , String prenom ,String ville , String function )
    {
      super(nom ,prenom ,ville) ;
      this.function=function ;

  

    } 

    // way !!?
public Client rechercheMembre(int codeClient, Client[] tbClients){
  for (Client client : tbClients) if ( client==null)continue;
    else  if   (client.getCode()==codeClient) return client;
     return null;
  
    

}
public void consulterClient(int codeClient ,Client[] tbClients)
{
  Client c=rechercheMembre(codeClient, tbClients);
  if (c==null) {
    System.out.println("no one with that code  !!");
    return;}

  String label="--------------:inspected client Code "+
     c.getCode()+":----------------";
  c.myInfo(label);

}

public void supprimerClient(int clientCode ,Client[] tbClients){
    
  for (int i = 0; i < tbClients.length; i++) if (tbClients[i]==null)continue;
  else  if (tbClients[i].getCode()==clientCode) {

System.out.println("--member Client +"+ ":"  +tbClients[i].getCode()+
              " has been deleted succesfully");
       tbClients[i]=null;
      return;}
      System.out.println("--no client with that code found");  
  
  

    
} 
// pour les prametre de cleint  , on les demende dans  la methode ces desus  :

public Client[] ajouterMembre(Client []tabClients)
 
   {
    
    Scanner sc =new Scanner(System.in);
    Client c  =new Client() ;

 
     System.out.print("enter the name of the client ");
     System.out.print(":");
     c.setPrenom(sc.next());
     System.out.print("enter the last name of the  client");
     System.out.print(":");
     c.setNom(sc.next());
     System.out.print("enter the city  of the  client");
     System.out.print(":");
     c.setVille(sc.next());
     Client newtb[]=new Client[tabClients.length+1];
     for (int i = 0; i < tabClients.length; i++) newtb[i]=tabClients[i];
     newtb[tabClients.length]=c;
     System.out.println("member client of code  :"+c.getCode()+" has been added succesfully");

    // sc.close();
    return newtb;
    
}
   public  void  ajouterCompte(int clientCode,Client []tb)
       
  {
          Scanner sc =new Scanner(System.in);
          float amount;
          Client c=this.rechercheMembre(clientCode, tb );
          if (c==null) {
            System.out.println("no client found with that code )-:");
            return;            
          }
          if (c.getNombreCompte()>=3) {
            System.out.println("already have 3 acounts (-:");  return;
          }
          System.out.println("-- Type of account ");
          System.out.println("E) Epargne \nC) Courant");
          char rep = sc.next().charAt(0);
          rep = Character.toUpperCase(rep); 
          Compte compte;
          if (rep == 'E') {
               compte = new CompteE();
             
          } else if (rep == 'C') {
              compte = new Compte();
          
          } else {
              System.out.println("Invalid account type selected.");
              return;
          }

        //see if we can add mony to it 
        System.out.println("you wanna diposit some inital mony to it \n Y)Yes \n N)No-and-continue\n:");
        rep = sc.next().charAt(0);
        rep = Character.toUpperCase(rep); 

        if (rep == 'Y') {
          System.out.println("enter the amount \n:");
          amount=sc.nextFloat();
          if (amount<0) {
            System.out.println("invalid input ");
            return;
          }
          compte.verser(amount);
          System.out.println(amount+"--has been diposit succesfully to account "+compte.getNumeroCompte());


         
      } else if (rep != 'N') {
        System.out.println("Invalid account type selected.");
         return;
          
      
      } 
      
      //if the client have no acounts
      if (c.getComptes()==null) {
        c.setNombreCompte(c.getNombreCompte()+1);
        c.setComptes(new  Compte[]{compte});
        System.out.println("account "+compte.getNumeroCompte()+" has been successfully "+
        "assigned to client "+c.getCode()+" with "+compte.getSolde()+" DH in balance."
        );
         return;
        
      }
      //if the client have a null refrence for previous deleted account  
      for (int i = 0; i < c.getComptes().length; i++) {
        if (c.getComptes()[i]==null) {
          c.getComptes()[i]=compte;
          c.setNombreCompte(c.getNombreCompte()+1);
          System.out.println(" account "+compte.getNumeroCompte()+" has been successfully " +
          " assigned to client "+c.getCode()+" with "+compte.getSolde()+" DH in balance."
          );
          return;
        }
        
      }
      //if the client have less than 3 acounts

        Compte []acounts=new Compte[c.getComptes().length+1];
          for (int i = 0; i < c.getComptes().length; i++) 
          acounts[i]=c.getComptes()[i];
          acounts[c.getComptes().length]=compte;
          c.setComptes(acounts);
          c.setNombreCompte(c.getNombreCompte()+1);
          System.out.println("account "+compte.getNumeroCompte()+"has been successfully" +
          "assigned to client "+c.getCode()+"with "+compte.getSolde()+" DH in balance."
          );
         
          return;


    

          
  }
public void supprimerCompte(int clientCode,Client []tb){

  Client c =this.rechercheMembre(clientCode, tb);
  if (c==null) {System.out.println("no client found with that code )-:");
    return; 
  }
  if (c.getComptes()==null) {
    System.out.println("there is no acounts to remove for this client");
    return;    
  }
  
  //choosing the account
  System.out.println("--choose an account to remove ");
        for (Compte compte : c.getComptes()) if(compte==null) continue;
        else System.out.println(compte.getNumeroCompte());
        System.out.print(":");
        Scanner sc =new Scanner(System.in);
        int code=sc.nextInt();
   //checking the input      
        if (code<0) {
         System.out.println("invalid input [negativ input]" );sc.close(); return; }
         //removing the wanted account 
for (int i = 0; i < c.getComptes().length; i++) {
  if (c.getComptes()[i]==null) continue;else 
  if (c.getComptes()[i].getNumeroCompte()==code){
    c.getComptes()[i]=null;c.setNombreCompte(c.getNombreCompte()-1);code=-1;
    break;
  }
 
}
if (code!=-1) {
  sc.close();
  System.out.println("no matching account code was found  "); return;
}
System.out.println("account has been deletd seccesfully (-:");

sc.close();return;



             




          }
        @Override
        public String toString() {
            return "Employe [nom=" + super.getNom() + ", prenom=" +super.getPrenom()  + 
            ", ville=" + getVille()+ ", code=" + super.getCode() + ", compte="
                + Arrays.toString(super.getComptes())  + "function = "+ this.function+"]" ;
        }

  public Client[] menuEmploye(String label,Client[] clients)
  {
    Scanner scanner=new Scanner(System.in);
    int k=1;
    String delemiter="---------------------------------------------------------------";
        
    while (k!=0) {


      System.out.println(label);
      System.out.println("--options ");
      System.out.println("1)add-client ");
      System.out.println("2)remove-client ");
      System.out.println("3)inspect-client ");
      System.out.println("4)add-acount");
      System.out.println("5)remove-acount");
      System.out.println("6)my-info") ;
      System.out.print("0)quit\n");
      if (!scanner.hasNextInt()) { // Validate input is an integer
        System.out.println(delemiter);
        System.out.println("Invalid input. Please enter a valid option.");
        scanner.next(); // Consume invalid input
        continue;
    }
      
      k=scanner.nextInt();
      int code;
      
          

      switch (k){
        
        
        case 1:
        System.out.println(delemiter);





        clients=this.ajouterMembre(clients);
        break;
        case 2:
        System.out.println(delemiter);
       System.out.print("enter the client code you wanna remove  \n:");
          code =scanner.nextInt();
          this.supprimerClient(code, clients);
        break;
        case 3:
        System.out.println(delemiter);
        System.out.print("enter the client code you wanna inspect  \n:");
           code =scanner.nextInt();
          this.consulterClient(code, clients);
             

        break;
        case 4:
        System.out.println(delemiter);
        System.out.print("enter the client code you wanna add an account to  \n:");
          code =scanner.nextInt();
          this.ajouterCompte(code, clients);

        break;
        case 5 :
        System.out.println(delemiter);
        System.out.print("enter the client code you wanna remove  an account from  \n:");
        code =scanner.nextInt();
        this.supprimerCompte(code, clients);


        break;
        case 6 :
        System.out.println(delemiter);
        String ch = "----------------Emloye code "+ this.getCode() + "-------------" ;
        this.myInfo(ch) ;
        break ;
        case 0:
        break;
       default:
       System.out.println(delemiter);
           System.out.println("not an option!! , try again ");


      }
      
      





    }
    // scanner.close();


    return clients;
  }

 


    
}