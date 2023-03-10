package com.hillel.shabrin.homeworks.homework8;
public  class ArraysValueCalculator {

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        int numRows = array.length;
        int numCols = array[0].length;

        if (numRows != 4 || numCols != 4) {
            throw new ArraySizeException("Array size should be 4x4");
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                try {
                    int num = Integer.parseInt(array[i][j]);
                    sum += num;
                } catch (NumberFormatException ex) {
                    throw new ArrayDataException("Invalid data in cell (" + i + "," + j + "): " + array[i][j], ex);
                }
            }
        }

        return sum;
    }

    public static class ArraySizeException extends Exception {
        public ArraySizeException(String message) {
            super(message);
        }
    }

    public static class ArrayDataException extends Exception {
        public ArrayDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

