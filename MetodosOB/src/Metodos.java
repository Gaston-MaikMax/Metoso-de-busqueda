import java.util.Scanner;
public class Metodos {
    public void mostrar(int[] x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print("["+x[i]+"]");
        }
    }
    public void leer(int[] x)
    {
        boolean pasar=false;
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<x.length;i++)
        {
           do{
            try{
            System.out.print("Elemento "+(i+1)+" => ");
            x[i]=sc.nextInt();
            pasar=true;
            }
          catch(Exception e)
            {
             System.out.println("El caracter no es valido, ingrese solo numeros");
             sc.nextLine();
            }
           }while(pasar==false);
           pasar=false;
        }
    }
    //gabo was here
    public static void quicksort(int A[], int izq, int der) {
        int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho
}

    public int[] MergeSort(int[] vector)
    {
        int i,j,k;
        
        if(vector.length>1)
        {
            //dividiendo el vector
            int izq=vector.length/2;
            int der=vector.length-izq;
            int vecIzq[]=new int[izq];
            int vecDer[]=new int[der];
            //poniendo los dados de vector original en los auxiliares
            for(i=0;i<izq;i++)
            {
                vecIzq[i]=vector[i];
            }
            
            for(i=izq;i<(izq+der);i++)
            {
                vecDer[i-izq]=vector[i];
            }
            
            vecIzq=MergeSort(vecIzq);  //parte recurciva
            vecDer=MergeSort(vecDer);  //parte recurciva
            i=0;
            j=0;
            k=0;
            //ordenado el vector
            while(vecIzq.length!=j&&vecDer.length!=k)
            {
                if(vecIzq[j]<vecDer[k])
                {
                    vector[i]=vecIzq[j];
                    i++;
                    j++;        
                }
                else
                {
                    vector[i]=vecDer[k];
                    i++;
                    k++;
                }
            }
             //uniendo el vector
              while(vecIzq.length!=j)
            {
                vector[i]=vecIzq[j];
                i++;
                j++;
            }
            while(vecDer.length!=k)
            {
                vector[i]=vecDer[k];
                i++;
                k++;
            }
        }
        return vector;
    }
    public void fnSortHeap(int v[], int arr_ubound) 
    { 
        int i, o;
        int lChild, rChild, mChild, root, temp; 
        root = (arr_ubound - 1) / 2; 
        for (o = root; o >= 0; o--) { 
            for (i = root; i >= 0; i--) { 
                lChild = (2 * i) + 1; 
                rChild = (2 * i) + 2; 
                if ((lChild <= arr_ubound) && (rChild <= arr_ubound)) { 
                    if (v[rChild] >= v[lChild]) 
                        mChild = rChild; 
                    else 
                        mChild = lChild; 
                } else { 
                    if (rChild > arr_ubound) 
                        mChild = lChild; 
                    else 
                        mChild = rChild; 
                } 
                if (v[i] < v[mChild]) { 
                    temp = v[i]; 
                    v[i] = v[mChild]; 
                    v[mChild] = temp; 
                } 
            } 
        } 
        temp = v[0]; 
        v[0] = v[arr_ubound]; 
        v[arr_ubound] = temp; 
        return; 

    }
    public int[]Boubblesort(int vector[])
    {
        int aux=0;
        for(int i=0;i<vector.length;i++)
        {
            for(int j=0;j<vector.length-1;j++)
            {
                if(vector[j]>vector[j+1])
                {
                   aux=vector[j];
                   vector[j]=vector[j+1];
                   vector[j+1]=aux;
                }
            }
        }
        return vector;
    }
    public int BusquedaSecuencia(int vector[],int x)
    {
       int i;
       boolean encontrado=false;
       for(i=0;i<vector.length&&encontrado==false;i++)
       {
           if(x==vector[i])
           {
               encontrado=true;
               return i;
               
           }
       }
       return -1;
    }
}
