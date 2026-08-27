# Java CLI Utility Suite

A modular, console-based utility suite written in core Java. This project provides everyday developer and text-processing tools through an interactive command-line interface.

---

## Features

- **Password Generator**: Generates randomized passwords of customizable length using lowercase, uppercase, numbers, and special symbols.
- **Text & File Analyzer**: Computes total line, word, and character counts, along with character distribution metrics for local text files.
- **Base64 Tool**: Encodes and decodes standard plain text as well as raw binary files (such as images) using modern Java NIO and standard Base64 utilities.

---

## Project Structure

```text
JavaCliSuite/
├── src/
│   └── com/
│       └── utility/
│           ├── Main.java
│           ├── PasswordGenerator.java
│           ├── TextStats.java
│           └── Base64Tool.java
└── README.md