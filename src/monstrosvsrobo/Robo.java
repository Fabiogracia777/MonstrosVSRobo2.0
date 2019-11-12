package monstrosvsrobo;

public class Robo implements MonstrosVsRobo {

    private int HP;
    private String NOME;
    private Double ATAQUE;
    private Double DEFESA;
    private Double AGILIDADE;

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    @Override
    public void setATAQUE(Double ATAQUE) {
        this.ATAQUE = ATAQUE;
    }

    @Override
    public void setDEFESA(Double DEFESA) {
        this.DEFESA = DEFESA;
    }

    @Override
    public void setAGILIDADE(Double AGILIDADE) {
        this.AGILIDADE = AGILIDADE;
    }

}
