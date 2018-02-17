public class expressions {

    String notSoSuperIfElseIfElse(String foo) throws Exception {
        if (foo.equals("bar")) {
            return "foobar";
        } else if (foo.equals("blarg")) {
            return "wibble";
        } else {
            return "wobble";
        }
    }

    String notSoSuperSwitch(String foo) throws Exception {
        switch (foo) {
            case "bar":
                return "foobar";
            case "blarg":
                return "wibble";
            default:
                return "wobble";
        }
    }


    void javaTryExpressionIsNotAsGreat() {
        String barf;
        try {
            barf = "great";
        } catch (Exception e) {
            barf = "not great";
        }
        barf = barf.toUpperCase();
    }

}
