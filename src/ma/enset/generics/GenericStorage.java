package ma.enset.generics;
import java.util.*;

public class GenericStorage<T> {
    private List<T> elements = new ArrayList<>();

    public void addElement(T o) { elements.add(o); }
    public void removeElement(int index) { elements.remove(index); }
    public T getElement(int index) { return elements.get(index); }
    public int getSize() { return elements.size(); }

    public static void main(String[] args) {
        GenericStorage<String> names = new GenericStorage<>();
        names.addElement("Java");
        names.addElement("Python");
        System.out.println("Name at 0: " + names.getElement(0));
    }
}