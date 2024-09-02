import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        RecebeNotas notas = new RecebeNotas();
        notas.notasValor();
        
    }
}


class RecebeNotas {

    Scanner scanner = new Scanner(System.in);

    void notasValor() {
        System.out.println("**** Calculadora de metas ****");
        System.out.println("Digite os valores das notas para prosseguir");
        System.out.println("Nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.println("Nota 2: ");
        int nota2 = scanner.nextInt();
        System.out.println("Nota 3: ");
        int nota3 = scanner.nextInt();
        System.out.println("Nota 4: ");
        int nota4 = scanner.nextInt();
        int total = nota1+nota2+nota3+nota4;
        int media = total/4;

        System.out.println("As notas informadas foram: \nNota 1: "+nota1+"\nNota 2: "+nota2+"\nNota 3: "+nota3+"\nNota 4: "+nota4);
        System.out.println("A média das quatro notas é:"+media);
        System.out.println("**** FIM DO PROGRAMA ****");
    }


}
}

