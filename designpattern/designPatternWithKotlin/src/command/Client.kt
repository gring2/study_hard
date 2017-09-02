package src.command

fun main(args: Array<String>) {
    val remoteControl:RemoteControl = RemoteControl()

    val ceilingFan:CeilingFan = CeilingFan("LivingRoom")

    val ceilCom:FanCommand = FanCommand(ceilingFan)
    val ceilComoff:FanOffCommand = FanOffCommand(ceilingFan)
    val livingLight:Light = Light("LivingRoom")

    val lightOnCom:LightOnCommand = LightOnCommand(livingLight)
    val lightOffCom:LightOffCommand = LightOffCommand(livingLight)

    val stereo:Stereo = Stereo()
    val stereoOn:StereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
    val stereoOff:StereoOffCommand = StereoOffCommand(stereo)

    val commandOns:Array<Command> = arrayOf(ceilCom, lightOnCom, stereoOn)
    val commandOffs:Array<Command> = arrayOf(ceilComoff, lightOffCom, stereoOff)

    val macroOn:MacroCommand = MacroCommand(commandOns)
    val macroOff:MacroCommand = MacroCommand(commandOffs)
    remoteControl.setCommand(0,macroOn,macroOff)
    remoteControl.onButtonWasPressed(0)
    remoteControl.offButtonWasPressed(0)

}