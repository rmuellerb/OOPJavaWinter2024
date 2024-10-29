public enum WEEKDAY {
	MONDAY("Montag"), TUESDAY("Dienstag");
	
	private String de;
	
	private WEEKDAY(String german) {
		this.de = german;
	}
	
	public String getGermanTranslation() {
		return de;
	}
}
