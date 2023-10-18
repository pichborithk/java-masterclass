package ModifierAccess;

public class Main {

    public static void main(String[] args) {

        ParentClass parentClass = new ParentClass();

        System.out.println(parentClass.publicField);
        System.out.println(parentClass.protectedField);
        System.out.println(parentClass.defaultField);

        String cheatsheet = """
                +-----------+------------------------------------+
                | Modifier  | Class   Package   Subclass   World |
                +-----------+------------------------------------+
                | public    |   Y        Y         Y         Y   |
                | protected |   Y        Y         Y         N   |
                | default   |   Y        Y         N         N   |
                | private   |   Y        N         N         N   |
                +------------------------------------------------+""";

        System.out.println(cheatsheet);
    }

}
