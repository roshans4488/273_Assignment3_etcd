package Wallet.Resource




import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty

class WebLogin{
  
 

@BeanProperty
  protected var login_id: Int = _



@BeanProperty
  @NotEmpty
  protected  var url: String = _


@BeanProperty
  @NotEmpty
  protected var login: String = _



@BeanProperty
  @NotEmpty
  protected var password: String = _




  
}