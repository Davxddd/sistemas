import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int Ce = Integer.parseInt(br.readLine());

        String[] nombres = new String[Ce];
        double[] notas = new double[Ce];

        for (int i = 0; i < Ce; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = br.readLine();
            System.out.print("Ingrese el apellido del estudiante " + (i + 1) + ": ");
            String apellido = br.readLine();

            if (nombre.length() == 0 || apellido.length() == 0) {
                System.out.println("Ingrese sus nombres y sus apellidos");
                i--;
                continue;
            }
            nombres[i] = nombre + " " + apellido;
            double nota;
            do {
                System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
                nota = Double.parseDouble(br.readLine());
            } while (nota < 0 || nota > 20);

            notas[i] = nota;
        }

        double SumNot = 0;
        double notAlta = notas[0];
        double notBaja = notas[0];

        for (double nota : notas) {
            SumNot += nota;
            if (nota > notAlta) {
                notAlta = nota;
            }
            if (nota < notBaja) {
                notBaja = nota;
            }
        }

        double promedio = SumNot / Ce;
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("La nota más alta es: " + notAlta);
        System.out.println("La nota más baja es: " + notBaja);
    }
}
