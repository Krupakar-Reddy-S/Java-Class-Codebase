import java.io.File;
import java.util.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ImageEditor {

    public static BufferedImage increaseBrightness(BufferedImage input, int a) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
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
                OutputImage.setRGB(j, i, newpixel.getRGB());
            }
        }
        return OutputImage;
    }

    public static BufferedImage converttogray(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                OutputImage.setRGB(j, i, input.getRGB(j, i));
            }
        }
        return OutputImage;
    }

    public static BufferedImage rightRotate(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                OutputImage.setRGB(i, j, input.getRGB(j, i));
            }
        }
        int cols = OutputImage.getWidth() - 1;
        for (int i = 0; i < OutputImage.getHeight(); i++) {
            for (int j = 0; j < (OutputImage.getWidth() / 2); j++) {
                Color pixel = new Color(OutputImage.getRGB(j, i));
                OutputImage.setRGB(j, i, OutputImage.getRGB(cols - j, i));
                OutputImage.setRGB(cols - j, i, pixel.getRGB());
            }
        }
        return OutputImage;
    }

    public static BufferedImage leftRotate(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                OutputImage.setRGB(i, j, input.getRGB(j, i));
            }
        }
        int rows = OutputImage.getHeight() - 1;
        for (int j = 0; j < OutputImage.getWidth(); j++) {
            for (int i = 0; i < OutputImage.getHeight() / 2; i++) {
                Color pixel = new Color(OutputImage.getRGB(j, i));
                OutputImage.setRGB(j, i, OutputImage.getRGB(j, rows - i));
                OutputImage.setRGB(j, rows - i, pixel.getRGB());
            }
        }
        return OutputImage;
    }

    public static BufferedImage verticallyInvert(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(width, height,BufferedImage.TYPE_3BYTE_BGR);
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height / 2; i++) {
                Color temp = new Color(input.getRGB(j, i));
                OutputImage.setRGB(j, i, input.getRGB(j, height - 1 - i));
                OutputImage.setRGB(j, height - 1 - i, temp.getRGB());
            }
        }
        return OutputImage;
    }

    public static BufferedImage horizantallyInvert(BufferedImage input) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                OutputImage.setRGB(width - 1 - j, i, input.getRGB(j, i));
            }
        }
        return OutputImage;
    }

    public static BufferedImage blurr(BufferedImage input, int k) {
        int height = input.getHeight();
        int width = input.getWidth();
        BufferedImage OutputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

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
                        OutputImage.setRGB(j, i, newpixel.getRGB());

                    }
                }
                startcols += k;
            }
            startrow += k;
        }
        return OutputImage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the path of image file: ");

        String ImagePath = sc.next();
        String FileExtension = "" + ImagePath.charAt(ImagePath.length()-3) + ImagePath.charAt(ImagePath.length()-2) + ImagePath.charAt(ImagePath.length()-1);

        File inputFile = new File(ImagePath);
        try {
            BufferedImage inputImage = ImageIO.read(inputFile);
            File OutputImage = new File("OutputImage." + FileExtension);
            
            System.out.println("Enter the Operation to perform: ");
            System.out.println("1. Convert Image to Grayscale");
            System.out.println("2. Increase Brightness of Image");
            System.out.println("3. Rotate Image");
            System.out.println("4. Invert Image Vertically");
            System.out.println("5. Invert Image Horizontally");
            System.out.println();

            int Operation = sc.nextInt();
            switch (Operation){

                case 1:
                    BufferedImage GreyScaleImage = converttogray(inputImage);
                    ImageIO.write(GreyScaleImage, FileExtension, OutputImage);
                    break;

                case 2:
                    System.out.println("By how much percent you want to change the brightness");
                    int a = sc.nextInt();
                    BufferedImage BrighterImage = increaseBrightness(inputImage, a);
                    ImageIO.write(BrighterImage, FileExtension, OutputImage);
                    break;

                case 3:
                    System.out.println("enter 1 to rotate towards right and enter 2 to rotate towards left");
                    int x = sc.nextInt();
                    if (x == 1) {
                        BufferedImage RotatedImage = rightRotate(inputImage);
                        ImageIO.write(RotatedImage, FileExtension, OutputImage);
                    } 
                    else if (x == 2) {
                        BufferedImage RotatedImage = leftRotate(inputImage);
                        ImageIO.write(RotatedImage, FileExtension, OutputImage);
                    }
                    break;
                
                case 4:
                    BufferedImage VerticalImage = verticallyInvert(inputImage);
                    ImageIO.write(VerticalImage, FileExtension, OutputImage);
                    break;

                case 5:
                    BufferedImage HorizontalImage = horizantallyInvert(inputImage);
                    ImageIO.write(HorizontalImage, FileExtension, OutputImage);
                    break;
                
                case 6:
                    int height = inputImage.getHeight();
                    int width = inputImage.getWidth();
                    System.out.println("on the scale of 1 to " + Math.min(height, width)+ " , select the level at which you want to bluur the image");
                    int k = sc.nextInt();
                    BufferedImage BlurredImage = blurr(inputImage, k);
                    ImageIO.write(BlurredImage, FileExtension, OutputImage);
                    break;

            }
        } 

        catch (IOException e) {
            System.out.println("Please Enter Valid Image Path!");
        }

        sc.close();
    }
}
