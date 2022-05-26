package dio.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author CarlosOliveira0
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() { super(); }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
