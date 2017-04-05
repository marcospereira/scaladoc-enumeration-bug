package com.acme;

import scala.Enumeration;

public interface Bar {

    /**
     * Using standard lib
     */
    void a(Enumeration.Value mode);

    /**
     * User defined classes
     */
    void b(Outer.Inner inner);
}
