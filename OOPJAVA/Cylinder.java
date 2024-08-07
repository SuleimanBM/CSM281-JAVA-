public class Cylinder {
    private double radius;
    private double height;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
     
    public double volume(){
       double volume = Math.PI * Math.pow(this.radius, 2) * this.height;
       return volume;
    }
    
    public double bothOpenArea(){
        double Area = 2 * Math.PI * this.radius * this.height;
        return Area;
    }
    public double oneClosedArea(){
        double Area = Math.PI * Math.pow(this.radius, 2) + bothOpenArea();
        return Area;
    }

    public double bothClosedArea(){
        double Area =2* Math.PI * Math.pow(this.radius, 2) + bothOpenArea();
        return Area;
    }
}
