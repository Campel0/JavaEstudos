/*
 * Arquivo: capitulo14/Retangulo.java
 * Autor: Prof. Dr. David Buzatto
 * 
 * Teste das formas usando classes de interface gráfica.
 * 
 * TesteFormas gerdade JFrame, que por sua vez é uma janela.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class TesteFormas extends JFrame {
    
    // uma lista de formas
    private List<Forma> formas;

    public TesteFormas() {

        // configura o JFrame
        setTitle( "Teste Formas" );
        setSize( 800, 600 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );

        // cria a lista de formas
        formas = new ArrayList<>();

        // popula a lista
        criarFormasTeste();

    }

    private void criarFormasTeste() {

        // cria uma Linha e a configura
        Linha linha = new Linha();
        linha.setXIni( 50 );
        linha.setYIni( 50 );
        linha.setXFim( 160 );
        linha.setYFim( 160 );

        // cria um Retângulo e o configura
        Retangulo retangulo = new Retangulo();
        retangulo.setXIni( 200 );
        retangulo.setYIni( 200 );
        retangulo.setXFim( 400 );
        retangulo.setYFim( 350 );
        retangulo.setCorContorno( Color.GREEN );
        retangulo.setCorPreenchimento( Color.YELLOW );

        // cria uma elipse e a configura
        Elipse elipse = new Elipse();
        elipse.setXIni( 400 );
        elipse.setYIni( 350 );
        elipse.setXFim( 600 );
        elipse.setYFim( 550 );
        elipse.setCorContorno( Color.RED );
        elipse.setCorPreenchimento( Color.BLUE );

        // insere os objetos criados na lista de formas
        formas.add( linha );
        formas.add( retangulo );
        formas.add( elipse );

    }

    /*
     * O método paint é responsável em fazer o "desenho" da janela na 
     * tela. Esse desenho é feito usando o contexto gráfico Graphics
     * que internamente é na verdade do subtipo Graphics2D.
     */
    @Override
    public void paint( Graphics g ) {

        /* 
         * A chamada ao paint da superclasse é obrigatório para que não
         * haja inconsistências na apresentação do componente.
         */
        super.paint( g );

        // cria um novo contexto gráfico com base no original
        Graphics2D g2d = (Graphics2D) g.create();

        // ativa suavização
        g2d.setRenderingHint( 
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON );

        // percorre a lista de formas, desenhando uma a uma
        for ( Forma f : formas ) {

            /* 
             * Aqui que a vinculação dinâmica/tardia entra em ação
             * para que o polimorfismo atue, pois a versão do método
             * desenhar que será invocada dependerá do tipo do objeto,
             * não da referência.
             */
            f.desenhar( g2d );
            
        }

        // libera o contexto gráfico criado
        g2d.dispose();

    }

    public static void main( String[] args ) {
        new TesteFormas().setVisible( true );
    }

}