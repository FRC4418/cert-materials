# SW1-13 Lambdas Method References and Suppliers

Student task: Complete `SupplierDemo.java`.

* `Settings` stores a boolean enabled and a double speed, with getters and setters.
* `enabledSupplier(settings)` returns a `java.util.function.BooleanSupplier` made with a lambda that reads the current enabled value.
* `speedSupplier(settings)` returns a `java.util.function.DoubleSupplier` made with the method reference `settings::getSpeed`.
* The two suppliers must report updated settings when the settings object changes after the supplier is created.

Run:

    javac *.java
    java ProctorTest
