import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import javafx.scene.control.MenuItem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java DIO");
        curso.setDescricao("descricao");
        curso.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SQL DIO");
        curso2.setDescricao("descricao");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Mentoria JAVA curso dio");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Get Start Java");
        bootcamp.setDescricao("BootCamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);

        Dev devKesley = new Dev();
        devKesley.setNome("Kesley Rozas");
        devKesley.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devKesley.getConteudoInscritos());
        devKesley.progredir();
        System.out.println("Conteudos Inscritos: " + devKesley.getConteudoConcluidos());
        System.out.println("XP : " + devKesley.calcularTotalXp());

        Dev devRozas = new Dev();
        devRozas.setNome("Rozas");
        devRozas.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devRozas.getConteudoInscritos());
        devRozas.progredir();
        System.out.println("Conteudos Inscritos: " + devRozas.getConteudoConcluidos());
        System.out.println("XP : " + devRozas.calcularTotalXp());

    }
}
