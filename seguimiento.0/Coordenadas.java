import java.util.Scanner; // Importamos Scanner para leer lo que el usuario escribe

    public class Coordenadas {
        public static double calcularPuntoMedio(double coordA, double coordB) {

    // Fórmula del punto medio: sumar las dos coordenadas y dividir entre 2
    double medio = (coordA + coordB) / 2;
    return medio; // Devolvemos el resultado
}
 public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        // Fórmula: m = (y2 - y1) / (x2 - x1)
        double pendiente = (y2 - y1) / (x2 - x1);
        return pendiente;
    }

public static void mostrarEcuacionRecta(double pendiente, double x1, double y1) {
        // Despejamos b de: y = mx + b  →  b = y1 - m * x1
        double b = y1 - (pendiente * x1);
        System.out.println("Ecuación de la recta: y = " + pendiente + "x + " + b);
}
        public static void main(String[] args) {

            // Creamos el Scanner para leer datos del teclado
            Scanner sc = new Scanner(System.in);
            // Calculamos las coordenadas del punto medio M
            // Pedimos y guardamos las coordenadas de Martín (Punto A)
            System.out.print("Ingrese x1 (coordenada x de Martín): ");
            double x1 = sc.nextDouble();

            System.out.print("Ingrese y1 (coordenada y de Martín): ");
            double y1 = sc.nextDouble();

            // Pedimos y guardamos las coordenadas de Ricardo (Punto B)
            System.out.print("Ingrese x2 (coordenada x de Ricardo): ");
            double x2 = sc.nextDouble();

            System.out.print("Ingrese y2 (coordenada y de Ricardo): ");
            double y2 = sc.nextDouble();

            // Calculamos las coordenadas del punto medio
            double xM = calcularPuntoMedio(x1, x2);
            double yM = calcularPuntoMedio(y1, y2);
            // Mostramos el resultado al usuario
            System.out.println("Las coordenadas del punto medio M son: (" + xM + ", " + yM + ")");
    
     // BONO 1: Calculamos y mostramos la pendiente
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        System.out.println("La pendiente de la recta es: " + pendiente);

        // BONO 2: Mostramos la ecuación general de la recta
        mostrarEcuacionRecta(pendiente, x1, y1);
        
        // Cerramos el Scanner para liberar recursos
        sc.close();
        }
}


/*   calcula el punto medio entre las casas de
 *   Martín (punto A) y Ricardo (punto B), para que se encuentren
 *   en un lugar equidistante.
 *
 * Entradas:
 *   - x1 (double): coordenada x de la casa de Martín
 *   - y1 (double): coordenada y de la casa de Martín
 *   - x2 (double): coordenada x de la casa de Ricardo
 *   - y2 (double): coordenada y de la casa de Ricardo
 *
 * Salidas:
 *   - xM (double): coordenada x del punto medio
 *   - yM (double): coordenada y del punto medio
 */