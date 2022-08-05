5.1 Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O círculo mais interno deve ter um raio de 10 pixels e cada círculo sucessivo deve ter um raio
de 10 pixels maior que o anterior. Comece localizando o centro do JPanel. Para obter o canto superior esquerdo de um círculo, mova-se um raio para cima e um raio para a 
esquerda a partir do centro. A largura e a altura do retângulo delimitador têm o mesmo diâmetro do círculo (isto é, duas vezes o raio).

![image](https://user-images.githubusercontent.com/80348569/182971261-ee690743-e5f1-4e1d-a85d-9bc2d076f686.png)


5.2 Modifique a Questão 5.16 no final dos exercícios do capítulo para ler a entrada utilizando diálogos e exibir o gráfico de barras usando
retângulos de comprimentos variados.

~~~
import javax.swing.*;
import java.awt.Graphics;

public class Shapes extends JPanel {
    private int choice;

    public Shapes(int userChoice) {
        choice = userChoice;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        double width = getWidth();
        double height = getHeight();
        width = width/2 - 10;
        height = height/2 - 10;
        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval((int) (width - i * 10), (int) (height - i * 10), 20 + i * 20, 20 + i * 20);
                    break;
            }
        }
    }
}
~~~
![image](https://user-images.githubusercontent.com/80348569/182971315-e7abebca-2a10-46fa-aff7-e49f9f493d3b.png)

