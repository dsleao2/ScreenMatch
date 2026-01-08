package br.com.alura.screenmatch.modelos;

public class Filme {
   private String name;
   private int anoDeLancamento;
   private  int duracaoEmMinutos;
   private boolean incluidoNoPlano;
   private double somaDasAvaliacoes;
   private int totalDeAvaliacoes;


   public int getTotalDeAvaliacao(){
      return totalDeAvaliacoes;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAnoDeLancamento(int anoDeLancamento) {
      this.anoDeLancamento = anoDeLancamento;
   }

   public void setDuracaoEmMinutos(int duracaoEmMinutos) {
      this.duracaoEmMinutos = duracaoEmMinutos;
   }

   public void setIncluidoNoPlano(boolean incluidoNoPlano) {
      this.incluidoNoPlano = incluidoNoPlano;
   }

   public void exibirFichaTecnica (){
      System.out.println("Nome do filme: " + name);
      System.out.println("Ano de lançamento: " + anoDeLancamento);
      System.out.println("Duração em minutos: " + duracaoEmMinutos);
      System.out.println("Incluido no plano: " + incluidoNoPlano);
   }

   public  void avalia(double nota){
      somaDasAvaliacoes += nota;
      totalDeAvaliacoes++;
   }

   public double pegaMedia(){

      return somaDasAvaliacoes/totalDeAvaliacoes;
   }

     }

