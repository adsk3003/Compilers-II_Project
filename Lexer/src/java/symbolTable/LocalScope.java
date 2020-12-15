package symbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class LocalScope extends BaseScope {
	/*
	 * DATA MEMBERS
	 */
	private Scope enclosingScope;

	/*
	 * CONSTRUCTORS
	 */
	public LocalScope(String name, Scope enclosingScope) { super(name, enclosingScope); }
}