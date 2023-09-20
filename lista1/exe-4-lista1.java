import java.util.Scanner;

public class exe4 {

    private static final String SENHA_SECRETA = "python123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (!senha.equals(SENHA_SECRETA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals(SENHA_SECRETA));

        System.out.println("Senha correta!");
    }
}