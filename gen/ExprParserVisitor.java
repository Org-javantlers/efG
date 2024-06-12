// Generated from C:/Users/HelioSousa/Dropbox/Emprego/UAb-EI/2023-24-2S-21018-COMP/InteliJ/d-efG/Grammar/ExprParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(ExprParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(ExprParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#forcicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcicle(ExprParser.ForcicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExprParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExprParser.FactorContext ctx);
}