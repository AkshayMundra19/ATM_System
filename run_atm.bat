@echo off
echo Checking for required JAR files...

if not exist freetts.jar (
    echo [ERROR] freetts.jar not found!
    echo Please download 'freetts.jar' and place it in this folder: %CD%
    echo.
    pause
    exit /b
)

if not exist cmu_us_kal.jar (
    echo [ERROR] cmu_us_kal.jar not found!
    echo Please download 'cmu_us_kal.jar' and place it in this folder: %CD%
    echo.
    pause
    exit /b
)

echo Compiling ATMSystem...
javac -cp ".;freetts.jar;cmu_us_kal.jar" ATMSystem.java

if %errorlevel% neq 0 (
    echo [ERROR] Compilation failed!
    pause
    exit /b
)

echo Running ATMSystem...
echo.
java -cp ".;freetts.jar;cmu_us_kal.jar" ATMSystem
pause
