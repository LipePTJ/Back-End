package gettersEsetterss;

public class Main {
    static void main(){

    Fuincionario fuincionario = new Fuincionario();

        IO.println(fuincionario.getNome());

    fuincionario.setNome("joao");

        IO.println(fuincionario.getNome());

    fuincionario.setSalario(850);

        IO.println(fuincionario.getSalario());

        fuincionario.setCargo("lider de vendas");

        IO.println(fuincionario.getCargo());


    }
}
