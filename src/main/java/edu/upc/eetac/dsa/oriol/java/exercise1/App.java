package edu.upc.eetac.dsa.oriol.java.exercise1;

// Constructures, sobrecarga y sobreescritura

public class App 
{
    public static void main( String[] args )
    {    	
            Tree[] arboles = new Tree[4];
            arboles[0] = new Tree(4); 
            arboles[1] = new Tree("Roble"); 
            arboles[2] = new Tree(); 
            arboles[3] = new Tree(5,"Pino");
            
            for (Tree a : arboles)
           	System.out.println(a);
                     
           // int i = 0;
           // while (i<5){
           //  System.out.println(arboles[i]);
           // i++;
           // }
    }
}
