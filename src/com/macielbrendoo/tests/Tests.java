package com.macielbrendoo.tests;

import org.junit.Test;

import com.macielbrendoo.enums.Direction;
import com.macielbrendoo.model.Position;
import com.macielbrendoo.model.Probe;

import junit.framework.Assert;

public class Tests {
	@Test
	public void getLeftTest() {
		Direction expectedDir = Direction.W;
		Direction InicialDir = Direction.N;
		Assert.assertEquals(expectedDir, InicialDir.getLeft());
	}
	@Test
	public void getRightTest() {
		Direction expectedDir = Direction.E;
		Direction InicialDir = Direction.N;
		Assert.assertEquals(expectedDir, InicialDir.getRight());
	}
	@Test
	public void moveTest() {
		Probe probe = new Probe(new Position(0,0,Direction.N));
		Position expectedPos = new Position(0,1,Direction.N);
		probe.move();
		Assert.assertEquals(probe.getPos().getX(), expectedPos.getX());
		Assert.assertEquals(probe.getPos().getY(), expectedPos.getY());
	}
	@Test
	public void turnLeftTest(){
		Probe probe = new Probe(new Position(0,0,Direction.N));
		Direction expectedDir = Direction.W;
		probe.turnLeft();
		Assert.assertEquals(expectedDir, probe.getPos().getDir());
	}
	@Test
	public void turnRightTest() {
		Probe probe = new Probe(new Position(0,0,Direction.N));
		Direction expectedDir = Direction.E;
		probe.turnRight();
		Assert.assertEquals(expectedDir, probe.getPos().getDir());
	}
}
