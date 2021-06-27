package activities;

import java.util.*;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers) {
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();	
    }
    
    public void onboard(String passengers) {
    	this.passengers.add(passengers);
    }
    
    public Date takeoff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    public List<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("Hari");
		plane.onboard("Chakri");
		plane.onboard("Paramesh");
		plane.onboard("Ramesh");
		plane.onboard("Peter");
		System.out.println("Plane Take-off time : " + plane.takeoff());
		System.out.println("List of Passengers in Plane : " + plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Time of Plane Landing : "+plane.getLastTimeLanded());

	}

}
