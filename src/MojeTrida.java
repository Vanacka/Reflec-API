import java.lang.reflect.Method;

public class MojeTrida {
    int rok;

    public MojeTrida(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "MojeTrida{" +
                "rok=" + rok +
                '}';
    }

    public static void main(String[] args) {
        MojeTrida mt = new MojeTrida(2024);
        String str = "aaaa";

        Class <?> cls = mt.getClass();
        Method[] methods = cls.getMethods();
        System.out.println(ziskejPredka(cls));

        // Vypise jmena metod ktera tato trida pouziva
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
    // Vypise vsechny predky aktualni tridy
    public static Class<?> ziskejPredka(Class<?> predek) {
        Class <?> cls = predek.getSuperclass();
        if (cls == null) {
            return predek;
        }
        else {
            return ziskejPredka(cls);
        }
    }
}
