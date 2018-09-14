package lanc2018_QRS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Mix_Data{

    public static void main(String args[]) throws IOException{
        
        
        Scanner scanner1 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver02/driver02_600.csv"));
        Scanner scanner2 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver03/driver03_600.csv"));
      //  Scanner scanner3 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver04/driver04_994.csv"));
        //Scanner scanner4 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/driver05_994.csv"));
        FileWriter arq = new FileWriter("/Users/alexsantos/Downloads/LANC2018/driver02e03_600.csv");
         PrintWriter gravarArq = new PrintWriter(arq);
                 
         String leitorDados;
         leitorDados = scanner1.nextLine();
 		leitorDados = scanner1.nextLine();
 		leitorDados = scanner2.nextLine();
		leitorDados = scanner2.nextLine();
/*		leitorDados = scanner3.nextLine();
		leitorDados = scanner3.nextLine();
		leitorDados = scanner4.nextLine();
		leitorDados = scanner4.nextLine();
*/		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		while (scanner1.hasNext() || scanner2.hasNext()) {
           
           
            System.out.println("entrou aqui");
            if(scanner1.hasNextLine() && scanner2.hasNextLine() ) {
            	
            	leitorDados = scanner1.nextLine();
                gravarArq.println(leitorDados);
                count2++;
                leitorDados = scanner2.nextLine();
                gravarArq.println(leitorDados);
                count3++;
              /*  leitorDados = scanner3.nextLine();
                gravarArq.println(leitorDados);
                count4++;
                leitorDados = scanner4.nextLine();
                gravarArq.println(leitorDados);
                count5++;*/
            }
                 
            
          
         
        }
         arq.close();
         scanner1.close();
         scanner2.close();
      //   scanner3.close();
       //  scanner4.close();
         System.out.println("count2" + count2);
         System.out.println("count3"+ count3);
     //    System.out.println("count4"+ count4);
       //  System.out.println("count5"+ count5);
        
    }
        
        
    }

    
