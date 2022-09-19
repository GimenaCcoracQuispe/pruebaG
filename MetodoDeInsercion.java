package metodo.de.insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoDeInsercion {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del sistema"));
        
        arreglo = new int[nElementos];    
        
        System.out.println("Digite el arreglo: ");
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+ ".Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        for(int i=0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]> aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        System.out.println("Orden Ascendente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("Orden Desendente: ");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
            
}

    

