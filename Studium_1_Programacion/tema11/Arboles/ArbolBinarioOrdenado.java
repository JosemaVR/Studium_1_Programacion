package es.studium.Arboles;

public class ArbolBinarioOrdenado
{
	private ArbolBinarioOrdenado izquierda;
	private Integer valor;
	private ArbolBinarioOrdenado derecha;

	// Constructores
	public ArbolBinarioOrdenado() 
	{
		this.izquierda = null;
		this.setValor(null);
		this.derecha = null;
	}
	public ArbolBinarioOrdenado(Integer v) 
	{
		this.izquierda = null;
		this.setValor(v);
		this.derecha = null;
	}
	public ArbolBinarioOrdenado(ArbolBinarioOrdenado a)
	{
		// David Sánchez
		this.izquierda = a.izquierda;
		this.setValor(a.getValor());
		this.derecha = a.derecha;
	}
	public ArbolBinarioOrdenado(ArbolBinarioOrdenado i, Integer v, ArbolBinarioOrdenado d) 
	{
		this.izquierda = i;
		this.setValor(v);
		this.derecha = d;
		// Completar
	}

	// Setters y Getters
	public ArbolBinarioOrdenado getIzquierda()
	{
		return izquierda;
	}

	public void setIzquierda(ArbolBinarioOrdenado izquierda)
	{
		this.izquierda = izquierda;
	}

	public Integer getValor()
	{
		return valor;
	}

	public void setValor(Integer valor)
	{
		this.valor = valor;
	}

	public ArbolBinarioOrdenado getDerecha()
	{
		return derecha;
	}

	public void setDerecha(ArbolBinarioOrdenado derecha)
	{
		this.derecha = derecha;
	}

	// Otros inspectores
	public void add(Integer v)
	{
		if (v < this.valor)
		{
			if (izquierda != null) 
			{
				izquierda.add(v);
			} 
			else 
			{
				izquierda = new ArbolBinarioOrdenado(v);
			}
		} 
		else 
		{
			if (derecha != null) 
			{
				derecha.add(v);
			} 
			else 
			{
				derecha = new ArbolBinarioOrdenado(v);
			}
		}
	}
	public String mostrar()
	{
		String cadena = "";

		return cadena;
		// Completar
	}
	public boolean buscar(Integer v) 
	{
		boolean resultado = false;
		if (v == this.valor) 
		{
			resultado = true;
		} 
		else if (v < this.valor) 
		{
			if (this.izquierda != null) 
			{
				resultado = this.izquierda.buscar(v);
			} 
			else 
			{
				resultado = false;
			}
		} 
		else 
		{
			if (this.derecha != null) 
			{
				resultado = this.derecha.buscar(v);
			} 
			else 
			{
				resultado = false;
			}
		}
		return resultado;
	}
	public void mostrarIn()
	{
		if(izquierda!=null)
		{
			izquierda.mostrarIn();
		}
		if(valor==null)
		{
			System.out.println("Árbol vacío");
		}
		else
		{
			System.out.println(valor);
		}
		if(derecha!=null)
		{
			derecha.mostrarIn();
		}
	}

	public void mostrarPre()
	{
		if(valor==null)
		{
			System.out.println("Árbol vacío");
		}
		else
		{
			System.out.println(valor);
		}
		if(izquierda!=null)
		{
			izquierda.mostrarPre();
		}
		if(derecha!=null)
		{
			derecha.mostrarPre();
		}
	}

