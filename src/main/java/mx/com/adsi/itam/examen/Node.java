package mx.com.adsi.itam.examen;
/**
* Clase utilizada para representar un Nodo de una lista ligada cuyo dato es un String
* para el segundo parcial de ADSI @ITAM
* @author Pablo López Quiles
*/
public class Node {
    
    String data;
    Node next;
    
    /**
     * Constructor de la clase nodo.
     * 
     * @return el nuevo nodo creado , por default su atributo next es null
     */
    Node(String data) {
        this.data = data;
    }
    
    /**
     * Invierte la lista ligada de nodos destruyendo la lista orignal
     * @return el nodo  que es la cabeza de la lista invertida
     */
    Node gus() {
        //caso base/condicion de paro -> llegue al final de la lista
        if(next == null) return this;
        //guarda el valor de mi siguiente nodo
        Node otro = next;
        //hace que ya no tenga siguiente nodo
        next      = null;
        //recorre de manera recursiva para invertir toda la lista
        Node tavo = otro.gus();
        //invierte la lista, hace que mi nodo siguiente apunte a mi
        otro.next = this;
        return tavo;
    }
  
    /**
     * Imprime en la consola la secuencia de Nodos que 
     * componen a esta lista. Por ejemplo, para la lista
     * que devuelve el método "build", la invocación de
     * este metodo escribe en la consola: 
     * 
     * A-->B-->C-->D-->E-->F-->
     * 
     * Lo anterior será lo que se visualiza en la consola 
     * justo después de ejecutar las siguintes dos lineas:
     * 
     *         Node a = build();
     *         a.prn();
     *         
     */
    void prn() {
        Node aux = this;
        while(aux!=null){
            System.out.print(aux.data);
            System.out.print("-->");
            aux = aux.next;
        }
        System.out.println();
    }
    
}// ends Node class