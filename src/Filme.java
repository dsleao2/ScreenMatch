public class Filme {
   String name;
   int anoDeLancamento;
   boolean incluidoNoPlano;
   double somaDasAvaliacoes;
   int totalDeAvaliacao;
   int duracaoEmMinutos;


   void exibirFichaTecnica (){
      System.out.println("O nome do filme é :" + name);
      System.out.println(" o ano do filme é :" +anoDeLancamento);
   }

   void avalia(double nota){
      somaDasAvaliacoes += nota;
      totalDeAvaliacao ++;
   }

   double pegaMedia(){
      return somaDasAvaliacoes/totalDeAvaliacao;
   }

    }

