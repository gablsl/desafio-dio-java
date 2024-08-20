import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Conteudo logica = new Curso();
        logica.setTitulo("Lógica de Programação");
        logica.setDescricao("Você vai aprender o básico do mundo de programação");

        Conteudo poo = new Curso();
        poo.setTitulo("Programação Orientada a Objetos");
        poo.setDescricao("Domine todos os aspectos da poo");

        Conteudo mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java + Spring Boot");
        mentoria.setDescricao("Se aprofunde ainda mais em Java! Aprenda tudo que há de moderno no mercado");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Back end Java");
        bootcamp.setDescricao("Aprenda Java com o maior banco do Brasil");
        bootcamp.getConteudos().add(logica);
        bootcamp.getConteudos().add(poo);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor alan = new Desenvolvedor();
        alan.setNome("Alan");
        alan.inscreverBootcamp(bootcamp);
        alan.progredir();
        System.out.println("Conteúdos inscritos: " + alan.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + alan.getConteudosConcluidos());

        Desenvolvedor maethe = new Desenvolvedor();
        maethe.setNome("Maethe");
        maethe.inscreverBootcamp(bootcamp);
        System.out.println("XP: " + maethe.calcularTotalXp());
        maethe.progredir();
        maethe.progredir();
        System.out.println("Conteúdos concluidos: " + maethe.getConteudosConcluidos());
        System.out.println("XP: " + maethe.calcularTotalXp());
    }
}
