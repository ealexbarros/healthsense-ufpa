package lanc2018_QRS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Transform1hora_NAOUSAR {

    public static void main(String args[]) throws IOException{
        
        
        Scanner scanner1 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver02/driver02_1hora.csv"));
        FileWriter arq = new FileWriter("/Users/alexsantos/Downloads/LANC2018/driver02/driver02_600.csv");
         PrintWriter gravarArq = new PrintWriter(arq);
         String [] array;            
         String leitorDados;
         leitorDados = scanner1.nextLine();
 		leitorDados = scanner1.nextLine();
 		int countTotal =0;
 	    while (scanner1.hasNext() && countTotal<600) {
           countTotal++;
            gravarArq.printf("driver02");
            System.out.println("entrou aqui");
            		
            for(int i=0; i<994; i++) {
            	if(scanner1.hasNextLine()) {
            	leitorDados = scanner1.nextLine();
            	array= leitorDados.split(",");
            	gravarArq.printf(","+ array[1]);
            }
                    
            
          }
            gravarArq.printf("%n");
        }
         arq.close();
         scanner1.close();  
         System.out.println("counttotal"+ countTotal);
    }
        
        
    }

    
