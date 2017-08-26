package trinomiocp;

public class Numero {

    private int num1 = 0; //Recibe el numero a
    private double num2; //Recibe el numero b
    private double num3; //Recibe el numero c
    private double num4; //Ayuda a guardar el primer valor de a
    private int numV; //Ayuda a validar 
    private String ec; //Cadena de la ecuación
    //Todos los get´s ofrecen el valor de cada variable
    //Todos los set´s gaurdan el valor de cada variable

    public int getNumV() {
        return numV;
    }

    public void setNumV(int numV) {
        this.numV = numV;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    //Divide toda la ecuación entre el coeficiente de la cuadratica a
    public void Dividir() {
        this.num2 = num2 / num1;
        this.num4 = this.num1;
        this.num1 = num1 / num1;
    }

    //Otiene el valor de C 
    public double ObtenerC() {
        this.num3 = Math.pow((this.num2 / 2), 2);
        return num3;
    }

    //Obtiene la ecuación
    public String ecuacion() {
        this.ec = num1 + "x2 + " + num2 + "x + " + num3 * num4;
        return this.ec;
    }

}
