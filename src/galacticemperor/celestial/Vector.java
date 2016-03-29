/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package galacticemperor.celestial;

/**
 *
 * @author Andrew
 */
public class Vector {
	float x, y, z;
	
	public Vector() {
		this.x = this.y = this.z = 0.0f;
	}
	
	public Vector(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() { return this.x; }
	public float getY() { return this.y; }
	public float getZ() { return this.z; }
	
	public void setX(float x) { this.x = x; }
	public void setY(float y) { this.y = y; }
	public void setZ(float z) { this.z = z; }
	
	public float getMagnitude() {
		return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
	}
	
	public Vector getDirection() {
		float m = this.getMagnitude();
		return new Vector(this.x / m, this.y / m, this.z / m);
	}
	
	public void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void set(Vector b) {
		this.x = b.x;
		this.y = b.y;
		this.z = b.z;
	}
	
	public void add(float b) {
		this.x += b;
		this.y += b;
		this.z += b;
	}
	
	public void add(Vector b) {
		this.x += b.x;
		this.y += b.y;
		this.z += b.z;
	}
	
	public void subtract(float b) {
		this.x -= b;
		this.y -= b;
		this.z -= b;
	}
	
	public void subtract(Vector b) {
		this.x -= b.x;
		this.y -= b.y;
		this.z -= b.z;
	}
	
	public void multiply(float b) {
		this.x *= b;
		this.y *= b;
		this.z *= b;
	}
	
	public void multiply(Vector b) {
		this.x *= b.x;
		this.y *= b.y;
		this.z *= b.z;
	}
	
	public void divide(float b) {
		this.x /= b;
		this.y /= b;
		this.z /= b;
	}
	
	public void divide(Vector b) {
		this.x /= b.x;
		this.y /= b.y;
		this.z /= b.z;
	}
	
	public void zero() {
		this.x = this.y = this.z = 0.0f;
	}
	
	@Override
	public String toString() {
		return String.format("{ x=%.5f, y=%.5f, z=%.5f }", this.x, this.y, this.z);
	}
}
