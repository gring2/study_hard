package src.composit.bpm.model

import src.composit.bpm.view.BPMObserver
import src.composit.bpm.view.BeatObserver
import javax.sound.midi.*

class BeatModel:BeatModelInterface, MetaEventListener {
    lateinit var sequencer:Sequencer
    val beatObservers:MutableList<BeatObserver> = ArrayList()
    val bpmObservers:MutableList<BPMObserver> = ArrayList()
    var bpm:Int = 90
    lateinit var sequence:Sequence
    lateinit var track:Track
    override fun initialize() {
        setUpMidi()
        buildTrackAndStart()
    }
    fun setUpMidi(){
        try{
            sequencer = MidiSystem.getSequencer()
            sequencer.open()
            sequencer.addMetaEventListener(this)
            sequence = Sequence(Sequence.PPQ,4)
            track = sequence.createTrack()
            sequencer.tempoInBPM = (getBPM() as Float)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    fun buildTrackAndStart(){
        val trackList = arrayOf(35, 0, 46, 0)
        sequence.deleteTrack(null)
        track = sequence.createTrack()

        makeTracks(trackList)
        track.add(makeEvent(192, 9, 1, 0, 4))
        try{
            sequencer.setSequence(sequence)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    fun makeTracks(list:Array<Int>){
        for (i in list){
            if(i != 0){
                track.add(makeEvent(144, 9, i, 100, list.indexOf(i)))
                track.add(makeEvent(128, 9, i, 100, list.indexOf(i)+1))

            }
        }
    }
    fun makeEvent(cmd:Int, chan:Int, one:Int, two:Int, tick:Int):MidiEvent?{
        var event:MidiEvent? = null
        try{
            val m:ShortMessage = ShortMessage()
            m.setMessage(cmd, chan, one, two)
            event = MidiEvent(m, tick as Long)
        }catch (e:Exception){
            e.printStackTrace()
        }
        return event
    }
    override fun meta(meta: MetaMessage?) {
        if(meta!!.type == 47){
            beatEvent()
            sequencer.start()
            setBPM(getBPM())
        }
    }
    fun beatEvent(){
        notifyBeatObservers()
    }
    override fun on() {
        sequencer.start()
        setBPM(90)
    }

    override fun off() {
        setBPM(0)
        sequencer.stop()
    }

    override fun setBPM(bpm: Int) {
        this.bpm = bpm
        sequencer.tempoInBPM = (getBPM() as Float)
        notifyBPMObservers()
    }

    override fun getBPM():Int {
        return this.bpm
    }

    override fun registerObserver(o: BeatObserver) {
        beatObservers.add(o)
    }

    override fun regmoveObserver(o: BeatObserver) {
        beatObservers.remove(o)
    }

    override fun registerObserver(o: BPMObserver) {
        bpmObservers.add(o)
    }

    override fun regmoveObserver(o: BPMObserver) {

        bpmObservers.remove(o)
    }
    fun notifyBPMObservers(){
        for (b: BPMObserver in bpmObservers){
            b.updateBPM()
        }
    }

    fun notifyBeatObservers(){
        for (b: BeatObserver in beatObservers){
            b.updateBeat()
        }

    }
}