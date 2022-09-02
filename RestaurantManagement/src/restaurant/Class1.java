
package restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Class1 {
    public double ChickenBurger=0,ComboMeal=0,CheeseBurger=0,ChickenSausage=0,FishCutlet=0,Meals,Drinks=0,TotalofMealsDrinks=0,FullCost=0;
    public double MilkShake=0,VanillaC=0,ClassicVanilla=0,VMilkShake=0,CMilkShake=0;
    
    
    public double GetAmount(){
        Meals=ChickenBurger+ComboMeal+CheeseBurger+ChickenSausage+FishCutlet;
        Drinks=MilkShake+VanillaC+ClassicVanilla+VMilkShake+CMilkShake;
        TotalofMealsDrinks=Meals+Drinks;
        FullCost=TotalofMealsDrinks;
        return FullCost;
    }
    
    private JFrame frame;
    public void iExitSystem(){
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Do you want to exit","Restaurant Management Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
            }

    
    public double pChickenBurger=200.00,pComboMeal=230.00,pCheeseBurger=210.00,pChickenSausage=150.00,pFishCutlet=130.00;
    public double pMilkShake=120.00,pVanillaC=110.00,pClassicVanilla=150.00,pVMilkShake=140.00,pCMilkShake=100.00;
    
    
    
    
    public double cTax=0.15;
    public double cFindTax(double cAmount){
        double FindTax=(cAmount*cTax);
        return FindTax;
    }
    
    
}
