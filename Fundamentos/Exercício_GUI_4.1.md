4.1 Utilizar loops e instruções de controle para desenhar linhas pode levar a muitos projetos interessantes. 

a) Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior esquerdo, estendendo-as até que cubram a metade superior
esquerda do painel. Uma abordagem é dividir a largura e altura em um número igual de passos (descobrimos que 15 passos funcionam bem).
A primeira extremidade de uma linha sempre estará no canto superior esquerdo (0, 0). A segunda extremidade pode ser encontrada iniciando no canto 
inferior esquerdo e movendo-se para cima em um passo vertical e para a direita em um passo horizontal. Desenhe uma linha entre as duas extremidades. 
Continue movendo-se para cima e para o passo à direita a fim de encontrar cada extremidade sucessiva. A figura deve ser dimensionada de maneira correspondente à medida
que você redimensiona a janela.

b) Modifique sua resposta da parte (a) para que as linhas se estendam dos quatro cantos, como mostrado na captura de tela da direita na
Figura 4.20. As linhas de cantos opostos devem se cruzar no meio.

![image](https://user-images.githubusercontent.com/80348569/181843265-b14b89cc-39fe-41f8-8c2a-a8e1ca288d79.png)

Classe DrawPanel
~~~
import javax.swing.*;
import java.awt.Graphics;
public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        double aux_width = (double) width / 15;
        double aux_height = (double) height / 15;
        int cont = 0;
        double x = 0;
        double y = height;

        while (cont != 15) {
            g.drawLine(0, 0, (int) x, (int) y);
            x += aux_width;
            y -= aux_height;
            cont++;
        }
        cont = 0;
        x = width;
        y = 0;
        while (cont != 15) {
            g.drawLine(width, height, (int) x, (int) y);
            x -= aux_width;
            y += aux_height;
            cont++;
        }
        cont = 0;
        x = 0;
        y = 0;
        while (cont != 15) {
            g.drawLine(0, height, (int) x, (int) y);
            x += aux_width;
            y += aux_height;
            cont++;
        }
        cont = 0;
        x = width;
        y = height;
        while (cont != 15) {
            g.drawLine(width, 0, (int) x, (int) y);
            x -= aux_width;
            y -= aux_height;
            cont++;
        }
    }
}
~~~

Main DrawPanelTest

~~~
import javax.swing.*;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }
}
~~~

Saída:

![image](https://user-images.githubusercontent.com/80348569/181843462-21d23249-7a2c-4eb1-b621-e93025d18cbb.png)

