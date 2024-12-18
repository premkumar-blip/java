package javaprogram;
import java.util.*;

// Thread to handle marks of a single subject
class SubjectThread extends Thread {
    private int marks;
    private int subjectNumber;

    public SubjectThread(int marks, int subjectNumber) {
        this.marks = marks;
        this.subjectNumber = subjectNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void run() {
        System.out.println("Processing marks for Subject " + subjectNumber + ": " + marks);
        try {
            Thread.sleep(500); // Simulate processing delay
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted for Subject " + subjectNumber);
        }
    }
}

// Main class to calculate total and average marks
public class CalculateSubjectMark {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Array to store marks and threads
	        int[] marks = new int[5];
	        SubjectThread[] threads = new SubjectThread[5];

	        // Input marks for 5 subjects
	        System.out.println("Enter marks for 5 subjects:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	            threads[i] = new SubjectThread(marks[i], i + 1); // Create a thread for each subject
	        }

	        // Start threads
	        for (int i = 0; i < 5; i++) {
	            threads[i].start();
	        }

	        // Wait for threads to finish
	        for (int i = 0; i < 5; i++) {
	            try {
	                threads[i].join();
	            } catch (InterruptedException e) {
	                System.out.println("Main thread interrupted while waiting for Subject " + (i + 1) + " thread.");
	            }
	        }

	        // Calculate total and average marks
	        int total = 0;
	        for (int i = 0; i < 5; i++) {
	            total += threads[i].getMarks();
	        }
	        double average = total / 5.0;

	        // Display the result
	        System.out.println("\nTotal Marks: " + total);
	        System.out.println("Average Marks: " + average);

	        scanner.close();
	    }
	}
