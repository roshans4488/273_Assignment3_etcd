package Wallet.Exception


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such record")
class ResourceNotFoundException(errorMsg:String) extends RuntimeException(errorMsg){
  

  
}