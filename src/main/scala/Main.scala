import com.pi4j.io.gpio._

object Main {
  val gpio = GpioFactory.getInstance

  val led1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "MyLED", PinState.HIGH);
  val led2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "MyLED2", PinState.HIGH);


  def runLighting(): Unit = {
    led1.toggle;
    led2.toggle;
  } 


  def main(args: Array[String]): Unit = {
    println("<--Pi4J--> GPIO Controller")

    led1.setShutdownOptions(true, PinState.LOW);
    led2.setShutdownOptions(true, PinState.LOW);

    Thread.sleep(5000)

    led1.low();
    led2.high();
    println("Initialized")

    Thread.sleep(5000)
   
    runLighting

    Thread.sleep(5000)

    runLighting

    Thread.sleep(5000)
 
    gpio.shutdown
  }
}
