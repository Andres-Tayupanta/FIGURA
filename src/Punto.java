public class Punto {
    double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double calcularDistacia(Punto punto2){
        double dist = Math.sqrt(Math.pow(this.x-punto2.getX(),2)+Math.pow(this.y- punto2.getX(),2));
        return dist;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
