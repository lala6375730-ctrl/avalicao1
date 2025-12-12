import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[8];

        System.out.println("\nInforme as 8 notas do aluno:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextFloat();
        }

        float bimestre1 = (notas[0] + notas[1]) / 2;
        float bimestre2 = (notas[2] + notas[3]) / 2;
        float bimestre3 = (notas[4] + notas[5]) / 2;
        float bimestre4 = (notas[6] + notas[7]) / 2;

        float semestre1 = (bimestre1 + bimestre2) / 2;
        float semestre2 = (bimestre3 + bimestre4) / 2;

        float mediaFinal = (semestre1 + semestre2) / 2;

        System.out.println("\n--- Resultados ---");
        System.out.printf("1º Bimestre: %.1f\n", bimestre1);
        System.out.printf("2º Bimestre: %.1f\n", bimestre2);
        System.out.printf("1º Semestre: %.1f\n", semestre1);
        System.out.println("-----------------");
        System.out.printf("3º Bimestre: %.1f\n", bimestre3);
        System.out.printf("4º Bimestre: %.1f\n", bimestre4);
        System.out.printf("2º Semestre: %.1f\n", semestre2);
        System.out.println("-----------------");
        System.out.printf("Media Final: %.1f\n", mediaFinal);

        entrada.close();

    }
}
