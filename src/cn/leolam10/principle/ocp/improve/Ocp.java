package cn.leolam10.principle.ocp.improve;


public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new OtherGraphic());

    }

}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shape对象，根据type来绘制不同的图像
    public void drawShape(Shape s) {
       s.draw();
    }

}

//shape类 基类
abstract class Shape {
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {


    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增一个图像
class OtherGraphic extends Shape{

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
