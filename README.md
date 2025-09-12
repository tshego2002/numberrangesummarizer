# NumberRangeSummarizer

A Java program that summarizes ranges of numbers from a collection.  

For example, given:

1,3,6,7,8,12,13,14,15,21,22,23,24,31

the program outputs:

1,3,6-8,12-15,21-24,31

---

## 🏷 Package

All source files are in the package:

package numberrangesummarizer;

Files included:

- Main.java — Entry point of the program.  
- NumberRangeSummarizer.java — Interface defining methods to collect and summarize numbers.  
- NumberRangeSummarizeClass.java — Implementation of the interface.

---

## 📂 Project Structure

NumberRangeSummarizer/
├── pom.xml
├── .gitignore
├── readme
└── src/
     ├── main/java/numberrangesummarizer/
     │    ├── Main.java
     │    ├── NumberRangeSummarizer.java
     │    └── NumberRangeSummarizeClass.java
     └── test/java/umberrangesummarizer/
            ├── NumberRangeSummarizerTest.java


---

## ⚡ Prerequisites

- Java 17 or later  
- Maven 3.x  

Check your installation:

java -version  
mvn -v

---

## 🛠 Build

### 1. Compile

From the project root:

mvn clean compile

### 2. Package JAR

mvn package

The JAR file is created at:

target/NumberRangeSummarizer-1.0-SNAPSHOT.jar

---

## ▶ How to Run

### Using Maven

mvn exec:java -Dexec.mainClass="numberrangesummarizer.Main"

### Using the JAR

java -cp target/NumberRangeSummarizer-1.0-SNAPSHOT.jar numberrangesummarizer.Main

---

## 💻 Sample Run

Input:

1,3,6,7,8,12,13,14,15,21,22,23,24,31

Output:

Sample Input: 1,3,6,7,8,12,13,14,15,21,22,23,24,31  
Output: 1,3,6-8,12-15,21-24,31

---

## 🧩 Dependencies

- No external dependencies for now.  
- Add Maven dependencies in pom.xml if needed in the future.


