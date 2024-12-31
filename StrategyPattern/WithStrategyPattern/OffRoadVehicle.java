package WithStrategyPattern;

import WithStrategyPattern.Strategy.OffRoadDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new OffRoadDriveStrategy());
    }
}