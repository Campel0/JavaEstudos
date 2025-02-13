/*
 * Arquivo: capitulo14/Linha.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Classe que representa uma Forma do tipo Linha.
 * A classe Linha herda de Forma e implementa o método abstrato desenhar.
 */

import java.awt.Graphics2D;

public class Linha extends Forma {
    
    /*
     * Na implementação do método abstrato herdado a subclasse fornece
     * seu comportamento especializado para esse método. Na implementação
     * do método desenhar da classe Linha uma linha será desenhada usando
     * o contexto gráfico Graphics2D (do Java2D) e os atributos definidor
     * na superclasse.
     */
    public void desenhar( Graphics2D g2d ) {

        // cria um novo contexto gráfico com base no passado no parâmetro
        g2d = (Graphics2D) g2d.create();

        // se há cor de preenchimento
        if ( corContorno != null ) {

            // configura a cor do "pincel" contexto
            g2d.setColor( corContorno );

            // desenha uma linha
            g2d.drawLine( xIni, yIni, xFim, yFim );

        }
        
        // libera o contexto gráfico criado
        g2d.dispose();

    }

}