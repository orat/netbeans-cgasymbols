package de.orat.math.cga.cgasymbols;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
public class GenerateCGASymboImages {
    
    public GenerateCGASymboImages() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createImages() {
        // https://unicode-table.com/de/html-entities/
        createImage(Character.toString('\u222A'), "meet", 20);
        createImage(Character.toString('\u2229'), "join", 20);
        createImage(Character.toString('\u230B'), "right-contraction", 20);
        createImage(Character.toString('\u230A'), "left-contraction", 20);
        createImage(Character.toString('\u2228'), "vee", 20);
        createImage(Character.toString('\u2227'), "wedge", 20);
        createImage(Character.toString('\u22C5'), "dot", 20);
        createImage(Character.toString('\u007C'), "vert", 20);
        // symbols
        createImage(Character.toString('o'), "origin", 20);
        createImage(Character.toString('\u221E'), "infinity", 20);
        createImage(Character.toString('\u03B5')+Character.toString('\u2081'), "epsilon-1", 20);
        createImage(Character.toString('\u03B5')+Character.toString('\u2082'), "epsilon-2", 20);
        createImage(Character.toString('\u03B5')+Character.toString('\u2083'), "epsilon-3", 20);
        // right-side operators 
        createImage(Character.toString('\u207b')+Character.toString('\u00B9'), "inverse", 20);
        createImage(Character.toString('\u02DC'), "reverse", 20);
        createImage(Character.toString('\u002A'), "dual", 20);
        createImage(Character.toString('\u207b')+Character.toString('\u002A'), "undual", 20);
        createImage(Character.toString('\u2020'), "conjugate", 20); // dagger
    }
    
    private boolean createImage(String c, String name, int size){
        boolean result = true;
        /*
           Because font metrics is based on a graphics context, we need to create
           a small, temporary image so we can ascertain the width and height
           of the final image
         */
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        Font font = new Font("Arial", Font.PLAIN, size); // 48 führt zu Images der Höhe 67
        g2d.setFont(font);
        FontMetrics fm = g2d.getFontMetrics();
        int width = fm.stringWidth(c);
        int height = fm.getHeight();
        g2d.dispose();

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g2d = img.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g2d.setFont(font);
        fm = g2d.getFontMetrics();
        g2d.setColor(Color.BLACK);
        g2d.drawString(c, 0, fm.getAscent());
        g2d.dispose();
        try {
            // "src/main/resources/de/orat/math/cga/cgasymbols/"
            ImageIO.write(img, "png", new File(name+".png"));
            System.out.println("Image \""+name+".png"+"\" written!");
        } catch (IOException ex) {
            result = false;
            ex.printStackTrace();
        }
        return result;
    }
}