import java.util.*;
public class MainClass {
  
    public static void  main(String[] args) {
        Client c=new Client();
        Compte[] cmp=new Compte[3];
        cmp[0]=new Compte(22);
        cmp[1]=new Compte(99);
        cmp[2]=new Compte(100);
    
         c.setComptes(cmp);
         String label="--------------:client Code "+c.getCode()+":----------------";
         // c.menu(label);
         Client []clients={c,new Client("anas"),new Client("yassin"),new Client("ouusama")};
        Employe employe=new Employe();
        // clients[2]=null;
        Client cc=employe.rechercheMembre(clients[3].getCode(), clients);
        clients=employe.ajouterMembre(clients, "cliensg");
        System.out.println(clients[clients.length-1].getNom());
       
       
        
    }
    

    
}
