public class Compte {
    
   
    static int nombreComptes=0;
    private float solde ;
    private int numeroCompte ;
    private String typeCompte="courant";
    public Compte(){
       numeroCompte = ++nombreComptes ;
        this.solde =0 ;
        
    }
    public String getTypeCompte() {
        return typeCompte;
    }
    public Compte(float solde){

        numeroCompte = nombreComptes++ ;
         this.solde = solde ;
         
 
     }
        public Compte(Compte c){
        this.solde=c.getSolde();
        this.numeroCompte=c.getNumeroCompte();
        }

        
   
    @Override
    public String toString() {
        return "Compte [solde=" + solde + ", numeroCompte=" + numeroCompte + "]";
    }



    public float getSolde() {
        return this.solde;
    }
   
    public int getNumeroCompte() {
        return this.numeroCompte;
    }
    // public void setNumeroCompte(int numeroCompte) {
    //     this.numeroCompte = numeroCompte;
    // }
    public void retirer(float solde){
        if (solde > this.solde) {
            System.out.println("--insufisant money :-(  try less amount "
            +"\n"+"--you have:"+getSolde()
            
            );
            
        }else{
            this.solde-=solde;
            System.out.println("--"+solde+"has been withdrawn successfully :-)  ");
            
        }

    }
    public void verser(float solde){
        this.solde+=solde;
        System.out.println("--"+solde+"has been diposit successfuly :-) ");

    }
    
}
