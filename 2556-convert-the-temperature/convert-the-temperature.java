class Solution {
    public double[] convertTemperature(double celsius) {
        
        double[] result=new double[2];
        double Kelvin=celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        
    result[0]=Kelvin;
    result[1]=Fahrenheit;

    return result;
    }
}