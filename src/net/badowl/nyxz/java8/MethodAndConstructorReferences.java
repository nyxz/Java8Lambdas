package net.badowl.nyxz.java8;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Method references:
 * 
 * Format: target_reference::method_name
 * 
 * Kinds of method references:
 * 
 * - Static method
 * 
 * - Instance method of an arbitrary type.
 * 
 * - Instance method of an existing object.
 * 
 * 
 * Constructor references: same as method references but for the constructor.
 */
public class MethodAndConstructorReferences {

    static class Randy {

        /*
         * static method
         */
        public static int get(int n) {
            return new Random().nextInt(n);
        }

        /*
         * instance method
         */
        public String salute(String name) {
            return "!Hola " + name;
        }
    }

    public static void main(String[] args) {
        staticMethodExample();
        instanceMethodOfArbitraryTypeExample();
        instanceMethodOfExistingObjectExample();
        constructorReferenceExample();

        /* FileFilter example */
        FileFilter x = (File f) -> f.canRead();
        FileFilter y = File::canRead;

        File pathname = new File(".");
        x.accept(pathname);
        y.accept(pathname);
    }

    public static void staticMethodExample() {
        UnaryOperator<Integer> a = (x) -> Randy.get(x);
        /* Same as above */
        UnaryOperator<Integer> b = Randy::get;

        int num = 100;
        System.out.println(a.apply(num));
        System.out.println(b.apply(num));
    }

    public static void instanceMethodOfArbitraryTypeExample() {
        BiFunction<Randy, String, String> a = (Randy ins, String _arg) -> ins.salute(_arg);
        /* Same as above */
        BiFunction<Randy, String, String> b = Randy::salute;

        Randy randy = new Randy();
        System.out.println(a.apply(randy, "instanceMethodOfArbitraryType"));
        System.out.println(b.apply(randy, "instanceMethodOfArbitraryType"));
    }

    public static void instanceMethodOfExistingObjectExample() {
        Randy randy = new Randy();
        Function<String, String> a = (String _arg) -> randy.salute(_arg);
        /* Same as above */
        Function<String, String> b = randy::salute;

        System.out.println(a.apply("instanceMethodOfExistingObject"));
        System.out.println(b.apply("instanceMethodOfExistingObject"));
    }

    public static void constructorReferenceExample() {
        Supplier<List<String>> consumer1 = () -> new ArrayList<String>();
        /* Same as above */
        Supplier<List<String>> consumer2 = ArrayList<String>::new;

        List<String> list1 = consumer1.get();
        List<String> list2 = consumer2.get();

        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
