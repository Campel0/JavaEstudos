import java.awt.Color;

import br.com.davidbuzatto.jsge.core.engine.EngineFrame;

public class Bolinha {
    
    private double x;
    private double y;
    private double raio;
    private Color cor;

    private double vx;
    private double vy;
    private double atrito;
    private double elasticidade;

    private boolean arrastando;
    
    public Bolinha( double x, double y, double raio, Color cor, double vx, double vy, double atrito, double elasticidade ) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.cor = cor;
        this.vx = vx;
        this.vy = vy;
        this.atrito = atrito;
        this.elasticidade = elasticidade;
        this.arrastando = false;
    }

    public void desenhar( EngineFrame engine ) {
        engine.fillCircle( x, y, raio, cor );
        engine.drawCircle( x, y, raio, EngineFrame.BLACK );
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

    public double getAtrito() {
        return atrito;
    }

    public void setAtrito(double atrito) {
        this.atrito = atrito;
    }

    public double getElasticidade() {
        return elasticidade;
    }

    public void setElasticidade(double velocidade) {
        this.elasticidade = velocidade;
    }

    public boolean isArrastando() {
        return arrastando;
    }

    public void setArrastando(boolean arrastando) {
        this.arrastando = arrastando;
    }

}