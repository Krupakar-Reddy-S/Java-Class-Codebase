import java.io.File;
import java.lang.*;
import java.util.*;
import java.awt.*;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ImageEditor {

    // FUNCTION TO INCREASE BRIGHTNESS OF IMAGE

    public static BufferedImage increaseBrightness(BufferedImage input, int a) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color pixel = new Color(input.getRGB(j, i));
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                red += (a * red) / 100;
                green += (a * green) / 100;
                blue += (a * blue) / 100;
                if (red > 255)
                    red = 255;
                if (green > 255)
                    green = 255;
                if (blue > 255)
                    blue = 255;
                if (red < 0)
                    red = 0;
                if (green < 0)
                    green = 0;
                if (blue < 0)
                    blue = 0;
                Color newpixel = new Color(red, green, blue);
                output.setRGB(j, i, newpixel.getRGB());
            }
        }
        return output;
    }

    public static BufferedImage converttogray(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                output.setRGB(j, i, input.getRGB(j, i));
            }
        }
        return output;
    }

    public static BufferedImage rightRotate(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                output.setRGB(i, j, input.getRGB(j, i));
            }
        }
        int cols = output.getWidth() - 1;
        for (int i = 0; i < output.getHeight(); i++) {
            for (int j = 0; j < (output.getWidth() / 2); j++) {
                Color pixel = new Color(output.getRGB(j, i));
                output.setRGB(j, i, output.getRGB(cols - j, i));
                output.setRGB(cols - j, i, pixel.getRGB());
            }
        }
        return output;
    }

    public static BufferedImage leftRotate(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                output.setRGB(i, j, input.getRGB(j, i));
            }
        }
        int rows = output.getHeight() - 1;
        for (int j = 0; j < output.getWidth(); j++) {
            for (int i = 0; i < output.getHeight() / 2; i++) {
                Color pixel = new Color(output.getRGB(j, i));
                output.setRGB(j, i, output.getRGB(j, rows - i));
                output.setRGB(j, rows - i, pixel.getRGB());
            }
        }
        return output;
    }

    public static BufferedImage verticallyInvert(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(width, height,BufferedImage.TYPE_3BYTE_BGR);
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height / 2; i++) {
                Color temp = new Color(input.getRGB(j, i));
                input.setRGB(j, i, input.getRGB(j, height - 1 - i));
                input.setRGB(j, height - 1 - i, temp.getRGB());
            }
        }
        return input;
    }

    public static BufferedImage horizantallyInvert(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                output.setRGB(width - 1 - j, i, input.getRGB(j, i));
            }
        }
        return output;
    }

    public static BufferedImage blurr(BufferedImage input, int k) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

        int startrow = 0;
        while (startrow < height) {
            int startcols = 0;
            while (startcols < width) {
                int red = 0;
                int blue = 0;
                int green = 0;
                for (int i = startrow; i < startrow + k; i++) {
                    for (int j = startcols; j < startcols + k; j++) {
                        Color pixel = new Color(input.getRGB(j, i));
                        red += pixel.getRed();
                        blue += pixel.getBlue();
                        green += pixel.getGreen();
                    }
                }
                int finalred = red / (k * k);
                int finalblue = blue / (k * k);
                int finalgreen = green / (k * k);
                
                for (int i = startrow; i < startrow + k; i++) {
                    for (int j = startcols; j < startcols + k; j++) {
                        Color newpixel = new Color(finalred, finalgreen, finalblue);
                        output.setRGB(j, i, newpixel.getRGB());

                    }
                }
                startcols += k;
            }
            startrow += k;
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path of image file");
        String s = sc.next();

        File inputFile = new File(s);
        try {
            BufferedImage inputImage = ImageIO.read(inputFile);
            System.out.println(
                    "enter 1 to print pixels \nenter 2 to get grayimage \nenter 3 to increase brightness \nenter 4 to rotate the image\n enter 5 to vertically invert the Image \n enter 6 to horizantally invert the image ");
            int todo = sc.nextInt();
            if (todo == 1){
                // printpixels(inputImage);
            }
            else if (todo == 2) {
                BufferedImage outputImage = converttogray(inputImage);
                File output = new File("output.jpg");
                ImageIO.write(outputImage, "jpg", output);
            } else if (todo == 3) {
                System.out.println("By how much percent you want to change the brightness");
                int a = sc.nextInt();
                BufferedImage brighterimage = increaseBrightness(inputImage, a);
                File output = new File("output.jpg");
                ImageIO.write(brighterimage, "jpg", output);
            }

            else if (todo == 4) {
                System.out.println("enter 1 to rotate towards right and enter 2 to rotate towards left");
                int x = sc.nextInt();
                if (x == 1) {
                    BufferedImage outputImage = rightRotate(inputImage);
                    File output = new File("output.jpg");
                    ImageIO.write(outputImage, "jpg", output);

                } else if (x == 2) {
                    BufferedImage outputImage = leftRotate(inputImage);
                    File output = new File("output.jpg");
                    ImageIO.write(outputImage, "jpg", output);
                }
            } else if (todo == 5) {
                BufferedImage outputImage = verticallyInvert(inputImage);
                File output = new File("output.jpg");
                ImageIO.write(outputImage, "jpg", output);
            } else if (todo == 6) {
                BufferedImage outputImage = horizantallyInvert(inputImage);
                File output = new File("output.jpg");
                ImageIO.write(outputImage, "jpg", output);
            } else if (todo == 7) {
                int height = inputImage.getHeight();
                int width = inputImage.getWidth();
                System.out.println("on the scale of 1 to" + Math.min(height, width)
                        + " , select the level at which you want to bluur the image");
                int k = sc.nextInt();
                BufferedImage outputImage = blurr(inputImage, k);
                File output = new File("output.jpg");
                ImageIO.write(outputImage, "jpg", output);
            }
        } catch (Exception e) {
            System.out.println("Error!");
            // TODO: handle exception
        }

    }
}
