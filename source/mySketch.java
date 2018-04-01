import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class mySketch extends PApplet {

float a;
float b;
float c;
float aa;
float bb;
float aC;
float bC;
float cC;
String message = "lait";
String messagecafe = "cafe";
String messagesucre = "sucre";
float x, y; // X and Y coordinates of text
float xsucre, ysucre; // X and Y coordinates of text
float xcafe, ycafe; // X and Y coordinates of text
float hr, vr;  // horizontal and vertical radius of the text
float hrcafe, vrcafe;  // horizontal and vertical radius of the text
float hrsucre, vrsucre;  // horizontal and vertical radius of the text

public void setup() {
  
background(167,190,242);


  hr = textWidth(message) / 2;
  vr = (textAscent() + textDescent()) / 2;
  noStroke();
  x = width / 1.2f;
  y = height / 2;
  hrcafe = textWidth(messagecafe) / 2;
  vrcafe = (textAscent() + textDescent()) / 2;
  noStroke();
  xcafe = width / 1.2f;
  ycafe = height / 1.5f;
  hrsucre = textWidth(messagesucre) / 2;
  vrsucre = (textAscent() + textDescent()) / 2;
  noStroke();
  xsucre = width / 1.2f;
  ysucre = height / 1.2f;


  a = 190;
  b = 0;
  c = 18;
  aa = 200;
  bb = 0;
  aC = 59;
  bC = 25;
  cC = 19;
  
  
}
public void draw() {
  
  
  
  
  
  background(167,190,242);

  
  noStroke();
fill(255, 235, 172);
rect(20,120,50,60);
fill(255, 235, 172);
rect(60,100,80,100);
fill(167,190,242);
rect(30,130,30,40);
/*line(20, 170, 20, 120);
line(30, 160, 30, 130);
line(20, 170, 60, 170);
line(20, 120, 60, 120);
line(30, 160, 60, 160);
line(30, 130, 60, 130);*/


  
 /* IF ACTION SUCRE*/
    /* SUCRE*/
    
    // If the cursor is over the text, 
  if (abs(mouseX - xsucre) < hrsucre &&
      abs(mouseY - ysucre) < vrsucre) {

  
  
  c = c + 2;
  
  if (c > 180) { 
    c = 180; 
  }
      }
      fill(0);
   
      
  text("Sucre", xsucre, ysucre);
  fill(255, 255, 255);
  rect(97,c,7,7);  
  
    /* IF ACTION REMPLISSEMENT LAIT
    /* LAIT*/
    // If the cursor is over the text, 
  if (abs(mouseX - xcafe) < hrcafe &&
      abs(mouseY - ycafe) < vrcafe) {
        
        if ( b == 0 ) {
          aC = 255;
          bC = 108;
          cC = 82;
        } 
   
fill(255, 255, 255);
rect(97,25,5,165); 
  noStroke();
  
  aC = aC + 2;
  bC = bC + 1;
  cC = cC + 0.5f;
  
  
  a = a - 0.05f;
  if (a < 100) { 
    a = 100; 
    
    aa = aa - 0.025f;
    
  }
  b = b + 0.05f;
  if (b > 90) { 
    b = 90; 
    
    bb = bb + 0.025f;
   
  } 
  }
  fill(255, 255, 255);
  rect(70, a, 60, b);
  rect(0, aa, 200, bb);
  fill(0);
  text("Lait", xcafe, ycafe);
  
   /*IF ACTION REMPLISSEMENT CAFE*/
   /* CAFE*/
   // If the cursor is over the text, 
  if (abs(mouseX - x) < hr &&
      abs(mouseY - y) < vr) {
fill(59, 25, 19);
rect(97,25,5,165);

  aC = aC - 2;
  bC = bC - 1;
  cC = cC - 0.5f;
  
  a = a - 0.05f;
  if (a < 100) { 
    a = 100; 
    
    aa = aa - 0.025f;
    
  }
  b = b + 0.05f;
  if (b > 90) { 
    b = 90; 
    
    bb = bb + 0.025f;
   
  }  
  
  }
  
  
  if ( aC < 59 ) {
    aC = 59;
  }
  if ( bC < 25 ) {
    aC = 25;
  }
  if ( aC < 19 ) {
    aC = 19;
  }
  
  fill(aC, bC, cC);
  rect(70, a, 60, b);
  rect(0, aa, 200, bb);
  fill(0);
  text("Cafe", x, y); 
  fill(0, 0, 0);
  rect(90,-5,20,30);
  
  // Click within the image and press
// the left and right mouse buttons to 
// change the value of the rectangle

  if (mousePressed && (mouseButton == LEFT)) {
    fill(0);
    
    if (b < 10) { 
   text("Vous n'avez rien pris, \n Vous avez surement un profil \n d'EMPATHIQUE", 10, 55);
    } 
    
    if (b < 30 & b > 10 & aC < 60) { 
   text("Vous avez pris un Espresso, \n Vous avez surement un profil \n de PROMOTEUR", 10, 55);
    }
     if (b < 60 && b > 29 & aC < 60) { 
   text("Vous avez pris un Double Espresso, \n Vous avez surement un profil \n de TRAVAILLOMANE", 10, 55);
    }
     if (b < 90 && b > 59 & aC < 60) { 
   text("Vous avez pris un Triple Espresso, \n Vous avez surement un profil \n de PERSEVERANT", 10, 55);
    }
    if (bb > 0) { 
   text("Vous avez fait d\u00e9border la tasse, \n Vous avez surement un profil \n de REBELLE", 10, 55);
    }
    if (b < 30 & b > 10 & aC > 60 & aC < 200 ) { 
   text("Vous avez pris un Cappuccino, \n Vous avez surement un profil \n de REBELLE", 10, 55);
    }
    if (b < 30 & b > 10 & aC > 200 & aC < 400 ) { 
   text("Vous avez pris un Latte, \n Vous avez s\u00fbrement un profil \n d'EMPATHIQUE", 10, 55);
    }
    if (b < 60 && b > 29 & aC > 60 & aC < 200 ) { 
   text("Vous avez pris un Cafe Noisette, \n Vous avez s\u00fbrement un profil \n de REVEUR", 10, 55);
    }
    if (b < 60 && b > 29 & aC > 200 & aC < 400 ) { 
   text("Vous avez pris trop de lait, \n Vous avez surement un profil \n de REVEUR", 10, 55);
    }
   if (b < 90 && b > 59 & aC > 60 & aC < 200) { 
   text("Vous avez pris un Macchiato, \n Vous avez surement un profil \n de REVEUR", 10, 55);
    }
    
    if (aC > 400 & b < 90 & b > 10 ) { 
   text("Vous avez pris trop de lait, \n Vous avez surement un profil \n de REVEUR", 10, 55);
    }
  } else {
    fill(126);
  }
  rect(8, 31, 10, 10);
  
  text("Resultat", 20, 40);
  
}
  public void settings() { 
size(200,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "mySketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
