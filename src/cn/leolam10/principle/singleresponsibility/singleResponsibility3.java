package cn.leolam10.principle.singleresponsibility;

public class singleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("car");
        vehicle2.fly("aircraft");
        vehicle2.sail("ship");
    }
}

/**
 * 方式3:   1)此修改方法没有对原来的类做大的修改，只是增加方法
 *         2)虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上仍然遵守了单一职责原则。
 *
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road.");
    }
    public void fly(String vehicle) {
        System.out.println(vehicle + " is flying on the air.");
    }
    public void sail(String vehicle){
        System.out.println(vehicle + " is sailing on the sea");
    }
}