/*
 * Arquivo: capitulo15/Desenhavel.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Uma interface que fornece aos seus implementadores um método
 * de desenho.
 * 
 * Já vimos que usualmente nomeamos nossas classes usando substantivos,
 * pois representam coisas. As interfaces são normalmente nomeadas usando-se
 * adjetivos, pois adicionarão características ou comportamentos às classes
 * que as implementam.
 * 
 * Toda classe que implementar a interface Desenhavel passará a ser uma
 * classe cujos objetos podem ser desenhados ou que são desenháveis.
 */

import java.awt.Graphics2D;

public interface Desenhavel {
    
    public abstract void desenhar( Graphics2D g2d );

}