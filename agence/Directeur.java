import java.util.Scanner;



public class Directeur  extends Employe{
    //sans ajouter compte  a la employe
    //consteceur without parametres for DR
    public Directeur()
      {
         super() ;
      }
      //constracuer with paramatres
    public Directeur(String nom  , String prenom ,String ville , String function )
    { super(nom ,prenom ,ville ,function) ;

    } 
     // memberType{EMPLOYE}
     
    public  Employe[] ajouterEmploye( Employe[] tbEmploye )
    {  
        Scanner sc =new Scanner(System.in);
        Employe c  =new Employe() ;

 
     System.out.print("enter the name of the  employe");
     System.out.print(":");
     c.setPrenom(sc.next());
     System.out.print("enter the last name of the employe");
     System.out.print(":");
     c.setNom(sc.next());
     System.out.print("enter the city  of the  employe");
     System.out.print(":");
     c.setVille(sc.next());
     System.out.println("enter the job of this employe");
     c.setFunction(sc.next()) ;
     Employe newtb[]=new Employe[tbEmploye.length+1];
     for (int i = 0; i < tbEmploye.length; i++) newtb[i]=tbEmploye[i];
     newtb[tbEmploye.length]=c;
     System.out.println("member employe of code  :"+c.getCode()+" has been added succesfully");

    // sc.close();
    return newtb;
    
    }
    ///
      
    public void  supprimerEmploye( int code  ,Employe[] tbEmployes)
    {
        for(int i =0  ;i<tbEmployes.length;i++){
            if(tbEmployes[i]==null)continue;else 
            if(tbEmployes[i].getCode()==code){
                
                System.out.print("Employe"+tbEmployes[i]+"has been deleted succesfully");
                tbEmployes[i] = null ;
              return ;
            }
                
               
            }
            System.out.println("--no Employe with that code found ");
            return ;
    }
    
    
    //print all the information about this member...
    public Client[] consulterEmploye( int code ,Employe[] tbEmploye ,Client[] tbClients )
    {  
        Employe employe =null ;
       for(Employe i : tbEmploye){
        if(i==null)continue  ;
        else if(i.getCode()==code){
            employe =i ;
        }
       }
       if(employe==null){
        System.out.println("there's no one with that code ") ;
        return tbClients ;
       }
       String a ="----------------: inspected employe code " +employe.getCode() +  ":-----------------------------" ;
         tbClients = employe.menuEmploye(a ,tbClients ) ;
         return tbClients ;
        
          
        
    }
     //what the directeur can do ..







     public Client[][] menuDirecteur( Employe[] tbEmploye, Client[] clients) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        String delimiter = "---------------------------------------------------------------";
    
        while (option != 0) {
            System.out.println("--------------------- Directeur--------------------------------");
            System.out.println("-- Options:");
            System.out.println("1) Add Employe");
            System.out.println("2) Add Client");
            System.out.println("3) Remove Employe");
            System.out.println("4) Remove Client");
            System.out.println("5) Inspect Employe");
            System.out.println("6) Inspect Client");
            System.out.println("7) Add Account");
            System.out.println("8) Remove Account");
            System.out.println("9) LISTE ALL EMPLOYES");
            System.out.println("10) LISTE ALL Clients");
            System.out.println("11) my-info");

            System.out.println("0) Quit");
            System.out.println(delimiter);
            System.out.print("enter opt : ") ;
    
            // Validate that input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.next(); // Consume invalid input
                continue;
            }
    
            option = scanner.nextInt();
            int code; // For user input related to codes
     
            switch (option) {
                case 1:
                    System.out.println(delimiter);
                    tbEmploye = this.ajouterEmploye( tbEmploye);
                    Client[] cl =new Client[clients.length+1] ;
                    for (int index = 0; index < clients.length; index++) 
                        cl[index] =clients[index] ;
                         cl[clients.length] = tbEmploye[tbEmploye.length -1] ;
                         clients =cl ;
                    
                    
                    break;
    
                case 2:
                    System.out.println(delimiter);
                    clients = this.ajouterMembre(clients);
                    break;
    
                case 3:
                    System.out.println(delimiter);
                    System.out.print("Enter the Employe code to remove: ");
                    code = scanner.nextInt();
                    this.supprimerEmploye(code, tbEmploye);
                    break;
    
                case 4:
                    System.out.println(delimiter);
                    System.out.print("Enter the Client code to remove: ");
                    code = scanner.nextInt();
                    this.supprimerClient(code, clients) ;
                    break;
    
                case 5:
                    System.out.println(delimiter);
                    System.out.print("Enter the Employe code to inspect: ");
                    code = scanner.nextInt();
                     clients = this.consulterEmploye(code, tbEmploye  ,clients);
                    break;
    
                case 6:
                    System.out.println(delimiter);
                    System.out.print("Enter the Client code to inspect: ");
                    code = scanner.nextInt();
                     this.consulterClient(code, clients);
                     break ;
    
                case 7:
                    System.out.println(delimiter);
                    System.out.print("Enter the Client code to add an account to: ");
                    code = scanner.nextInt();
                    this.ajouterCompte(code, clients);
                    break;
    
                case 8:
                    System.out.println(delimiter);
                    System.out.print("Enter the Client code to remove an account from: ");
                    code = scanner.nextInt();
                    this.supprimerCompte(code, clients);
                    break;
                    case 9 :
                    System.out.println(delimiter);
                    for(Employe i :tbEmploye)
                    { 
                        if(i==null)continue ;else{
                            
                            System.out.println("nom " +i.getNom()+" preonm "+i.getPrenom()+"  code "+i.getCode()) ;
                        }


                    } break ;
                     case 10 :
                     System.out.println(delimiter);
                     for(Client i :clients)
                    { 
                        if(i==null)continue ;else{
                            
                            System.out.println("nom " +i.getNom()+" preonm "+i.getPrenom()+"  code "+i.getCode()) ;
                        }


                    }
                    break ;
                    case 11  :
                    System.out.println(delimiter);
                    
                    this.myInfo("--------------------Directeur----------------");
                        break ;
                    
    
                case 0:
                    System.out.println("Exiting menu. Goodbye!");
                    break;
                     
    
                default:
                    System.out.println(delimiter);
                    System.out.println("Invalid option! Please try again.");
            }
        }
    
       
        return new Client[][] { tbEmploye, clients }; // Return updated references
    }
    
         
   
   
   
   
   
       
       // scanner.close();
   
   
      
     }
   
    
   















     
        
    