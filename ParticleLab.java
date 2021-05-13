/* A. StudentName
 * David Elkins
 * 
 */
import java.awt.*;
import java.util.*;
public class ParticleLab{

    static final int DEFAULT_R = 200;//Do not change
    static final int DEFAULT_C = 180;//Do not change
    
    static final double LARGER = 1.0; //this can be changed and will tile the file if the file is not big enough.
    static final int NBR_ROWS  = (int)(DEFAULT_R*LARGER);  //200 
    static final int NBR_COLS  = (int)(DEFAULT_C*LARGER);  //180 
    static final int CELL_SIZE = 800+(int)(LARGER*800)%200;  //800
    //PerformanceTest,EMPTY
    static final String FILE_NAME     = "ForPres.txt";         //This is the name of the input file.
    static final String NEW_FILE_NAME = "ForPres.txt";  //This is the name of the file you are saving.

    //add constants for particle types here
    public static final int EMPTY = 0;
    public static final int METAL = EMPTY+1;
    public static final int WOOD = METAL+1;
    public static final int VINE = WOOD+1;
    public static final int SAND = VINE+1;
    public static final int DIRT = SAND+1;
    public static final int GRASS = DIRT+1;
    public static final int WATER = GRASS+1;
    public static final int OIL = WATER+1;
    public static final int VAPOR = OIL+1;
    public static final int NEON = VAPOR+1;
    public static final int DESTRUCTOR = NEON+1;
    public static final int GENERATOR = DESTRUCTOR+1;
    public static final int GRAVITY_UP = GENERATOR+1;
    public static final int GRAVITY_DOWN = GRAVITY_UP+1;
    public static final int WIND_ON = GRAVITY_DOWN+1;
    public static final int WIND_OFF = WIND_ON+1;
    public static final int WIND_L = WIND_OFF+1;
    public static final int WIND_R = WIND_L+1;
    public static final int BIG_BRUSH_ON = WIND_R+1;
    public static final int BIG_BRUSH_OFF = BIG_BRUSH_ON+1;
    public static final int FANCY_TEXTURES_ON = BIG_BRUSH_OFF+1;
    public static final int FANCY_TEXTURES_OFF = FANCY_TEXTURES_ON+1;
    public static final int DISPLAY_UPDATES = FANCY_TEXTURES_OFF+1;
    public static final int FANCY_BACKGROUND_1 = DISPLAY_UPDATES+1;
    public static final int FANCY_BACKGROUND_2 = FANCY_BACKGROUND_1+1;
    public static final int FANCY_BACKGROUND_OFF = FANCY_BACKGROUND_2+1;
    public static final int DISPLAY_FPS = FANCY_BACKGROUND_OFF+1;
    public static final int SAVE_FILE = DISPLAY_FPS+1;
    public static final int WALL_ON = SAVE_FILE+1;
    public static final int WALL_OFF = WALL_ON+1;
    public static final int RESET = WALL_OFF+1;


    public static final int SAND_DR      = 15;
    public static final int SAND_DL      = 15;
    public static final int SAND_DOWN    = 100-(SAND_DL+SAND_DR);
    public static final int SAND_GR      = 50;
    public static final int SAND_GL      = 50;
    public static final int SAND_G_STAY  = 100-(SAND_GL+SAND_GR);
    public static final int SAND_WIND_AFFECT = 10;

    public static final int DIRT_DR      = 15;
    public static final int DIRT_DL      = 15;
    public static final int DIRT_DOWN    = 100-(SAND_DL+SAND_DR);
    public static final int DIRT_GR      = 50;
    public static final int DIRT_GL      = 50;
    public static final int DIRT_G_STAY  = 100-(SAND_GL+SAND_GR);
    public static final int DIRT_WIND_AFFECT = 10;

    public static final int WATER_DR     = 30;
    public static final int WATER_DL     = 30;
    public static final int WATER_DOWN   = 100-(WATER_DL+WATER_DR);
    public static final int WATER_GR     = 45;
    public static final int WATER_GL     = 45;
    public static final int WATER_G_STAY = 100-(WATER_GL+WATER_GR);
    public static final int WATER_WIND_AFFECT = 20;

    public static final int OIL_DR       = 30;
    public static final int OIL_DL       = 30;
    public static final int OIL_DOWN     = 100-(OIL_DL+OIL_DR);
    public static final int OIL_GR       = 45;
    public static final int OIL_GL       = 45;
    public static final int Oil_G_STAY   = 100-(OIL_GL+OIL_GR);
    public static final int OIL_WIND_AFFECT = 17;
    
    public static final int VAPOR_DR     = 40;
    public static final int VAPOR_DL     = 40;
    public static final int VAPOR_DOWN   = 100-(VAPOR_DL+VAPOR_DR);
    public static final int VAPOR_GR     = 45;
    public static final int VAPOR_GL     = 45;
    public static final int VAPOR_G_STAY = 100-(VAPOR_GL+VAPOR_GR);
    public static final int VAPOR_WIND_AFFECT = 50;
    public static final int VAPOR_REMOVE_CHANCE = 6;
    public static final int VAPOR_REMOVE_CHANCE_AIR = 1;


    public static final int NEON_DR     = 40;
    public static final int NEON_DL     = 40;
    public static final int NEON_DOWN   = 100-(VAPOR_DL+VAPOR_DR);
    public static final int NEON_GR     = 45;
    public static final int NEON_GL     = 45;
    public static final int NEON_G_STAY = 100-(VAPOR_GL+VAPOR_GR);
    public static final int NEON_WIND_AFFECT = 50;
    public static final int NEON_REMOVE_CHANCE = 10;

