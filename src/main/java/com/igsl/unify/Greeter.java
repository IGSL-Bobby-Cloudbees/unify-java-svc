package com.igsl.unify;

public final class Greeter {
    private Greeter() {}

    public static String greet(String name) {
        String who = (name == null || name.isBlank()) ? "World" : name.trim();
        return "Hello, " + who + "!";
    }

    // Entry point for the Dockerfile CMD (`java -cp /app/app.jar com.igsl.unify.Greeter`)
    public static void main(String[] args) {
        System.out.println(greet(args.length > 0 ? args[0] : "container"));
    }
}
