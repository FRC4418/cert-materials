# SW1-09 Inheritance and Overriding

Student task: Complete `Task.java` and `AnnounceTask.java`.

* `Task` stores a protected `name` set by its constructor. Its `run()` returns `Running: ` followed by name.
* `AnnounceTask` extends `Task`, receives name and message, calls the parent constructor with `super(name)`, and overrides `run()`.
* The overridden result is exactly `Running: Announce | Message: Field reset` for name `Announce` and message `Field reset`.

Run:

    javac *.java
    java ProctorTest
