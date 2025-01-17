import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Initialisation des objets
        // le code de dircteur est 0
        Directeur directeur = new Directeur("youssef", "naji", "El jadida", "DIRECTEUR");
        // le code de client est 1
        Client client1 = new Client("yassin", "naji", "Eljadida");
        // le code de employe est 2
        Employe employe1 = new Employe("karim", "ahmed", "RABT", "right hand");

        // Tableaux pour stocker les informations
        Employe[] tbEmploye = new Employe[2];
        Client[] tbClient = new Client[2];
        tbEmploye[0] = employe1;
        tbClient[0] = client1;

        int nbr = 0; // Compteur pour limiter le nombre de tentatives
        Scanner sc = new Scanner(System.in);

        while (nbr < 3) {
            // Affichage du menu
            String delimiter = "---------------------------------------------------------------";
            System.out.println(delimiter);
            System.out.println("1): I'm Client");
            System.out.println("2): I'm Employe");
            System.out.println("3): I'm Directeur");
            System.out.println(delimiter);
            System.out.print("Enter option: ");

            try {
                int opt = sc.nextInt();

                switch (opt) {
                    case 1: // Gestion du cas Client
                        System.out.print("Code: ");
                        int code = sc.nextInt();
                        boolean clientFound = false;

                        for (Client client : tbClient) {
                            if (client != null && client.getCode() == code) {
                                client.menu("Client: " + client.getNom());
                                clientFound = true;
                                break;
                            }
                        }

                        if (!clientFound) {
                            System.out.println("No client with that code or incorrect code!");
                            nbr++;
                        }
                        break;

                    case 2: // Gestion du cas Employé
                        System.out.print("Code: ");
                        code = sc.nextInt();
                        boolean employeFound = false;

                        for (Employe employe : tbEmploye) {
                            if (employe != null && employe.getCode() == code) {
                                tbClient = employe.menuEmploye("-----------Employe nom: " + employe.getNom() + "---------", tbClient);
                                employeFound = true;
                                break;
                            }
                        }

                        if (!employeFound) {
                            System.out.println("No employe with that code or incorrect code!");
                            nbr++;
                        }
                        break;

                    case 3: // Gestion du cas Directeur
                        System.out.print("Code: ");
                        code = sc.nextInt();

                        if (directeur.getCode() == code) {
                            Client[][] cl = directeur.menuDirecteur(tbEmploye, tbClient);
                            tbEmploye = (Employe[]) cl[0];
                            tbClient = cl[1];
                        } else {
                            System.out.println("Invalid code!");
                            nbr++;
                        }
                        break;

                    default: // Option invalide
                        System.out.println("Invalid option!");
                        nbr++;
                        break;
                }

                // Demander à l'utilisateur s'il souhaite revenir au menu principal ou quitter
                System.out.println("Do you want to return to the main menu or quit?");
                System.out.println("1): Return to Main Menu");
                System.out.println("2): Quit");
                System.out.print("Enter option: ");
                int choice = sc.nextInt();

                if (choice == 2) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine(); // Effacer le buffer
                nbr++;
            } catch (java.util.NoSuchElementException e) {
                System.out.println("No input detected. Exiting...");
                break;
            }
        }

        sc.close(); // Fermer le scanner
    }
}