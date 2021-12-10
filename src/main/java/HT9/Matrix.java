package HT9;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] matrix;

    /**
     * Creating an empty matrix with a predetermined number of rows
     * and columns (all values in matrix equal 0).
     * @param rows
     * @param columns
     * @throws ArrayIndexOutOfBoundsException
     * @throws NegativeArraySizeException
     */

    public Matrix(int rows, int columns) throws ArrayIndexOutOfBoundsException, NegativeArraySizeException{
        if (rows == 0 || columns == 0) { throw new ArrayIndexOutOfBoundsException("Matrix can not have size \"0\""); }
        else if (rows < 0 || columns < 0) { throw new NegativeArraySizeException("Matrix can not have negative size");}
        else this.matrix = new double[rows][columns];

    }

    /**
     * Creating of matrix based on existing two-dimensional array
     * @param matrix
     * @throws MatrixException
     */
    public Matrix(double[][] matrix) throws MatrixException {
        if (matrix.length == 0) { throw new MatrixException("Matrix cannot have any rows");}
        this.matrix = matrix;
    }

    /**
     * @return number of matrix rows
     */
    public int getRows() {
        return this.matrix.length;
    }

    /**
     *
     * @return number of matrix columns
     */
    public int getColumns() {
        return this.matrix[0].length;
    }

    /**
     * @return two-dimensional array
     */
    public double[][] getMatrix() {
        return this.matrix;
    }

    /**
     * Read access to items through the specified index.
     * @param indexRow
     * @param indexColumn
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public double getItemByIndex(int indexRow, int indexColumn) throws ArrayIndexOutOfBoundsException {

        if (indexRow < 0 || indexColumn < 0) {throw new ArrayIndexOutOfBoundsException("Index cannot be negative");}
        return this.matrix[indexRow][indexColumn];
    }

    /**
     * Set access to items through the specified index.
     * @param indexRow
     * @param indexColumn
     * @param valueToBeChanged
     * @throws ArrayIndexOutOfBoundsException
     */
    public void setItemByIndex(int indexRow, int indexColumn, double valueToBeChanged) throws ArrayIndexOutOfBoundsException {

        if (indexRow < 0 || indexColumn < 0) {throw new ArrayIndexOutOfBoundsException("Index cannot be negative");}
        this.matrix[indexRow][indexColumn] = valueToBeChanged;
    }

    /**
     * Matrix addition is the operation of adding two matrices by adding the corresponding entries together.
     * Two matrices must have an equal number of rows and columns to be added.
     * @param inputMatrix
     * @return
     * @throws MatrixException
     */
    public double[][] matrixAddition (double[][] inputMatrix) throws MatrixException {

        if (getRows() != inputMatrix.length) {
            throw new MatrixException("Only matrices of the same size can be added");
        }
        double[][] matrixAdditionResult = new double[getRows()][getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                matrixAdditionResult[i][j] = getItemByIndex(i, j) + inputMatrix[i][j];
            }
        }
        return matrixAdditionResult;
    }

    /**
     * Subtraction between two matrixes is possible if they have the same order or the dimensions.
     * So, they must have the same number of rows and columns in order to subtract two or more matrices.
     * @param inputMatrix
     * @return
     * @throws MatrixException
     */
    public double[][] matrixSubtraction (double[][] inputMatrix) throws MatrixException {

        if (this.getRows() != inputMatrix.length) {
            throw new MatrixException("Only matrices of the same size can be subtracted");
        }
        double[][] matrixAdditionResult = new double[getRows()][getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                matrixAdditionResult[i][j] = getItemByIndex(i, j) - inputMatrix[i][j];
            }
        }
        return matrixAdditionResult;
    }

    /**
     * Matrix multiplication is a binary operation that produces a matrix from two matrices.
     * For matrix multiplication, the number of columns in the first matrix must be equal
     * to the number of rows in the second matrix.
     * @param inputMatrix
     * @return
     * @throws MatrixException
     */
    public double[][] matrixMultiplication (double[][] inputMatrix) throws MatrixException {

        if (this.matrix.length != inputMatrix[0].length) {
            throw new MatrixException("For matrix multiplication, the number of columns in the first matrix " +
                    "must be equal to the number of rows in the second matrix");
        }
        double[][] matrixMultiplicationResult = new double[getRows()][inputMatrix[0].length];

        for (int row = 0; row < getRows(); row++) {
            for (int col = 0; col < inputMatrix[0].length; col++) {
                matrixMultiplicationResult[row][col] = multiplyMatricesCell(inputMatrix, row, col);
            }
        }
        return matrixMultiplicationResult;
    }

        private double multiplyMatricesCell(double[][] inputMatrix, int row, int col){
            double cell = 0;
            for (int i = 0; i < inputMatrix.length; i++) {
                cell += getMatrix()[row][i] * inputMatrix[i][col];
            }
            return cell;
    }

}

