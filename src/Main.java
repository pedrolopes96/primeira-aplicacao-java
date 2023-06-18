public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Maverick ");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada a partir da opinião de três pessoas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        //Text blocks
        String sinopse;
        sinopse = """
                Filme Top Gun 
                Filme de aventura com ator dos anos 80
                Muito bom!
                A média do filme é: %f
                Ano de lançamento %d
                """ .formatted(media, anoDeLancamento);
        System.out.println(sinopse);
    }
}