//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("mago do pix");
        Guerreiro guerreiro = new Guerreiro("klebin");
        Arqueiro arqueiro = new Arqueiro("zé flechada");

        mago.mostrarStatus();
        guerreiro.mostrarStatus();
        arqueiro.mostrarStatus();

        System.out.println("--- INÍCIO DA BATALHA ---");

        arqueiro.atacar(mago);
        mago.mostrarStatus();

        System.out.println("mago do pix faleceu sem nem se mover na batalha que noob!");

        System.out.println("\n--- ROUND 2: A VINGANÇA DE KLEBIN ---");
        System.out.println("Klebin ficou furioso com a queda do Mago do Pix e partiu para cima!");

        guerreiro.atacar(arqueiro);

        System.out.println("Zé Flechada tenta revidar!");
        arqueiro.disparoPreciso();
        arqueiro.atacar(guerreiro);


        System.out.println("Klebin não sente o dano e continua avançando!");
        guerreiro.golpepesado();
        guerreiro.atacar(arqueiro);

        System.out.println("Klebin prepara o golpe final!");
        guerreiro.atacar(arqueiro);

        System.out.println(" O GRANDE CAMPEÃO É: " + guerreiro.getNome().toUpperCase());

        System.out.println("com essa vitoria ele ganha 2 reais!");
    }
}