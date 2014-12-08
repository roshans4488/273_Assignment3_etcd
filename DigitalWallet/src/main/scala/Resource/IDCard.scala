package Wallet.Resource




import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty
//import org.joda.time.DateTime
import java.util.Date

class IDCard{
  
 

@BeanProperty
 protected var card_id: Int = _



@BeanProperty
  @NotEmpty
  protected var card_name: String = _


@BeanProperty
  @NotEmpty
  protected var card_number: String = _






  @BeanProperty
 protected var expiration_date : String = _




  
}