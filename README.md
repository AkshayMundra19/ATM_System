# ATM_System
ATM System in Java with Real-Time Voice Modulation

# ATM System in Java with Voice Modulation

This project is a console-based ATM System developed in Java, integrated with real voice modulation using Text-To-Speech (FreeTTS).

It simulates the core functionalities of an ATM machine with a user-friendly, menu-driven interface and audio feedback for better interaction.

# Features

Secure PIN-based login
Check account balance
Deposit money
Withdraw money
Fast cash option
Change ATM PIN
Mini statement (transaction history)
Exit functionality
Real-time voice guidance using FreeTTS

# Voice Modulation

The system uses the FreeTTS Java library to provide real voice output, including:

Adjustable speech rate
Pitch control
Volume control

This enhances accessibility and simulates a real ATM experience.

# Technologies Used

Java (Core Java, OOP concepts)
FreeTTS (Text-To-Speech)
Scanner, ArrayList
Command Line Interface (CLI)

# Project Structure

ATMSystem.java – Main ATM logic
VoiceAssistant.java – Text-to-Speech voice handling

# How to Run

Place freetts.jar and cmu_us_kal.jar in the project directory
Compile and run:
bash:
javac -cp ".;freetts.jar;cmu_us_kal.jar" ATMSystem.java
java  -cp ".;freetts.jar;cmu_us_kal.jar" ATMSystem

# Use Cases

College mini project
Java OOP practice
Console application demonstration
Viva and interview preparation

# Future Enhancements

GUI-based ATM (Swing / JavaFX)
Database integration (MySQL)
Multiple user accounts
File handling for persistent data
Hindi voice support
