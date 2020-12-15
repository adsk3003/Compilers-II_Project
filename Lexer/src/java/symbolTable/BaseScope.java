package symbolTable;

import java.util.LinkedHashMap;
import java.util.Map;
import symbolTable.debugging;

public abstract class BaseScope implements Scope {
	/*
	 * DATA MEMBERS
	 */
	private String scopeName;
	private Scope enclosingScope;
	public Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>(); // sYMBOL TABLE

	/*
	 * CONSTRUCTORS
	 */
	public BaseScope(Scope enclosingScope) { this.enclosingScope = enclosingScope; }
	public BaseScope(String scopeName, Scope enclosingScope) { this.scopeName = scopeName; this.enclosingScope = enclosingScope; }

	/*
	 * SCOPE INTERFACE FUNCTIONS' IMPLEMENTATIONS
	 */
	public Scope getEnclosingScope() { return this.enclosingScope; }
	public String getScopeName() { return this.scopeName; }

	/*
	 * Define symbol in the symbol table
	 */
	public void define(Symbol sym) {
		if(debugging.status == true) {
			System.out.println("Putting " + sym);			
		}
		symbols.put(sym.getName(), sym);
		sym.setScope(this);
	}
	
	/*
	 * Resolve symbol from the currentScope 
	 * all the way up till global scope
	 */
	public Symbol resolve(String name) {
		Symbol s = symbols.get(name);
		if ( s != null ) return s;
		if ( enclosingScope != null ) return enclosingScope.resolve(name);
		return null;
	}

	/* 
	 * Resolve symbol only in the current scope
	 */
	public Symbol exists(String name) { return symbols.get(name); }

	/*
	 * OVERRIDED FUNCTIONS
	 */

	@Override public String toString() { return getScopeName()+":"+symbols.keySet().toString(); }
}