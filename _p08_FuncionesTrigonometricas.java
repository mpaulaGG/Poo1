// Calcula funciones trigonometricas de un angulo en radianes

import java.util.Scanner;

public class _p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un angulo en grados : ");
        double angulog = new Scanner(System.in).nextDouble();
        double angulor = Math.toRadians(angulog);

        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);

        System.out.println(String.format("El angulo es: %.2f,seno: %.2f, coseno %.2f, Tangente: %.2f",angulor,sen,cos,tan));


    }
    
}
