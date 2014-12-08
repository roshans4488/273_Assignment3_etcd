package Wallet.Resource



import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty
//import org.joda.time.DateTime

class User{
  
 

@BeanProperty
  protected var user_id: Int = _





@BeanProperty
  @NotEmpty
  protected var email: String = _



@BeanProperty
  @NotEmpty
 protected  var password : String = _

@BeanProperty
  //@NotEmpty
  protected var name: String = _



  @BeanProperty
  protected var created_at: String = _


  @BeanProperty
  protected var updated_at: String = _





  
}