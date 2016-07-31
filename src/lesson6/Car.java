package lesson6;

public class Car {
	public String  carBrand;
	public int fuelConsumption; //10 na 100
	public int mileage;
	public int fuelTankVolume;
	public int fuelLevel;
	public boolean engineStatus;
	
	
	public void drive(int howKm){
		if(engineStatus == true){
			if((fuelLevel - howKm*(fuelConsumption/100))>=0){
				fuelLevel = fuelLevel - howKm*(fuelConsumption/100);
				mileage = mileage + howKm;
			}else{
				
				
				System.out.println("You must start engine first!"); 
			}
	
	public void startTheCar(){
		if(fuelLevel<=0){
			System.out.println("Fuel is over! Engine off.");
			engineStatus = false;
		}else if(engineStatus == true){
			engineStatus = false;
			System.out.println("Engine is off.");
		}else{
			engineStatus = true;
			System.out.println("Engine is on.");
		}
	}

	
	public void fillUp(int fuel){
		
		if(fuelLevel+fuel>fuelTankVolume){
			fuelLevel = fuelTankVolume;
			System.out.println("Tank is full. Over liters is: "+(fuelLevel+fuel-fuelTankVolume));
		}else{
			fuelLevel = fuelLevel + fuel;
			System.out.println("Fuel level: "+fuelLevel);
		}
		
	}
	
	
	
	

}
