# SW1-13 Lambdas, Method References, and Suppliers

Student task: Complete `SupplierDemo.java`. Do not change the supplied test.

## Scenario

Another part of a program needs to ask for a driver's enabled state and speed later, not just once when it is configured. Build supplier methods that continue to read the current settings after the `Settings` object changes.

The public behavior is the contract. Decide how to organize the code so it remains clear and avoids captured copies of values.

* `Settings` stores an enabled flag and speed, with normal getters and setters.
* `enabledSupplier(settings)` returns a `BooleanSupplier` built with a lambda.
* `speedSupplier(settings)` returns a `DoubleSupplier` built with the method reference `settings::getSpeed`.
* After either supplier is created, a later change to `settings` must be visible through that same supplier.

Before the proctor signs off, explain why a supplier that captured the value at creation time would fail this scenario.

Run:

    javac *.java
    java ProctorTest
