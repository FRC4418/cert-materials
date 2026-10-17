# SW1-08 Constructors and Encapsulation

Student task: Complete `BoundedSetting.java`.

* Use private fields named `name`, `minimum`, `maximum`, and `value`.
* The constructor receives name, minimum, maximum, and starting value. It stores the name and bounds, then uses `setValue` for the starting value.
* `setValue(newValue)` keeps value inside the inclusive bounds.
* `getValue()` returns value; `getName()` returns name.
* `toString()` returns exactly `speed=1.0` for a setting named `speed` with value 1.0.

Run:

    javac *.java
    java ProctorTest
