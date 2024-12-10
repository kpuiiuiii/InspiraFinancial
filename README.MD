# Inspira Financial Contact Us Form Automation

## Project Overview
This is a Selenium WebDriver-based test automation project for validating the Contact Us form on the Veeva website using Cucumber BDD framework.

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

## Test Scenario
The project includes a happy path scenario for submitting the Contact Us form, which:
- Navigates to Contact Us page
- Clicks Contact Sales dropdown
- Fills form with valid test data
- Submits the form
- Validates success/error message

## Key Test Validations
- Form submission with generated fake data
- Email validation
- Dropdown interactions

## Configuration
Browser selection and other configurations can be managed through the configuration reader utility.

## Dependencies
- Selenium WebDriver
- Cucumber
- JavaFaker
- SLF4J Logging

