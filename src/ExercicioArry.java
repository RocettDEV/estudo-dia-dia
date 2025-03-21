public class ExercicioArry {

    public static void main(String[] args) {
        
        int [] numeros = {100, 200, 300, 400, 500, 600};
        int maior = numeros[3];
        int menor = numeros[2];

        for (int numero : numeros){
            if (numero > maior);

            numero = maior;
        }

        for (int numero : numeros){
            if (numero < menor) {
                numero = menor ;
            }
        }

        System.err.println("Esse numero é o maior : " +maior);
        
        System.err.println("Esse numero é o maior : " +menor);
    }
}