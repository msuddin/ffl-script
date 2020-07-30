# Facts For Life

## Purpose
This is a very small project; it's purpose is to take an existing script and convert it into a more readable script

## Instructions
After pulling this repository, you may need to first set the permission on gradlew. From the root directory, run:
```
chmod +x gradlew
```

Now run the following command to build the jar:
```
./gradlew clean build
```

We can now run the jar which will generate the script file:
```
java -jar build/libs/java-fact-for-life-prepare-script-1.0-SNAPSHOT.jar
```

## Notes
 - In the root directory of the project, make sure to place your script file and call it "script.txt"
 - Once the jar finished, if successful, a new file called "script_new.txt" will be generate
 - Note that running the jar again will write over any existing files called "script_new.txt"