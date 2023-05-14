package finalproject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;  
import java.io.IOException; 
import javax.imageio.ImageIO;

public class Separating {
    
//Dividing into 3 equal part
public void separate_image(){     
       try{
          File originalImage=new File("C:\\FinalProject\\src\\Images\\Erosion.png");
          BufferedImage img=ImageIO.read(originalImage);
          BufferedImage otherImage = new BufferedImage((img.getWidth()/3),img.getHeight(),BufferedImage.TYPE_INT_ARGB);

         for(int i=0;i<img.getHeight();i++){
           for(int j=0;j<(img.getWidth()/3);j++){
            Color c = new Color(img.getRGB(j, i));
                int value = c.getGreen();

                 Color gColor=new Color(value,value,value);
             otherImage.setRGB(j,i,gColor.getRGB());
             }
           }
         ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\Part1.png"));
         System.out.println("first separation done");
      }
catch(IOException e){System.out.println("Error while reading");}

    try{
          File originalImage=new File("C:\\FinalProject\\src\\Images\\Erosion.png");
          BufferedImage img=ImageIO.read(originalImage);
          BufferedImage otherImage = new BufferedImage((img.getWidth()/3),img.getHeight(),BufferedImage.TYPE_INT_ARGB);

          //second part
          for(int i=0;i<img.getHeight();i++){
            for(int j=((img.getWidth()/3)+1);j<=((img.getWidth()/3)*2);j++){
            Color c = new Color(img.getRGB(j, i));
                int value = c.getGreen();


                 Color gColor=new Color(value,value,value);
             otherImage.setRGB(j-((img.getWidth()/3)+1),i,gColor.getRGB());
             }
           }
         ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\Part2.png"));
         System.out.println("second separation done");
    }
   
catch(IOException e){ System.out.println("Error while reading");}
    
    try{
          File originalImage=new File("C:\\FinalProject\\src\\Images\\Erosion.png");
          BufferedImage img=ImageIO.read(originalImage);
          BufferedImage otherImage = new BufferedImage((img.getWidth()/3),img.getHeight(),BufferedImage.TYPE_INT_ARGB);
            
           //third  part
            for(int i=0;i<img.getHeight();i++){
             for(int j=(((img.getWidth()/3)*2)+1);j<img.getWidth()-1;j++){
                Color c = new Color(img.getRGB(j,i));
                int value = c.getGreen();

                 Color gColor=new Color(value,value,value);
             otherImage.setRGB(j-(((img.getWidth()/3)*2)+1),i,gColor.getRGB());
             }
           }
            ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\Part3.png"));
            System.out.println("third separation done"); 
        }
        catch(IOException e){ System.out.println("Error while reading"); }
    }   
}