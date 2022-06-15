import java.util.Scanner;
public class Manejo {
    public static void main(String args[])
    {
        int n=0;
        boolean pasar=false;
        Scanner sc=new Scanner(System.in);
        Metodos Met=new Metodos();
        int vec2[]={9,6,2,3,7};
        System.out.println("ORDENAMIENTO Y BUSQUEDA");
        
        do{
        System.out.print("Ingrese la dimencion del Vector: ");
            try{
            
            n=sc.nextInt();
            pasar=true;
            }
          catch(Exception e)
            {
             System.out.println("El caracter no es valido, ingrese solo numeros");
             sc.nextLine();
            }
           }while(pasar==false);
          pasar=false;
        int vec[]=new int[n];
        System.out.println();
        Met.leer(vec);
        System.out.println();
        Met.mostrar(vec);
        int izq = 0;
        int der = vec.length-1;
        Met.quicksort(vec,izq,der);
        System.out.println();
        Met.mostrar(vec);
        /*for (int i = vec.length; i > 1; i--) 
        { 
            Met.fnSortHeap(vec, i - 1); 
        } 
        System.out.println();
        Met.mostrar(vec);
        
        /*System.out.println();
        vec=Met.MergeSort(vec);
        System.out.println();
        Met.mostrar(vec);
        System.out.println();
        Met.mostrar(vec2);
        System.out.println();
        vec2=Met.MergeSort(vec2);
        System.out.println();
        Met.mostrar(vec2);*/
    }
}
