import java.util.Arrays;
import java.util.Scanner;

public class Client {
    


    private String nom ;
    private String prenom ;
    private String ville;
    private int code ;
    static  int nombreClients=0;
    private Compte[] comptes =null;
    private int nombreCompte =0 ;
    private Scanner scanner = new  Scanner(System.in);


    public Client()
    {
        this.code = nombreClients++ ;

    }
    public Client(String nom)
    
    {
        this.nom=nom;
        this.code = nombreClients++ ;

    }
     public Client(String nom ,String prenom ,String ville){
        this.nom =nom ;
        this.prenom=prenom ;
        this.ville =ville ;
        this.code =nombreClients++ ;


     }
    
    
    public int getCode() {
        return this.code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getNombreCompte() {
        return nombreCompte;
    }
    public void setNombreCompte(int nombreCompte) {
        this.nombreCompte = nombreCompte;
    }
    
    public Compte[] getComptes() {
        return this.comptes;
    }
    public void setComptes(Compte[] compte) {
        this.comptes = compte;
    }
   
    
   
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getVille() {
        return this.ville;

    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    
    @Override
    public String toString() {
        return "Client [nom=" + nom + ", prenom=" + prenom + ", ville=" + ville + ", code=" + code + ", compte="
                + Arrays.toString(comptes)  +"]";
    }
    private void transaction(int typeTransaction){

        int acount;
        float amount; 

        if (this.comptes==null) {
            System.out.println("--you dont have an account :-( ");
            return;
            
        }
        
        //enter the amount 
        System.out.println("--enter the amount");
        System.out.print(":");
        amount=scanner.nextFloat();
        if (amount<0) {
         System.out.println("--invalid amount ");
         return;  
        }
        System.out.println("--choose an account");
        for (Compte compte : comptes)if(compte==null) continue;
        else System.out.println(compte.getNumeroCompte());
        System.out.print(":");
        
        acount =scanner.nextInt();
        
        
        for (Compte compte : comptes) {
            if (compte.getNumeroCompte()==acount){ 
                if(typeTransaction==1) compte.verser(amount);else compte.retirer(amount); 
                amount=-1;
            return;}}
         if(amount!=-1   ){System.out.println("--invalid option!!!");return;}
         return;










    }
    
    


    //MENEU :liste of client functions 




    //function to change and show the informations 

     public void myInfo(String lable ) {
        int choice = -1;
        String delimiter = "---------------------------------------------------------------";
    
        while (choice != 0) {
            System.out.println(lable);
            System.out.println("Your Personal Information:");
            System.out.println("1) View Name");
            System.out.println("2) View Surname");
            System.out.println("3) View City");
            System.out.println("4) Vew All Accounts");
            System.out.println("5) Change Name");
            System.out.println("6) Change Surname");
            System.out.println("7) Change City");
          

            System.out.println("0) Back to Menu");
            System.out.print(": ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
    
            switch (choice) {
                case 1:
                System.out.println(delimiter);
                    System.out.println("Name: " + this.nom);
                    break;
                case 2:
                System.out.println(delimiter);
                    System.out.println("Surname: " + this.prenom);
                    break;
                case 3:
                System.out.println(delimiter);
                    System.out.println("City: " + this.ville);
                    break;
                case 4:
                System.out.println(delimiter);
                    if (this.comptes==null) {
                        System.out.println("No accounts found.");
                    } else {
                        System.out.println("Accounts:");
                        for (Compte compte : comptes) {
                            if (compte==null) 
                                continue;else
                            System.out.println( compte);
                        }
                    }
                    break;

                case 5:
                System.out.println(delimiter);
                    System.out.print("Enter new name: ");
                    this.nom = scanner.nextLine();
                    System.out.println("Name updated successfully.");
                    break;
                case 6:
                    System.out.println(delimiter);
                    System.out.print("Enter new surname: ");
                    this.prenom = scanner.nextLine();
                    System.out.println("Surname updated successfully.");
                    break;
                case 7:
                    System.out.println(delimiter);
                    System.out.print("Enter new city: ");
                    this.ville = scanner.nextLine();
                    System.out.println("City updated successfully.");
                    break;
                   
                
                case 0:
                System.out.println(delimiter);
                    System.out.println("Returning to menu...");
                    break;
                default:
                   System.out.println(delimiter);
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
    
    public void menu(String label)
    { 
        int k=1;
        String delemiter="---------------------------------------------------------------";
        
        while (k!=0) {
            System.out.println(label);
            System.out.println("--options");
            System.out.println("1)deposit ");
            System.out.println("2)withdraw ");
            System.out.println("3)check balances ");
            System.out.println("4)my-infos ");
            System.out.println("0)quit ");
            System.out.print(":");
            k=scanner.nextInt();
            
          


            switch (k) {

                //verser
                case 1:
                System.out.println(delemiter);
                transaction(1);
                break;
               

                 case 2 :
                 System.out.println(delemiter);
                 transaction(2);
                 break;
               
                case 3:
                System.out.println(delemiter);
               
                if (this.comptes==null) {
                    System.out.println("this client dont have any accounts");
                    break;
                    
                }
                System.out.println("your balnaces ");
                for (Compte compte : comptes) {
                    if (compte==null) 
                        continue;else
                    System.out.println("account Number "+compte.getNumeroCompte()+": balance "+compte.getSolde());
                    
                }
                break;
                case 4:
                System.out.println(delemiter);
                this.myInfo(label);

                break;
                case 0:
                 break;
                default:
                System.out.println(delemiter);
                    System.out.println("not an option!! , try again ");
            }




            

        }    
     



    }
     

   

}