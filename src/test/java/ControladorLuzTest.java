import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControladorLuzTest {

	ControladorLuz controlador;
	Luz luz;

	@BeforeEach
	void setUp() {
		controlador = new ControladorLuz();
		luz = new Luz();
	}

	@Test
	void deveLigarLuz() {
		Tarefa ligarLuz = new LigarLuzTarefa(luz);
		controlador.executarTarefa(ligarLuz);

		assertEquals("Luz ligada", luz.getStatus());
	}

	@Test
	void deveDesligarLuz() {
		Tarefa desligarLuz = new DesligarLuzTarefa(luz);
		controlador.executarTarefa(desligarLuz);

		assertEquals("Luz desligada", luz.getStatus());
	}

	@Test
	void deveCancelarDesligamentoDaLuz() {
		Tarefa ligarLuz = new LigarLuzTarefa(luz);
		Tarefa desligarLuz = new DesligarLuzTarefa(luz);

		controlador.executarTarefa(ligarLuz);
		controlador.executarTarefa(desligarLuz);

		controlador.cancelarUltimaTarefa();

		assertEquals("Luz ligada", luz.getStatus());
	}
}