#!/usr/bin/env bash
cd ..
cp -r src classes
cd classes
find . -name *.java -exec rm {} \;
find . -name *Test*.* -exec rm {} \;
jar cvf ../lib/jcoord.jar .
cd ..
rm -rf classes
cd bin
