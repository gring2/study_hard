package src.command

class FanCommand(val ceilingFan: CeilingFan):Command {
     var prevSpeed:Int = 0

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.high()
        println(ceilingFan.speed)
    }

    override fun undo() {
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high()
        } else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium()
        } else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low()
        } else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off()
        }
    }
}