package de.cuuky.varo.entity.player.stats;

public enum KickResult {

	ALLOW(true),
	BANNED,
	DEAD,
	FINALE_JOIN(true),
	MASS_RECORDING_JOIN(true),
	NO_PREPRODUCES_LEFT,
	NO_PROJECTUSER,
	NO_SESSIONS_LEFT,
	NO_TIME,
	NOT_IN_TIME,
	SERVER_FULL,
	SERVER_NOT_PUBLISHED,
	SPECTATOR(true),
	STRIKE_BAN;

	private boolean allowsJoin;

	private KickResult() {
		this(false);
	}

	private KickResult(boolean allowsJoin) {
		this.allowsJoin = false;
	}

	public boolean allowsJoin() {
		return this.allowsJoin;
	}
}