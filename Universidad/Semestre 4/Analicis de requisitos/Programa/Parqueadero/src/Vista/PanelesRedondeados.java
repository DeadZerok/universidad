package Vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class PanelesRedondeados extends JPanel {

    public int getBordeSuperiorIzquierdo() {
        return BordeSuperiorIzquierdo;
    }

    public void setBordeSuperiorIzquierdo(int BordeSuperiorIzquierdo) {
        this.BordeSuperiorIzquierdo = BordeSuperiorIzquierdo;
        repaint();
    }

    public int getBordeSuperiorDerecho() {
        return BordeSuperiorDerecho;
    }

    public void setBordeSuperiorDerecho(int BordeSuperiorDerecho) {
        this.BordeSuperiorDerecho = BordeSuperiorDerecho;
        repaint();
    }

    public int getBordeInferiorIzquierdo() {
        return BordeInferiorIzquierdo;
    }

    public void setBordeInferiorIzquierdo(int BordeInferiorIzquierdo) {
        this.BordeInferiorIzquierdo = BordeInferiorIzquierdo;
        repaint();
    }

    public int getBordeInferiorDerecho() {
        return BordeInferiorDerecho;
    }

    public void setBordeInferiorDerecho(int BordeInferiorDerecho) {
        this.BordeInferiorDerecho = BordeInferiorDerecho;
        repaint();
    }

    private int BordeSuperiorIzquierdo = 0;
    private int BordeSuperiorDerecho = 0;
    private int BordeInferiorIzquierdo = 0;
    private int BordeInferiorDerecho = 0;

    public PanelesRedondeados() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createBordeSuperiorIzquierdo());
        if (BordeSuperiorDerecho > 0) {
            area.intersect(new Area(createBordeSuperiorDerecho()));
        }
        if (BordeInferiorIzquierdo > 0) {
            area.intersect(new Area(createBordeInferiorIzquierdo()));
        }
        if (BordeInferiorDerecho > 0) {
            area.intersect(new Area(createBordeInferiorDerecho()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    private Shape createBordeSuperiorIzquierdo() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, BordeSuperiorIzquierdo);
        int roundY = Math.min(height, BordeSuperiorIzquierdo);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createBordeSuperiorDerecho() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, BordeSuperiorDerecho);
        int roundY = Math.min(height, BordeSuperiorDerecho);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createBordeInferiorIzquierdo() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, BordeInferiorIzquierdo);
        int roundY = Math.min(height, BordeInferiorIzquierdo);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }

    private Shape createBordeInferiorDerecho() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, BordeInferiorDerecho);
        int roundY = Math.min(height, BordeInferiorDerecho);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
}
