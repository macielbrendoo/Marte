package enums;

public enum Direction {
	N(0, 1) {
		@Override
		public Direction getLeft() {
			return Direction.W;
		}

		@Override
		public Direction getRight() {
			return Direction.E;
		}
	},
	W(-1, 0) {
		@Override
		public Direction getLeft() {
			return Direction.S;
		}

		@Override
		public Direction getRight() {
			return Direction.N;
		}
	},
	S(0, -1) {
		@Override
		public Direction getLeft() {
			return Direction.E;
		}

		@Override
		public Direction getRight() {
			return Direction.W;
		}
	},
	E(1, 0) {
		@Override
		public Direction getLeft() {
			return Direction.N;
		}

		@Override
		public Direction getRight() {
			return Direction.S;
		}
	};

	private int x;
	private int y;

	public abstract Direction getLeft();

	public abstract Direction getRight();

	Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getXDifference() {
		return this.x;
	}

	public int getYDifference() {
		return this.y;
	}
}
