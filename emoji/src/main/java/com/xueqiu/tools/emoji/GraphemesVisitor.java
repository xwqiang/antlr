package com.xueqiu.tools.emoji;// Generated from /Users/xuwuqiang/Documents/workspace/antlr/emoji/src/main/antlr4/com/xueqiu/tools/emoji/Graphemes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphemesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphemesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphemesParser#emoji_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmoji_sequence(GraphemesParser.Emoji_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphemesParser#grapheme_cluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrapheme_cluster(GraphemesParser.Grapheme_clusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphemesParser#xueqiu_emoji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXueqiu_emoji(GraphemesParser.Xueqiu_emojiContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphemesParser#graphemes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphemes(GraphemesParser.GraphemesContext ctx);
}