/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog24178;

import JudgementDay.SkyNet;
import becker.robots.City;
import becker.robots.Direction;

/**
 *
 * @author phil
 */
public class Terminator extends SkyNet {
    
    public Terminator(){   
    }

    
public boolean goToStreet(int street){
        boolean isClear = true;

        if (super.getDirection() == Direction.NORTH && super.getStreet() < street){
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
            int movesToMake = Math.abs(street - super.getStreet());
            for (int i = 0; i < movesToMake; i++){
                if (!super.frontIsClear()){
                    isClear = false;
                    break;
            }
                super.move();
            }
            
        } else if (super.getDirection() == Direction.NORTH && super.getStreet() > street){
            this.turnLeft();
            int movesToMake = Math.abs(street - this.getStreet());
            
        } else if (super.getDirection() == Direction.SOUTH && super.getStreet() < street){
            super.turnLeft();
            int movesToMake = Math.abs(street - super.getStreet());
            for (int i = 0; i < movesToMake; i++){
                if (!super.frontIsClear()){
                    isClear = false;
                    break;
            }
                super.move();
            }
        }else if (super.getDirection() == Direction.NORTH && super.getStreet() > street){
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
            int movesToMake = Math.abs(street - this.getStreet());
            for (int i = 0; i < movesToMake; i++){
                if (!super.frontIsClear()){
                    isClear = false;                    
                    break;
            }
                super.move();
            }
        }
        
        return isClear;
    }
    public boolean goToAvenue(int avenue){
        boolean isClear = true;
        if (super.getDirection() == Direction.NORTH && super.getAvenue() < avenue){
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
            int movesToMake = Math.abs(avenue - super.getAvenue());
            for (int i = 0; i < movesToMake; i++){
                if (!super.frontIsClear()){
                    isClear = false;                    
                    break;
            }
                super.move();
            }
            
        } else if (super.getDirection() == Direction.NORTH && super.getAvenue() > avenue){
            this.turnLeft();
            int movesToMake = Math.abs(avenue - this.getAvenue());
            
        } else if (super.getDirection() == Direction.SOUTH && super.getAvenue() < avenue){
            super.turnLeft();
            int movesToMake = Math.abs(avenue - super.getAvenue());
            for (int i = 0; i < movesToMake; i++){
                if (!super.frontIsClear()){
                    isClear = false;                                        
                    break;
            }
                super.move();
            }
        }else if (super.getDirection() == Direction.NORTH && super.getAvenue() > avenue){
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
            int movesToMake = Math.abs(avenue - this.getStreet());
            for (int i = 0; i < movesToMake; i++){
                if (!super.frontIsClear()){
                    isClear = false;
                    break;
            }
                super.move();
            }
        }
        
        return isClear;
    }

    public void move(){
        this.move();

    }
    
}
   
