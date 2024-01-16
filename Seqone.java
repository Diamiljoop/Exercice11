import java.util.*;
public class Seqone{


    public static void main(String[] args) {
        // creaion d'objet scanner qui permet de recuperer la taille du tableau
        Scanner sc= new Scanner(System.in);
       Random nombre_aleatoire=new Random();
        System.out.println("Donner la taille du tableau");
        int taiile_tableau=sc.nextInt();
        int [] tabsequence=new int[taiile_tableau];
        //int [] tabcomptage=new int[taiile_tableau];
        int somme_un=0;
        int somme_seq2=0;
        int somme_seq3=0;

        // boucle permettant l'affectation de chaque valeur 
        for(int i=0; i<taiile_tableau; i++){
            tabsequence[i]=nombre_aleatoire.nextInt((1 - 0) + 1) + (0);
        }
        // boucle qui permet de le nombre d'iteration par sequence
        for(int i=0; i<taiile_tableau; i++){
            System.out.print(tabsequence[i]+" ");
        }
            for(int i=0; i<taiile_tableau; i++){
            if(tabsequence[i]==1){
                somme_un++;
                if(tabsequence[i]==tabsequence[i-1]){
                somme_seq2++;
                if(tabsequence[i]==tabsequence[i-1] && tabsequence[i-1]==tabsequence[i-2]){
                somme_seq3++;
            }
            }
            }
            
        
            }
              // Affichage des sequences
            System.out.println();
            System.out.println(somme_un+" sequence de longeur de 1");
            System.out.println(somme_seq2+" sequence de longeur de 2");
            System.out.println(somme_seq3+" sequence de longeur de 3");
        
            
        }


        



        
    }


    
