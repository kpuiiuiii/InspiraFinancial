# Inspira Financial Automation

## Project Overview
This is a Selenium WebDriver-based test automation project.

## Tech Stack
- Java
- Selenium WebDriver
- Cucumber
- JUnit
- JavaFaker
- Maven

## Project Structure
- `Driver.java`: WebDriver utility for browser management
- `ContactUsPage.java`: Page Object Model for Contact Us page
- `ContactUs_StepDefs.java`: Step definitions for Cucumber scenarios
- `happy_path_contact_form.feature`: Cucumber feature file

## Prerequisites
- Java 11
- Maven
- Chrome or Firefox browser

## Setup Instructions
1. Clone the repository
2. Run `mvn clean install` to download dependencies
3. Configure `browser` property in configuration file
4. Run tests using `mvn test`


## Configuration
Browser selection and other configurations can be managed through the configuration reader utility.

## Dependencies
- Selenium WebDriver
- Cucumber
- JavaFaker
- SLF4J Logging

