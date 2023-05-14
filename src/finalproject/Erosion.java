package finalproject;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author shekhar
 */
public class Erosion { 

            //morphological operation-erosion
  public void erosion_image(){
        try{
         File originalImage = new File("C:\\FinalProject\\src\\Images\\Dilation.png");
         BufferedImage img=ImageIO.read(originalImage);
         BufferedImage otherImage = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);

         for(int i=1;i<img.getHeight()-1;i++){
             for(int j=1;j<img.getWidth()-1;j++){
         
         //using diamond as the structuring element
         //        i
          //     i A i
           //      i                       
        Color O = new Color(img.getRGB(j,i)); //original pixel - on which we need to take decision
        Color T = new Color(img.getRGB(j,i-1));  //top pixel
        Color R = new Color(img.getRGB(j+1,i));  //right pixel
        Color B = new Color(img.getRGB(j,i+1));  //Below pixel
        Color L = new Color(img.getRGB(j-1,i));  //left pixe        
        int oriP=O.getRed();
 
        //its an binary image so rgb value will have the same value 
        int topP=T.getRed();
        int rightP=R.getRed();
        int bottomP=B.getRed();
        int leftP=L.getRed();
        int Ans=0;
        if(oriP==255)
          {Ans=255;} //dont do any thing to white pixel
        else if(topP==0 && rightP==0 && bottomP==0 && leftP==0)     //its check if its neighbour has the black pixel value
          {Ans=0;}    //mean make that pixel as black
        else{Ans=255;}       
     Color gColor=new Color(Ans,Ans,Ans);
     otherImage.setRGB(j,i,gColor.getRGB());
     }
  }
  ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\Erosion.png"));
}
catch(IOException e){System.out.println("Error while reading - Erosion part");}
 System.out.println("Erosion done Successfully");
  }
}