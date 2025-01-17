public class CompteE extends Compte {
    private String typeCompte="Epargne";
    float sold_retirer = 0 ;
    @Override
    public void retirer(float solde){
      if((sold_retirer+=solde) <= 1000){ // 24 hours equal program open 
         super.retirer(solde);
      }else
      System.out.print("you pass 1000 DH") ;

      
       
 
    }
    public String getTypeCompte() {
       return typeCompte;
    }
 }