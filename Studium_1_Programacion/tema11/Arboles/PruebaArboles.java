package es.studium.Arboles;

public class PruebaArboles
{
	public static void main(String[] args) 
	{
        ArbolBinarioOrdenado arbol1 = new ArbolBinarioOrdenado(10);
        ArbolBinarioOrdenado arbol2 = new ArbolBinarioOrdenado(); 
        ArbolBinarioOrdenado arbol3 = new ArbolBinarioOrdenado(10);
        ArbolBinarioOrdenado arbol4 = new ArbolBinarioOrdenado(10);

        arbol1.add(5);
        arbol1.add(15);
        arbol1.add(1);
        arbol1.add(3);
        
        arbol3.add(5);
        arbol3.add(15);
        arbol3.add(1);
        arbol3.add(3);
     
        arbol4.add(5);
        arbol4.add(15);
        arbol4.add(1);
        arbol4.add(2);
     
        if(arbol1.comparar(arbol3, arbol1) == true) {
        	System.out.println("CORRECTO");
        }else {
        	System.out.println("FALLO");
        } 
        
        if(arbol1.comparar(arbol4, arbol1) == true) {
        	System.out.println("CORRECTO");
        }else {
        	System.out.println("FALLO");
        }
        
        if(arbol1.comparar(arbol1, arbol2) == true) {
        	System.out.println("CORRECTO");
        }else {
        	System.out.println("FALLO");
        }

        
    }
}
