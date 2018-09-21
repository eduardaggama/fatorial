package login01;
import java.util.Scanner;
public class Login {

    private final String usuario = "java8";
    private final String senha = "java8";

    public void logIn() {

        Scanner sc = new Scanner(System.in);

        for (int i = 2; i > -1; i--) {
            System.out.println("login:");
            String usuarioLogin = sc.nextLine();

            System.out.println("senha:");
            String senhaPass = sc.nextLine();

            if (this.usuario.equals(usuarioLogin) && this.senha.equals(senhaPass)) {

                System.out.println("login e senha válidos.");
                break;
            } else {
                System.out.println("falha, verifique login e senha.\n"
                        + "você tem mais " + i + " tentativa(s).");
            }
        }
    }
}