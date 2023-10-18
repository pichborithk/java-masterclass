package ModifierAccess.SubPackage;

import ModifierAccess.ParentClass;

public class ChildClass extends ParentClass {

    public void printParentInfo() {
        System.out.println(publicField);
        System.out.println(protectedField);
    }
}
