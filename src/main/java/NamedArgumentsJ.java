public class NamedArgumentsJ {

    NamedArgumentsJ foo = new NamedArgumentsJ()
            .setBar("blarg")
            .setBaz("bobble")
            .setBongo(true);


    private String bar;
    private String baz;
    private Boolean bongo;

    public NamedArgumentsJ setBar(String bar) {
        this.bar = bar;
        return this;
    }

    public NamedArgumentsJ setBaz(String baz) {
        this.baz = baz;
        return this;
    }

    public NamedArgumentsJ setBongo(Boolean bongo) {
        this.bongo = bongo;
        return this;
    }

    @Override
    public String toString() {
        return "NamedArgumentsJ{" +
                "foo=" + foo +
                ", bar='" + bar + '\'' +
                ", baz='" + baz + '\'' +
                ", bongo=" + bongo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NamedArgumentsJ that = (NamedArgumentsJ) o;

        if (foo != null ? !foo.equals(that.foo) : that.foo != null) return false;
        if (bar != null ? !bar.equals(that.bar) : that.bar != null) return false;
        if (baz != null ? !baz.equals(that.baz) : that.baz != null) return false;
        return bongo != null ? bongo.equals(that.bongo) : that.bongo == null;
    }

    @Override
    public int hashCode() {
        int result = foo != null ? foo.hashCode() : 0;
        result = 31 * result + (bar != null ? bar.hashCode() : 0);
        result = 31 * result + (baz != null ? baz.hashCode() : 0);
        result = 31 * result + (bongo != null ? bongo.hashCode() : 0);
        return result;
    }
}
