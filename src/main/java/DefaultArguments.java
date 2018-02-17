public class DefaultArguments {

    String foo(String bar) {
        return foo(bar, true);
    }

    String foo(String bar, Boolean baz) {
        if (baz) return bar + "Baz";
        else return bar + "Bongo";
    }

    String blargBaz = foo("blarg");
    String blargBongo = foo("blarg", false);
}
