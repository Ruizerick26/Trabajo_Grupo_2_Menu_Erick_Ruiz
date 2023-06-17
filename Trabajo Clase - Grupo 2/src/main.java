import conicas2. *;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("Sistema de calculos geometricos:\n\n\n");
        opciones();
        int opcion= rc.nextInt();
        while (opcion != 5){
            switch(opcion){
                case 1:
                    circunferencia_grupo2 circulo = new circunferencia_grupo2(0,0);
                    System.out.println("CIRCUNFERENCIA");
                    System.out.println("Ingrese el radio de la circunferencia");
                    float radio = rc.nextFloat();
                    circulo.setRadio_cir(radio);
                    System.out.println("Ingrese el angulo central");
                    float angulo_C = rc.nextFloat();
                    circulo.setAngulo_central(angulo_C);
                    System.out.println("El perimetro de la circunferencia es: "+circulo.perimetro_cir());
                    System.out.println("El área de la circunferencia es: "+circulo.area_cir());
                    System.out.println("El angulo inscrito de la circunferencia es: "+circulo.angulo_inscrito_cir());
                    break;
                case 2:
                    Elipse nuevaelicpse = new Elipse(0,0);
                    System.out.println("ELIPSES");
                    System.out.println("Ingrese el eje mayor de la elipse:");
                    float eje_mayor=rc.nextFloat();
                    nuevaelicpse.setEje_mayor(eje_mayor);
                    System.out.println("Ingrese el eje menor de la elipse");
                    float eje_menor = rc.nextFloat();
                    nuevaelicpse.setEje_menor(eje_menor);
                    System.out.println("El perimetro de la elipse es: "+nuevaelicpse.perimetro_elipse());
                    System.out.println("El área de la elipse es: "+nuevaelicpse.area_elipse());
                    break;
                case 3:
                    hiperbole lahiperbole = new hiperbole(0,0);
                    System.out.println("Ingrese el punto A");
                    float a = rc.nextFloat();
                    lahiperbole.setA(a);
                    System.out.println("Ingrese el punto B");
                    float b = rc.nextFloat();
                    lahiperbole.setB(b);
                    lahiperbole.variables();
                    break;
                case 4:
                    Parabola_Equipo2 miparabola = new Parabola_Equipo2(0,0,0,0,0);
                    System.out.println("Ingrese el eje x: ");
                    int x = rc.nextInt();
                    miparabola.setEjex(x);
                    System.out.println("Ingrese el eje y: ");
                    int y = rc.nextInt();
                    miparabola.setEjey(y);
                    System.out.println("Ingrese le punto A: ");
                    float a_p = rc.nextFloat();
                    miparabola.setA(a_p);
                    System.out.println("Ingrese el punto B: ");
                    float b_p = rc.nextFloat();
                    miparabola.setB(b_p);
                    System.out.println("Ingrese el punto C: ");
                    float c_p = rc.nextFloat();
                    miparabola.setC(c_p);
                    System.out.println("El valor de X usando A y B: "+ miparabola.Parabola_Equipo2_VerticeX(miparabola.getA(), miparabola.getB()));
                    System.out.println("El valor de Y usando A,B y C: "+miparabola.Parabola_Equipo2_VerticeY(miparabola.getA(), miparabola.getB(), miparabola.getC()));
                    miparabola.Parabola_Equipo2_ImpVer();
            }
            opciones();
            opcion= rc.nextInt();
        }

    }
    public static void opciones(){
        System.out.println("SELECCIONE UNA LA OPCION QUE DESEA");
        System.out.println("1. Calculos de una Circunferencia");
        System.out.println("2. Calculos de una Elipse");
        System.out.println("3. Calculos de una Hiperbole");
        System.out.println("4. Calculos de una Parabola");
        System.out.println("5. SALIR");
    }
}

