public class Compte {
   
    static int nombreComptes=0;
    private float solde ;
    private int numeroCompte ;
    public Compte(){
       numeroCompte = nombreComptes++ ;
        this.solde =0 ;
        

    }

    
   
    @Override
    public String toString() {
        return "Compte [solde=" + solde + ", numeroCompte=" + numeroCompte + "]";
    }



    public float getSolde() {
        return this.solde;
    }
    public void setSolde(float solde) {
        this.solde = solde;
    }
    public int getNumeroCompte() {
        return this.numeroCompte;
    }
    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
    public void retirer(float solde){

    }
    public void verser(float solde){

    }
    
}
