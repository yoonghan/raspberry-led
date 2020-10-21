import com.pi4j.io.gpio._

object Main {
  def main(args: Array[String]): Unit = {
    println("<--Pi4J--> GPIO Controller")
    val gpio = GpioFactory.getInstance

    val pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "MyLED", PinState.HIGH);
   
    pin.setShutdownOptions(true, PinState.LOW);
    println("Should be ON")

    Thread.sleep(5000)

    pin.low();
    println("Should be OFF")

    Thread.sleep(5000)

    pin.toggle
    println("Should be ON")

    Thread.sleep(5000)

    pin.toggle
    println("Should be OFF")

//    gpio.shutdown
  }
}
