public class DesligarLuzTarefa implements Tarefa {

	private Luz luz;

	public DesligarLuzTarefa(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void executar() {
		this.luz.desligar();
	}

	@Override
	public void cancelar() {
		this.luz.ligar();
	}
}