public class Luz {
	private String status;

	public String getStatus() {
		return status;
	}

	public void ligar() {
		this.status = "Luz ligada";
	}

	public void desligar() {
		this.status = "Luz desligada";
	}
}