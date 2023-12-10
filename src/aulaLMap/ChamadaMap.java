package aulaLMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChamadaMap {
    public static void chamadaMap() {
        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "Maria");
        aluno1.put("turma", "3a");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Joao");
        aluno2.put("turma", "3b");

        List<Map<String, String>> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);

        System.out.println(alunos);
    }
}
