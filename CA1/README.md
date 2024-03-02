# CA1 - Version Control with GIT

## Overview

## Table of Contents

1. [Part 1 - Technical Report](#part-1---technical-report)
2. [Part 2A - Technical Report](#part-2A---technical-report)
3. [Part 2B - Technical Report](#part-2B---technical-report)

## Part 1 - Technical Report

#### Analysis, Design, and Implementation

### Steps

1. **Setup:**
    - To initiate the `CA1` assignment, the tutorial code was copied directly from the desktop to the designated project
      folder. To ensure a clean slate, the existing .git and .gitignore folders were removed from the copied directory.
    - An empty `README.md` file was also created to serve as the main documentation for the project. These changes were
      then committed and pushed to the repository.
    - git commands used:
        - `git add`
        - `git commit -m "message"`
        - `git push`


2. **Tagging:**
    - A tag was created `v1.1.0` following a versioning pattern of `major.minor.revision` for clear and structured version
      management.
    - git commands used:
        - `git tag -a tagname -m "message"`
        - `git push origin tagname`


3. **Adding New Feature:**
    - To implement the new feature the following steps were taken:
        - A new field `jobYears` was added to the `Employee` class.
        - Validation was added to the `Employee` class fields to ensure that they cannot be null or empty and to ensure
          that the new field is a positive integer.
        - Relevant methods and/or code in the `Employee` class were modified to incorporate the new field.
        - The code in the `Database Loader` was adjusted to include the new field when creating or loading
          employee data.
        - The `React Component` responsible for rendering and handling employee data was updated to display and manage the
          new field.
    - git commands used:
    - `git add`
    - `git commit -m "message"`
    - `git push`


4. **Unit Testing:**
    - To ensure the correctness of the implemented feature, unit tests were conducted as follows:
        - Unit tests were implemented testing scenarios where all fields were appropriately set and get.
        - Additional unit tests were implemented to validate fields constraints.
    - git commands used:
    - `git add`
    - `git commit -m "message"`
    - `git push`


5. **Tagging and Conclusion:**
    - A tag was created `v1.2.0` following the creation of the new feature.
    - A tag `ca1-part1` was also created to mark the end of part 1 of the assignment.
    - git commands used:
        - `git tag -a tagname -m "message"`
        - `git push origin tagname`


## Part 2A - Technical Report

#### Analysis, Design, and Implementation

### Steps

1. **Setup:**
   - To initiate part 2 of the assignment, a new branch `email-field` was created.
   - git commands used:
      - `git branch branchname`
      - `git switch branchname`

3. **Adding New Feature:**
   - To implement the new feature the following steps were taken:
      - A new field `email` was added to the `Employee` class.
     - Validation was added to the `Employee` class new field to ensure that it cannot be null or empty.
     - Relevant methods and/or code in the `Employee` class were modified to incorporate the new field.
     - The code in the `Database Loader` was adjusted to include the new field when creating or loading
       employee data.
     - The `React Component` responsible for rendering and handling employee data was updated to display and manage the
       new field.
   - git commands used:
   - `git add`
   - `git commit -m "message"`
   - `git push`


4. **Unit Testing:**
    - To ensure the correctness of the implemented feature, unit tests were conducted as follows:
        - Unit tests were implemented testing scenarios where the new field was appropriately set and get.
        - Additional unit tests were implemented to validate the new field constraints.
   - git commands used:
   - `git add`
   - `git commit -m "message"`
   - `git push`


5. **Tagging and Conclusion:**
   - The `email-field` branch was merged into the `main` branch.
   - A tag was created `v1.3.0` following the creation of the new feature.
   - git commands used:
      - `git tag -a tagname -m "message"`
      - `git push origin tagname`


## Part 2B - Technical Report

#### Analysis, Design, and Implementation

### Steps

1. **Setup:**
   - To continue part 2 of the assignment, a new branch `fix-invalid-email` was created.
   - git commands used:
      - `git branch branchname`
      - `git switch branchname`

3. **Fixing Feature Bug:**
   - To fix the new feature bug the following steps were taken:
      - Validation was added to the `Employee` class to ensure that the `email` field cannot be null or empty and needs to contain the symbol `@`.
      - Relevant methods or code in the `Employee` class were modified to incorporate this change.
   - git commands used:
   - `git add`
   - `git commit -m "message"`
   - `git push`


4. **Unit Testing:**
   - To ensure the correctness of the implemented validations, unit tests were conducted as follows:
      - Additional unit tests were implemented to validate the `email` field constraints, such as ensuring no values without the `@` symbol were allowed.
   - git commands used:
   - `git add`
   - `git commit -m "message"`
   - `git push`


5. **Tagging and Conclusion:**
   - The `fix-invalid-email` branch was merged into the `main` branch.
   - A tag was created `v1.3.1` following the implementation of the bug fix.
   - A final tag `ca1-part2` was created to mark the end of the assignment.
   - git commands used:
      - `git tag -a tagname -m "message"`
      - `git push origin tagname`