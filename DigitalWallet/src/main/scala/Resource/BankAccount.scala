package Wallet.Resource



import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty

class BankAccount{
  
 

@BeanProperty
 protected var ba_id: Int = _



@BeanProperty 
  protected  var account_name: String = _


@BeanProperty
  @NotEmpty
  protected  var routing_number: String = _



@BeanProperty
  @NotEmpty
  protected  var account_number: String = _




  
}