package src.composit.bpm.view

import src.composit.bpm.controller.ControllerInterface
import src.composit.bpm.model.BeatModelInterface
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JFrame
import javax.swing.JPanel

class DJview(var controller:ControllerInterface, var model:BeatModelInterface):ActionListener, BeatObserver, BPMObserver {
    lateinit var viewFrame:JFrame
    lateinit var viewPanel:JPanel
    lateinit var beatBar:BeatBar
    init {
        model.registerObserver(this as BPMObserver)
        model.registerObserver(this as BeatObserver)
    }
    override fun updateBeat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateBPM() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun actionPerformed(e: ActionEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}