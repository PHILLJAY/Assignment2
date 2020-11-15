class RationalNumber implements Comparable<RationalNumber> {
    private int numerator, denominator;


    //  Constructor that changes denom to 1 if its set as zero and stores the sign in the numerator

    public RationalNumber(int numer, int denom)
    {
        if (denom == 0)
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0)
        {
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator = numer;
        denominator = denom;

        reduce();
    }

    //Returns the numerator of the rational number
    public int getNumerator()
    {
        return numerator;
    }


    //Returns the denominator of the rational number
    public int getDenominator()
    {
        return denominator;
    }
    public RationalNumber reciprocal()
    {
        return new RationalNumber(denominator, numerator);
    }


    //Adds this rational number to the one passed as a parameter.
    //A common denominator is found by multiplying the individual
    //denominators.

    public RationalNumber add(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator);
    }
    public RationalNumber subtract(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Multiplies this rational number by the one passed as a
    //  parameter.
    //-----------------------------------------------------------------
    public RationalNumber multiply(RationalNumber op2)
    {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    }
    public RationalNumber divide(RationalNumber op2)
    {
        return multiply(op2.reciprocal());
    }


    //  Determines if this rational number is equal to the one passed
    //  as a parameter. Assumes they are both reduced.

    public boolean isLike(RationalNumber op2)
    {
        return ( numerator == op2.getNumerator() &&
                denominator == op2.getDenominator() );
    }
    public String toString()
    {
        String result;
        if (numerator == 0)
            result = "0";
        else
        if (denominator == 1)
            result = numerator + "";
        else
            result = numerator + "/" + denominator;
        return result;
    }
    private void reduce()
    {
        if (numerator != 0)
        {
            int common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        }
    }
    private int gcd(int num1, int num2)
    {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num1;
    }

    public int compareTo(RationalNumber a){

        double x1 = (double)getNumerator()/(double)getDenominator();//gets a double based on the first rational numbers

        double x2 = (double)a.getNumerator()/(double)a.getDenominator();//gets a double based on the second rational numbers

        double tolerance = 1/0.0001;//computes the inverse of the tolerance
        x1 = x1*tolerance;//multiply both these numbers by the inverse tolerance so that anything larger than the tolerance
        x2 = x2*tolerance;//becomes larger than the decimal point

        //via the inverse of tolerance. If the numbers are within the tolerance range, then the result will be 0
        return (int)(x1-x2);
    }
}
