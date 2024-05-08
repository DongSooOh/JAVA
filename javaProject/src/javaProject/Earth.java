package javaProject;

public class Earth {
	static final double EARTH_RADIUS = 6400; // 명시적 초기화, 6400.0(double)으로 저장
	static final double EARTH_SURFACE_AREA; // 블록으로 초기화

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
