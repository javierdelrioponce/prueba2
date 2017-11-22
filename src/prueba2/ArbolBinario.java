
package prueba2;

public class ArbolBinario{
    
    Nodo raiz;
    
    public ArbolBinario() {
        this.raiz = null;
    }
    //METODOS PUBLICOS PARA EL MAIN
    public void preorden()
    {
        preorden(this.raiz);
    }
    
    public void postOrden()
    {
        postOrden(this.raiz);
    }
    
    public void inOrden()
    {
        inOrden(this.raiz);
    }
    
    //METODOS PRIVADOS DEL ARBOL
    private void preorden(Nodo n)
    {
        if (n != null)
        {
            System.out.print(" "+ n.getDato());
            preorden(n.getHijoIzq());
            preorden(n.getHijoDer());
        }
    }
    
    private void postOrden(Nodo n)
    {
        if (n != null)
        {
            
            postOrden(n.getHijoIzq());
            postOrden(n.getHijoDer());
            System.out.print(" "+ n.getDato());
        }
    }
    
    private void inOrden(Nodo n)
    {
        if (n != null)
        {
            
            inOrden(n.getHijoIzq());
            System.out.print(" "+ n.getDato());
            inOrden(n.getHijoDer());
        }
    }
    
    

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    //siguiente clase
    
    public String buscar (int nro)
    {
        if (buscar(this.raiz,nro))
        {
            return "Encontrado";
        }
        else
        {
            return "no encontrado";
        }
    }
    
    private boolean buscar (Nodo n, int nro)
    {
        if( n != null)
        {
            if (n.getDato() == nro)
            {
                return true;
            }
            else
            {
                boolean ok1 = buscar(n.getHijoIzq(),nro);
                boolean ok2 = buscar(n.getHijoDer(),nro);
                
                //if ((ok1 == true ) || (ok2 == true))
                if ((ok1) || (ok2))    
                {
                    return true;
                }
//                else
//                {
//                    return false;
//                }
                    
                
            }
            
        }
        return false;
    }
    
    
    //contar elementos 
    public String contar(){
        
        int cant = contar(this.raiz);
        return "el arbol tiene " + cant + " nodos";
        
    }
    
    private int contar(Nodo n)
    {
        if (n == null)
        {
            return 0;
        }
        else
        {
            int c1 = contar(n.getHijoIzq());
            int c2 = contar(n.getHijoDer());
            int c3 = c1 + c2 +1; //el 1 es el padre
            return c3;
        }
    }
    
    //sumar elementos 
    public String sumar(){
        
        int cant = sumar(this.raiz);
        return "la suma de los elementos del arbol es:  " + cant;
        
    }
    
    private int sumar(Nodo n)
    {
        if (n == null)
        {
            return 0;
        }
        else
        {
            int c1 = sumar(n.getHijoIzq());
            int c2 = sumar(n.getHijoDer());
            int c3 = c1 + c2 +n.getDato();
            return c3;
        }
    }
    
    //atura de un arbol
    public String altura()
    {
        int alt = altura(this.raiz);
        return "la altura de un arbol es: " + alt;
    }
    
    private int altura(Nodo n)
    {
        
        if(n == null )
        {
            return 0;
        }
        else
        {
            int h1 = altura(n.getHijoIzq());
            int h2 = altura(n.getHijoDer());
            //me sirve la mayor altura
            if(h1>h2)
            {
                return h1 +1;
            }
            else
            {
                return h2 +1;
            }
        }
        
    }
    
    //mayor valor del arbol
    
     public String buscarMayor()
    {
        int mayor = buscarMayor(this.raiz);
        return "el mayor dato es: " + mayor;
    }
    
    private int buscarMayor(Nodo n)
    {
        
        if(n == null )
        {
            return 0;
        }
        else
        {
            int m1 = buscarMayor(n.getHijoIzq());
            int m2 = buscarMayor(n.getHijoDer());
            int m3 = n.getDato(); //el padre
            
            if (m1 >= m2 && m1 >= m3){
                return m1;
            }
            else
            {
                if (m2 >= m1 && m2 >= m3)
                {
                    return m2;
                }
                else{
                    return m3;
                }   
            }
        }
        
    }
     
    
}
