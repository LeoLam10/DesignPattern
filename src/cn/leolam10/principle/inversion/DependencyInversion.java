package cn.leolam10.principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 完成Person接收消息的功能
 * 方式1:   1)、简单，较易想到
 *         2)、若火枪的对象是微信、短信等，则需要新增类，同时Person对象也要新增相应的接收方法
 *         3)、解决思路:引入一个抽象的接口IReceiver表示接收者，Person类与接口发生依赖
 *            因为Email,WeiXin等都属于接受的范围，他们各自实现IReceiver接口即可，就符合依赖倒转原则
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo(){
        return "电子信息邮件:hello world";
    }
}

