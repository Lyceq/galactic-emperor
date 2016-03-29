/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package galacticemperor.celestial;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class System {
	private ArrayList<Body> bodies;
	
	public System() {
		this.bodies = new ArrayList();
	}
	
	public ArrayList<Body> getBodies() { return this.bodies; }
	
	public void update() {
		for (Body body : this.bodies) {
			body.update();
		}
	}
}
