# SW1-02 Conditions and Boolean Logic

Student task: Complete `BatteryStatus.java`.

* `isSafeVoltage(voltage)` returns true only when voltage is at least 10.5 and no more than 13.0.
* `status(voltage, enabled)` returns `DISABLED` when enabled is false. Otherwise return `LOW` below 11.0, `NOMINAL` from 11.0 through 12.7, and `HIGH` above 12.7.
* `main` prints the status for 12.0 volts and enabled true.

Run:

    javac *.java
    java ProctorTest