    public static final int GENERATOR_CHANCE = 25;
    public static final int DESTRUCTOR_CHANCE = 25;

    public static final int GRASS_DR     = 15;
    public static final int GRASS_DL     = 15;
    public static final int GRASS_DOWN   = 100-(GRASS_DL+GRASS_DR);
    public static final int GRASS_GR     = 45;
    public static final int GRASS_GL     = 45;
    public static final int GRASS_G_STAY = 100-(GRASS_GL+GRASS_GR);
    public static final int GRASS_WIND_AFFECT = 10;
    public static final int GRASS_SPREAD_CHANCE = 5;

    public static final int WOOD_DR     = 2;
    public static final int WOOD_DL     = 2;
    public static final int WOOD_DOWN   = 100-(GRASS_DL+GRASS_DR);
    public static final int WOOD_GR     = 0;
    public static final int WOOD_GL     = 0;
    public static final int WOOD_G_STAY = 100-(GRASS_GL+GRASS_GR);
    public static final int WOOD_WIND_AFFECT = 2;

    
    //do not add any more global fields
    private int row = 0;
    private int col = 0;
    
    private int[][] particleGrid;
    private LabDisplay display;
    // New Arrays
    public static int[][] preParticleGrid; // for fast screen updates 
    public static int[][] prepreParticleGrid; // for fast screen updates 
    
    //textures
    public static boolean fancyTextures = false;
    public static boolean preFancyTextures=!fancyTextures;

    public static boolean updatesOnly = false;
    public static boolean preUpdatesOnly=updatesOnly;

    public static int fancyBackground_1=1;
    public static int fancyBackground_2=2;
    public static int fancyBackground_OFF=0;
    public static int fancyBackground=0;
    public static int preFancyBackground=0;
    

    //walls 
    public static boolean wallToggle = false;
    public static boolean preWallToggle = false;
    public static final int WALL_SIZE = 2;

    public static boolean gravityDown = true;
    public static boolean wind = false;
    public static boolean windDirectionRight = true;
    public static boolean showFPS = false; // set to true if you want to know how many frames can be rendered in a second.
    public int[] FPS_AVERAGE = new int[10]; // to average the the last 20 frames for frames per second
    public static boolean bigBrush = false;

    
    //---------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args){
        System.out.println("+------------------+\n| By: David Elkins |\n| Class: CIS131    |\n+------------------+\n");
        System.out.println("================= Starting Program =================");
        System.out.println("ROWS: " + NBR_ROWS + "\nCOLS: " + NBR_COLS + "\nCELL_SIZE: " + CELL_SIZE + "\n");
        
