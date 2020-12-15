package symbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class GlobalScope extends BaseScope {
	private Scope enclosingScope;
	private Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

	public GlobalScope(String name, Scope enclosingScope) { super(name, enclosingScope); }
}