package net.badowl.nyxz.java8.util;

import java.util.Collection;

public class Print {

    public static void collection(Collection<?> collection) {
        for (Object value : collection) {
            System.out.println(value);
        }
        System.out.println();
    }
}
