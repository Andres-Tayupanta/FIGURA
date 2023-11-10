import java.util.List;
import java.util.Scanner;

public class Rectangulo extends Figura {
    public Rectangulo() {

    }


     void ingresarPuntos(){
             Scanner sc = new Scanner(System.in);
             System.out.println();
             for (int i=0;i<6;i++){
                 System.out.println("INGRESE X"+i+1);
                 double x =sc.nextDouble();
                 System.out.println("INGRESE Y"+i+1);
                 double Y =sc.nextDouble();
                 Punto punto = new Punto(x,Y);
                 this.ListaPuntos.add(punto);

             }

     }

     double calcularPerimetro(){
        Punto p1 = this.listaPuntos.get(0);
         Punto p2 = this.listaPuntos.get(1);
         Punto p3 = this.listaPuntos.get(2);
         Punto p4 = this.listaPuntos.get(3);
         double l1 =p1.calcularDistacia(p2);
         double l2 =this.calcularDistacia(p1,p3);
         this.perimetro = l1+2+l2+2;
         return this.perimetro;


     }
      double calcularArea(){
        Punto punto1 = this.listaPuntos.get (1);
        Punto punto2 = this.listaPuntos.get (2);
        Punto punto3 = this.listaPuntos.get (3);
          double l1= punto1.calcularDistacia(punto2);
          double l2 = this.calcularDistancia(punto1,punto3);
          this.area = l1+l2;
          return this.area;
    }
    Punto
}