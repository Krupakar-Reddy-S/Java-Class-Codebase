
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.*;

@SuppressWarnings("ALL")
public class ImageEditor {

    public static BufferedImage convertToGrayScale(BufferedImage inputImage) {

        int height = inputImage.getHeight();
        int width = inputImage.getWidth();

        BufferedImage outputImage = new BufferedImage(width, height,
                    BufferedImage. TYPE_BYTE_GRAY);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                outputImage.setRGB(j, i, inputImage.getRGB(j, i));
            }
        }

        return outputImage;

    }
    public static void printPixelValues(BufferedImage inputImage) {

        int height = inputImage.getHeight();
        int width = inputImage.getWidth();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // System.out.print(inputImage.getRGB(j, i) + " ");
                Color pixel = new Color(inputImage.getRGB(j, i));
                System.out.print("(" + pixel.getRed() + " " + pixel.getBlue() + " "
                            + pixel.getGreen() + ")");
                // pixel.getGreen());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        File inputFile = new File("image.jpg");

        try {
            BufferedImage inputImage = ImageIO.read(inputFile);
            // printPixelValues(inputImage);
            BufferedImage grayScale = convertToGrayScale(inputImage);
            File grayScaleImage = new File("grayscaleimage.jpg");
            ImageIO.write(grayScale, "jpg", grayScaleImage);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
