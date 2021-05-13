/*********************************************************************************************************************
  * SandLabFiles.java
  *********************************************************************************************************************/
import java.io.*;
import java.util.*;

public class ParticleLabFiles {
    static FileWriter  fw;
    static PrintWriter pw;
    
    static FileReader fr;
    static BufferedReader br;
    
    static int nbrOfRows = ParticleLab.getNbrRows();  //160;
    static int nbrOfCols = ParticleLab.getNbrCols();  //180;

    static int DEFAULT_R = ParticleLab.getDefaultNbrRows();  //180;
    static int DEFAULT_C = ParticleLab.getDefaultNbrCols();  //200;
    
    
    public static void main(String[] args) throws IOException {
        System.out.println("Executing ParticleLabFiles.main directly is not recommended.");
        if (args.length > 0){
            readFile(args[0]);
        }else{
            readFile("ParticleLabFile.txt");
        }
    }
    
    public static void writeFile(int [][] sandLabArray, String fileName)  {
        System.out.println("\nStarting ParticleLabFiles.writeFile()");
        System.out.println("    Writing: " + fileName);
                                                      
        try {
            fw = new FileWriter(fileName, false);
            pw = new PrintWriter(fw);
            
            for (int r = 0; r < nbrOfRows; r++) {
                for (int c = 0; c < nbrOfCols; c++) {
                    pw.print(sandLabArray[r][c] + " ");
                }
                pw.println();
            }
            pw.flush();
            pw.close();
            System.out.println("ParticleLabFiles.writeFile() is complete");
        }
        catch (Exception e) {
            System.err.println("Error writing file. Ending program.");
            System.exit(-1);
        }  
    } 
      
    public static void setRowsAndCols(int rows, int cols){
        nbrOfRows = rows; 
        nbrOfCols = cols; 
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    
    public static int[][] readFile(String fileName) {
        System.out.println("Finding: " + fileName);
        int [][] grid = new int[nbrOfRows][nbrOfCols]; 
        int [][] gridStart = new int[DEFAULT_R][DEFAULT_C]; 
        String value = "";
        
        try { 
            
            File file = new File(fileName);
            Scanner in = new Scanner(file);

            for (int r = 0; r < DEFAULT_R; r++) {
                for (int c = 0; c < DEFAULT_C; c++) {
                    gridStart[r][c] = in.nextInt();
                }
            }
            
        }
        catch (Exception e) {
            System.err.println("Error reading file. Has the size changed? Does it exist?");
            System.err.println("Ending program.");
            System.exit(-1);
        } 
        if(DEFAULT_R!=nbrOfRows){
            System.out.println("The input file will be tiled to fill the board.");
        }
        for (int r = 0; r < nbrOfRows; r++) {
            for (int c = 0; c < nbrOfCols; c++) {
                grid[r][c] = gridStart[r%DEFAULT_R][c%DEFAULT_C];
            }
        }


        return grid;
    }
}