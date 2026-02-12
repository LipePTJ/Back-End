package ex1;

public class Gato {

    public String nomee;
    public int idadee;
    public String sexoo;
    public String racaa;


    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nomee + '\'' +
                ", idade=" + idadee +
                ", sexo='" + sexoo + '\'' +
                ", raca='" + racaa + '\'' +
                '}';
    }

    public Gato(String nome, int idade, String sexo, String raca) {
        this.nomee = nome;
        this.idadee = idade;
        this.sexoo = sexo;
        this.racaa = raca;




    }
}
