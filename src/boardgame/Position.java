package boardgame;

public class Position {
	
	private int row = 0;
	private int column = 0;

	public Position(int row, int column) {
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
		this.row = row;
		this.column = colum;
	}
	
	@Override
	public String toString() {
		return "Row: " + row + " Column: " + column;
	}
}
