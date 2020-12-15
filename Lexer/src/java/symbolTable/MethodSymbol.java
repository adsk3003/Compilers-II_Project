package symbolTable;

import java.util.*;

public class MethodSymbol extends Symbol implements Scope {
	/* 
	 * DATA MEMBERS
	 */
	private Scope enclosingScope;
	private LocalScope methodLocalScope;

	/* 
	 * CONSTRUCTORS
	 */
	public MethodSymbol(String name, Type type, Scope enclosingScope, List<Type> parTypes) {
		super(name, type);
		this.enclosingScope = enclosingScope;
		this.methodLocalScope = new LocalScope(name, this);
		this.parTypes = parTypes;
	}

	/*
	 * SCOPE INTERFACE FUNCTIONS' IMPLEMENTATIONS
	 */
	public String getScopeName() { return super.getName(); }
	public Scope getEnclosingScope() { return this.enclosingScope; }

	/*
	 * Define Symbol sym in method's local scope
	 */
	public void define(Symbol sym) { methodLocalScope.define(sym); }

	/*
	 * Resolve symbol from method's local scope
	 * all the way upto global scope
	 */
	public Symbol resolve(String name) {
		Symbol s = methodLocalScope.symbols.get(name);
		if ( s != null ) return s;
		if ( enclosingScope != null ) return enclosingScope.resolve(name);
		return null;
	}

	/*
	 * Resolve symbol only in method's local scope
	 */
	public Symbol exists(String name) { return methodLocalScope.symbols.get(name); }


	/*
	 * OVERRIDED FUNCTION
	 */
	@Override public String toString() {
		return getScopeName() + ":" + methodLocalScope.symbols.keySet().toString();
	}
}