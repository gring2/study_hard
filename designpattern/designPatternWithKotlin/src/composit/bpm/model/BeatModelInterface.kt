package src.composit.bpm.model

import src.composit.bpm.view.BPMObserver
import src.composit.bpm.view.BeatObserver

interface BeatModelInterface {

    fun initialize()
    fun on()
    fun off()
    fun setBPM(bpm:Int)
    fun getBPM():Int
    fun registerObserver(o: BeatObserver)
    fun regmoveObserver(o: BeatObserver)
    fun registerObserver(o: BPMObserver)
    fun regmoveObserver(o: BPMObserver)

}

