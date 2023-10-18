package ModifierAccess.SubPackage;

import ModifierAccess.ParentClass;

public class Main {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();

        System.out.println(parentClass.publicField);
    }
}
