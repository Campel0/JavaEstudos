import br.com.davidbuzatto.jsge.core.engine.EngineFrame;

/**
 * Exemplo de tratamento de eventos do teclado.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class Main extends EngineFrame {

    private char[] caracteres;
    private int quantidadeCaracteres;

    public Main() {
        super( 600, 400, "Exemplo de Tratamento do Teclado", 60, true );
        caracteres = new char[100];
        quantidadeCaracteres = 0;
    }

    @Override
    public void create() {
    }

    @Override
    public void update( double delta ) {

        if ( isKeyPressed( KEY_SPACE ) ) {
            System.out.println( "tecla <espaco> pressionada!" );
        }

        if ( isKeyReleased( KEY_SPACE ) ) {
            System.out.println( "tecla <espaco> solta!" );
        }

        char c = getCharPressed();
        if ( c != KEY_NULL ) {
            if ( quantidadeCaracteres < 100 ) {
                caracteres[quantidadeCaracteres++] = c;
            }
        }

        int k = getKeyPressed();
        if ( k != KEY_NULL ) {
            System.out.printf( "codigo tecla pressionada: %d\n", k );
        }

    }

    @Override
    public void draw() {

        int x;
        int y = 10;
        int k = 0;

        int tamanhoFonte = 20;

        for ( int i = 0; i < quantidadeCaracteres; i++ ) {
            char caractere = caracteres[i];
            if ( caractere == '\n' ) {
                y += tamanhoFonte;
                k = 0;
            } else {

                x = 10 + k * tamanhoFonte;
                k++;

                drawText( String.format( "%c", caracteres[i] ), 
                          x, y + 10, 
                          tamanhoFonte, DARKPURPLE );

            }
        }

    }

    public static void main( String[] args ) {
        new Main();
    }

}