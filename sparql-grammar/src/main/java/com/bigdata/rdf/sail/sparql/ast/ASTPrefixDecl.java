/* Generated By:JJTree: Do not edit this line. ASTPrefixDecl.java */

package com.bigdata.rdf.sail.sparql.ast;

import com.bigdata.rdf.sail.sparql.ast.ASTIRI;
import com.bigdata.rdf.sail.sparql.ast.SimpleNode;
import com.bigdata.rdf.sail.sparql.ast.SyntaxTreeBuilder;
import com.bigdata.rdf.sail.sparql.ast.SyntaxTreeBuilderVisitor;
import com.bigdata.rdf.sail.sparql.ast.VisitorException;

public class ASTPrefixDecl extends SimpleNode {

	private String prefix;

	public ASTPrefixDecl(int id) {
		super(id);
	}

	public ASTPrefixDecl(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data)
		throws VisitorException
	{
		return visitor.visit(this, data);
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public ASTIRI getIRI() {
		return jjtGetChild(ASTIRI.class);
	}

	@Override
	public String toString()
	{
		return super.toString() + " (prefix=" + prefix + ")";
	}
}