package com.igsl.unify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GreeterTest {
    @Test void greetsByName() { assertEquals("Hello, Unify!", Greeter.greet("Unify")); }
    @Test void defaultsToWorld() { assertEquals("Hello, World!", Greeter.greet(" ")); }
}
