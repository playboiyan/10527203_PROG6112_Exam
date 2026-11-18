/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */


    
    
{ int TotalSales(int[][] productSales); double AverageSales(int[][]
productSales); int MaxSale(int[][] productSales); int MinSale(int[][] productSales); } public class
ProductSales implements IProductSales { public int TotalSales(int[][] sales) { int total = 0; for (int[]
row : sales) for (int value : row) total += value; return total; } public double AverageSales(int[][]
sales) { int total = TotalSales(sales); int count = 0; for (int[] row : sales) count += row.length; return
(double) total / count; } public int MaxSale(int[][] sales) { int max = sales[0][0]; for (int[] row :
sales) for (int value : row) if (value > max) max = value; return max; } public int MinSale(int[][] sales)
{ int min = sales[0][0]; for (int[] row : sales) for (int value : row) if (value < min) min = value; return
min; } }