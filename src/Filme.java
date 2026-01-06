public class Filme {
   String name;
   int anoDeLancamento;
   int duracaoEmMinutos;
   boolean incluidoNoPlano;
   private double somaDasAvaliacoes;
   private int totalDeAvaliacoes;


   int getTotalDeAvaliacao(){
      return totalDeAvaliacoes;
   }

   void exibirFichaTecnica (){
      System.out.println("Nome do filme: " + name);
      System.out.println("Ano de lançamento: " + anoDeLancamento);
      System.out.println("Duração em minutos: " + duracaoEmMinutos);
      System.out.println("Incluido no plano: " + incluidoNoPlano);
   }

   void avalia(double nota){
      somaDasAvaliacoes += nota;
      totalDeAvaliacoes++;
   }

   double pegaMedia(){

      return somaDasAvaliacoes/totalDeAvaliacoes;
   }

     }

