import java.util.Objects;
import java.util.Scanner;

public class exerc3 {


    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
         String[] nomes = new String[5];

        for (int c=0;c < nomes.length;c++){
            System.out.println("Informe 5 nomes para guardar no array: ");
            nomes[c] = ler.nextLine();
        }

        System.out.println("Digite o nome para verificar se existe no array: ");
        String NomePraVerificar = ler.nextLine();

        for(int j = 0; j < nomes.length ;j++){
            if(Objects.equals(NomePraVerificar, nomes[j])){
                System.out.println("Nome digitado foi encontrado no array");
            }
        }
    }
}
