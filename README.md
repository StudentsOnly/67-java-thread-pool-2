## Exercise: Printing Documents 

#### Objective:

The objective of this exercise is to practice working with the newFixedThreadPool method of the ExecutorService. You will create a program that simulates a simple thread pool with fixed threads for performing tasks related to printing documents.

#### Instructions:

1.	Create a class named PrintTask that implements the Runnable interface. This class will represent a task that simulates printing a document.
2.	In the run() method of the PrintTask class, simulate printing the document by printing a message indicating the document is being printed.
3.	In the Main class, create an ExecutorService using Executors.newFixedThreadPool with a specified number of threads (e.g., 3).
4.	Create an array of PrintTask objects, each representing a document printing task.
5.	Submit each PrintTask to the ExecutorService for execution.
6.	Allow the program to run for a specified duration (e.g., 6 seconds) to observe the tasks executing in parallel.
7.	After the specified duration, shut down the ExecutorService.
