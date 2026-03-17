public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;

    }
        public void atacar(Personagem alvo) {
            System.out.println("\n" + this.nome + " atacou " + alvo.nome);
            alvo.receberDano(this.ataque);
        }

        public void receberDano(int dano) {
            this.vida -= dano;
            if (this.vida < 0) this.vida = 0;
            System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
        }

        public void mostrarStatus() {
            System.out.println("--- " + this.nome + " ---");
            System.out.println("Vida: " + this.vida);
            System.out.println("Forca: " + this.ataque);
            System.out.println("Defesa: " + this.defesa);
        }


    }


