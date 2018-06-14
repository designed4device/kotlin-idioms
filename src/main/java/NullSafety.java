import net.designed4device.nullchecks.NullCheck;

import java.util.List;

public class NullSafety {

    int getFooLength(NullCheck nullCheck) {
        return (nullCheck.foo != null) ? nullCheck.foo.length() : 0;
    }

    int getNPE(NullCheck nullCheck) {
        return nullCheck.foo.length();
    }

    void printNotNull(List<NullCheck> list) {
        for(NullCheck nullCheck : list) {
            if (nullCheck != null && nullCheck.foo != null)
                System.out.println(nullCheck.foo.length());
        }
    }
}

