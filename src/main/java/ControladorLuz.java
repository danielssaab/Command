import java.util.ArrayList;
import java.util.List;

public class ControladorLuz {

	private List<Tarefa> tarefas = new ArrayList<>();

	public void executarTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
		tarefa.executar();
	}

	public void cancelarUltimaTarefa() {
		if (!tarefas.isEmpty()) {
			Tarefa tarefa = this.tarefas.remove(tarefas.size() - 1);
			tarefa.cancelar();
		}
	}
}