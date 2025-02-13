/*
 * Arquivo: capitulo14/Retangulo.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Forma do tipo Retângulo.
 */

import java.awt.Graphics2D;

public class Retangulo extends Forma {
    
    public void desenhar( Graphics2D g2d ) {

        // cria um novo contexto gráfico com base no passado no parâmetro
        g2d = (Graphics2D) g2d.create();

        // define valores apropriados para o desenho do retângulo
        int xIniD = xIni < xFim ? xIni : xFim;
        int yIniD = yIni < yFim ? yIni : yFim;
        int largura = Math.abs( xFim - xIni );
        int altura = Math.abs( yFim - yIni );

        // se há cor de preenchimento
        if ( corPreenchimento != null ) {

            // configura a cor do "pincel" contexto
            g2d.setColor( corPreenchimento );

            // pinta um retângulo
            g2d.fillRect( xIniD, yIniD, largura, altura );

        }

        // se há cor de contorno
        if ( corContorno != null ) {

            // configura a cor do "pincel" contexto
            g2d.setColor( corContorno );

            // desenha o contorno de um retângulo
            g2d.drawRect( xIniD, yIniD, largura, altura );

        }

        // libera o contexto gráfico criado
        g2d.dispose();

    }

}