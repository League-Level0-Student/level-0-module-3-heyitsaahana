
void setup() {
 
  // set the size of your sketch
  size(900,900);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  for(int x=0;x<10;x++){
    if(x % 2==0){
      fill(#D82A2C);
    }else{
      fill(#000000);
      
    }
      
    ellipse(width/2,height/2,700-(x*60),700-(x*60));
    
      
    }
    
    
    
    
    
    
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
