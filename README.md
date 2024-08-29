# Calculator app automation

## Project Summery
This project aims to automate the calculation of arithmetic series using a calculator app. The calculator app takes a mathematical series as a parameter and calculates the result accordingly. This repository provides the necessary code and instructions to automate the process of passing different series to the calculator app and obtaining the results.

## Project Scenario
Automate any series for calculator app. Pass the series as a parameter to your test method.
For an example:
100/10*5-10+60
or
50+10-20*2+10/2

## Pre-requities
1. JDK 11
2. Gradle
3. Appium
4. Android Emulator or physical Android device with Developer Mode enabled.
5. Google Chrome browser installed on the machine (required for Selenium WebDriver).

##  Framework
* TestNG

## How to run this project
* clone this project
* Open this project in Intellij Idea
* Start Appium Server with this command in the command prompt:
"Appium"
* For checking the connectivity of device, give this command in command prompt: adb devices
* Open Appium Inspector
* Set desired capabilites:
* In intellij Idea terminal-
* To run suite, hit this command - "gradle clean test"
* To generate allure report hit these command
* allure generate allure-results --clean -output
* allure serve allure-results

## Allure Report
![overview](https://github.com/user-attachments/assets/0b6f795f-8fc4-48d9-bf01-0a0156db97c9)
![behaviour](https://github.com/user-attachments/assets/401f42ca-e3b1-4d75-877f-f50ae206892d)

## Video Output
[App Automation.webm](https://github.com/user-attachments/assets/5917808f-108d-4973-aec0-8fb3e8063202)
