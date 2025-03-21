public class ContinueExemplo {
    public static void main(String[] args) {
        for(int numero = 1; numero <=20; numero ++){
            if (numero == 3 || numero == 15 || numero == 20) {
                
                continue;
            }
            System.out.println(numero);
        }
        
    }
}

