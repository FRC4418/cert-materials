# FRC 4418 Certification Materials

This repository contains the runnable Java projects used by the Tier I software certifications. Each `SW1-xx` directory is the exact folder named in the certification document.

## Get the materials

Install Git, then clone this repository:

```text
git clone https://github.com/frc4418/cert-materials.git
```

Open the cloned `cert-materials` folder. Choose the directory that matches the certification ID, for example `SW1-04` for Methods, Parameters, and Scope.

## Run a certification project

Use a Java Development Kit (JDK) that supports Java 8 or later. In the selected certification directory, run:

```text
javac *.java
java ProctorTest
```

The student edits only the starter files named in that folder's `README.md`. `ProctorTest.java` is the proctor's unchanged behavior check. The program prints a full passing count when the required work is complete.

`SW1-15` intentionally starts with broken files. Its README gives the three exact compile-and-run commands. `SW1-S` is the Tier I supercert; run `javac *.java`, then `java ProctorTest`, then `java ProgressTracker`.
