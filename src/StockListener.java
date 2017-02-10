// Generated from Stock.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StockParser}.
 */
public interface StockListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StockParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StockParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StockParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(StockParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(StockParser.PeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(StockParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(StockParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#picks}.
	 * @param ctx the parse tree
	 */
	void enterPicks(StockParser.PicksContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#picks}.
	 * @param ctx the parse tree
	 */
	void exitPicks(StockParser.PicksContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#pick}.
	 * @param ctx the parse tree
	 */
	void enterPick(StockParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#pick}.
	 * @param ctx the parse tree
	 */
	void exitPick(StockParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(StockParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(StockParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#buy}.
	 * @param ctx the parse tree
	 */
	void enterBuy(StockParser.BuyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#buy}.
	 * @param ctx the parse tree
	 */
	void exitBuy(StockParser.BuyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#sell}.
	 * @param ctx the parse tree
	 */
	void enterSell(StockParser.SellContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#sell}.
	 * @param ctx the parse tree
	 */
	void exitSell(StockParser.SellContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#hedge}.
	 * @param ctx the parse tree
	 */
	void enterHedge(StockParser.HedgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#hedge}.
	 * @param ctx the parse tree
	 */
	void exitHedge(StockParser.HedgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(StockParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(StockParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#strike}.
	 * @param ctx the parse tree
	 */
	void enterStrike(StockParser.StrikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#strike}.
	 * @param ctx the parse tree
	 */
	void exitStrike(StockParser.StrikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(StockParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(StockParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(StockParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(StockParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(StockParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(StockParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(StockParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(StockParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(StockParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(StockParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(StockParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(StockParser.IdentifierContext ctx);
}