package com.shri.neuralnet.functions.loss.impl;

import com.shri.neuralnet.functions.loss.LossFunction;

public class SquaredErrorFunction implements LossFunction
{

    @Override
    public Double calculate(Double[] expected, Double[] actual)
    {
        int length = expected.length;
        Double squaredError = 0d;
        for (int i = 0; i < length; i++) {
            squaredError += Math.pow(expected[i] - actual[i], 2);
        }
        return squaredError;
    }

}
