package com.simplon.mower;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static com.simplon.mower.Orientation.N;
import static com.simplon.mower.Orientation.findOrientation;

public class Reader {
    public static void main(String[] args) throws IOException {

         //String lawnDimension;
         //String mowerPosition;
         //String mowerMovement;
        int x = 0;
        int y = 0;
        Orientation o = N;
        //Position p = new Position();
        Mower mower = new Mower(x,y,o);

        try {
            String file = "/home/jerome/IdeaProjects/mower/src/main/java/com/simplon/mower/input.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            /*
            int oneMower = 0;
            while ((block = br.readLine()) != null) {
                String[] line = block.split("\n");
                lawnDimension  = line[0];
                mowerPosition = field[1];
                mowerMovement = field[2];
                Lawn lawn = new Lawn(Character.getNumericValue(lawnDimension.charAt(0)),Character.getNumericValue(lawnDimension.charAt(1)));
                System.out.println(lawn);
            */


            if ((line = br.readLine()) != null) {
                mower.setLawnX(Character.getNumericValue(line.charAt(0)));
                mower.setLawnY(Character.getNumericValue(line.charAt(1)));
                //Lawn lawn = new Lawn(Character.getNumericValue(line.charAt(0)),Character.getNumericValue(line.charAt(1)));
                //System.out.println(lawn);
            }
            int i = 0;
     //     for(i=0;i<br.length()){}
            if ((line = br.readLine()) != null) {
                x = Character.getNumericValue(line.charAt(0));
                y = Character.getNumericValue(line.charAt(1));
                o = findOrientation(line.charAt(2));
                //Position p = new Position(x,y,o);
                //p.setPosition();
                mower.setPosition(x,y,o);
                //System.out.println(mower);
            }
            if ((line = br.readLine()) != null) {
                int j =0;
                for (j=0;j<line.length();j++){
                    mower.move(line.charAt(j));
                    j++;
                }

            }


        } catch (IOException io) {
            io.printStackTrace();
        }
        System.out.println(mower);


/*File file = new File("test.txt");
     FileReader in;
       try{

                  in = new FileReader(file);


                  char[] line = new char[5];
                  String Result ="";

                   int toto =0;
                    while(toto<4){

                        for(int i =0; i<line.length ;i++){
                            line[i] = (char)in.read();
                            }
                       Result = new String(line);
                       System.out.println(Result);
                       toto++;

                        }
      }catch(FileNotFoundException e){}catch(IOException e){}

                   }*/


    }
}

