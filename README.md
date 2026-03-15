# AEM Multibrands Website Project

## Project Overview
The AEM Multibrands Website project is designed to facilitate the management of multiple brands within Adobe Experience Manager (AEM). This project aims to provide a scalable and maintainable structure for handling content across various brands, ensuring a consistent user experience and efficient content delivery.

## Setup Instructions
To set up the project locally, follow these steps:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/sayabannatole/aem-multibrands-website.git
   cd aem-multibrands-website
   ```

2. **Install Required Software**
   - Make sure you have [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed (version 8 or later).
   - Install [Apache Maven](https://maven.apache.org/download.cgi) for building the project.
   - Ensure that you have access to an AEM environment (either local or remote).

3. **Build the Project**
   Run the following command to build the project:
   ```bash
   mvn clean install
   ```

4. **Deploy to AEM**
   Deploy the built package to your AEM instance using the package manager or through the following command:
   ```bash
   curl -u admin:admin -F file=@target/aem-multibrands-*.zip http://localhost:4502/crx/packmgr/service/.json
   ```

5. **Access the Project**
   Open your browser and navigate to `http://localhost:4502` to start using the AEM Multibrands Website.

## Brand Structure
The project is structured to support multiple brands with specific folder structures under the `/content` directory. Each brand has its own subdirectory containing the following components:

- **Content**
  - Pages
  - Assets
  - Components

- **Design**
  - Templates
  - Clientlibs

Each brand's folder is named according to its respective branding guidelines and should follow the naming conventions established in the project documentation.

## Development Guidelines
To maintain a high-quality codebase, adhere to the following development guidelines:

1. **Code Quality**
   - Follow Java coding standards and best practices.
   - Write unit tests for all significant changes.

2. **Version Control**
   - Use feature branches for new developments.
   - Keep the main branch clean; only merge fully tested and reviewed code.

3. **Documentation**
   - Update documentation related to new features or changes in functionality.
   - Ensure all public methods and classes are adequately documented.

4. **Continuous Integration**
   - Set up your CI/CD pipeline for automated testing and deployment.
   - Ensure that no breaking changes are introduced.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
