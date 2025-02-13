/*
 * Arquivo: capitulo15/Forma.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Neste exemplo, separamos a ideia do desenho em uma interface chamada
 * Desenhavel.
 * 
 * Nessa interface é definido o método desenhar que a classe
 * abstrata Forma deverá implementar ou deixar que as subclasses o
 * implementem. Como forma é abstrata, ela não precisa implementar esse
 * método e delegar essas responsabilidades às suas classes filhas.
 * 
 * Caso uma classe seja concreta, ela obrigatoriamente deverá implementar
 * o ou os métodos definidos nas interfaces implementadas.
 * 
 * Na UML a representação de que uma classe implementa uma interface
 * é feita por meio de uma realização, simbolizada de forma análoga à
 * uma herança (linha com seta branca), só que a linha da seta é tracejada.
 */

import java.awt.Color;

public abstract class Forma implements Desenhavel {

    protected int xIni;
    protected int yIni;
    protected int xFim;
    protected int yFim;
    protected Color corContorno = Color.BLACK;
    protected Color corPreenchimento = Color.WHITE;

    public int getXIni() {
        return xIni;
    }
    
    public int getYIni() {
        return yIni;
    }

    public int getXFim() {
        return xFim;
    }
    
    public int getYFim() {
        return yFim;
    }

    public Color getCorContorno() {
        return corContorno;
    }

    public Color getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setXIni( int xIni ) {
        this.xIni = xIni;
    }
    
    public void setYIni( int yIni ) {
        this.yIni = yIni;
    }

    public void setXFim( int xFim ) {
        this.xFim = xFim;
    }
    
    public void setYFim( int yFim ) {
        this.yFim = yFim;
    }

    public void setCorContorno( Color corContorno ) {
        this.corContorno = corContorno;
    }

    public void setCorPreenchimento( Color corPreenchimento ) {
        this.corPreenchimento = corPreenchimento;
    }

}