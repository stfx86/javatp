import java.util.Arrays;

public class Client {
    


    private String nom ;
    private String prenom ;
    private String ville;
    private int code ;
    static int nombreClients=0;
    private Compte[] comptes ;
    private int nombreCompte =0 ;



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
        System.out.println("1 :");
        System.out.println("1 :");
        System.out.println("1 :");
        System.out.println("1 :");



    }
     

   

}
