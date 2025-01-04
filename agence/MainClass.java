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
        System.out.println("client has bees found--:"+cc.getCode());
        // for (Client client : clients) {
        //     if (client.getCode()==clients[3].getCode()) {
        //         client=null;
                
        //     }
        // }
        for(int i=0;i<clients.length;i++){
            if (clients[i].getCode()==clients[3].getCode()) {
                clients[i]=null;
                
            }

        }
        // clients[3]=null;
        Client ccc=employe.rechercheMembre(clients[3].getCode(), clients);
        System.out.println("client has bees found--:"+ccc.getCode());
        
    }
    

    
}
