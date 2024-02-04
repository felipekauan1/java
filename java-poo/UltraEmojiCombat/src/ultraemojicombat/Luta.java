package ultraemojicombat;

import java.util.Random;

public class Luta {
    // Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos
    
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if ((lutador1.getCategoria().equals(lutador2.getCategoria())) && (lutador1 != lutador2)) {
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("--------------------------------------");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("--------------------------------------");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                case 0:
                    System.out.println("--------------------------------------");
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("O lutador1 desafiado ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("--------------------------------------");
                    System.out.println("O lutador2 desafiante ganhou!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
                    
        } else {
            System.out.println("--------------------------------------");
            System.out.println("A luta não foi aprovada para acontecer");
        }
    }
    
    // Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
