// Generated from ExprParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(ExprParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(ExprParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(ExprParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(ExprParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#forcicle}.
	 * @param ctx the parse tree
	 */
	void enterForcicle(ExprParser.ForcicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#forcicle}.
	 * @param ctx the parse tree
	 */
	void exitForcicle(ExprParser.ForcicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExprParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExprParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExprParser.FactorContext ctx);
}