package MethodReferenceDemo;

import java.util.Arrays;
import java.util.function.Supplier;

public class PlainOdd {

    private static int last_id = 1;

    private int id;

    public PlainOdd() {
        this.id = PlainOdd.last_id++;
        System.out.println("Creating a PlainOld Object: id = " + this.id);
    }


}
