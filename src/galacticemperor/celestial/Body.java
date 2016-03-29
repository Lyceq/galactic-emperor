/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package galacticemperor.celestial;

/**
 *
 * @author Andrew
 */
public class Body {
	private static int nextId = 0;
	
	// Immutable Designation given to this body when it was first discovered.
	private String designation;
	
	// Common name of this body.
	private String name;
	
	// Vector from system origin that gives the current position of the body.
	private Vector position;
	
	// Vector from body position that gives where the body will be in the next tick.
	private Vector velocity;
	
	// Mass of the body in kilograms.
	private float mass;
	
	// The system (usually a solar system) that this body belongs to.
	// It is assumed that a body cannot be influenced by anything outside of its system.
	private System system;
	
	public Body() {
		this.designation = "UNKOWN-" + Integer.toString(nextId++);
		this.initialize();
	}
	
	public Body(String designation) {
		this.designation = designation;
		this.initialize();
	}
	
	private void initialize() {
		this.name = null;
		this.position = new Vector();
		this.velocity = new Vector();
		this.mass = Units.EarthMass;
		this.system = null;
	}	
	
	public String getDesignation() { return this.designation; }
	
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	public Vector getPosition() { return this.position; }
	public Vector getVelocity() { return this.velocity; }
	
	public float getMass() { return this.mass; }
	public void setMass(float mass) { this.mass = mass; }
	
	public System getSystem() { return this.system; }
	public void setSystem(System system) { this.system = system; }
	
	@Override
	public String toString() {
		return this.designation;
	}
	
	// Applies velocity to position, then applies gravity to velocity.
	public void update() {
		// Apply velocity to position.
		this.position.add(this.velocity);
		
		// If this body is not part of a system, maintain velocity.
		if (this.system == null) return;
		
		// Apply gravitational effects to velocity.
		Vector pull = new Vector();
		for ( Body body : this.system.getBodies() ) {
			pull.set(this.position);
			pull.add(body.position);
			Vector direction = pull.getDirection();
			float distance = pull.getMagnitude();
			float force = Units.G * this.mass * body.mass / (distance * distance);
			direction.multiply(force);
			this.velocity.multiply(direction);
		}
	}
}
