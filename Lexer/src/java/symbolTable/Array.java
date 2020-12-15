package symbolTable;

public class Array extends Type {
	/*
	 * DATA MEMBERS
	 */
	private Type of;
	private int size = 1;

	/*
	 * CONSTRUCTORS
	 */
	public Array(int sz, Type p) {
		super(p.getName(), sz * p.getWidth());
		size = sz;
		of = p;
	}

	/*
	 * OVERRIDED FUNCTIONS
	 */
	@Override public int getSize() { return this.size; }

	@Override public String toString() { return "ARRAY : [" + size + "] " + of.toString(); }
}