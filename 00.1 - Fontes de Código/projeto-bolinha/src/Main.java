import br.com.davidbuzatto.jsge.core.engine.EngineFrame;

/**
 * Simulação da bolinha.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class Main extends EngineFrame {

    private Bolinha bolinha;
    private double offsetX;
    private double offsetY;
    private int xMouseAnterior;
    private int yMouseAnterior;

    private static final int GRAVIDADE = 100;

    public Main() {
        super( 800, 450, "Bolinha - Prof. Dr. David Buzatto", 60, true );
    }

    @Override
    public void create() {
        bolinha = new Bolinha( getScreenWidth() / 2, getScreenHeight() / 2, 25, BLUE, 400, 400, 0.99, 0.9 );
    }

    @Override
    public void update( double delta ) {

        if ( isMouseButtonPressed( MOUSE_BUTTON_LEFT ) ) {
            double cat1 = getMouseX() - bolinha.getX();
            double cat2 = getMouseY() - bolinha.getY();
            double hip = Math.sqrt( cat1 * cat1 + cat2 * cat2 );
            if ( hip <= bolinha.getRaio() ) {
                bolinha.setArrastando( true );
                offsetX = getMouseX() - bolinha.getX();
                offsetY = getMouseY() - bolinha.getY();
            } else {
                bolinha.setArrastando( false );
            }
        } else if ( isMouseButtonReleased( MOUSE_BUTTON_LEFT ) ) {
            bolinha.setArrastando( false );
        } else if ( isMouseButtonDown( MOUSE_BUTTON_LEFT ) ) {
            if ( bolinha.isArrastando() ) {

                bolinha.setX( getMouseX() - offsetX );
                bolinha.setY( getMouseY() - offsetY );

                bolinha.setVx( ( getMouseX() - xMouseAnterior ) / delta );
                bolinha.setVy( ( getMouseY() - yMouseAnterior ) / delta );

                xMouseAnterior = getMouseX();
                yMouseAnterior = getMouseY();

            }
        }

        if ( !bolinha.isArrastando() ) {

            bolinha.setX( bolinha.getX() + bolinha.getVx() * delta );
            bolinha.setY( bolinha.getY() + bolinha.getVy() * delta );

            if ( bolinha.getX() + bolinha.getRaio() >= getScreenWidth() ) {
                bolinha.setX( getScreenWidth() - bolinha.getRaio() );
                bolinha.setVx( -bolinha.getVx() * bolinha.getElasticidade() );
            } else if ( bolinha.getX() - bolinha.getRaio() <= 0 ) {
                bolinha.setX( bolinha.getRaio() );
                bolinha.setVx( -bolinha.getVx() * bolinha.getElasticidade() );
            }

            if ( bolinha.getY() + bolinha.getRaio() >= getScreenHeight() ) {
                bolinha.setY( getScreenHeight() - bolinha.getRaio() );
                bolinha.setVy( -bolinha.getVy() * bolinha.getElasticidade() );
            } else if ( bolinha.getY() - bolinha.getRaio() <= 0 ) {
                bolinha.setY( bolinha.getRaio() );
                bolinha.setVy( -bolinha.getVy() * bolinha.getElasticidade() );
            }

            bolinha.setVx( bolinha.getVx() * bolinha.getAtrito() );
            bolinha.setVy( bolinha.getVy() * bolinha.getAtrito() + GRAVIDADE );

        }

    }

    @Override
    public void draw() {
        bolinha.desenhar( this );
    }

    public static void main( String[] args ) {
        new Main();
    }

}