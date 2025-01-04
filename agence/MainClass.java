import java.util.*;
public class MainClass {
  
    public static void  main(String[] args) {
        Client c=new Client();
        Compte[] cmp=new Compte[3];
        cmp[0]=new Compte(22);
        cmp[1]=new Compte(99);
        cmp[2]=new Compte(100);
    
         c.setComptes(cmp);

        c.menu();
    
        
    }
    

    
}
