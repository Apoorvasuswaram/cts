package com;

public class Shape {
	int ShapeId;
	String ShapeName;
	@Override
	public String toString() {
		return "Shape [ShapeId=" + ShapeId + ", ShapeName=" + ShapeName + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Shape(int shapeId, String shapeName) {
		super();
		ShapeId = shapeId;
		ShapeName = shapeName;
	}
	public int getShapeId() {
		return ShapeId;
	}

	public void setShapeId(int shapeId) {
		ShapeId = shapeId;
	}

	public String getShapeName() {
		return ShapeName;
	}

	public void setShapeName(String shapeName) {
		ShapeName = shapeName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int area()
	{
	return 3;
	}

}
