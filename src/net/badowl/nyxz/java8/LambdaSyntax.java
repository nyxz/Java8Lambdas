package net.badowl.nyxz.java8;

/**
 * General syntax: (parameters) -> { lambda-body } "->" is called "lambda operator"
 * 
 * Lambda expressions are anonymous functions - which are like methods but without a class.
 *
 * Rules for parameters:
 * 
 * - if you have one parameter you don't need the brackets (they are optional).
 * 
 * - if you have no parameters you have to have an empty set of brackets.
 * 
 * - if you have more than one parameters, they have to be comma separated and you must put the
 * brackets.
 * 
 * Rules for lambda-body:
 * 
 * - if it is single line - no braces needed (they are optional). In case where you don't put the
 * braces then the line can end without semicolon ";". If you put the braces though you should put
 * the semicolon.
 * 
 * - for multi-line body the braces are mandatory. Every statement should be separated by semicolon
 * ";" as it is in regular method.
 * 
 * - for single-line body you don't need explicit "return" statement.
 */
public class LambdaSyntax {

    /**
     * () -> System.out.println("Hello")
     * 
     * x -> x + 10
     * 
     * (int x, int y) -> { return x + y; }
     * 
     * (String x, String y) -> x.length() + y.length()
     * 
     * (String x) -> {
     * 
     * listA.add(x);
     * 
     * listB.remove(x);
     * 
     * return listB.size();
     * 
     * }
     */
}
