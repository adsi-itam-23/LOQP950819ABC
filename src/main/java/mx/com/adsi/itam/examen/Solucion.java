package mx.com.adsi.itam.examen;
import java.util.logging.Logger;
/**
 * Clase utilizada para el segundo parcial de ADSI @ITAM
 * @author Pablo López Quiles
 */
public class Solucion {


    public final static Logger LOG = Logger.getLogger(Solucion.class.getName());
    /**
     * 
     * Crea una lista ligada con 6 nodos inciales con las primeras letras del alfabeto
     * 
     * @return Un objeto nodo que representa la cabeza de la lista
     */
    private Node build() {
        LOG.info("Creando lista ligada");
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba
     */
    public void ok() {
        LOG.info("Comenzando prueba");
        Node a = build();
        LOG.info("Imprimiendo lista orignal");
        a.prn();
        a = a.gus();
        LOG.info("Imprimeindo lista invertida");
        a.prn();
        LOG.info("Regresandoa  lista orignal ");
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    public static void main(String...argv) {
        new Solucion().ok();
    }

}