public class Table {

    int[][] table;

    Table(int rows, int cols) {
        table = new int[rows][cols];
    }

    int getValue(int row, int col) {
        return table[row][col];
    }

    void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    int rows() {
        return table.length;
    }

    int cols() {
        return table[0].length;
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < cols(); j++) {
                result = result + table[i][j] + " ";
            }
            result = result + "\n";
        }

        return result;
    }

    double average() {
        int sum = 0;

        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < cols(); j++) {
                sum = sum + table[i][j];
            }
        }

        return (double) sum / (rows() * cols());
    }
}