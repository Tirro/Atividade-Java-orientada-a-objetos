public class Gincana {
   private String nomeGincana;
   private int totalEstudantes;
   private int pontuacaoMaxima;
    private Estudante estudanteVencedor;

    public String getNomeGincana() {
        return nomeGincana;
    }

    public void setNomeGincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
    }

    public int getTotalEstudantes() {
        return totalEstudantes;
    }

    public void setTotalEstudantes(int totalEstudantes) {
        this.totalEstudantes = totalEstudantes;
    }

    public int getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public Estudante getEstudanteVencedor() {
        return estudanteVencedor;
    }

    public void setEstudanteVencedor(Estudante estudanteVencedor) {
        this.estudanteVencedor = estudanteVencedor;
    }

     int adicionarEstudante(Estudante){
        if ()

    }

    void exibirVencedor(){
        System.out.printf("O vencedor é: " + estudanteVencedor);
    }
}
