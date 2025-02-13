/*
 * Arquivo: capitulo14/Elipse.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Forma do tipo Elipse.
 */

import java.awt.Graphics2D;

public class Elipse extends Forma {
    
    public void desenhar( Graphics2D g2d ) {

        // cria um novo contexto gráfico com base no passado no parâmetro
        g2d = (Graphics2D) g2d.create();

        // define valores apropriados para o desenho da elipse
        int xIniD = xIni < xFim ? xIni : xFim;
        int yIniD = yIni < yFim ? yIni : yFim;
        int largura = Math.abs( xFim - xIni );
        int altura = Math.abs( yFim - yIni );

        // se há cor de preenchimento
        if ( corPreenchimento != null ) {

            // configura a cor do "pincel" contexto
            g2d.setColor( corPreenchimento );

            // pinta uma elipse
            g2d.fillOval( xIniD, yIniD, largura, altura );

        }

        // se há cor de contorno
        if ( corContorno != null ) {

            // configura a cor do "pincel" contexto
            g2d.setColor( corContorno );

            // desenha o contorno de uma elipse
            g2d.drawOval( xIniD, yIniD, largura, altura );
            
        }

        // libera o contexto gráfico criado
        g2d.dispose();

    }

}