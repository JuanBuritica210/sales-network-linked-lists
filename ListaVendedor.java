package Vendedores;



public class ListaVendedor {
	
	NodoVendedor head;
	
	public NodoVendedor getHead() {
		return head;
	}
    public void insertar(Vendedor vendedor){
    	NodoVendedor nuevoNodo = new NodoVendedor();
    	nuevoNodo.setVendedor(vendedor);
        

        //La lista esta vacia
        if(head == null){
            head = nuevoNodo;
        }      
         else { //La lista no esta vacia
        	NodoVendedor ultimo = head;
        	while(ultimo.getNext() != null) {
        		ultimo = ultimo.getNext();
            }
         ultimo.setNext(nuevoNodo);
        }
    }

}
