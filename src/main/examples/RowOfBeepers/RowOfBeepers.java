///usr/bin/env jbang "$0" "$@" ; exit $? // (1)
//DEPS com.zemiak:javakarel:1.0.0-SNAPSHOT

import acm.program.*;
import stanford.karel.*;

public class RowOfBeepers extends Karel {
    public void run() {
        while(frontIsClear())
        {
            putBeeper();
            move();
        }
    }
}
