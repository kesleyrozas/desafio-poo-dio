import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import javafx.scene.control.MenuItem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java DIO");
        curso.setDescricao("descricao");
        curso.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Mentoria JAVA curso dio");
        mentoria.setData(LocalDate.now());

    }
}
