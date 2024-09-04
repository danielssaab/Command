public class LigarLuzTarefa implements Tarefa {

	private Luz luz;

	public LigarLuzTarefa(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void executar() {
		this.luz.ligar();
	}

	@Override
	public void cancelar() {
		this.luz.desligar();
	}
}