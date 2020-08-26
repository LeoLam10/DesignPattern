package cn.leolam10.principle.singleresponsibility;

public class singleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("car");
        airVehicle.run("aircraft");
        waterVehicle.run("ship");
    }
}

/**
 * 交通工具类
 *  方式2:   1)遵守了单一职责原则
 *          2)但这样做改动很大，即:将类分解，同时修改客户端
 *          3)改进:直接修改Vehicle类，改动的代码会比较少-->方式3
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the air");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the watter");
    }
}
