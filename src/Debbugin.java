public class Debbugin {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no método main");
        a();
        System.out.println("Finalizou o programa no método main");
        
    }

    public static void a() {

        System.out.println("Entou no método A");
        b();
        System.out.println("Finalizou o método A");
    }

    public static void b(){

        System.err.println("Entou no método B");
        c();
        System.out.println("finalizou o método B");
    }

    public static void c(){
        for(int x = 0; x <= 4; x++)System.out.println(x);
        d();
        System.out.println("Finalizou o método C");
    }

    public static void d(){
        System.err.println("EntroU no método D");

        System.out.println("Finalizou o método D");
    }
}
