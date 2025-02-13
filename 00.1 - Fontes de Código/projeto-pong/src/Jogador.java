import br.com.davidbuzatto.jsge.core.engine.EngineFrame;
import java.awt.Color;

public class Jogador {

    private int x;
    private int y;
    private int largura;
    private int altura;
    private Color cor;

    public Jogador( int x, int y, int largura, int altura, Color cor ) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
    }

    public void desenhar( EngineFrame engine ) {
        engine.fillRectangle( x, y, largura, altura, cor );
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
}
