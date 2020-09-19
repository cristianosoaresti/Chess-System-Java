package boardgame;

import boardgame.exception.BoardException;

public class Position {

	private int row = 0;
	private int column = 0;

	public Position(int row, int column) {
		if (row < 0 || column < 0) {
			throw new BoardException("Invalid position (it must have a row and column greater or equal zeros)");
		}
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setValue(int row, int colum) {
		if (row < 0 || column < 0) {
			throw new BoardException(
					"Invalid value of the position (It must have a row and column greater or equal zeros)");
		}
		this.row = row;
		this.column = colum;
	}

	@Override
	public String toString() {
		return "Row: " + row + " Column: " + column;
	}
}
