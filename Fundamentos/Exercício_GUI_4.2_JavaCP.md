4.2 A Figura 4.21 exibe dois projetos adicionais criados utilizando-se loops while e drawLine. 

a) Crie o projeto na captura de tela da esquerda na Figura 4.21. 
Comece dividindo cada borda em um número igual de incrementos (escolhemos 15 novamente). A primeira linha inicia no canto superior esquerdo e termina um passo à direita 
na extremidade inferior. Para cada linha sucessiva, move-se para baixo um incremento na borda esquerda e um incremento para a direita na borda inferior. 
Continue desenhando linhas até alcançar o canto inferior direito. A figura deve ser dimensionada à medida que você redimensiona a janela, de modo que as extremidades 
sempre toquem as bordas.

b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura de tela da direita na
Figura 4.21.

![image](https://user-images.githubusercontent.com/80348569/181844255-5d987dd0-80a0-4c58-9563-f40e2147878f.png)

~~~
import javax.swing.*;
import java.awt.Graphics;
public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int aux_width = width / 15;
        int aux_height = height / 15;
        int cont = 1;
        double x = 0;
        double y = height;
        int aux2 = 0;

        while (cont <= 16) {
            g.drawLine(0,  (int) y,  (int)  x, height);
            x = aux_width * cont;
            y = aux_height * aux2;
            aux2++;
            cont++;
        }

        cont = 0;
        x = 0;
        aux2 = 1;
        y = aux_height * aux2;

        while (cont <= 16) {
            g.drawLine(width,  (int) y,  (int)  x, 0);
            x = aux_width * cont;
            y = aux_height * aux2;
            aux2++;
            cont++;
        }

        cont = 1;
        x = aux_width * cont;
        aux2 = 0;
        y = aux_height * aux2;

        while (cont <= 16) {
            g.drawLine(width, (int) y, width - (int)  x, height);
            x = aux_width * cont;
            y = aux_height * aux2;
            aux2++;
            cont++;
        }

        cont = 1;
        x = aux_width * cont;
        aux2 = 0;
        y = aux_height * aux2;

        while (cont <= 16) {
            g.drawLine(0, height - (int) y, (int)  x, 0);
            x = aux_width * cont;
            y = aux_height * aux2;
            aux2++;
            cont++;
        }

    }
}

~~~
![image](https://user-images.githubusercontent.com/80348569/181855014-de1629f3-4c54-4329-9438-3add66600057.png)
![image](https://user-images.githubusercontent.com/80348569/181857988-b91000cd-bfe2-47f9-a79a-e70cb61c427a.png)
