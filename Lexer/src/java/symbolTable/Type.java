package symbolTable;

import java.util.*;

public class Type {
	/*
	 * DATA MEMBERS
	 */
	private int width = 0;
	private String name = "";
	private boolean isStatic = false;
	private boolean isConst = false;
	private boolean isUnsigned = false;
	private boolean isLong = false;

	/*
	 * CONSTRUCTORS
	 */
	public Type(String s, Integer w) { this.name = s; this.width = w; }

	/*
	 * DEFINITION OF ALL TYPES
	 */
	public static final Type
		VOID = new Type("VOID", 8),
		INT = new Type("INT", 4),
		REAL = new Type("REAL", 8),
		CHAR = new Type("CHAR", 1),
		BOOL = new Type("BOOL", 1),
		COMPLEX = new Type("COMPLEX", 16),
		INVALID = new Type("INVALID", 0);

	/*
	 * DEFINITION OF TYPE COMPATIBILITY PARAMETERS
	 */
	public static final int
		INCOMPATIBLE  = 0,
		WARNING = 1,
		COMPATIBLE = 2;

	/*
	 * GETTERS
	 */
	public int getWidth() { return this.width; }
	public String getName() { return this.name; }
	public boolean getIsStatic() { return this.isStatic; }
	public boolean getIsConst() { return this.isConst; }
	public boolean getIsUnsigned() { return this.isUnsigned; }
	public boolean getIsLong() { return this.isLong; }
	public int getSize() { return this.width; }

	/*
	 * SETTERS
	 */
	public void setIsStatic(boolean input) {this.isStatic = input;}
	public void setIsConst(boolean input) {this.isConst = input;}
	public void setIsUnsigned(boolean input) {this.isUnsigned = input;}
	public void setIsLong(boolean input) {this.isLong = input; this.width = 8;}

	/*
	 * UTILITY FUNCTIONS
	 */
	public boolean isInteger(Type t) { return isInt(t) || isLint(t) || isUint(t) || isULint(t); }
	public boolean isInt(Type t) { return (t != null && t.getName().equals("INT") 
										&& !t.getIsUnsigned() && !t.getIsLong()); }

	public boolean isULint(Type t) { return (t != null && t.getName().equals("INT") 
										&& t.getIsUnsigned() && t.getIsLong()); }

	public boolean isLint(Type t) { return (t != null && t.getName().equals("INT") 
										&& !t.getIsUnsigned() && t.getIsLong()); }

	public boolean isUint(Type t) { return (t != null && t.getName().equals("INT") 
										&& t.getIsUnsigned() && !t.getIsLong()); }

	public boolean numeric(Type p) {
		return p == Type.CHAR || isInteger(p) || p == Type.REAL;
	}

	/*
	 * Returns the resultant type of 
	 * binary operation between "this" type
	 * and input type "p2"
	 */
	public Type result(Type p2) {
		Type p1 = this;
		if(p1 == Type.BOOL && p2 == Type.BOOL) return Type.BOOL;
		if(p1 == Type.COMPLEX && p2 == Type.COMPLEX) return Type.COMPLEX;
		if((p1 == Type.REAL && numeric(p2) == true) || 
			((p2 == Type.REAL && numeric(p1) == true))) return Type.REAL;

		if(isInteger(p1) && p2 == Type.CHAR) return p1;
		if(isInteger(p2) && p1 == Type.CHAR) return p2;

		if(isInt(p1) && isInt(p2)) return Type.INT;
		if(isULint(p1) || isULint(p2)) {
			Type res = new Type("INT", 4);
			res.setIsLong(true);
			res.setIsUnsigned(true);
			return res;
		}
		if(isLint(p1) || isLint(p2)) {
			Type res = new Type("INT", 4);
			res.setIsLong(true);
			return res;	
		}
		if(isUint(p1) || isUint(p2)) {
			Type res = new Type("INT", 4);
			res.setIsUnsigned(true);
			return res;
		}

		return Type.INVALID;
	}

	/*
	 * Returns Compatibility status when
	 * "this" type is assigned input type "p2"
	 */
	public int isCompatible(Type p2) {
		Type p1 = this;
		if(p1 == Type.BOOL && p2 == Type.BOOL) return Type.COMPATIBLE;
		if(p1 == Type.COMPLEX && p2 == Type.COMPLEX) return Type.COMPATIBLE;
		if(p1 == Type.REAL && numeric(p2)) return Type.COMPATIBLE;
		if(isInteger(p1) && p2 == Type.CHAR) return Type.COMPATIBLE;
		if(p1 == Type.CHAR && (isInt(p2) || isUint(p2) || p2 == Type.CHAR)) return Type.COMPATIBLE;

		if(isInt(p1) && isInt(p2)) return Type.COMPATIBLE;
		if(isLint(p1) && (isLint(p2) || isInt(p2))) return Type.COMPATIBLE;
		if(isUint(p1) && (isUint(p2) || isInt(p2))) return Type.COMPATIBLE;
		if(isULint(p1) && isInteger(p2)) return Type.COMPATIBLE;

		if(p1 != Type.REAL && numeric(p1) && p2 == Type.REAL) return Type.WARNING;
		if(isInt(p1) && isUint(p2)) return Type.WARNING;
		if((isInt(p1) || isUint(p1)) && (isLint(p2) || isULint(p2))) return Type.WARNING;
		if(isLint(p1) && (isULint(p2) || isUint(p2))) return Type.WARNING;

		return Type.INCOMPATIBLE;
	}

	/*
	 * Returns true if "this" type is equal to input type "t"
	 * in all aspects
	 */
	public boolean equals(Type t) { return (t != null && this.isStatic == t.getIsStatic() && 
											this.isConst == t.getIsConst() && this.name == t.getName()); }

	
	/*
	 * OVERRIDED FUNCTIONS
	 */
	public String toString() { return this.name; }
}