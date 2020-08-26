package cn.leolam10.principle.inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

interface IReceiver{
    public String getInfo();
}

class Person{
    //这里是对接口的依赖
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "Email message:hello world";
    }
}

class WeChat implements IReceiver{
    @Override
    public String getInfo() {
        return "WeChat message:hello WeChat";
    }
}
