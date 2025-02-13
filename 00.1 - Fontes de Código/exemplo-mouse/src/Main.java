import br.com.davidbuzatto.jsge.core.engine.EngineFrame;
import br.com.davidbuzatto.jsge.math.Vector2;

/**
 * Exemplo de tratamento de eventos do mouse.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class Main extends EngineFrame {

    private class Linha {
        Vector2 ini = new Vector2();
        Vector2 fim = new Vector2();
        boolean desenhar;
    }

    private Linha linhaTemporaria;
    private Linha[] linhas;
    private int quantidadeLinhas;

    public Main() {
        super( 600, 400, "Exemplo de Tratamento do Mouse", 60, true );
        linhas = new Linha[100];
        quantidadeLinhas = 0;
    }

    @Override
    public void create() {
    }

    @Override
    public void update( double delta ) {

        // verifica se o botão da esquerda do mouse foi pressionado uma vez
        if ( isMouseButtonPressed( MOUSE_BUTTON_LEFT ) ) {

            System.out.print( "botao da esquerda pressionado: " );

            linhaTemporaria = new Linha();

            /* obtém a posição em x do mouse
             * int getMouseX();
             */

            /* obtém a posição em y do mouse
             * int getMouseY();
             */
            System.out.printf( "(%d, %d)\n", getMouseX(), getMouseY() );

            linhaTemporaria.ini.x = getMouseX();
            linhaTemporaria.ini.y = getMouseY();

            // verifica se o botão da esquerda do mouse foi solto
        } else if ( isMouseButtonReleased( MOUSE_BUTTON_LEFT ) ) {

            System.out.println( "botao da esquerda solto!" );
            linhas[quantidadeLinhas++] = linhaTemporaria;

            // verifica se o botão da esquerda do mouse continua pressionado
        } else if ( isMouseButtonDown( MOUSE_BUTTON_LEFT ) ) {

            if ( linhaTemporaria != null ) {

                System.out.println( "botao continua pressionado!" );

                linhaTemporaria.fim.x = getMouseX();
                linhaTemporaria.fim.y = getMouseY();
                linhaTemporaria.desenhar = true;

            }

        }

    }
    
    @Override
    public void draw() {

        if ( linhaTemporaria != null && linhaTemporaria.desenhar ) {
            desenharLinha( linhaTemporaria );
        }
    
        for ( int i = 0; i < quantidadeLinhas; i++ ) {
            desenharLinha( linhas[i] );
        }

    }

    void desenharLinha( Linha linha ) {
        drawLine( linha.ini.x, linha.ini.y, 
                  linha.fim.x, linha.fim.y, DARKPURPLE );
    }

    public static void main( String[] args ) {
        new Main();
    }

}