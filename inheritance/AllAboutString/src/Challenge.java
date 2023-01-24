 class Circle {
    // write your code here
    protected double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }
}

 