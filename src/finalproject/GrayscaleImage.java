package finalproject;
import java.awt.Color;
import java.awt.image.BufferedImage;  //This will be used to create image object that will hold the image info
import java.io.File;  //this will be used to create file object
import java.io.IOException; //this will be used to catch IO Exception that may occure while reading/writing an image file 
import javax.imageio.ImageIO;  //this will be used to perform read and write operation


public class GrayscaleImage {
    
//grayscaling of the image 
public void grayScale_image(File f){     
    try{
  BufferedImage img=ImageIO.read(f);
  BufferedImage otherImage = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);
  
 for(int i=0 ;i<img.getHeight();i++){
       for(int j=0;j<img.getWidth();j++){
             //taking rgb color of of each pixel;
             Color c = new Color(img.getRGB(j,i)); //The color object c hold the information of rgb component of single pixel
             int r=c.getRed(); //extracting each component
             int g=c.getGreen();
             int b=c.getBlue();
          
         int gr=(r+g+b)/3; //peforming grayscale by adding all and than dividing by 3
         Color gColor=new Color(gr,gr,gr);//storing the information in another color object
         otherImage.setRGB(j,i,gColor.getRGB());//setRGB takes (position and the rgb value as parameter)
          }
      }
  ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\GrayScale.png"));
  System.out.println("Grayscale done Succesfully");
    }
  catch(IOException e){ System.out.println("Error while reading-GrayScale part....");}
   } 
}