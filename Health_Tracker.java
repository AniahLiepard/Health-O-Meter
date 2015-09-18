import java.util.Scanner;

public class Health_Tracker {
	public static void main(String args[]){
		Scanner healthTracker = new Scanner(System.in);
		int age = 0;
		int daysOld = 0;
		int heartBeat = 0;
		int heartRate = 0;
		int sneezeAmount = 0;
		double sneezeRate = 0;
		int caloriesAmount = 0;
		int calories = 0;
		int sleepHours = 0;
		int sleepAmount = 0;
		int minutes = 60;
		
		System.out.println("Question one! If you don't mind me asking, how old are you?");
		age = healthTracker.nextInt();
		daysOld = age * 365;
		System.out.println("Congratulations, you are " + daysOld + " days old!");
		System.out.println("Question two! How many times has your heart beat per minute?");
		heartBeat = healthTracker.nextInt();
		heartRate = heartBeat * 72;
		System.out.println("Wow! Your heart has beat " + heartRate + " times throughout your entire lifetime!");
		System.out.println("Question 3! How many times do you sneeze per day?");
		sneezeAmount = healthTracker.nextInt();
		sneezeRate = sneezeAmount * 1.2;
		System.out.println("You sneezed " + sneezeRate + " times within your lifetime..... need a tissue or something?");
		System.out.println("Question four! How much calories do you take in a day?");
		caloriesAmount = healthTracker.nextInt();
		calories = age * caloriesAmount;
		System.out.println(+ calories + " calories? I don't know how to respond to that..... honestly.....");
		System.out.println("Here is the fifth and final question! How many hours do you sleep per night?");
		sleepHours = healthTracker.nextInt();
		sleepAmount = (age * sleepHours) * minutes;
		System.out.println("You have slept " + sleepAmount + " hours within your lifetime! I wish I could sleep less than that......");
	}
}
