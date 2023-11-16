package Week07;/*
 * Exercise Week #7
 */

public class ColorHSB {
    
    private int hue;
    private int saturation;
    private int brightness;

    // Exercise #7.1
    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
		hue = h;
        saturation = s;
        brightness = b;
		
    }

    // Exercise #7.2
    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
		return "(" + hue + ", " + saturation + ", " + brightness + ")";
		
		
    }

    // Exercise #7.3
    // Is this color in grayscale?
    public boolean isGrayscale() {
		if (saturation == 0 || brightness == 0) {
            return true;
        }else return false;
		
		
    }

    // Exercise #7.4
    // Returns the squared distance between two colors.
    //     min{ (h1−h2)^2, (360−|h1−h2|)^2 } + (s1−s2)^2 + (b1−b2)^2
    public int squareDist(ColorHSB that) {
		int rs = 0;
		int h1 = this.hue;
        int h2 = that.hue;
        int s1 = this.saturation;
        int s2 = that.saturation;
        int b1 = this.brightness;
        int b2 = that.brightness;
        int subH = h1 - h2;
        int subS = s1 - s2;
        int subB = b1 - b2;
        rs = Math.min(subH*subH, (360-Math.abs(subH))*(360-Math.abs(subH)) )+ subS*subS + subB*subB;
		return rs;
    }
    
    public static void main(String[] args) {
        ColorHSB green = new ColorHSB(100, 100, 50);
        ColorHSB orange = new ColorHSB(25, 100, 100);
        ColorHSB gray = new ColorHSB(0, 0, 50);
        ColorHSB black = new ColorHSB(0,0,0);
        
        System.out.println(green.toString());
        System.out.println(orange);
        System.out.println(gray);

        System.out.println(orange.isGrayscale());
        System.out.println(gray.isGrayscale());
        System.out.println(black.isGrayscale());

        int distGreenOrange = green.squareDist(orange);
        System.out.println(distGreenOrange);
        System.out.println(gray.squareDist(orange));
    }
    
}
