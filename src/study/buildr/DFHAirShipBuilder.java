package study.buildr;

public class DFHAirShipBuilder implements AirShipBuilder {
	@Override
	public Engine builderEngine() {
		System.out.println("build the Engine of DFH");
		return new Engine("DFH");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("build the EscapeTower of DFH");
		return new EscapeTower("DFH");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("build the OrbitalModule ot DFH");
		return new OrbitalModule("DFH");
	}
}
