/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication11 
{

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
       try
       {
           try (PrintWriter print_writer = new PrintWriter("Mi_archivo.txt")) {
               print_writer.write("Maria 94697805 Juan 12345678 kevin 12457814");
               print_writer.close();
           }
           
           
         Scanner scanner =new Scanner(new File("mi_archivo.txt"));
         while(scanner.hasNext());
         {
             System.out.println("Nombe: "+scanner.next());
             System.out.println("Numero: "+scanner.nextInt());
         }
                    
           scanner.close();
       }catch(FileNotFoundException e)
       {
           System.out.println("Ocurrio un error!");
           e.printStackTrace();
       }
    }
    
}
