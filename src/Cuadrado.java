import java.util.Scanner;

public class Cuadrado {
    public class Circulo extends Figura{
        public class Triangulo extends Figura{
            void ingresarPuntos(){
                Scanner sc = new Scanner(System.in);
                System.out.println();
                for (int i=0;i<6;i++){
                    System.out.println("INGRESE X"+i+1);
                    double x =sc.nextDouble();
                    System.out.println("INGRESE Y"+i+1);
                    double Y =sc.nextDouble();
                    Punto punto = new Punto(x,y);
                    this.ListaPuntos.add(punto);

                }

            }

            double calcularPerimetro(){
                Punto p1 = this.listaPuntos.get(0);
                Punto p2 = this.listaPuntos.get(1);


                double r =p1.calcularDistacia(p2);

                this.perimetro = l1+2+l2+2;
                return this.perimetro;


            }
            double calcularArea(){
                Punto punto1 = this.listaPuntos.get (1);
                Punto punto2 = this.listaPuntos.get (2);
                Punto punto3 = this.listaPuntos.get (3);
                double l1= punto1.calcularDistacia(p2);
                double l2 = this.calcularDistancia(punto1,punto3);
                this.area = l1+l2;
                return this.area;
            }
        }

    }
}
