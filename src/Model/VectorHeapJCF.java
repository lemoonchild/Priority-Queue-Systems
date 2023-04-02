package Model;

import java.util.PriorityQueue;
import java.util.Vector;

/**
 * The type Vector heap jcf.
 *
 * @param <E> the type parameter
 */
public class VectorHeapJCF<E extends Comparable<E>> extends PriorityQueue<E> {

    /**
     * The Data.
     */
    protected Vector<E> data;

    /**
     * Instantiates a new Vector heap jcf.
     */
    public VectorHeapJCF(){

        data = new Vector<>();

    }

    /**
     * Instantiates a new Vector heap jcf.
     *
     * @param vectorHeap the vector heap
     */
    public VectorHeapJCF(Vector<E> vectorHeap){

        data = new Vector<>(vectorHeap.size());
        for (int i = 0; i < vectorHeap.size(); i++) {
            add(vectorHeap.get(i));
        }

    }

    /**
     * Retorna en la representación padre de un nodo en la localidad i
     *
     * @param i the
     * @return padre del nodo
     */
    protected static int parent(int i)
    {
        return (i - 1) / 2;
    }

    /**
     * Retorna el índice de la representación hijo izquierdo de un nodo en la posición i
     *
     * @param i the
     * @return el índice del hijo izquierdo
     */
    protected static int left(int i)

    {
        return 2 * i + 1;
    }

    /**
     * Se encarga de retornar el índice del hijo derecho de un nodo en la posición i
     *
     * @param i the
     * @return el índice del hijo derecho
     */
    protected static int right(int i)

    {
        return (2 * i + 1) + 1;
    }

    /**
     * Se encarga de mover el nodo en el índice de la hoja hasta la posición apropiada
     *
     * @param leaf the leaf
     */
    protected void percolateUp(int leaf)

    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 &&
                (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    /**
     * Se agrega un valor a la cola de prioridad
     * @param value
     */
    public boolean add(E value)

    {
        data.add(value);
        percolateUp(data.size() - 1);
        return false;
    }


    /**
     * Se encarga de mover el nodo al índice de la raíz de abajo hacia la posición apropiada en el subárbol
     *
     * @param root the root
     */
    protected void pushDownRoot(int root)

    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos + 1)).compareTo
                                (data.get(childpos)) < 0)) {
                    childpos++;
                }

                if ((data.get(childpos)).compareTo
                        (value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root, value);
                    return;
                }
            } else {
                data.set(root, value);
                return;
            }
        }
    }

    /**
     * Su función es eliminar un valor (mínimo) de la cola
     * @return valor mínimo
     */
    public E remove()

    {
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    /**
     * Cumple con la función de capturar el primer valor del vector
     *
     * @return primer valor
     */
    public E getFirst() {
        return data.get(0);
    }

    /**
     * Comprueba si el vector esta vacío
     * @return verdadero o falso
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Permite retornar el tamaño del vector
     * @return tamaño
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Se encarga de quitar todos los datos del vector
     */
    @Override
    public void clear() {

    }


}
