import java.util.Arrays;
import java.util.Scanner;

public class Client {
    


    private String nom ;
    private String prenom ;
    private String ville;
    private int code ;
    static int nombreClients=0;
    private Compte[] comptes =null;
    private int nombreCompte =0 ;
    private Scanner scanner =new  Scanner(System.in);


    public Client()
    {
        this.code =nombreClients++ ;

    }
     public Client(String nom ,String prenom ,String ville){
        this.nom =nom ;
        this.prenom=prenom ;
        this.ville =ville ;
        this.code =nombreClients++ ;


     }
    
    
    public int getCode() {
        return code;
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
    
    public Compte[] getCompte() {
        return this.comptes;
    }
    public void setCompte(Compte[] compte) {
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
    
    
    


    //MENEU :liste of client functions 
    public void menu()
    { 
        int k=1;
        
        while (k!=0) {
            System.out.println("                                client Code :"+this.code);
            System.out.println("options");
            System.out.print("/1:verser");
            System.out.print("/2:");
            System.out.print("/3:");
            System.out.print("/4:");
            System.out.print("/5:");
            k=scanner.nextInt();
            

            switch (k) {
                case 1:
                if (this.comptes==null) {
                    System.out.println("you dont have an account :-( ");
                    break;
                    
                }
                System.out.println("choose an account");
                for (Compte compte : comptes) System.out.println(compte.getNumeroCompte());
                    
                    break;
            
            
                default:
                    break;
            }




            
        }    
     



    }
     

   

}
