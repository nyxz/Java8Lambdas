package net.badowl.nyxz.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

    /**
     * The Consumer takes a single value and returns no result.
     * 
     * Ex. (String s) -> System.out.println(s)
     */
    class MyConsumer<T> implements Consumer<T> {

        @Override
        public void accept(T t) {}

    }

    /**
     * The BiConsumer takes a two values and returns no result.
     * 
     * Ex. (k, v) -> System.out.println("key: " + k + " value: " + v)
     */
    class MyBiConsumer<T, U> implements BiConsumer<T, U> {

        @Override
        public void accept(T t, U u) {}

    }

    /**
     * Supplier takes no values and returns some result. It is the opposite of Consumer.
     * 
     * Ex. () -> produceSomeValue()
     */
    class MySupplier<T> implements Supplier<T> {

        @Override
        public T get() {
            return null;
        }

    }

    /**
     * Function is more like a mathematical function - it takes one value and returns some result.
     * The value and the result can be different types.
     * 
     * Ex. Student s -> s.getName()
     * 
     * It has useful static methods for composing:
     * 
     * - compose() - execute before the function.
     * 
     * - andThen() - execute after the function.
     * 
     */
    class MyFunction<T, R> implements Function<T, R> {

        @Override
        public R apply(T t) {
            return null;
        }

    }

    /**
     * BiFunction is like function but it takes two values instead of one. All types - the values'
     * and the result's can be different.
     * 
     * Ex. (Object x, String y) -> x.hashCode() + y.hashCode()
     */
    class MyBiFunction<T, U, R> implements BiFunction<T, U, R> {

        @Override
        public R apply(T t, U u) {
            return null;
        }

    }

    /**
     * UnaryOperator is subset of the function - it takes one value and returns result of the same
     * type as the value.
     * 
     * String s -> s.toLowerCase()
     */
    class MyUnaryOperator<T> implements UnaryOperator<T> {

        @Override
        public T apply(T t) {
            return null;
        }

    }

    /**
     * Same like the UnaryOperator but it takes two values instead of one.
     * 
     * Ex. (String x, String y) -> { if (x.length() > y.length()) { return x; } else { return y; } }
     */
    class MyBinaryOperator<T> implements BinaryOperator<T> {

        @Override
        public T apply(T t, T u) {
            return null;
        }

    }

    /**
     * Predicate takes one value and returns a boolean result.
     * 
     * Student s -> s.graduationYear() == 2011
     */
    class MyPredicate<T> implements Predicate<T> {

        @Override
        public boolean test(T t) {
            return false;
        }

    }
}
