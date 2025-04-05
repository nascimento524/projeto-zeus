public class FormaGeometrica {
    public void area() {
        System.out.println("Área de uma forma geométrica");
    }
}

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void area() {
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
    }
}

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area() {
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}

public class Circulo extends FormaGeometrica {
    private double raio;
    private final double PI = 3.14159; // Valor aproximado de PI

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void area() {
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }
}