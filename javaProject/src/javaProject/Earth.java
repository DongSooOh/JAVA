package javaProject;

public class Earth {
	static final double EARTH_RADIUS = 6400; // ����� �ʱ�ȭ, 6400.0(double)���� ����
	static final double EARTH_SURFACE_AREA; // ������� �ʱ�ȭ

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
