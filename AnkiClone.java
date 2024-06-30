import java.util.*;

public class AnkiClone {
    public static void main(String[] args) {
        List<String> listaBaralho = new ArrayList<>();

        Informativo info = new Informativo();
        ListaBaralho lista = new ListaBaralho();
        FerramentaCriar fc = new FerramentaCriar();
        info.mostraInfo(listaBaralho);
        lista.mostraBaralho(listaBaralho);
        fc.criaBaralho(listaBaralho);
    }

    static class Informativo {
        void mostraInfo(List<String> listaBaralho) {
        int numBaralho = listaBaralho.size();
        int numCartas = 0;
            System.out.println("Número de Baralhos: " + numBaralho);
            System.out.println("Número de Cartas: " + numCartas);

        }
    }

    static class ListaBaralho {
        void mostraBaralho(List<String> listaBaralho) {
            System.out.println("Lista de Baralhos: ");
            for(String baralho : listaBaralho) {
                System.out.println(baralho);
            }
        }
    }

    static class FerramentaCriar {

        void criaBaralho(List<String> mostraBaralho) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Qual o nome do Baralho: ");
            String nomeBaralho = sc.nextLine();
            mostraBaralho.add(nomeBaralho);
            System.out.print("Deseja criar uma carta? Sim ou Não? ");
            String respostaCarta = sc.nextLine();
            boolean fimCriar = false;
            while(fimCriar == true) {
                if(respostaCarta.equalsIgnoreCase("sim")) {
                    System.out.println("Criando carta para baralho " + nomeBaralho);
                    fimCriar = true;
                } else if(respostaCarta.equalsIgnoreCase("não") || respostaCarta.equalsIgnoreCase("nao")) {
                    System.out.println("Baralho " + nomeBaralho + "criado!");
                    fimCriar = true;

                } else {
                    System.out.println("Digitação incorreta");
                }

            }
        }
    }
}