	public void mostrarPos()
	{
		if(izquierda!=null)
		{
			izquierda.mostrarPos();
		}
		if(derecha!=null)
		{
			derecha.mostrarPos();
		}
		if(valor==null)
		{
			System.out.println("Árbol vacío");
		}
		else
		{
			System.out.println(valor);
		}
	}
	public void anular()
	{
		// Álvaro Carballo
		this.izquierda=null;
		this.derecha=null;
		this.setValor(null);
	}
	public boolean arbolVacio()
	{
		// Carolina Ávila
		boolean vacio = false;
		if((this.valor==null)&&(this.izquierda==null)&&(this.derecha==null))
		{
			vacio = true;
		}
		return vacio;
	}
	public ArbolBinarioOrdenado construirArbol(ArbolBinarioOrdenado izquierdo, int valor, ArbolBinarioOrdenado derecho)
	{
		ArbolBinarioOrdenado union = new ArbolBinarioOrdenado();
		return union;
		// Completar ¿?
	}
	public ArbolBinarioOrdenado hijoIzquierdo()
	{
		// Antonio Hernández
		ArbolBinarioOrdenado hijoI = new ArbolBinarioOrdenado();
		hijoI = this.izquierda;
		return hijoI;
	}
	public ArbolBinarioOrdenado hijoDerecho()
	{
		// Alberto Arrojo
		ArbolBinarioOrdenado hijoD = new ArbolBinarioOrdenado();
		hijoD = this.derecha;
		return hijoD;
	}
	public int raiz()
	{
		return this.valor;
	}
	public boolean esHoja(int v)
	{
		// José Manuel Fortún
		boolean resultado = true;
		if((this.izquierda==null)&&(this.derecha==null))
		{
			resultado = true;
		}
		else
		{
			resultado = false;
		}
		return resultado;
	}
	public void eliminarArbol()
	{
		this.izquierda=null;
		this.derecha=null;
		this.setValor(null);
		// El recolector eliminará el objeto
	}
	public int altura()
	{
		// Recursivo
		int altura = 0;
		// Base
		// Caso Recursivo
		return altura;
		// Completar
	}
	public int hojas()
	{
		int hojas = 0;
		// Recorrer todo el árbol
		// Cuando llegue a un nodo, contar si es hoja o no
		return hojas;
		// Completar
	}
	public int contarDato(int x)
	{
		// Parecido a hojas()
		int cuenta = 0;
		return cuenta;
		// Completar
	}
	public int contarNodos()
	{
		// Javier Martín
		int cuenta = 0;
		if(this.valor==null)
		{
			cuenta = 0;
		}
		else
		{
			cuenta = 1;
		}
		if(this.izquierda!=null)
		{
			cuenta+=this.izquierda.contarNodos();

		}
		if(this.derecha!=null)
		{
			cuenta+=this.derecha.contarNodos();

		}
		return cuenta;
	}
	public boolean existe(int x)
	{
		boolean existe = false;
		return existe;
		// Completar
	}
	
	public boolean comparar(ArbolBinarioOrdenado a, ArbolBinarioOrdenado b)
	{
		boolean iguales = true;
		if(a.getValor() == b.getValor())
		{						
			if(a.getIzquierda()!=null && b.getIzquierda()!=null) {
				iguales = comparar(a.getIzquierda(), b.getIzquierda());
			}
			if(a.getDerecha()!=null && b.getDerecha()!=null && iguales == true) {
				iguales = comparar(a.getDerecha(), b.getDerecha());		
			}
		}
		else {
			iguales = false;
		}
		return iguales;
	}
	public ArbolBinarioOrdenado espejo(ArbolBinarioOrdenado x)
	{
		ArbolBinarioOrdenado espejo = new ArbolBinarioOrdenado();
		return espejo;
		// Completar
	}
	public ArbolBinarioOrdenado buscarOrd(int valor)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
		// Completar
	}
	public ArbolBinarioOrdenado insertarOrd(int valor)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
		// Completar
	}
	public ArbolBinarioOrdenado extremoDerecho()
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
		// Completar
	}
	public ArbolBinarioOrdenado extremoIzquierdo()
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
		// Completar
	}
	public ArbolBinarioOrdenado eliminarOrd(int x)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
		// Completar
	}
	public ArbolBinarioOrdenado hacerOrd(ArbolBinarioOrdenado a)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
		// Completar
	}
	public int contarNodosEnNivel(int nivel)
	{
		int nodos = 0;
		return nodos;
		// Completar
	}
}
