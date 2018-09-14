package lanc2018_QRS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class TransformHora {

    public static void main(String args[]) throws IOException{
        
        
        Scanner scanner1 = new Scanner(new FileReader("/Users/alexsantos/Downloads/drivers/artigo/d15_ecg.csv"));
        String [] array;            
        String leitorDados;
        leitorDados = scanner1.nextLine();
 		leitorDados = scanner1.nextLine();
 		int k =1;
 		//o numero magico 501 representa a quantidade de arquivos que desejo gerar menos um
 		while (scanner1.hasNext() && k < 501) {
 			
 			FileWriter arq = new FileWriter("/Users/alexsantos/Downloads/drivers/artigo/driver015_"+k+".csv");
 	        PrintWriter gravarArq = new PrintWriter(arq);
 	        k++;
            gravarArq.printf("'Elapsed time','ECG'\n" + 
            		"'hh:mm:ss.mmm','mV'\n");
            System.out.println("entrou aqui");
            	
            //o numero magico 2480 representa 5 segundos de coleta.
            for(int i=0; i<2480; i++) {
            	if(scanner1.hasNextLine()) {
            	leitorDados = scanner1.nextLine();
            	gravarArq.println(leitorDados);
            }
                    
            
          }
            arq.close();
        }
         
         scanner1.close();
        
         
        
    }
        
        
    }

    
