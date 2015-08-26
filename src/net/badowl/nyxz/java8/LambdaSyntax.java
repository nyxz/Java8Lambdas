package net.badowl.nyxz.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    static class MyProcessor<T> {

        public void process(List<T> list, Comparator<T> comparator) {
            Collections.sort(list, comparator);
        }

    }

    public static void main(String[] args) {
        final List<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        list.add("strawberry");
        list.add("carrot");
        list.add("pineapple");

        printCollection(list);

        /**
         * Type inference - we do not explicitly give the types to x and y but the compiler knows if
         * the Comparator is String we have to give string values to its compare method.
         * 
         * This is not a dynamic typing!
         */
        new MyProcessor<String>().process(list, (x, y) -> x.compareTo(y));

        printCollection(list);
    }

    private static void printCollection(Collection<?> collection) {
        for (Object value : collection) {
            System.out.println(value);
        }
        System.out.println();
    }
}