        ParticleLab lab = new ParticleLab(NBR_ROWS, NBR_COLS);  //creates the object
        lab.run();
    }
    

    //SandLab constructor - ran when the above lab object is created 
    public ParticleLab(int numRows, int numCols){
        String[] names = new String[RESET+1];
        names[EMPTY]                = "Empty";
        names[METAL]                = "Metal";
        names[WOOD]                 = "Wood";
        names[VINE]                 = "Vine";
        names[SAND]                 = "Sand";
        names[DIRT]                 = "Dirt";
        names[GRASS]                = "Grass";
        names[WATER]                = "Water";
        names[OIL]                  = "Oil";
        names[VAPOR]                = "Vapor";
        names[NEON]                 = "Neon";
        names[DESTRUCTOR]           = "Destructor";
        names[GENERATOR]            = "Generator";
        names[GRAVITY_UP]           = "Gravity Up";
        names[GRAVITY_DOWN]         = "Gravity Down";
        names[WIND_ON]              = "Wind On";
        names[WIND_OFF]             = "Wind OFF";
        names[WIND_L]               = "Wind Left";
        names[WIND_R]               = "Wind Right";
        names[BIG_BRUSH_ON]         = "Big Brush On";
        names[BIG_BRUSH_OFF]        = "Big Brush Off";
        names[FANCY_TEXTURES_ON]    = "Fancy Textures On";
        names[FANCY_TEXTURES_OFF]   = "Fancy Textures Off";
        names[DISPLAY_UPDATES]      = "Only Show Updates";
        names[FANCY_BACKGROUND_1]   = "Fancy Background 1";
        names[FANCY_BACKGROUND_2]   = "Fancy Background 2";
        names[FANCY_BACKGROUND_OFF] = "Fancy Background Off";
        names[DISPLAY_FPS]          = "Display FPS in Console";
        names[SAVE_FILE]            = "SaveFile";
        names[WALL_ON]              = "Walls ON";
        names[WALL_OFF]             = "Walls OFF";
        names[RESET]                = "Reset";

        display      = new LabDisplay("SandLab", numRows, numCols, names);  //uses the LabDisplay.class file 
        particleGrid = new int[numRows][numCols];
        preParticleGrid = new int[numRows][numCols];
        prepreParticleGrid = new int[numRows][numCols];
        
        
        if (FILE_NAME != "") {  
            System.out.println("Attempting to load: " + FILE_NAME);
            particleGrid = ParticleLabFiles.readFile(FILE_NAME);   
        } 
    }

    //called when the user clicks on a location using the given tool
    private void locationClicked(int row, int col, int tool){
        if(tool == SAVE_FILE) {
            ParticleLabFiles.writeFile(particleGrid, NEW_FILE_NAME);  
        }else if(tool==GRAVITY_UP){
            gravityDown=false;
        }else if(tool==GRAVITY_DOWN){
            gravityDown=true;
        }else if(tool==WIND_ON){
            wind = true;
        }else if(tool==WIND_OFF){
            wind = false;
        }else if(tool==WIND_L){
            windDirectionRight = false;
        }else if(tool==WIND_R){
            windDirectionRight = true;
        }else if(tool==DISPLAY_FPS){
            showFPS=!showFPS;
            System.out.print("                 \r");
        }else if(tool==BIG_BRUSH_ON){
            bigBrush=true;
        }else if(tool==BIG_BRUSH_OFF){
            bigBrush=false;
        }else if(tool==FANCY_TEXTURES_ON){
            fancyTextures=true;
        }else if(tool==FANCY_TEXTURES_OFF){
            fancyTextures=false;
        }else if(tool==DISPLAY_UPDATES){
            updatesOnly=!updatesOnly;
        }else if(tool==FANCY_BACKGROUND_1){
            fancyBackground=fancyBackground_1;
        }else if(tool==FANCY_BACKGROUND_2){
            fancyBackground=fancyBackground_2;
        }else if(tool==FANCY_BACKGROUND_OFF){
            fancyBackground=fancyBackground_OFF;
        }else if(tool==RESET){
            particleGrid = ParticleLabFiles.readFile(FILE_NAME);
        }else if(tool==WALL_ON){
            wallToggle=true;
        }else if(tool==WALL_OFF){
            wallToggle=false;
        }else{
            particleGrid[row][col] = tool;
            // for making a bigger paint brush
            if(bigBrush){
                int row1 = (row+1>=NBR_ROWS)?0:row+1;
                int row0 = (row-1<=0)?NBR_ROWS-1:row-1;
                int col1 = (col+1>=NBR_COLS)?0:col+1;
                int col0 = (col-1<=0)?NBR_COLS-1:col-1;
                
                particleGrid[row1][col] = tool;
                particleGrid[row0][col] = tool;
                particleGrid[row][col1] = tool;
                particleGrid[row][col0] = tool;
            }
            
        }
    }

    public Color getFancyBackground_1(int r, int c){
        Color fancyBackgroundColor = new Color (Math.abs(((NBR_COLS*4-r*4)%(c+1)))%255,Math.abs(((NBR_COLS*4-c*4)%(r+1)))%255,Math.abs((Math.abs(((NBR_COLS-r*2)%(c+1)))%255)-Math.abs(((NBR_COLS-c*2)%(r+1)))%255));
        //Color fancyBackgroundColor = new Color (Math.abs(((NBR_COLS*4-r*4)%(c+1)))%255,0,0);                                                  //red
        //Color fancyBackgroundColor = new Color (0,Math.abs(((NBR_COLS*4-c*4)%(r+1)))%255,0);                                                  //green
        //Color fancyBackgroundColor = new Color (0,0,Math.abs((Math.abs(((NBR_COLS-r*2)%(c+1)))%255)-Math.abs(((NBR_COLS-c*2)%(r+1)))%255));   //blue
        return fancyBackgroundColor;
    }
    final private double DEVIDE_BY = 22.0;
    final private double ADD_BY = 0.5;
    public Color getFancyBackground_2(int r, int c){
        
        Color fancyBackgroundColor_2 = new Color((int)Math.abs((Math.sin(c/DEVIDE_BY)+ADD_BY)*(255/6))+(int)Math.abs((Math.sin(r/DEVIDE_BY)+ADD_BY)*(255/6)),(int)Math.abs((Math.sin(c/DEVIDE_BY)+ADD_BY)*(255/6)),(int)Math.abs((Math.sin(r/DEVIDE_BY)+ADD_BY)*(255/6)));
        return fancyBackgroundColor_2;
    }
    
                                      // EMPTY        METAL                     WOOD                   VINE                  SAND                     DIRT                     Grass       WATER      OIL          Vapor       NEON      Destructor Generator
    final public static Color[] colors = {Color.black,new Color (192, 192, 192),new Color (179,116,71),new Color (0, 150, 0),new Color (194, 178, 128),new Color (155, 118, 83),Color.green,Color.BLUE,Color.ORANGE,Color.white,Color.red,Color.cyan,Color.pink};
    //Examines each element of the 2D particleGrid and paints a color onto the display
    public void updateDisplay(){
        for(int r=0;r<particleGrid.length;r++){
            for(int c=0;c<particleGrid[r].length;c++){
                if(((particleGrid[r][c]!=preParticleGrid[r][c])||(fancyBackground!=preFancyBackground||fancyTextures!=preFancyTextures||preUpdatesOnly!=updatesOnly))&&!updatesOnly){   //
                    if(fancyTextures){
                        if(particleGrid[r][c]==METAL){
                            display.setColor(r, c, Texture.METAL_TEXTURE[r%2][c%2]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==WOOD){
                            display.setColor(r, c, Texture.WOOD_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==VINE){
                            display.setColor(r, c, Texture.VINE_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==SAND){
                            display.setColor(r, c, Texture.SAND_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==DIRT){
                            display.setColor(r, c, Texture.DIRT_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==WATER){
                            display.setColor(r, c, Texture.WATER_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==OIL){
                            display.setColor(r, c, Texture.OIL_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==VAPOR){
                            display.setColor(r, c, Texture.VAPOR_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==NEON){
                            display.setColor(r, c, Texture.NEON_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==GRASS){
                            display.setColor(r, c, Texture.GRASS_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==DESTRUCTOR){
                            display.setColor(r, c, Texture.DESTRUCTOR_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==GENERATOR){
                            display.setColor(r, c, Texture.GENERATOR_TEXTURE[r%8][c%8]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else if(particleGrid[r][c]==EMPTY){
                            if(fancyBackground==fancyBackground_1){
                                display.setColor(r, c, getFancyBackground_1(c,r));
                            }else if(fancyBackground==fancyBackground_2){
                                display.setColor(r, c, getFancyBackground_2(r,c));
                            }else{
                                display.setColor(r, c, colors[particleGrid[r][c]]);
                            }
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }else{
                            display.setColor(r, c, colors[particleGrid[r][c]]);
                            preParticleGrid[r][c]=particleGrid[r][c];
                        }
                    }else{
                        if(particleGrid[r][c]!=EMPTY){
                            display.setColor(r, c, colors[particleGrid[r][c]]);
                        }else if(particleGrid[r][c]==EMPTY){
                            if(fancyBackground==fancyBackground_1){
                                display.setColor(r, c, getFancyBackground_1(c,r));
                            }else if(fancyBackground==fancyBackground_2){
                                display.setColor(r, c, getFancyBackground_2(r,c));
                            }else{
                                display.setColor(r, c, colors[particleGrid[r][c]]);
                            }
                        }
                        preParticleGrid[r][c]=particleGrid[r][c];
                    }
                }else if(((particleGrid[r][c]!=preParticleGrid[r][c]||(prepreParticleGrid[r][c]!=preParticleGrid[r][c]&&updatesOnly)||preUpdatesOnly!=updatesOnly))&&updatesOnly){
                    if(particleGrid[r][c]!=preParticleGrid[r][c]){
                        display.setColor(r,c,Color.white);
                        prepreParticleGrid[r][c]=preParticleGrid[r][c];
                        preParticleGrid[r][c]=particleGrid[r][c];
                    }else{
                        display.setColor(r,c,Color.black);
                        prepreParticleGrid[r][c]=preParticleGrid[r][c];
                        preParticleGrid[r][c]=particleGrid[r][c];
                    }
                    
                }
            }
        }
        if(preFancyTextures!=fancyTextures){
            preFancyTextures=fancyTextures;
        }
        if(preUpdatesOnly!=updatesOnly){
            preUpdatesOnly=updatesOnly;
        }
        if(fancyBackground!=preFancyBackground){
            preFancyBackground=fancyBackground;
        }
        // SAND Color: new Color (194, 178, 128)
        //remove the below code when ready   new Color (194, 178, 128)
        //Color purple = new Color (192, 0, 255);              //an example of how to create a new color
        //display.setColor(0,0,purple);                        //an example of how to display the new color
        //display.setColor(0,0,Color.red);                        //an example of how to display the new color
        //insert code here
        //insert code here
    }

    public int getSafeR(int r,int gravity){
        int newR=0;
        if((r+gravity)<0){
            newR=particleGrid.length-1;
        }else if((r+gravity)>=particleGrid.length){
            newR=0;
        }else{
            newR=r+gravity;
        }
        return newR;
    }

    public int getSafeC(int c,int dir){
        int newC=0;
        if((c+dir)<0){
            newC=particleGrid[0].length-1;
        }else if((c+dir)>=particleGrid[0].length){
            newC=0;
        }else{
            newC=c+dir;
        }
        return newC;
    }

    //called repeatedly.
    //causes one random particle to maybe do something.
    public void step(){
        int r = getRandomNumber(0, particleGrid.length-1);
        int c = getRandomNumber(0, particleGrid[r].length-1);
        processSand(r,c);
        processDirt(r,c);
        processWater(r,c);
        processOil(r,c);
        processVAPOR(r,c);
        processNEON(r,c);
        processGenerator(r,c);
        processDestructor(r,c);
        processWall();
        processGrass(r,c);
        processVine(r,c);
        //processWood(r,c);
    }

    public void processWood(int r,int c){
        if(particleGrid[r][c]==WOOD){
            int gravity = (gravityDown)?1:-1;
            int floatUp = (gravityDown)?-1:1;
            int newRG = getSafeR(r, gravity);
            int newRF = getSafeR(r, floatUp);
            int newCR = getSafeC(c, 1);
            int newCR2 = getSafeC(newCR, 1);
            int newCR3 = getSafeC(newCR2, 1);
            int newCR4 = getSafeC(newCR3, 1);
            int newCL = getSafeC(c, -1);
            int newCL2 = getSafeC(newCL, -1);
            int newCL3 = getSafeC(newCL2, -1);
            int newCL4 = getSafeC(newCL3, -1);
            int[] windArray = getWind(WOOD_DR,WOOD_DL,WOOD_GR,WOOD_GL,WOOD_WIND_AFFECT,WOOD_G_STAY);
            boolean doIFall = true;
            boolean connected = false;
            
            
            if((particleGrid[newRG][newCL2]==WOOD&&particleGrid[r][newCL]==WOOD)&&(particleGrid[newRG][newCL3]==WOOD&&particleGrid[newRG][newCL2]==WOOD&&particleGrid[newRG][newCL]==WOOD)){
                doIFall=false;
            }
            if((particleGrid[newRG][newCR2]==WOOD&&particleGrid[r][newCR]==WOOD)&&(particleGrid[newRG][newCR3]==WOOD&&particleGrid[newRG][newCR2]==WOOD&&particleGrid[newRG][newCR]==WOOD)){
                doIFall=false;
            }
            
            if(doIFall){
                if(!moveThrough(r, c, gravity, WOOD, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],WOOD_DOWN, EMPTY)){
                    if(!moveThrough(r, c, gravity, WOOD, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],WOOD_DOWN, WATER)){
                        if(!moveThrough(r, c, gravity, WOOD, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],WOOD_DOWN, OIL)){
                        }
                    }
                }
            }
            
        }
    }

    public void processVine(int r,int c){
        if(particleGrid[r][c]==VINE){
            int gravity = (gravityDown)?1:-1;
            int floatUp = (gravityDown)?-1:1;
            int newRG = getSafeR(r, gravity);
            int newRF = getSafeR(r, floatUp);
            int newCR = getSafeC(c, 1);
            int newCL = getSafeC(c, -1);
            int[] windArray = getWind(GRASS_DR,GRASS_DL,GRASS_GR,GRASS_GL,GRASS_WIND_AFFECT,GRASS_G_STAY);
            boolean didIRun = true;
            if(didIRun){
                if(particleGrid[newRF][c]==OIL){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }else if(particleGrid[r][newCR]==OIL){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }else if(particleGrid[r][newCL]==OIL){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }else if(particleGrid[newRG][c]==OIL){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }else if(particleGrid[r][newCL]==NEON){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }else if(particleGrid[r][newCR]==NEON){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }else if(particleGrid[newRF][c]==NEON){
                    particleGrid[r][c]=EMPTY;
                    didIRun=false;
                }

            }
            if(didIRun){
                //down
                if(particleGrid[newRG][c]==WOOD){
                    particleGrid[newRG][c]=VINE;
                    didIRun=false;
                }else if(particleGrid[newRG][newCR]==WOOD){
                    particleGrid[newRG][newCR]=VINE;
                    didIRun=false;
                }else if(particleGrid[newRG][newCL]==WOOD){
                    particleGrid[newRG][newCL]=VINE;
                    didIRun=false;
                }//up*/


                if(particleGrid[newRF][c]==WOOD){
                    particleGrid[newRF][c]=VINE;
                    didIRun=false;
                }else if(particleGrid[newRF][newCR]==WOOD){
                    particleGrid[newRF][newCR]=VINE;
                    didIRun=false;
                }else if(particleGrid[newRF][newCL]==WOOD){
                    particleGrid[newRF][newCL]=VINE;
                    didIRun=false;
                }
            }
            if(particleGrid[newRG][c]==VINE||particleGrid[newRG][newCR]==VINE||particleGrid[newRG][newCL]==VINE){
                didIRun=false;
            }
            if(didIRun){
                if(!moveThrough(r, c, gravity, VINE, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],GRASS_DOWN, EMPTY)){
                    if(!moveThrough(r, c, gravity, VINE, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],GRASS_DOWN, WATER)){
                
                    }
                }
            }
        }
    }

    public void processGrass(int r,int c){
        if(particleGrid[r][c]==GRASS){
            int gravity = (gravityDown)?1:-1;
            int floatUp = (gravityDown)?-1:1;
            int newRG = getSafeR(r, gravity);
            int newRF = getSafeR(r, floatUp);

            int[] windArray = getWind(GRASS_DR,GRASS_DL,GRASS_GR,GRASS_GL,GRASS_WIND_AFFECT,GRASS_G_STAY);
            if(!moveThrough(r, c, gravity, GRASS, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],GRASS_DOWN, EMPTY)){
                int random = getRandomNumber(0, 100);
                if(particleGrid[newRG][c]!=DIRT){
                    particleGrid[r][c] = EMPTY;
                }
                if(particleGrid[newRG][c]!=DIRT&&particleGrid[newRG][c]!=GRASS&&particleGrid[newRF][c]!=EMPTY){
                    particleGrid[r][c] = DIRT;
                }else if(particleGrid[newRF][c]!=EMPTY&&particleGrid[newRF][c]!=GRASS){
                    particleGrid[r][c] = EMPTY;
                }else if(GRASS_SPREAD_CHANCE>=random){
                    int RL = getRandomNumber(0, 100);
                    int dir = 0;
                    if(RL>50){
                        dir = 1;
                    }else{
                        dir = -1;
                    }
                    int newC = getSafeC(c,dir);
                    int newRG2 = getSafeR(newRG, gravity);
                    int newRF2 = getSafeR(newRF, floatUp);
                    if(particleGrid[newRG][newC]==DIRT&&particleGrid[r][newC]==EMPTY&&particleGrid[newRF][newC]==EMPTY){
                        particleGrid[r][newC]=GRASS;
                    }else if(particleGrid[r][newC]==DIRT&&particleGrid[newRF][newC]==EMPTY){
                        particleGrid[newRF][newC]=GRASS;
                    }else if(particleGrid[newRG2][newC]==DIRT&&particleGrid[newRG][newC]==EMPTY){
                        particleGrid[newRG][newC]=GRASS;
                    }else if(particleGrid[newRF][newC]==DIRT&&particleGrid[newRF2][newC]==EMPTY){
                        particleGrid[newRF2][newC]=GRASS;
                    }

                }
            }
        }
    }

    public void processDestructor(int r, int c){
        if(particleGrid[r][c]==DESTRUCTOR){
            int random = getRandomNumber(0, 100);
            if(DESTRUCTOR_CHANCE>=random){
                int top = (gravityDown)?-1:1;
                int destructorR=getSafeR(r, top);
                if(particleGrid[destructorR][c]!=EMPTY&&particleGrid[destructorR][c]!=DESTRUCTOR){
                    particleGrid[destructorR][c]=VAPOR;
                }
            }
        }
    }

    public void processWall(){
        if(wallToggle!=preWallToggle){
            if(wallToggle){
                for(int r=0;r<particleGrid.length;r++){
                    for(int c=0;c<particleGrid[r].length;c++){
                        if(r-WALL_SIZE<0||r+WALL_SIZE>particleGrid.length-1||c-WALL_SIZE<0||c+WALL_SIZE>particleGrid[r].length-1){
                            particleGrid[r][c]=METAL;
                        }
                    }
                }
            }else{
                for(int r=0;r<particleGrid.length;r++){
                    for(int c=0;c<particleGrid[r].length;c++){
                        if(r-WALL_SIZE<0||r+WALL_SIZE>particleGrid.length-1||c-WALL_SIZE<0||c+WALL_SIZE>particleGrid[r].length-1){
                            particleGrid[r][c]=EMPTY;
                        }
                    }
                }
            }
            preWallToggle=wallToggle;
        }
    }

    public void processGenerator(int r, int c){
        if(particleGrid[r][c]==GENERATOR){
            int random = getRandomNumber(0, 100);
            if(GENERATOR_CHANCE>=random){
                int fromG = (gravityDown)?-1:1;
                int toG = (gravityDown)?1:-1;
                int fromMake=getSafeR(r, fromG);
                int toMake=getSafeR(r, toG);
                if(particleGrid[fromMake][c]!=EMPTY&&particleGrid[toMake][c]==EMPTY&&particleGrid[fromMake][c]!=GENERATOR){
                    particleGrid[toMake][c]=particleGrid[fromMake][c];
                }
            }
            
        }
    }

    public void processVAPOR(int r, int c){
        if(particleGrid[r][c]==VAPOR){
            int random = getRandomNumber(0, 100);
            int floatUp = (gravityDown)?-1:1;
            if(VAPOR_REMOVE_CHANCE_AIR>=random&&particleGrid[getSafeR(r, floatUp)][c]==EMPTY){
                particleGrid[r][c]=EMPTY;
            }else{
                //int gravity = (gravityDown)?1:-1;
                
                int[] windArray = getWind(VAPOR_DL,VAPOR_DR,VAPOR_GL,VAPOR_GR,VAPOR_WIND_AFFECT,VAPOR_G_STAY);
                if(!removePartial(c, r, floatUp)){
                    if(!moveThroughFlat(r, c, floatUp, VAPOR, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],VAPOR_DOWN, NEON)){
                        if(!moveThroughFlat(r, c, floatUp, VAPOR, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],VAPOR_DOWN, EMPTY)){
                            if(!moveThroughFlat(r, c, floatUp, VAPOR, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],VAPOR_DOWN, OIL)){
                                if(!moveThroughFlat(r, c, floatUp, VAPOR, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],VAPOR_DOWN, WATER)){
                                    if(!moveThroughFlat(r, c, floatUp, VAPOR, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],VAPOR_DOWN, SAND)){
                                        moveThroughFlat(r, c, floatUp, VAPOR, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],VAPOR_DOWN, DIRT);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void processNEON(int r, int c){
        if(particleGrid[r][c]==NEON){
            int gravity = (gravityDown)?1:-1;
            int floatUp = (gravityDown)?-1:1;
            int[] windArray = getWind(NEON_DL,NEON_DR,NEON_GL,NEON_GR,NEON_WIND_AFFECT,NEON_G_STAY);
            
            if(!moveThroughFlat(r, c, floatUp, NEON, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],NEON_DOWN, EMPTY)){
                if(!moveThroughFlat(r, c, floatUp, NEON, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],NEON_DOWN, OIL)){
                    if(!moveThroughFlat(r, c, floatUp, NEON, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],NEON_DOWN, WATER)){
                        if(!moveThroughFlat(r, c, floatUp, NEON, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],NEON_DOWN, SAND)){
                            if(!moveThroughFlat(r, c, floatUp, NEON, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],NEON_DOWN, DIRT)){
                            }
                        }
                    }
                }
            }
        }
    }

    public void processOil(int r, int c){
        if(particleGrid[r][c]==OIL){
            int gravity = (gravityDown)?1:-1;
            int[] windArray = getWind(OIL_DR,OIL_DL,OIL_GR,OIL_GL,OIL_WIND_AFFECT,Oil_G_STAY);
            
            if(!moveThroughFlat(r, c, gravity, OIL, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],OIL_DOWN, EMPTY)){}
        }
    }

    public void processWater(int r, int c){
        if(particleGrid[r][c]==WATER){
            int gravity = (gravityDown)?1:-1;
            int[] windArray = getWind(WATER_DR,WATER_DL,WATER_GR,WATER_GL,WATER_WIND_AFFECT,WATER_G_STAY);

            if(!moveThroughFlat(r, c, gravity, WATER, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],WATER_DOWN, EMPTY)){
                if(!moveThroughFlat(r, c, gravity, WATER, windArray[0], windArray[1], windArray[2], windArray[3], windArray[4],WATER_DOWN, OIL)){}
            }
        }
    }

    public void processDirt(int r, int c){
        if(particleGrid[r][c]==DIRT){
            int gravity = (gravityDown)?1:-1;
            int[] windArray = getWind(DIRT_DR,DIRT_DL,DIRT_GR,DIRT_GL,DIRT_WIND_AFFECT,DIRT_G_STAY);

            if(!moveThroughPile(r, c, gravity, DIRT, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4], DIRT_DOWN, EMPTY)){
                if(!moveThroughPile(r, c, gravity, DIRT, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4],DIRT_DOWN, OIL)){
                    if(!moveThroughPile(r, c, gravity, DIRT, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4],DIRT_DOWN, WATER)){
                        if(!moveThroughPile(r, c, gravity, DIRT, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4],DIRT_DOWN, SAND)){}
                    }
                }
            }
        }
    }

    public void processSand(int r, int c){
        if(particleGrid[r][c]==SAND){
            int gravity = (gravityDown)?1:-1;
            int[] windArray = getWind(SAND_DR,SAND_DL,SAND_GR,SAND_GL,SAND_WIND_AFFECT,SAND_G_STAY);

            if(!moveThroughPile(r, c, gravity, SAND, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4], SAND_DOWN, EMPTY)){
                if(!moveThroughPile(r, c, gravity, SAND, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4],SAND_DOWN, OIL)){
                    if(!moveThroughPile(r, c, gravity, SAND, windArray[0], windArray[1], windArray[2], windArray[3],windArray[4],SAND_DOWN, WATER)){}
                }
            }
        }
    }

    public boolean removePartial(int c,int r,int gravity){
        int newR = getSafeR(r, gravity);
        int chance = getRandomNumber(0, 100);
        if(VAPOR_REMOVE_CHANCE>chance){
            if(particleGrid[newR][c]!=VAPOR&&particleGrid[newR][c]!=EMPTY){
                particleGrid[r][c]=EMPTY;
                return true;
            }
            return false;
        }
        return false;
    }

    public int[] getWind(int rWind,int lWind,int grWind,int glWind,int windAffect,int gStay){
        int[] windArray = {rWind,lWind, grWind, glWind,gStay};
        if(wind){
            if(windDirectionRight){
                windArray[0] =rWind+windAffect;
                windArray[1] =lWind-windAffect;
                windArray[2]=grWind+windAffect;
                windArray[3]=glWind-windAffect;
                windArray[4]=gStay+windAffect;
            }else{
                windArray[0]=rWind-windAffect;
                windArray[1]=lWind+windAffect;
                windArray[2]=grWind-windAffect;
                windArray[3]=glWind+windAffect;
                windArray[4]=gStay-windAffect;
            }
        }
        return windArray;
    }

    public boolean moveThrough(int r, int c, int gravity,int partial,int RWind,int LWind,int GRWind,int GLWind,int GStay,int downPercent,int throughPartial){
        //GStay = 0;
        int moveDirection = getRandomNumber(0, 100);
        int newR=getSafeR(r, gravity);
        if(particleGrid[newR][c]==throughPartial){
            if(0<=moveDirection&&downPercent>moveDirection){
                if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                    if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }else if(downPercent<=moveDirection&&LWind+downPercent>=moveDirection){
                if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                    if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }else if(LWind+downPercent<moveDirection&&LWind+RWind+downPercent>=moveDirection){
                if(!moveLorRFall(r, c, gravity, partial ,1,throughPartial)){
                    if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,-1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }
        }
        return false;
    }

    public boolean moveThroughPile(int r, int c, int gravity,int partial,int RWind,int LWind,int GRWind,int GLWind,int GStay,int downPercent,int throughPartial){
        //GStay = 0;
        int moveDirection = getRandomNumber(0, 100);
        int newR=getSafeR(r, gravity);
        if(particleGrid[newR][c]==throughPartial){
            if(0<=moveDirection&&downPercent>moveDirection){
                if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                    if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }else if(downPercent<=moveDirection&&LWind+downPercent>=moveDirection){
                if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                    if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }else if(LWind+downPercent<moveDirection&&LWind+RWind+downPercent>=moveDirection){
                if(!moveLorRFall(r, c, gravity, partial ,1,throughPartial)){
                    if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,-1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }
        }else{
            if(0<=moveDirection&&GStay>moveDirection){
                return true;
            }else if(GStay<=moveDirection&&GLWind+GStay>moveDirection){
                if(!moveLorRPile(r, c, gravity, partial ,-1,throughPartial)){
                    return moveLorRPile(r, c, gravity, partial ,1,throughPartial);
                }else{return true;}
            }else if(GLWind+GStay<=moveDirection&&GLWind+GRWind+GStay>moveDirection){
                if(!moveLorRPile(r, c, gravity, partial ,1,throughPartial)){
                    return moveLorRPile(r, c, gravity, partial ,-1,throughPartial);
                }else{return true;}
            }
        }
        return false;
    }
    
    public boolean moveThroughFlat(int r, int c, int gravity,int partial,int RWind,int LWind,int GRWind,int GLWind,int GStay,int downPercent,int throughPartial){
        int moveDirection = getRandomNumber(0, 100);
        int newR=getSafeR(r, gravity);
        if(particleGrid[newR][c]==throughPartial){
            if(0<=moveDirection&&downPercent>moveDirection){
                if(!verticalGravity(r, c, gravity,partial,throughPartial)){
                    if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                        return moveLorRFall(r, c, gravity, partial ,1,throughPartial);
                    }else{return true;}
                }else{return true;}
            }else if(downPercent<=moveDirection&&LWind+downPercent>moveDirection){
                if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                    if(!moveLorRFall(r, c, gravity, partial ,1,throughPartial)){
                        return verticalGravity(r, c, gravity,partial,throughPartial);
                    }else{return true;}
                }else{return true;}
            }else if(LWind+downPercent<=moveDirection&&LWind+RWind+downPercent>moveDirection){
                if(!moveLorRFall(r, c, gravity, partial ,1,throughPartial)){
                    if(!moveLorRFall(r, c, gravity, partial ,-1,throughPartial)){
                        return verticalGravity(r, c, gravity,partial,throughPartial);
                    }else{return true;}
                }else{return true;}
            }
        }else{
            if(0<=moveDirection&&GStay>moveDirection){
                return true;
            }else if(GStay<=moveDirection&&GLWind+GStay>moveDirection){
                if(!moveLorRPile(r, c, gravity, partial ,-1,throughPartial)){
                    if(!moveLorRFlat(r, c, gravity, partial ,-1,throughPartial)){
                        if(!moveLorRPile(r, c, gravity, partial ,1,throughPartial)){
                            return moveLorRFlat(r, c, gravity, partial ,1,throughPartial);
                        }else{return true;}
                    }else{return true;}
                }else{return true;}
            }else if(GLWind+GStay<=moveDirection&&GLWind+GRWind+GStay>moveDirection){
                if(!moveLorRPile(r, c, gravity, partial ,1,throughPartial)){
                    if(!moveLorRFlat(r, c, gravity, partial ,1,throughPartial)){
                        if(!moveLorRPile(r, c, gravity, partial ,-1,throughPartial)){
                            return moveLorRFlat(r, c, gravity, partial ,-1,throughPartial);
                        }else{return true;}
                    }else{return true;}
                }else{return true;}
            }
        }
        return false;
    }

    public boolean moveLorRFall(int r, int c, int gravity,int partial,int direction,int throughPartial){
        int newR=getSafeR(r, gravity);
        if(particleGrid[newR][c]==throughPartial){
            if((c+direction)>=particleGrid[r].length){
                if(particleGrid[newR][0]==throughPartial){
                    particleGrid[r][c]=throughPartial;
                    particleGrid[newR][0]=partial;
                    return true;
                }
            }else if((c+direction)<0){
                if(particleGrid[newR][particleGrid[r].length-1]==throughPartial){
                    particleGrid[r][c]=throughPartial;
                    particleGrid[newR][particleGrid[r].length-1]=partial;
                    return true;
                }
            }else{
                if(particleGrid[newR][c+direction]==throughPartial){
                    particleGrid[r][c]=throughPartial;
                    particleGrid[newR][c+direction]=partial;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean moveLorRPile(int r, int c, int gravity,int partial,int direction,int throughPartial){
        int newR=getSafeR(r, gravity);
        if((c+direction)>=particleGrid[r].length){
            if(particleGrid[newR][0]==throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[newR][0]=partial;
                return true;
            }
        }else if((c+direction)<0){
            if(particleGrid[newR][particleGrid[r].length-1]==throughPartial&&particleGrid[newR][c]!=throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[newR][particleGrid[r].length-1]=partial;
                return true;
            }
        }else{
            if(particleGrid[newR][c+direction]==throughPartial&&particleGrid[newR][c]!=throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[newR][c+direction]=partial;
                return true;
            }
        }
        return false;
        
    }

    public boolean moveLorRFlat(int r, int c, int gravity,int partial,int direction,int throughPartial){
        int newR=getSafeR(r, gravity);
        if((c+direction)>=particleGrid[r].length){
            if(particleGrid[r][0]==throughPartial&&particleGrid[newR][c]!=throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[r][0]=partial;
                return true;
            }
        }else if((c+direction)<0){
            if(particleGrid[r][particleGrid[r].length-1]==throughPartial&&particleGrid[newR][c]!=throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[r][particleGrid[r].length-1]=partial;
                return true;
            }
        }else{
            if(particleGrid[r][c+direction]==throughPartial&&particleGrid[newR][c]!=throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[r][c+direction]=partial;
                return true;
            }
        }
        return false;
    }

    public boolean verticalGravity(int r, int c, int gravity,int partial,int throughPartial){
        if((r+gravity)<particleGrid.length&&(r+gravity)>=0){
            if(particleGrid[r+gravity][c]==throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[r+gravity][c]=partial;
                return true;
            }
        }else if((r+gravity)<0){
            if(particleGrid[particleGrid.length-1][c]==throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[particleGrid.length-1][c]=partial;
                return true;
            }
        }else if((r+gravity)>=particleGrid.length){
            if(particleGrid[0][c]==throughPartial){
                particleGrid[r][c]=throughPartial;
                particleGrid[0][c]=partial;
                return true;
            }
        }
        return false;
    }

    public void displayFPS(long end,long start){
        int diff = (int)(end - start);
        
        for(int a=FPS_AVERAGE.length-1;a>0;a--){
            FPS_AVERAGE[a]=FPS_AVERAGE[a-1];
        }
        FPS_AVERAGE[0]=diff;
        long sum=0;
        for(long i:FPS_AVERAGE){
            sum+=i;
        }
        double average = sum/(FPS_AVERAGE.length+0.0);
        System.out.printf("FPS:%4.0f   \r",(1/(average/1000.0)));
    }


    ////////////////////////////////////////////////////
    //DO NOT modify anything below here!!! /////////////
    ////////////////////////////////////////////////////
    
    public void run(){
        long start=0;
        long end=0;
        while (true){
            if(showFPS){
                start = System.currentTimeMillis();
            }
            for (int i = 0; i < display.getSpeed(); i++){
                step();
            }
            updateDisplay();
            display.repaint();
            display.pause(1);  //wait for redrawing and for mouse   
            int[] mouseLoc = display.getMouseLocation();
            if (mouseLoc != null)  //test if mouse clicked
                locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
            if(showFPS){
                end = System.currentTimeMillis();
                displayFPS(end,start);
            }
        }
    }
    
    public int getRandomNumber (int low, int high){
        return (int)(Math.random() * ((high+1) - low)) + low;
    }
    
    public static int getNbrRows() {return NBR_ROWS;}
    public static int getNbrCols() {return NBR_COLS;}
    public static int getCellSize(){return CELL_SIZE;}

    public static int getDefaultNbrRows() {return DEFAULT_R;}
    public static int getDefaultNbrCols() {return DEFAULT_C;}
    
}