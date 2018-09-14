package lanc2018_QRS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Transform {

    public static void main(String args[]) throws IOException{
        
        
        Scanner scanner1 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner2 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner3 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner4 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner5 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner6 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner7 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner8 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner9 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        Scanner scanner10 = new Scanner(new FileReader("/Users/alexsantos/Downloads/LANC2018/driver05/drive05_0_1min.csv"));
        FileWriter arq = new FileWriter("/Users/alexsantos/Downloads/LANC2018/driver05/driver05_994.csv");
         PrintWriter gravarArq = new PrintWriter(arq);
         String [] array;            
         String leitorDados;
         leitorDados = scanner1.nextLine();
 		leitorDados = scanner1.nextLine();
 		leitorDados = scanner2.nextLine();
		leitorDados = scanner2.nextLine();
		leitorDados = scanner3.nextLine();
		leitorDados = scanner3.nextLine();
		leitorDados = scanner4.nextLine();
		leitorDados = scanner4.nextLine();
		leitorDados = scanner5.nextLine();
		leitorDados = scanner5.nextLine();
		leitorDados = scanner6.nextLine();
		leitorDados = scanner6.nextLine();
		leitorDados = scanner7.nextLine();
		leitorDados = scanner7.nextLine();
		leitorDados = scanner8.nextLine();
		leitorDados = scanner8.nextLine();
		leitorDados = scanner9.nextLine();
		leitorDados = scanner9.nextLine();
		leitorDados = scanner10.nextLine();
		leitorDados = scanner10.nextLine();
        while (scanner1.hasNext() || scanner2.hasNext() || scanner3.hasNext() ||scanner4.hasNext() || scanner5.hasNext() || scanner6.hasNext() || scanner7.hasNext() || scanner8.hasNext() || scanner9.hasNext() || scanner10.hasNext()) {
           
            gravarArq.printf("driver05");
            System.out.println("entrou aqui");
            		
            for(int i=0; i<994; i++) {
            	if(scanner1.hasNextLine()) {
            	leitorDados = scanner1.nextLine();
            	array= leitorDados.split(",");
            	gravarArq.printf(","+ array[1]);
            }
            	else if(scanner2.hasNextLine()) {
            		
            		leitorDados = scanner2.nextLine();
                	array= leitorDados.split(",");
                	gravarArq.printf(","+ array[1]);
            } 
            	else if(scanner3.hasNextLine()) {
            		
            		leitorDados = scanner3.nextLine();
                	array= leitorDados.split(",");
                	gravarArq.printf(","+ array[1]);
            }  
            	else if(scanner4.hasNextLine()) {
	
            		leitorDados = scanner4.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            	else if(scanner5.hasNextLine()) {
	
            		leitorDados = scanner5.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            	else if(scanner6.hasNextLine()) {
	
            		leitorDados = scanner6.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            	else if(scanner7.hasNextLine()) {
	
            		leitorDados = scanner7.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            	else if(scanner8.hasNextLine()) {
	
            		leitorDados = scanner8.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            	else if(scanner9.hasNextLine()) {
	
            		leitorDados = scanner9.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            	else if(scanner10.hasNextLine()) {
	
            		leitorDados = scanner10.nextLine();
            		array= leitorDados.split(",");
            		gravarArq.printf(","+ array[1]);
            	}  
            
            
          }
            gravarArq.printf("%n");
        }
         arq.close();
         scanner1.close();
         scanner2.close();
         scanner3.close();
         scanner4.close();
         scanner5.close();
         scanner6.close();
         scanner7.close();
         scanner8.close();
         scanner9.close();
         scanner10.close();
         
        
    }
        
        
    }

    
