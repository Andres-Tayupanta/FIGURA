

import java.util.ArrayList;
import java.util.List;

public class Figura {

    private double  perimetro, area;
   public List<Punto> listaPuntos = new ArrayList<>();

    public Figura() {

    }
    public Figura(double perimetro, double area, List<Punto> listaPuntos) {
        this.perimetro = perimetro;
        this.area = area;
        this.listaPuntos = listaPuntos;
    }

    double Calculardistacia (Punto punto1, Punto punto2 ){
        double dist = Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2)+Math.pow(punto1.getY()-punto2.getY(),2));
        return dist;
    }


    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(List<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }
}
