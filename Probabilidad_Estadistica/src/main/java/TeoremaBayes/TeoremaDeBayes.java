package TeoremaBayes;
import java.util.Scanner;

public class TeoremaDeBayes {

    public static void main(String[] args) {
        // Solicitar las probabilidades al usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar las probabilidades al usuario
            System.out.println("Calculo de la probabilidad utilizando el Teorema de Bayes");
            
            System.out.print("Ingrese P(A) (probabilidad de A): ");
            double pA = scanner.nextDouble();
            
            System.out.print("Ingrese P(B|A) (probabilidad de B dado A): ");
            double pBA = scanner.nextDouble();
            
            System.out.print("Ingrese P(B) (probabilidad de B): ");
            double pB = scanner.nextDouble();
            
            // Validar que P(B) no sea 0 para evitar division entre cero
            if (pB == 0) {
                System.out.println("Error: P(B) no puede ser igual a 0.");
            } else {
                // Aplicar la formula del teorema de Bayes
                double pAB = (pBA * pA) / pB;
                
                // Mostrar el resultado
                System.out.println("La probabilidad de A dado B (P(A|B)) es: " + pAB);
            }
        }
    }
}
