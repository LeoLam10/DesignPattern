package cn.leolam10.principle.singleresponsibility;

public class singleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("bus");
        vehicle.run("aircraft");
    }
}



/**
 * 交通工具类
 * 方式1:   1)在方式1的run方法中，违反了单一职责原则
 *         2)解决的方法:根据交通工具运行方法不同，分解成不同的类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road.");
    }
}
