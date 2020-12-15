package symbolTable;

import java.util.*;
public class Symbol { 
    /*
     * DATA MEMBERS
     */
	private String name;
    private Type type;
    private Scope scope;                // Symbol is in this scope
    private boolean writtenTo = false;  // For VariableSymbol
    private boolean readFrom = false;   // For VariableSymbol
    private boolean isReturned = false; // For MethodSymbol
    public List<Type> parTypes;

    /*
     * CONSTRUCTORS
     */
    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Type type) {this.name = name; this.type = type;}

    /*
     * GETTERS
     */
    public String getName() { return this.name; }
    public Type getType() { return this.type; }
    public Scope getScope() { return this.scope; }
    public boolean getWrittenTo() { return this.writtenTo; }
    public boolean getReadFrom() { return this.readFrom; }
    public boolean getReturned() { return this.isReturned; };

    /*
     * SETTERS
     */
    public void setScope(Scope input) { this.scope = input; }
    public void setWrittenTo(boolean input) { this.writtenTo = input; }
    public void setReadFrom(boolean input) { this.readFrom = input; }
    public void setReturned(boolean input) { this.isReturned = input; }    

    /*
     * OVERRIDED FUNCTIONS
     */
    @Override public String toString() {
        if ( type != null ) return '<'+getName()+":"+type+'>';
            return getName();
	}
}
