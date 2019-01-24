package com.company;

public class SkyView {
    private double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int scannedIndex = 0;
        for (int r = 0; r < numRows; r++)
        {
            if (r%2 == 0)
            {
                for (int c = 0; c < numCols; c++)
                {
                    view[r][c] = scanned[scannedIndex];
                    scannedIndex++;
                }
            }
            else
            {
                for (int c = numCols - 1; c >= 0; c--)
                {
                    view[r][c] = scanned[scannedIndex];
                    scannedIndex++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double avg = 0;
        int count = 0;
        for (int r = startRow; r < endRow; r++)
        {
            for (int c = startCol; c < endCol; c++)
            {
                avg += view[r][c];
                count++;
            }
        }
        avg /= count;
        return avg;
    }

    public String toString(){
        String str = "";
        for(double[] row : view){
            for(double column : row){
                str += column + " ";
            }
            str+= "\n";
        }
        return str;
    }

}
