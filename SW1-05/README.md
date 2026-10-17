# SW1-05 Strings and Text

Student task: Complete `TeamNameFormatter.java`.

* `cleanName(raw)` removes outside spaces and changes all letters to uppercase.
* `initials(first, last)` returns the first character of each trimmed name in uppercase. `Ada`, `Lovelace` becomes `AL`.
* `hasTeamWord(name)` returns true when `name` contains `TEAM`, ignoring capitalization.
* `label(number, name)` returns exactly `Team 4418: IMPULSE` for inputs `4418` and `Impulse`.

Run:

    javac *.java
    java ProctorTest
