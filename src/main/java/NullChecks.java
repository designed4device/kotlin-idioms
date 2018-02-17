import net.designed4device.nullchecks.NullCheck;

public class NullChecks {
    private String baz;

    void setBongo() throws Exception {
        NullCheck nullCheck = new NullCheck();

        if (nullCheck.foo != null && nullCheck.foo.bar != null && nullCheck.foo.bar.baz != null) {
            baz = nullCheck.foo.bar.baz;
        } else throw new Exception();
    }

    public class Foo {

    }
}

