#!/usr/bin/env bash
cd ../src
java -cp .:../lib/junit-4.12.jar uk.me.jstott.jcoord.junit.AllTests
cd ../bin
