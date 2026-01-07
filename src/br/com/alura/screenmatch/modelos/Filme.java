package br.com.alura.screenmatch.modelos;

public class Filme {
   public String name;
   int anoDeLancamento;
   int duracaoEmMinutos;
   boolean incluidoNoPlano;
   private double somaDasAvaliacoes;
   private int totalDeAvaliacoes;


   public int getTotalDeAvaliacao(){
      return totalDeAvaliacoes;
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

