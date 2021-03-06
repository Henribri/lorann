package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import contract.model.IElement;
import contract.model.Permeability;

public class VBone extends Background {

	private int x;
	private int y;
	
	Permeability perm = Permeability.BLOCKING;
	/**
	 * set position of bone wall
	 * @param x
	 * 	postion on x axe
	 * @param y
	 *  postion on y axe
	 */

	public VBone(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public BufferedImage Image() throws IOException {
		BufferedImage vertical_bone = ImageIO.read(new File(path +"vertical_bone.png"));
		return vertical_bone;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return this.perm;
	}

	public void move(char c) throws IOException {
		// TODO Auto-generated method stub

	}

	public List<IElement> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
}
}
