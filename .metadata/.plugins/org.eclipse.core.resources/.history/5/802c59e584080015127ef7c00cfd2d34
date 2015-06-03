package main;

import java.awt.event.KeyEvent;

import net.tpdl.lib.content.Content;
import net.tpdl.lib.frame.Window;

public class Contenido extends Content {

	public Contenido(Window w) {
		super(w);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Main.respirar();
		}
		if(e.getKeyCode() == KeyEvent.VK_P){

			Main.parar();
		}
		if(e.getKeyCode() == KeyEvent.VK_S){

			Main.emepezar();

		}
		if(e.getKeyCode() == KeyEvent.VK_T){

			Main.terminado();

		}
		super.keyPressed(e);
	}


}
