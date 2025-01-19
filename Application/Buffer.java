/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BMW
 */
public class Buffer {

    double Pridected_PlatinumPrice;
    double Pridected_GoldPrice;
    double Pridected_SilverPrice;

    public Buffer(double P,double G,double S)
    {
        Pridected_PlatinumPrice=P;
        Pridected_GoldPrice=G;
        Pridected_SilverPrice=S;
    }
     
    public void set(double  Count,int Type)
    {
        if(Type==0)
            Pridected_PlatinumPrice*=(Count*0.1+1);
        else if(Type==1)
            Pridected_GoldPrice*=(Count*0.01+1);
        else 
            Pridected_SilverPrice*=(Count*0.001+1);
    }
    public prices  get()
    {
        prices Prices=new prices(Pridected_PlatinumPrice,Pridected_GoldPrice, Pridected_SilverPrice);
        return Prices;
    }

}
