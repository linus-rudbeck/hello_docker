# Hello Docker

## Overview

The **Hello Docker** project is a simple Java application that demonstrates the use of environment variables and basic time-based operations. It is designed to provide an introduction to integrating Java applications with Docker by showcasing how environment variables can be accessed within the application.

This project is ideal for beginners learning Docker and Java integration, focusing on practical examples of environment variable management and process control.

## Features

1. **Environment Variable Access:**
    - Reads and prints values of environment variables defined in the runtime environment.
    - Example variables include `MY_NAME`, `DB_NAME`, and `PIPPILÅNGSTRUMP`.

2. **Timer Functionality:**
    - Implements a basic stopwatch that counts up to a given number of seconds, demonstrating time-based operations.

3. **Command-Line Output:**
    - Provides clear, formatted output for environment variables and the stopwatch timer.

## Project Structure

- **Main Application:**
    - `Main.java`: Contains the core functionality, including:
        - `printEnv(String name)`: Reads and prints the value of a specified environment variable.
        - `startStopWatch(int seconds)`: Implements a simple timer with a countdown.

This project serves as an introduction to using environment variables in Java applications and is particularly relevant for learners exploring how Java interacts with containerized environments like Docker.
