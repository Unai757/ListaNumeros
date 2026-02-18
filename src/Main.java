import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        //Añadimos numeros a la lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        //Creamos el iterador
        System.out.println("¿Que numero quieres usar como multiplo para eliminar numeros de la lista?");
        int numero=sc.nextInt();
        Iterator<Integer> iterator = lista.iterator();
        //comprobamos que si el número es divisible entre 2 que lo elimine
        while (iterator.hasNext()) {
            int numeroBorrar=iterator.next();
            if (numeroBorrar % numero== 0) {
                iterator.remove();

            }
        }
        System.out.println(lista);
        }
    }
