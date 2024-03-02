# CA1 - Version Control with GIT

## Overview

## Table of Contents

1. [Part 1 - Technical Report](#part-1---technical-report)

## Part 1 - Technical Report

#### Analysis, Design, and Implementation

### Steps

1. **Setup:**
    - To initiate the CA1 assignment, the tutorial code was copied directly from the desktop to the designated project
      folder. To ensure a clean slate, the existing .git and .gitignore folders were removed from the copied directory.
    - Next, an empty README.md file was created to serve as the main documentation for the project. These changes were
      then committed and pushed to the repository.
    - git commands used:
        - `git add`
        - `git commit -m "message"`
        - `git push`


2. **Versioning:**
    - A tag was created `v1.1.0` following a versioning pattern of major.minor.revision for clear and structured version
      management.
    - git commands used:
        - `git tag -a tagname -m "message"`
        - `git push origin tagname`


3. **Adding a New Field:**
    - To implement the new feature the following steps were taken:

        - A new field `jobYears` was added to the Employee class.
        - Validation was added to the Employee class to ensure that the parameters cannot be null or empty and to ensure
          that the jobYears field is a positive integer.
        - Relevant methods or code in the Employee class were modified to incorporate the new jobYears field.
        - The code in the Database Loader was adjusted to include the new field when creating or loading
          employee data.
        - The React component responsible for rendering and handling employee data was updated to display and manage the
          new field.
    - git commands used:
    - `git add`
    - `git commit -m "message"`
    - `git push`


4. **Unit Testing:**
    - To ensure the correctness of the implemented validations, unit tests were conducted as follows:
        - Unit tests were implemented testing scenarios where all attributes were appropriately set and get.
        - Additional unit tests were implemented to validate attribute constraints, such as ensuring no null or empty
          values were allowed
    - git commands used:
    - `git add`
    - `git commit -m "message"`
    - `git push`


5. **Tagging and Conclusion:**
    - A second tag was created `v1.2.0` following the creation of the new feature.
    - A third tag `ca1-part1` was created to mark the end of the part one of assignment.
    - git commands used:
        - `git tag -a tagname -m "message"`
        - `git push origin tagname`
