#!/usr/bin/env bash
cd ../src
javac -target 1.6 -source 1.6 uk/me/jstott/jcoord/Test.java
javac -target 1.6 -cp .:../lib/junit-4.12.jar -source 1.6 uk/me/jstott/jcoord/junit/AllTests.java
cd ../bin
