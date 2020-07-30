/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nEx7pt21;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Turtle2 {
    
    // create Scanner to obtain input from command window
    Scanner input = new Scanner(System.in);

    // create a Messages object
  //   Messages message = new Messages();       //******************************************************************

    // declaration of variables
    int ROW = 20;
    int COLUMN = 20;
    int x = 0, y = 0;
    int position[] = new int[2]; // Holds current turtle position.
    int sketchPad[][] = new int[ROW][COLUMN]; // set array boundaries
    String commandLine;         // input commands variable
    String commandValues[];          // array for manipulation of input
    int command, distance;
    int sentinel = 9;
    boolean pen = false; // true if pen down, false if pen up
    boolean direction; // facing left is true, facing right is false

    public Turtle2(){
    }

    public void sketch(){

        // initialise the sketch pad to all zeros
        initialiseSketchPad();

        // set the turtles initial position
        position[0] = x;
        position[1] = y;
        setPosition(position);

  //      message.introMessage();           ***************************************************************
  //      message.commandOptions();         ***************************************************************

        commandInput();

        while(getCommand() != sentinel){

            if(getCommand() == 1){
                penUp();
            }
            if(getCommand() == 2){
                penDown();
            }
            if(getCommand() == 3){
                // turn right
                // facing true (row stays the same; column changes)
                turnRight();
            }
            if(getCommand() == 4){
                // turn left
                // facing false (column stays the same; row changes)
                turnLeft();
            }
            if(getCommand() == 5){
                // move forward the given amount of spaces
                moveForward();
            }
            if(getCommand() == 6){
                // display sketch
                display();
            }
            commandInput();
        }

        if(getCommand() == sentinel){
            endOfData();
        }

    }

    // while the pen is up, the turtle moves about freely without writing anything.
    // While the pen is down, the turtle traces out shapes as it moves
    // with the pen down, set the appropriate elements of array floor to 1s.
    public void penUp(){
        System.out.println("Pen Up: moving freely");
        boolean p = false; // set pen up
        setPen(p);
    }

    public void penDown(){
        System.out.println("Pen Down: tracing shapes");
        boolean p = true; // set pen down
        setPen(p);
    }
    public void turnRight(){
        System.out.println("Turn Right one position");
        // get pen position
        boolean p = getPen();
        // facing true (row stays the same; column changes)
        setDirection(true);
        // get the turtles position
        int turtleHome[] = new int[2];
        turtleHome = getPosition();
        int x = turtleHome[0];
        int y = turtleHome[1];
        y += 1;
        // true if pen is down
        if(p == true){
            sketchPad[x][y] = 1;
        }
        else{
            sketchPad[x][y] = 0;
        }
        // return the turtles position
        turtleHome[0] = x;
        turtleHome[1] = y;
        setPosition(turtleHome);
        return;
    }

    public void turnLeft(){
        System.out.println("Turn Left one position");
        // get pen position
        boolean p = getPen();

        // facing false (column stays the same; row changes)
        setDirection(false);
        // get the turtles position
        int turtleHome[] = new int[2];
        turtleHome = getPosition();
        int x = turtleHome[0];
        int y = turtleHome[1];
        x += 1;
        // true if pen is down
        if(p == true){
            sketchPad[x][y] = 1;
        }
        else{
            sketchPad[x][y] = 0;
        }
        // return the turtles position
        turtleHome[0] = x;
        turtleHome[1] = y;
        setPosition(turtleHome);
        return;
    }

    public void setDirection(boolean d){
        // facing true (row stays the same; column changes),
        // facing false (column stays the same; row changes)
        direction = d;

    }

    public boolean getDirection(){
        // facing left is true, facing right is false
        return direction;

    }
    public void setPen(boolean d){
        // facing left is true, facing right is false
        pen = d;

    }

    public void setPosition(int position[]){
        // set position of turtle
        x = position[0];
        y = position[1];

    }

    public int[] getPosition(){
        // set position of turtle
        return position;
    }

    public boolean getPen(){
        // facing left is true, facing right is false
        return pen;

    }

    public void moveForward(){
        int d = getDistance();
        System.out.println("Moving forward " + d + " places");
        // get pen position
        boolean p = getPen();
        // facing true (row stays the same; column changes),
        // facing false (column stays the same; row changes)
        boolean theWay = getDirection();
        // get the turtles position
        int turtleHome[] = new int[2];
        turtleHome = getPosition();
        int x = turtleHome[0];
        int y = turtleHome[1];
        // true if pen is down
        if(p == true){
            if(theWay == true){
                for(int t = 0; t <= d; t++) {
                    // facing true (row stays the same; column changes),
                    sketchPad[x][y + t] = 1;
                }
                y += d;

            }
            else if(theWay == false){
                for(int t = 0; t <= d; t++) {
                    // facing false (column stays the same; row changes)
                    sketchPad[x + t][y] = 1;
                }
                x += d;
            }
        }

        // return the turtles position
        turtleHome[0] = x;
        turtleHome[1] = y;
        setPosition(turtleHome);
        return;
    }

    // When the 6 command (display the array) is given, wherever there's a 1 in the array,
    // display an asterisk or any character you choose.
    public void display(){
        System.out.println("Display Sketch");
        for(int s = 0; s < sketchPad.length; s++) {
            for(int p = 0; p < sketchPad.length; p++) {
                if(sketchPad[s][p] == 1) {
                    System.out.print("#");
                }
                else if(sketchPad[s][p] == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void endOfData(){
        input.close();
        System.out.println("You have exited the application.");
        System.exit(0);
    }

    // Initialize all the elements of the array to false for all empty seats.
    public void initialiseSketchPad() {
        for (int i = 0; i < ROW; i++) {
            for(int j = 0; j < COLUMN; j++){
                sketchPad[i][j] = 0;
            }
        }
        sketchPad[0][0] = 1;
        setDirection(true);
    }

    public void commandInput() {
        System.out.printf("Enter the command, and distance if moving forward: ");
        commandLine = input.nextLine();
        commandValues = commandLine.split(" ");
        int c = Integer.parseInt(commandValues[0]);
        setCommand(c);
        if(c == 5) {
            int d = Integer.parseInt(commandValues[1]);
            setDistance(d);
        }
        return;
    }

    public void setCommand(int c){
        command = c;
    }

    public int getCommand(){
        return command;
    }

    public void setDistance(int d){
        distance = d;
    }

    public int getDistance(){
        return distance;
    }
    
}
