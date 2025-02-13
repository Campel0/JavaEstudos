import br.com.davidbuzatto.jsge.core.engine.EngineFrame;
import java.awt.Color;

public class Bolinha {
    
    private double x;
    private double y;
    private double raio;
    private Color cor;

    private double vx;
    private double vy;
    
    public Bolinha( double x, double y, double raio, Color cor, double vx, double vy ) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.cor = cor;
        this.vx = vx;
        this.vy = vy;
    }

    public void desenhar( EngineFrame engine ) {
        engine.fillCircle( x, y, raio, cor );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

}