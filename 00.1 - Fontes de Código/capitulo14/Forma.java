/*
 * Arquivo: capitulo14/Forma.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * A classe forma é uma classe abstrada. Classes abstratas não podem ser
 * instanciadas, ou seja, não é permitido criar objetos dessa classe de 
 * forma direta. Uma classe abstrata deve ser entendida como uma classe
 * que normalmente será usada como um modelo para outras classes que
 * herdarão dela.
 * 
 * Normalmente, classes abstratas terão um ou mais métodos abstratos que
 * deverão ser implementados por suas subclasses.
 * 
 * Os conceitos de subclasses (classes filhas) e superclasses (classes mães)
 * estão diretamente associados ao conceito de Herança, outro dos pilares
 * do paradigma orientado a objetos. A ideia da Herança é criar tipos mais
 * abstratos que servirão de modelo para tipos mais especializados.
 * 
 * O processo de se estender (herdar) classes as associa em uma hierarquia.
 * Na UML a representação da Herança é feita usando-se uma ligação da
 * classe filha para a classe mãe, sendo que na extremidade da classe mãe
 * há uma seta grande branca.
 * 
 * Outro conceito que é associado à Herança, mas não somente à ela, é o
 * Polimorfismo. A ideia do Polimorfismo se baseia em criar construções
 * nas classes que têm comportamento diferentes dependendo do contexto.
 * Quando estamos falando de Polimorfismo de Subtipo ou Polimorfismo de 
 * Inclusão, significa que métodos sobrescritos nas classes filhas serão
 * escolhidos durante a vinculação dinâmica (vinculação tardia) na hora da
 * execução dos mesmos, ou seja, dada uma variável que referencia um objeto,
 * a versão do método que será invocada é a versão do objeto, não do tipo
 * da variável.
 * 
 * Outro ponto importante é que em Java não é permitido que haja a Herança
 * múltipa, ou seja, uma classe herdar de mais de uma classe. Em Java
 * só é permitida a herança simples, ou seja, só pode existir uma
 * superclasse direta de uma outra classe. A motivação para isso é diminuir
 * o problema de conflito de nomes que linguagens que permitem Herança 
 * Múltipla (C++ por exemplo) têm. Apesar de não se poder herdar de mais de
 * uma classe diretamente, podemos incluir uma ou mais implementações de
 * interfaces (veremos isso no próximo Capítulo).
 */

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Forma {

    /* 
     * Membros protected (protegidos) tem acesso direto nas subclasses
     * da classe mãe.
     */
    protected int xIni;
    protected int yIni;
    protected int xFim;
    protected int yFim;
    protected Color corContorno = Color.BLACK;
    protected Color corPreenchimento = Color.WHITE;

    /*
     * Um método abstrato precisa ser obrigatoriamente sobrescrito/
     * implementado nas classes concretas que herdarem de Forma.
     * 
     * Se uma classe possui pelo menos um método abstrato, ela precisa
     * ser obrigatoriamente abstrata. Note que métodos abstratos não possuem
     * implementação (terminam com ;).
     */
    public abstract void desenhar( Graphics2D g2d );

    /*
     * Classes abstratas podem ter métodos concretos (não abstratos) e
     * inclusive construtores que serão chamados de forma indireta nas 
     * subclasses, permitindo que seus atributos sejam inicializados em 
     * um estado válido.
     */
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