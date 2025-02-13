import br.com.davidbuzatto.jsge.core.engine.EngineFrame;
import java.awt.Color;

public class Placar {
    
    private int x;
    private int y;
    private int pontosJogador1;
    private int pontosJogador2;
    private Jogador ultimoPontuar;
    private Color cor;

    public Placar( int x, int y, int pontosJogador1, int pontosJogador2, Jogador ultimoPontuar, Color cor ) {
        this.x = x;
        this.y = y;
        this.pontosJogador1 = pontosJogador1;
        this.pontosJogador2 = pontosJogador2;
        this.ultimoPontuar = ultimoPontuar;
        this.cor = cor;
    }

    public void desenhar( EngineFrame engine ) {
        String pontuacao = String.format( "%d | %d", pontosJogador1, pontosJogador2 );
        int largura = engine.measureText( pontuacao, 45 );
        engine.drawText( pontuacao, x - largura/2, y, 45, cor );
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

    public int getPontosJogador1() {
        return pontosJogador1;
    }

    public void setPontosJogador1(int pontosJogador1) {
        this.pontosJogador1 = pontosJogador1;
    }

    public int getPontosJogador2() {
        return pontosJogador2;
    }

    public void setPontosJogador2(int pontosJogador2) {
        this.pontosJogador2 = pontosJogador2;
    }

    public Jogador getUltimoPontuar() {
        return ultimoPontuar;
    }

    public void setUltimoPontuar(Jogador ultimoPontuar) {
        this.ultimoPontuar = ultimoPontuar;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

}
