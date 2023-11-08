package br.com.alura.musicas;

public class Principal {

    public static void main(String[] args) {
        Musica musica1 = new Musica("Orochi X6", 4.52, 6, "Luffy", "Trap", "Orichi");

        System.out.println("O nome da musica numero 1 é: " + musica1.getTitulo());
        System.out.println("A duração da musica numero 1 é: " + musica1.getDuracao());
        System.out.println("A classificação da musica numero 1 é: " + musica1.getClassificacao());
        System.out.println("O album da musica numero 1 é: " + musica1.getAlbum());
        System.out.println("O genero da musica numero 1 é: " + musica1.getGenero());
        System.out.println("O artista da musica numero 1 é: " + musica1.getArtista());


        Musica musica2 = new Musica("Year Zero", 5.51, 8, "Luffy", "Metall", "Ghost");
        System.out.println("\nO nome da musica numero 2 é: " + musica2.getTitulo());
        System.out.println("A duração da musica numero 2 é: " + musica2.getDuracao());
        System.out.println("A classificação da musica numero 2 é: " + musica2.getClassificacao());
        System.out.println("O album da musica numero 2 é: " + musica2.getAlbum());
        System.out.println("O genero da musica numero 2 é: " + musica2.getGenero());
        System.out.println("O artista da musica numero 2 é: " + musica2.getArtista());

        Musica musica3 = new Musica("Money Trees", 6.26, 9, "Luffy", "Rap", "Kendrik Lamar");
        System.out.println("\nO nome da musica numero 3 é: " + musica3.getTitulo());
        System.out.println("A duração da musica numero 3 é: " + musica3.getDuracao());
        System.out.println("A classificação da musica numero 3 é: " + musica3.getClassificacao());
        System.out.println("O album da musica numero 3 é: " + musica3.getAlbum());
        System.out.println("O genero da musica numero 3 é: " + musica3.getGenero());
        System.out.println("O artista da musica numero 3 é: " + musica3.getArtista());

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcast poddcast1 = new Podcast("AS 24 identidades de Billy Milligan", 78, 18, "Modus Operandi", "Historia real de um sequestrador" );
        for (int i = 0; i < 5000; i++) {
            poddcast1.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            poddcast1.curtir();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(poddcast1);
    }
}
