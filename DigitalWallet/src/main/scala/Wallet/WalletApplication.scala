package Wallet

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun

 */
 @ComponentScan
@EnableAutoConfiguration
object WalletApplication{

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[WalletConfig]);
	}
}