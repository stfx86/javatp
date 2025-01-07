import java.util.*;
public class MainClass {
  
    public static void  main(String[] args) {
        Client c=new Client();
        Compte[] cmp=new Compte[3];
        cmp[0]=new Compte(22);
        cmp[1]=new Compte(99);
        cmp[2]=new Compte(100);
    
        //  c.setComptes(cmp);
         
        //  c.menu("client");
         Client []clients={c,new Client("anas"),new Client("yassin"),new Client("ouusama")};
        //  clients[1].menu("client");
        Employe employe=new Employe();
        String label="--------------:Employer Code "+employe.getCode()+":----------------";
        System.out.println(clients[1].getCode());
        clients=employe.menuEmploye(label, clients);


            // employe.ajouterCompte(0, clients);


        // clients[2]=null;
        // Client cc=employe.rechercheMembre(clients[3].getCode(), clients);
        // clients=employe.ajouterMembre(clients, "client");
        // System.out.println(clients[clients.length-1].getNom());
    //    System.out.println(clients[0].getComptes()[2].getSolde());
//        employe.supprimerCompte(clients[0].getCode(), clients);
//        for (Compte cp :clients[0].getComptes()) {
//         if(cp==null)continue;
// System.out.println(cp.getNumeroCompte()+":"+cp.getSolde());        
//        }
    //    System.out.println(clients[0].getComptes()[2].getSolde());
    //    employe.supprimerCompte(clients[0].getCode(), clients);

    // employe.ajouterCompte(clients[0].getCode(), clients);
    
       
       
        
    }
    

    
}
