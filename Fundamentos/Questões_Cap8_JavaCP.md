8.4 (Classe Rectangle) Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento (length) e a largura (width). Os métodos set devem verificar se length e width são, cada um, números de ponto flutuante maiores que 0,0 e menores que
20,0. Escreva um programa para testar a classe Rectangle.

~~~
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    public void perimeter(double width, double height){
        double perimeter = 2 * width + 2 * height;
        System.out.printf("Perimetro: %f%n", perimeter);
    }

    public void area(double width, double height){
        double area = width * height;
        System.out.printf("Area: %f%n", area);
    }

    public void setWidth(double width){
        if (width > 0 && width < 20){
            this.width = width;
        }
    }

    public void setHeight(double height){
        if (height > 0 && height < 20){
            this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

}
~~~
