import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DDdmaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Map<Integer, String> dddMap = new HashMap<>();

        // Preenchendo o mapa com os DDDs e cidades
        dddMap.put(61, "Brasilia");
        dddMap.put(71, "Salvador");
        dddMap.put(11, "Sao Paulo");
        dddMap.put(21, "Rio de Janeiro");
        dddMap.put(32, "Juiz de Fora");
        dddMap.put(19, "Campinas");
        dddMap.put(27, "Vitoria");
        dddMap.put(31, "Belo Horizonte");

        System.out.println("Digite um DDD: ");

        
        try {
            int ddd = scanner.nextInt(); 

           
            if (dddMap.containsKey(ddd)) {
                System.out.println("Cidade: " + dddMap.get(ddd));
            } else {
                System.out.println("DDD não cadastrado");
            }
        } catch (Exception e) {
            
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        } finally {
            
            scanner.close();
        }
    }
}