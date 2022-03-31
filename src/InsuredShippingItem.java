public class InsuredShippingItem extends ShippingItem
{
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt)
  {
    super(w);
    insAmt = insuredAmount;

    /* TO BE IMPLEMENTED IN PART B */
  }
  
  public double getCost()
  {
    return super.getCost() + insuredAmount;
    /* TO BE IMPLEMENTED IN PART C */
  }
  
  public void addMoreInsurance(double amt)
  {
    insuredAmount += amt;
  }
}