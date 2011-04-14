public class Card {

	private String nype;
	private String number;

	public Card(String nype, String number) {
		this.setNype(nype);
		this.setNumber(number);
	}

	public void setNype(String nype) {
		this.nype = nype;
	}

	public String getNype() {
		return nype;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

}
