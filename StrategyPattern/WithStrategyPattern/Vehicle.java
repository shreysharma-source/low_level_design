package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle{

    DriveStrategy driveStrat;

    Vehicle(DriveStrategy iDriveStrategy){
        driveStrat = iDriveStrategy;
    }

    public void drive(){
        driveStrat.drive();
    }
}