package enum1.ex;

public enum Enumeration {
   HIGH(3),
   MEDIUM(2),
   LOW(1);
	private int levelcode;

	private Enumeration(int levelcode) {
		this.levelcode = levelcode;
	}
	public int getlevelcode()
	{
		return levelcode;
	}
}
