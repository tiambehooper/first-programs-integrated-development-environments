# Exercise: IntelliJ Introduction

For this first exercise we will do the following:

* Clone a Git repository into your Projects folder
* Open an existing project in IntelliJ
* Look at some code
* Run some tests
* Fix some code
* Rerun the tests

## Instructions

For many of our in-class exercises we will be working with preexisting Git repositories.

1. Start by opening a new Terminal session.

2. Change into your Projects directory using the `cd` command: 

	`cd ~/Projects`

3. Clone [this repository](https://github.com/tiy-raleigh-java/first-programs-integrated-development-environments) using the `git clone` command: 

	`git clone git@github.com:tiy-raleigh-java/first-programs-integrated-development-environments.git`

	This should create a new directory at `~/Projects/first-programs-integrated-development-environments`.

4. Launch IntelliJ

5. Use the File > Open... menu item and select the _directory_ you created above, not a file in that directory. Click OK and the project will open. 

	![select folder not file.png](https://tiy-learn-content.s3.amazonaws.com/7b5a5ca6-select%20folder%20not%20file.png)

6. The project will open in a new window that looks like this:

	![Screen Shot 2016-10-14 at 8.31.31 AM.png](https://tiy-learn-content.s3.amazonaws.com/f4a0209d-Screen%20Shot%202016-10-14%20at%208.31.31%20AM.png)
	
7. On the lefthand side of the window you will see a list of files. Take note that there is file named `Example` shown. (Actually, it's named `Example.java`. The file extension is not being shown.) This file should already be opened for you.

8. You may see a progress bar appear in the lower right corner of the window. Wait for this to finish and disappear before you do anything else.

	![Screen Shot 2016-10-14 at 8.26.59 AM.png](https://tiy-learn-content.s3.amazonaws.com/e9614072-Screen%20Shot%202016-10-14%20at%208.26.59%20AM.png)

9. You should see in the Example file a set of instructions shown in Java block comments (`/* .... */`). Read those instructions and follow them.

10. When you're ready to run this code, select "Run All Tests (ExampleTest)" in the drop down menu at the top of the screen and click the green Run button to the right.

	![run all.png](https://tiy-learn-content.s3.amazonaws.com/81bad2a9-run%20all.png)

11. As you work through the instructions in the `Example` file, you will see a listing of errors. This is what you are fixing:

	![list of errors.png](https://tiy-learn-content.s3.amazonaws.com/6d4d7408-list%20of%20errors.png)

12. After you have fixed both problems in the project, running it should produce output that looks like this:

	![success.png](https://tiy-learn-content.s3.amazonaws.com/cdf938e0-success.png)