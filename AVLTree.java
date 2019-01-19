package rsn170330.sp05;

//Starter code for AVL Tree
import java.util.Comparator;

public class AVLTree<T extends Comparable<? super T>> extends BinarySearchTree<T> {
    static class Entry<T> extends BinarySearchTree.Entry<T> {
        int height;
        Entry(T x, Entry<T> left, Entry<T> right) {
            super(x, left, right);
            height = 0;
        }
    }

    AVLTree() {
	super();
    }

    @Override
    public boolean add(T x) {
	return super.add(x);
    }
}
/**
 * AVL Tree and RedBlack Tree looks same, but AVL Tree is easy to code. 
 * Also, AVL Tree can only be two pass.
 *  
 * Whereas, RedBlack Tree can be done in single pass (might be the reason 
 * for Java to implement RedBlack Tree). 
 */
